/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.animalclinic.view.panels;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lk.ijse.animalclinic.controller.MedicineController;
import lk.ijse.animalclinic.controller.TreatmentController;
import lk.ijse.animalclinic.controller.TreatmentDetailsController;
import lk.ijse.animalclinic.core.dto.MedicineDTO;
import lk.ijse.animalclinic.core.dto.TreatmentDTO;
import lk.ijse.animalclinic.core.dto.TreatmentDetailsDTO;

/**
 *
 * @author chamindu
 */
public class ViewPetTreatmentPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewPetTreatmentPanel
     */
    public ViewPetTreatmentPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRemove = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblTreatment = new org.jdesktop.swingx.JXTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMedicine = new org.jdesktop.swingx.JXTable();
        jLabel54 = new javax.swing.JLabel();
        txtPaymentID = new javax.swing.JTextField();
        btnEdit = new javax.swing.JLabel();
        btnEdit1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRemove.setBackground(new java.awt.Color(102, 102, 102));
        btnRemove.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnRemove.setForeground(new java.awt.Color(189, 103, 107));
        btnRemove.setText("  Remove");
        btnRemove.setOpaque(true);
        btnRemove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRemoveMouseClicked(evt);
            }
        });
        add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 290, 130, 50));

        tblTreatment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TID", "Pet ID", "Vet ID", "Daignosis", "Description", "Treatment charge"
            }
        ));
        tblTreatment.setToolTipText("Select Row to Load Medicines\nDiagnosis,Description and Treatment Charge Colomns are editable");
        tblTreatment.setEditable(false);
        tblTreatment.setHorizontalScrollEnabled(true);
        tblTreatment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTreatmentMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblTreatment);
        if (tblTreatment.getColumnModel().getColumnCount() > 0) {
            tblTreatment.getColumnModel().getColumn(3).setPreferredWidth(300);
            tblTreatment.getColumnModel().getColumn(4).setPreferredWidth(300);
        }

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1280, 230));

        tblMedicine.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicine ID", "Medicine desc.", "unit price", "Qty", "Amount"
            }
        ));
        tblMedicine.setToolTipText("Qty Colomn is editable");
        jScrollPane2.setViewportView(tblMedicine);
        if (tblMedicine.getColumnModel().getColumnCount() > 0) {
            tblMedicine.getColumnModel().getColumn(1).setPreferredWidth(300);
        }

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 1280, 270));

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel54.setText("Payment ID                -");
        add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 30));

        txtPaymentID.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtPaymentID.setToolTipText("Enter to Search");
        txtPaymentID.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPaymentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaymentIDActionPerformed(evt);
            }
        });
        add(txtPaymentID, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 200, 30));

        btnEdit.setBackground(new java.awt.Color(102, 102, 102));
        btnEdit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("      Edit");
        btnEdit.setOpaque(true);
        btnEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditMouseClicked(evt);
            }
        });
        add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 290, 130, 50));

        btnEdit1.setBackground(new java.awt.Color(102, 102, 102));
        btnEdit1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnEdit1.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit1.setText("     Edit");
        btnEdit1.setOpaque(true);
        btnEdit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEdit1MouseClicked(evt);
            }
        });
        add(btnEdit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 640, 130, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void txtPaymentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaymentIDActionPerformed
        
        try {
            ArrayList<TreatmentDTO> treatmnt=TreatmentController.searchTreatment(txtPaymentID.getText());
            if(treatmnt==null)return;
            DefaultTableModel dtmTrt = (DefaultTableModel)tblTreatment.getModel();
            dtmTrt.setRowCount(0);
            for (TreatmentDTO treatmentDTO : treatmnt) {
                Object[] rowData={treatmentDTO.getTID(),treatmentDTO.getPID(),treatmentDTO.getVID(),treatmentDTO.getDiagnosis(),treatmentDTO.getDescription(),treatmentDTO.getTreatmentCharge()};
                dtmTrt.addRow(rowData);
            }
        } catch (Exception ex) {
            Logger.getLogger(ViewPetTreatmentPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtPaymentIDActionPerformed

    private void tblTreatmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTreatmentMouseClicked
        String id=(String) tblTreatment.getValueAt(tblTreatment.getSelectedRow(), 0);
        DefaultTableModel dtmMed = (DefaultTableModel)tblMedicine.getModel();
        dtmMed.setRowCount(0);
        try {
            ArrayList<TreatmentDetailsDTO> treatmntDetail=TreatmentDetailsController.searchTreatmentDetails(id);
            for (TreatmentDetailsDTO tD : treatmntDetail) {
                MedicineDTO medicine=MedicineController.searchMedicineByID(tD.getMID());
                Object[] rowData={tD.getMID(),medicine.getDescription(),tD.getMedicineUnitPrice(),tD.getMedicineQty(),tD.getMedicineAmount()};
                dtmMed.addRow(rowData);
            }
        } catch (Exception ex) {
            Logger.getLogger(ViewPetTreatmentPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
    }//GEN-LAST:event_tblTreatmentMouseClicked

    private void btnEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseClicked
        
    }//GEN-LAST:event_btnEditMouseClicked

    private void btnEdit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEdit1MouseClicked
       
    }//GEN-LAST:event_btnEdit1MouseClicked

    private void btnRemoveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoveMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRemoveMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnEdit;
    private javax.swing.JLabel btnEdit1;
    private javax.swing.JLabel btnRemove;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private org.jdesktop.swingx.JXTable tblMedicine;
    private org.jdesktop.swingx.JXTable tblTreatment;
    private javax.swing.JTextField txtPaymentID;
    // End of variables declaration//GEN-END:variables
}
