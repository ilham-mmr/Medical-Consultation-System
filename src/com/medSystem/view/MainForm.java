package com.medSystem.view;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.event.MouseEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ilham MMR <ilham.mmr@gmail.com> - - -
 */
public class MainForm extends javax.swing.JFrame {

    private List<MedInfo> medInfos;

    /**
     * Creates new form MyGUI
     */
    public MainForm() {
        medInfos = new ArrayList<>();
        initComponents();
        populateArrayList();
        showData();
    }

    private void showData() {
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        for (int i = 0; i < medInfos.size(); i++) {
            MedInfo medInfo = medInfos.get(i);

            String data[] = {medInfo.getDiseaseId(), medInfo.getName(), medInfo.getCauses(), medInfo.getSymptomps(), medInfo.getTreatments(), medInfo.getMedications()};
            tableModel.addRow(data);

        }
    }

    private void populateArrayList() {
        try {
            FileInputStream file = new FileInputStream("MedDatabase.txt");
            ObjectInputStream inputfile = new ObjectInputStream(file);

            boolean endOfFile = false;
            while (!endOfFile) {
                try {
                    medInfos.add((MedInfo) inputfile.readObject());
                } catch (IOException e) {
                    endOfFile = true;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }

            }

            file.close();
            inputfile.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void saveDataToFile() {
        try {
            FileOutputStream file = new FileOutputStream("MedDatabase.txt");
            ObjectOutputStream outputFile = new ObjectOutputStream(file);

            for (int i = 0; i < medInfos.size(); i++) {
                outputFile.writeObject(medInfos.get(i));

            }

            file.close();
            outputFile.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void clearTextField() {
        idField.setText("");
        nameField.setText("");
        causesField.setText("");
        symptomField.setText("");
        treatmentsField.setText("");
        medicationsField.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        causesField = new javax.swing.JTextField();
        symptomField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        treatmentsField = new javax.swing.JTextField();
        medicationsField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        submitBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        aboutLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Medical Consultation System");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setForeground(new java.awt.Color(51, 51, 0));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/medSystem/view/icons/key_24px.png"))); // NOI18N
        jLabel1.setText("Disease ID:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/medSystem/view/icons/autograph_24px.png"))); // NOI18N
        jLabel2.setText("Name:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        idField.setToolTipText("");
        jPanel1.add(idField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 180, -1));

