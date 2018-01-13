/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import lapr.project.model.UnitConversion;
import lapr.project.controller.AlgorithmVehicleResultsController;
import lapr.project.model.Section;
import lapr.project.model.AlgorithmResults;

/**
 *
 * @author MarioDias
 */
public class AlgorithmVehicleResultsUI extends javax.swing.JDialog {

    /**
     * Creates new form AlgorithmVehicleResultsUI
     */
    private static final long serialVersionUID = 1;
    private List<AlgorithmResults> listAlgorithms;
    private JFileChooser fileChooser;
    private AlgorithmVehicleResultsController controller;
    private DefaultComboBoxModel<String> comboboxModel = new DefaultComboBoxModel<>();
    private boolean button = false;

    public AlgorithmVehicleResultsUI(JFrame parent, List<AlgorithmResults> listAlgorithms) {
        super(parent, true);
        initComponents();
        initFileChooser();
        controller = new AlgorithmVehicleResultsController();
        vehicleCombobox.setModel(comboboxModel);
        this.listAlgorithms = listAlgorithms;
        if (!listAlgorithms.isEmpty()) {
            for (AlgorithmResults listAlgorithm : listAlgorithms) {
                comboboxModel.addElement(listAlgorithm.getVehicle().getName());
            }
        } else {
            JOptionPane.showMessageDialog(parent, "Error, there is no vehicles to present results.");
            this.dispose();
        }
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                listAlgorithms.clear();
                comboboxModel.removeAllElements();
            }
        });
    }

    public void initFileChooser() {
        fileChooser = new JFileChooser();
        FileNameExtensionFilter xmlfilter = new FileNameExtensionFilter("HTML files (*.html)", "html");
        fileChooser.setFileFilter(xmlfilter);
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.dir")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        closeBtn = new javax.swing.JButton();
        exportBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        projectTextfield = new javax.swing.JTextField();
        vehicleTextfield = new javax.swing.JTextField();
        totalweightTextField = new javax.swing.JTextField();
        distanceTextfield = new javax.swing.JTextField();
        costTextfield = new javax.swing.JTextField();
        traveltimeTextfield = new javax.swing.JTextField();
        energyTextfield = new javax.swing.JTextField();
        algorithmTextfield = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        pathTextarea = new javax.swing.JTextArea();
        vehicleCombobox = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Results");
        setResizable(false);

        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/return_icon.png"))); // NOI18N
        closeBtn.setText("Close");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });

        exportBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/html_icon.png"))); // NOI18N
        exportBtn.setText("Export HTML");
        exportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Project:");

        jLabel2.setText("Vehicle:");

        jLabel3.setText("Total weight:");

        jLabel4.setText("Path:");

        jLabel5.setText("Distance:");

        jLabel6.setText("Travel time:");

        jLabel7.setText("Cost:");

        jLabel8.setText("Energy:");

        jLabel9.setText("Algorithm:");

        projectTextfield.setEditable(false);

        vehicleTextfield.setEditable(false);

        totalweightTextField.setEditable(false);

        distanceTextfield.setEditable(false);

        costTextfield.setEditable(false);

        traveltimeTextfield.setEditable(false);

        energyTextfield.setEditable(false);

        algorithmTextfield.setEditable(false);

        pathTextarea.setEditable(false);
        pathTextarea.setColumns(20);
        pathTextarea.setRows(5);
        jScrollPane1.setViewportView(pathTextarea);

        vehicleCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehicleComboboxActionPerformed(evt);
            }
        });

        jLabel10.setText("Vehicle:");

        jButton1.setText("Convert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 14, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(algorithmTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(vehicleTextfield, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                                    .addComponent(projectTextfield)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(6, 6, 6)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                                    .addComponent(distanceTextfield)
                                    .addComponent(traveltimeTextfield)
                                    .addComponent(totalweightTextField)
                                    .addComponent(vehicleCombobox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(energyTextfield)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton1))
                                    .addComponent(costTextfield)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(closeBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(exportBtn)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(projectTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(vehicleTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(algorithmTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(totalweightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(distanceTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(traveltimeTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(costTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(energyTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vehicleCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(closeBtn)
                    .addComponent(exportBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void vehicleComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehicleComboboxActionPerformed
        if (vehicleCombobox.getItemCount() != 0) {
            projectTextfield.setText(listAlgorithms.get(vehicleCombobox.getSelectedIndex()).getProject().getName());
            vehicleTextfield.setText(listAlgorithms.get(vehicleCombobox.getSelectedIndex()).getVehicle().getName());
            totalweightTextField.setText(String.valueOf(listAlgorithms.get(vehicleCombobox.getSelectedIndex()).getVehicle().getTotalWeight()) + " kg");
            distanceTextfield.setText(String.valueOf(listAlgorithms.get(vehicleCombobox.getSelectedIndex()).getDistance()) + " km");
            traveltimeTextfield.setText(String.valueOf(UnitConversion.convertSecondstoHoursMinSec(listAlgorithms.get(vehicleCombobox.getSelectedIndex()).getTravelTime())) + " h");
            costTextfield.setText(String.valueOf(listAlgorithms.get(vehicleCombobox.getSelectedIndex()).getCost()) + " €");
            energyTextfield.setText(String.format("%.3f MJ", UnitConversion.convertJoulesToMegaJoules(listAlgorithms.get(vehicleCombobox.getSelectedIndex()).getEnergy())));
            algorithmTextfield.setText(listAlgorithms.get(vehicleCombobox.getSelectedIndex()).getAlgorithmType());
            String finalPath = "";
            for (Section section : listAlgorithms.get(vehicleCombobox.getSelectedIndex()).getSectionPath()) {
                finalPath += "Begining Junction: " + section.getBeginningJunction().getName() + " " + section.getRoadID() + " " + "Ending Junction: " + section.getEndingJunction().getName() + "\n";
            }
            pathTextarea.setText(finalPath);
        }
    }//GEN-LAST:event_vehicleComboboxActionPerformed

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        projectTextfield.setText("");
        vehicleTextfield.setText("");
        totalweightTextField.setText("");
        distanceTextfield.setText("");
        traveltimeTextfield.setText("");
        costTextfield.setText("");
        energyTextfield.setText("");
        algorithmTextfield.setText("");
        pathTextarea.setText("");
        vehicleCombobox.removeAllItems();
        comboboxModel.removeAllElements();
        vehicleCombobox.updateUI();
        listAlgorithms.clear();
        this.dispose();
    }//GEN-LAST:event_closeBtnActionPerformed

    private void exportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportBtnActionPerformed
        try {
            int returnvalue = fileChooser.showSaveDialog(this);
            if (returnvalue == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                String path = file.getPath();
                if (!(path.contains(".html"))) {
                    path += ".html";
                }
                controller.exportHTML(path, listAlgorithms);
                JOptionPane.showMessageDialog(this, "Results exported with success.", "Results Export", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (NullPointerException n) {
            JOptionPane.showMessageDialog(this, "No active project to export", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(Mockup.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_exportBtnActionPerformed

    private void convertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertBtnActionPerformed
        button = controller.checkConvertBtn(button);
        if (button) {
            double grams = listAlgorithms.get(vehicleCombobox.getSelectedIndex()).getFuelGrams();
            double energy = listAlgorithms.get(vehicleCombobox.getSelectedIndex()).getEnergy();
            String fuel = listAlgorithms.get(vehicleCombobox.getSelectedIndex()).getVehicle().getFuel();
            if (!fuel.equalsIgnoreCase("electric")) {
                energyTextfield.setText(String.format("%.3f Litres ", UnitConversion.convertGramsOfFuelToLiters(fuel, grams)));
            } else {
                energyTextfield.setText(String.format("%.3f MJ", UnitConversion.convertJoulesToMegaJoules(energy)));
            }
        } else {
            energyTextfield.setText(String.format("%.3f MJ", UnitConversion.convertJoulesToMegaJoules(listAlgorithms.get(vehicleCombobox.getSelectedIndex()).getEnergy())));
        }
    }//GEN-LAST:event_convertBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField algorithmTextfield;
    private javax.swing.JButton closeBtn;
    private javax.swing.JTextField costTextfield;
    private javax.swing.JTextField distanceTextfield;
    private javax.swing.JTextField energyTextfield;
    private javax.swing.JButton exportBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea pathTextarea;
    private javax.swing.JTextField projectTextfield;
    private javax.swing.JTextField totalweightTextField;
    private javax.swing.JTextField traveltimeTextfield;
    private javax.swing.JComboBox<String> vehicleCombobox;
    private javax.swing.JTextField vehicleTextfield;
    // End of variables declaration//GEN-END:variables
}
