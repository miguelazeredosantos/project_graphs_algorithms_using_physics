/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import lapr.project.controller.PathAlgorithmsController;
import lapr.project.model.Junction;
import lapr.project.model.Vehicle;

public class PathAlgorithmsUI extends javax.swing.JFrame {

    private static final long serialVersionUID = 1;
    private PathAlgorithmsController controller;
    private JFileChooser m_jfc;
    private JFileChooser csvFileChooser;

    /**
     * Creates new form FastestPathUI
     */
    public PathAlgorithmsUI() {
        initComponents();
        controller = new PathAlgorithmsController();
        for (Junction junction : controller.getJunctions()) {
            junctionBeginComboBox.addItem(junction);
            junctionEndComboBox.addItem(junction);
        }
        for (Vehicle v : controller.getVehicles()) {
            vehicleCombobox.addItem(v);
        }
        initFileChooser();
        csvFileChooser = new JFileChooser();
        csvFileChooser.setCurrentDirectory(new File(System.getProperty("user.dir")));

    }

    public void initFileChooser() {
        m_jfc = new JFileChooser();
        FileNameExtensionFilter xmlfilter = new FileNameExtensionFilter("HTML files (*.html)", "html");
        m_jfc.setFileFilter(xmlfilter);
        m_jfc.setCurrentDirectory(new File(System.getProperty("user.dir")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        junctionBeginComboBox = new javax.swing.JComboBox<>();
        junctionEndComboBox = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fastestPathCheckbox = new javax.swing.JCheckBox();
        EnergyEfficientCheckbox = new javax.swing.JCheckBox();
        EnergySavingCheckbox = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        calculateButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        vehicleCombobox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        exportHTMLButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        loadJTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        exportToCSVButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ok_icon.png"))); // NOI18N
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/return_icon.png"))); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Junction 1:");

        jLabel2.setText("Junction 2:");

        fastestPathCheckbox.setForeground(new java.awt.Color(255, 0, 0));
        fastestPathCheckbox.setText("Fastest Path");
        fastestPathCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fastestPathCheckboxActionPerformed(evt);
            }
        });

        EnergyEfficientCheckbox.setForeground(new java.awt.Color(0, 51, 204));
        EnergyEfficientCheckbox.setText("Energy Efficient Path");
        EnergyEfficientCheckbox.setToolTipText("");
        EnergyEfficientCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnergyEfficientCheckboxActionPerformed(evt);
            }
        });

        EnergySavingCheckbox.setForeground(new java.awt.Color(0, 153, 0));
        EnergySavingCheckbox.setText("Energy Saving Mode Path");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel4.setText("Results:");

        calculateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/path_icon.png"))); // NOI18N
        calculateButton.setText("Calculate");
        calculateButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        calculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateButtonActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Algorithms:");

        vehicleCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehicleComboboxActionPerformed(evt);
            }
        });

        jLabel3.setText("Vehicle:");

        exportHTMLButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/html_icon.png"))); // NOI18N
        exportHTMLButton.setText("Export to HTML");
        exportHTMLButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportHTMLButtonActionPerformed(evt);
            }
        });

        jLabel6.setText("Load:");

        loadJTextField.setText("0");
        loadJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadJTextFieldActionPerformed(evt);
            }
        });

        jLabel7.setText("kg");

        exportToCSVButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/csv_icon.png"))); // NOI18N
        exportToCSVButton.setText("Export to CSV");
        exportToCSVButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportToCSVButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(junctionBeginComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(junctionEndComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(vehicleCombobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(EnergyEfficientCheckbox)
                                        .addComponent(fastestPathCheckbox, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5))
                                    .addGap(26, 26, 26))
                                .addComponent(EnergySavingCheckbox))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(loadJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(13, 13, 13))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(11, 11, 11))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(exportToCSVButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(exportHTMLButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(calculateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(260, 260, 260))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(junctionBeginComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(junctionEndComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vehicleCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loadJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fastestPathCheckbox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EnergyEfficientCheckbox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EnergySavingCheckbox)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(calculateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exportHTMLButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exportToCSVButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void fastestPathCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fastestPathCheckboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fastestPathCheckboxActionPerformed

    private void EnergyEfficientCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnergyEfficientCheckboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnergyEfficientCheckboxActionPerformed

    private void calculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateButtonActionPerformed
        boolean valid = false;
        double currentLoad = 0;
        if (junctionBeginComboBox.getSelectedItem().equals(junctionEndComboBox.getSelectedItem())) {
            JOptionPane.showMessageDialog(this, "Please select different junctions", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            if (!loadJTextField.getText().trim().isEmpty()) {
                double maxLoad = ((Vehicle) vehicleCombobox.getSelectedItem()).getMaxLoad();
                double load = Double.parseDouble(loadJTextField.getText().trim());
                if (load > maxLoad) {
                    valid = false;
                    JOptionPane.showMessageDialog(this, "The load you inserted is invalid. The maxload of the vehicle is: " + maxLoad,
                            "ERROR", JOptionPane.ERROR_MESSAGE);
                } else {
                    valid = true;
                    currentLoad = load;
                }
            }

        }
        if (valid = true) {
            if (fastestPathCheckbox.isSelected()) {
                Junction begin = (Junction) junctionBeginComboBox.getSelectedItem();
                Junction end = (Junction) junctionEndComboBox.getSelectedItem();
                Vehicle v = (Vehicle) vehicleCombobox.getSelectedItem();
                v.setCurrentLoad(currentLoad);
                controller.bestPath(fastestPathCheckbox.isSelected(), EnergyEfficientCheckbox.isSelected(), EnergySavingCheckbox.isSelected(), begin, end, v);
                jTextArea1.setText(controller.getResultsAsText());
                v.setCurrentLoad(0);
            }
        }

    }//GEN-LAST:event_calculateButtonActionPerformed

    private void vehicleComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehicleComboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vehicleComboboxActionPerformed

    private void exportHTMLButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportHTMLButtonActionPerformed
        try {

            int returnvalue = m_jfc.showSaveDialog(this);
            if (returnvalue == JFileChooser.APPROVE_OPTION) {
                File file = m_jfc.getSelectedFile();
                String path = file.getPath();
                if (!(path.contains(".html"))) {
                    path += ".html";
                }
                controller.exportHTML(path);
                JOptionPane.showMessageDialog(this, "Results exported with success.", "Results Export", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (NullPointerException n) {
            JOptionPane.showMessageDialog(this, "No active project to export", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(Mockup.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_exportHTMLButtonActionPerformed

    private void loadJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loadJTextFieldActionPerformed

    private void exportToCSVButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportToCSVButtonActionPerformed
        try {

            int returnvalue = csvFileChooser.showSaveDialog(this);
            if (returnvalue == JFileChooser.APPROVE_OPTION) {
                File file = csvFileChooser.getSelectedFile();
                String path = file.getPath();
                controller.exportCSV(path);
                JOptionPane.showMessageDialog(this, "Results exported with success.", "Results Export", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (NullPointerException n) {
            JOptionPane.showMessageDialog(this, "No active project to export", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(Mockup.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(PathAlgorithmsUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_exportToCSVButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox EnergyEfficientCheckbox;
    private javax.swing.JCheckBox EnergySavingCheckbox;
    private javax.swing.JButton calculateButton;
    private javax.swing.JButton exportHTMLButton;
    private javax.swing.JButton exportToCSVButton;
    private javax.swing.JCheckBox fastestPathCheckbox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JComboBox<Junction> junctionBeginComboBox;
    private javax.swing.JComboBox<Junction> junctionEndComboBox;
    private javax.swing.JTextField loadJTextField;
    private javax.swing.JComboBox<Vehicle> vehicleCombobox;
    // End of variables declaration//GEN-END:variables
}