        nameField.setToolTipText("");
        jPanel1.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 180, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/medSystem/view/icons/virus_24px.png"))); // NOI18N
        jLabel3.setText("Causes:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/medSystem/view/icons/asthma_24px.png"))); // NOI18N
        jLabel4.setText("Symptoms:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        causesField.setToolTipText("");
        jPanel1.add(causesField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 180, -1));

        symptomField.setToolTipText("");
        jPanel1.add(symptomField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 180, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/medSystem/view/icons/treatment_24px.png"))); // NOI18N
        jLabel5.setText("Treatments:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/medSystem/view/icons/syringe_24px.png"))); // NOI18N
        jLabel6.setText("Medications:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        treatmentsField.setToolTipText("");
        jPanel1.add(treatmentsField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 180, -1));

        medicationsField.setToolTipText("");
        jPanel1.add(medicationsField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 180, -1));

        jTable1.setBackground(new java.awt.Color(102, 102, 255));
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Disease ID", "Name", "Causes", "Symptoms", "Treatments", "Medications"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 482, 398));

        submitBtn.setBackground(new java.awt.Color(70, 70, 70));
        submitBtn.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        submitBtn.setForeground(new java.awt.Color(255, 255, 255));
        submitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/medSystem/view/icons/submit_document_24px.png"))); // NOI18N
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });
        jPanel1.add(submitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        updateBtn.setBackground(new java.awt.Color(70, 70, 70));
        updateBtn.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/medSystem/view/icons/update_file_24px.png"))); // NOI18N
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        jPanel1.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, -1, -1));

        deleteBtn.setBackground(new java.awt.Color(70, 70, 70));
        deleteBtn.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/medSystem/view/icons/delete_file_24px.png"))); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        jPanel1.add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, -1, -1));

        jLabel7.setBackground(new java.awt.Color(187, 187, 187));
        jLabel7.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Medical Consultation System");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/medSystem/view/icons/medical_history_50px.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/medSystem/view/icons/hospital_24px.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        aboutLabel.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        aboutLabel.setForeground(new java.awt.Color(255, 255, 255));
        aboutLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/medSystem/view/icons/help_32px.png"))); // NOI18N
        aboutLabel.setText("About");
        aboutLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aboutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutLabelMouseClicked(evt);
            }
        });
        jPanel1.add(aboutLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 851, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        String id = idField.getText();
        String name = nameField.getText();
        String causes = causesField.getText();
        String symptom = symptomField.getText();
        String treatments = treatmentsField.getText();
        String medication = medicationsField.getText();

        if (id.isEmpty() || name.isEmpty() || causes.isEmpty() || causes.isEmpty() || symptom.isEmpty() || treatments.isEmpty() || medication.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Fill in the form properly!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            MedInfo medInfo = new MedInfo(id, name, causes, symptom, treatments, medication);
            medInfos.add(medInfo);
            DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();

            String data[] = {id, name, causes, symptom, treatments, medication};
            tableModel.addRow(data);

            saveDataToFile();

            clearTextField();
        }
    }//GEN-LAST:event_submitBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        if (jTable1.getSelectedRowCount() == 1) {
            int index = jTable1.getSelectedRow();

            String id = idField.getText();
            String name = nameField.getText();
            String causes = causesField.getText();
            String symptom = symptomField.getText();
            String treatments = treatmentsField.getText();
            String medication = medicationsField.getText();
            if (id.isEmpty() || name.isEmpty() || causes.isEmpty() || causes.isEmpty() || symptom.isEmpty() || treatments.isEmpty() || medication.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill in the form properly!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                tableModel.setValueAt(id, jTable1.getSelectedRow(), 0);
                tableModel.setValueAt(name, jTable1.getSelectedRow(), 1);
                tableModel.setValueAt(causes, jTable1.getSelectedRow(), 2);
                tableModel.setValueAt(symptom, jTable1.getSelectedRow(), 3);
                tableModel.setValueAt(treatments, jTable1.getSelectedRow(), 4);
                tableModel.setValueAt(medication, jTable1.getSelectedRow(), 5);

                MedInfo medInfoUpdate = medInfos.get(index);
                medInfoUpdate.setDiseaseId(id);
                medInfoUpdate.setName(name);
                medInfoUpdate.setCauses(causes);
                medInfoUpdate.setSymptomps(symptom);
                medInfoUpdate.setTreatments(treatments);
                medInfoUpdate.setMedications(medication);

                saveDataToFile();
                clearTextField();
            }
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        if (jTable1.getSelectedRowCount() == 1) {
            int index = jTable1.getSelectedRow();
            tableModel.removeRow(index);
            medInfos.remove(index);

            saveDataToFile();
            clearTextField();
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            int index = jTable1.getSelectedRow();
            MedInfo medInfo = medInfos.get(index);

            idField.setText(medInfo.getDiseaseId());
            nameField.setText(medInfo.getName());
            causesField.setText(medInfo.getCauses());
            symptomField.setText(medInfo.getSymptomps());
            treatmentsField.setText(medInfo.getTreatments());
            medicationsField.setText(medInfo.getMedications());
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void aboutLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutLabelMouseClicked
        JOptionPane.showMessageDialog(null, "GROUP MEMBERS"
                + "\nRachmat Ilham Muslim Maulana (268954)"
                + "\nasdfas", "About", JOptionPane.QUESTION_MESSAGE);
    }//GEN-LAST:event_aboutLabelMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aboutLabel;
    private javax.swing.JTextField causesField;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField medicationsField;
    private javax.swing.JTextField nameField;
    private javax.swing.JButton submitBtn;
    private javax.swing.JTextField symptomField;
    private javax.swing.JTextField treatmentsField;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
