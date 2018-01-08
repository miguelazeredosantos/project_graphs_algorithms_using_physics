package lapr.project.database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import lapr.project.model.Junction;
import lapr.project.model.ListOfResults;
import lapr.project.model.Project;
import lapr.project.model.Section;
import lapr.project.model.Vehicle;
import lapr.project.networkanalysis.AlgorithmResults;
import lapr.project.utils.Session;
import oracle.jdbc.OracleTypes;

public class ResultsData extends DataAccess<Map<Vehicle, List<AlgorithmResults>>> {

    public ResultsData(Connection connection) {
        super(connection);
    }

    private boolean exists(List<SQLArgument> args) throws SQLException {
        ResultSet rs = super.callFunction("checkResult", args);

        return rs.next();
    }

    public ListOfResults get(String pName) throws SQLException {
        if (connection == null) {
            return new ListOfResults();
        }
        ListOfResults list = new ListOfResults();

        List<SQLArgument> args = new ArrayList<>();
        args.add(new SQLArgument(pName, OracleTypes.VARCHAR));
        try (ResultSet rs = super.callFunction("getResultados", args)) {
            while (rs.next()) {
                int idRes = rs.getInt("ID_RESULTADOS");
                String vName = rs.getString("NAME");
                double cost = rs.getDouble("COST");
                double travelTime = rs.getDouble("TRAVEL_TIME");
                double energy = rs.getDouble("ENERGY");
                double distance = rs.getDouble("DISTANCE");
                String algorithm = rs.getString("ALGORITHM");

                Vehicle v = Session.getActiveProject().getListVehicles().getVehicleByName(vName);

                LinkedList<Junction> junctionPath = new LinkedList<>();
                
                List<SQLArgument> argsR = new ArrayList<>();
                argsR.add(new SQLArgument(Integer.toString(idRes), OracleTypes.NUMBER));
                ResultSet rs1 = super.callFunction("getResultadosJunction", argsR);
                while (rs1.next()) {
                    String junc = rs1.getString("ID_JUNCTION");
                    
                    junctionPath.add(Session.getActiveProject().getJunction(junc));
                }
                
                LinkedList<Section> fastestPath = new LinkedList<>();
                
                ResultSet rs2 = super.callFunction("getResultadosSection", argsR);
                while (rs2.next()) {
                    Junction j1 = Session.getActiveProject().getJunction(rs2.getString("bJUNC"));
                    Junction j2 = Session.getActiveProject().getJunction(rs2.getString("eJUNC"));
                    
                    fastestPath.add(Session.getActiveProject().getSection(j1, j2));
                }
                

                double[] results = {travelTime, energy};
                
                AlgorithmResults ar = new AlgorithmResults(Session.getActiveProject(), junctionPath, fastestPath, v, results, algorithm);
                ar.setCost(cost);
                ar.setDistance(distance);

                list.addResult(v,ar);
            }
        }

        return list;
    }

    public void insertResults(Project p, Map<Vehicle, List<AlgorithmResults>> mapOfResults) throws SQLException {
        if (connection == null) {
            return;
        }

        List<SQLArgument> args1 = new ArrayList<>();
        for (Vehicle vehicle : mapOfResults.keySet()) {
            for (AlgorithmResults ar : mapOfResults.get(vehicle)) {
                args1.clear();
                args1.add(new SQLArgument(p.getName(), OracleTypes.VARCHAR));
                args1.add(new SQLArgument(vehicle.getName(), OracleTypes.VARCHAR));
                args1.add(new SQLArgument(Double.toString(ar.getCost()), OracleTypes.NUMBER));
                args1.add(new SQLArgument(Double.toString(ar.getTravelTime()), OracleTypes.NUMBER));
                args1.add(new SQLArgument(Double.toString(ar.getEnergy()), OracleTypes.NUMBER));
                args1.add(new SQLArgument(Double.toString(ar.getDistance()), OracleTypes.NUMBER));
                args1.add(new SQLArgument(ar.getAlgorithmType(), OracleTypes.VARCHAR));
                System.out.println("ar: " + args1);

                if (exists(args1)) {
                } else {
                    super.callProcedure("insertResults", args1);

                    List<SQLArgument> args2 = new ArrayList<>();

                    for (Section section : ar.getSectionPath()) {
                        args2.clear();
                        args2.add(new SQLArgument(Integer.toString(section.getSectionID()), OracleTypes.NUMBER));
                        System.out.println(args2);
                        super.callProcedure("insertResultsSection", args2);
                    }

                    for (Junction junction : ar.getJunctionPath()) {
                        args2.clear();
                        args2.add(new SQLArgument(junction.getName(), OracleTypes.VARCHAR));
                        System.out.println(args2);
                        super.callProcedure("insertResultsJunction", args2);
                    }
                }
            }
        }
    }
}