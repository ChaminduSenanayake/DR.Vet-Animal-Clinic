/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.animalclinic.view.panels;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Action;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lk.ijse.animalclinic.controller.MedicineController;
import lk.ijse.animalclinic.controller.OwnerController;
import lk.ijse.animalclinic.core.dto.MedicineDTO;
import lk.ijse.animalclinic.core.dto.OwnerDTO;
import lk.ijse.animalclinic.view.DialogFormAddMedicine;
import lk.ijse.animalclinic.view.HomeFrame;

/**
 *
 * @author chamindu
 */
public class MedicinePanel extends javax.swing.JPanel {

    /**
     * Creates new form MedicinePanel
     */
    public MedicinePanel() {
        initComponents();
        loadAllMedicineIDs();
        loadAllMed();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblMedicineData = new org.jdesktop.swingx.JXTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        btnEditMedicine = new javax.swing.JLabel();
        btnRemoveMedicine = new javax.swing.JLabel();
        txtMedDesc = new javax.swing.JTextField();
        txtExpDate = new org.jdesktop.swingx.JXDatePicker();
        txtMedPrice = new javax.swing.JTextField();
        txtQtyOnHand = new javax.swing.JTextField();
        btnAddNew = new javax.swing.JLabel();
        cmbMedicineID = new org.jdesktop.swingx.JXComboBox();
        cmbMedType = new org.jdesktop.swingx.JXComboBox();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblMedicineData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MID", "Medicine Discription", "Type", "Exp.Date", "Price", "QtyOnHand"
            }
        ));
        tblMedicineData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMedicineDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMedicineData);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 280));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel42.setText(" Type                       -");
        jPanel1.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 160, 30));

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel43.setText(" Medicine desc.       -");
        jPanel1.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 160, 30));

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel44.setText(" Medicine ID            -");
        jPanel1.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 160, 30));

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel45.setText(" Exp.Date                -");
        jPanel1.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 160, 30));

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel46.setText(" Price                       -");
        jPanel1.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 160, 30));

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel47.setText(" QtyOnHand           -");
        jPanel1.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 160, 30));

        jLabel41.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(204, 204, 204));
        jLabel41.setText(" Edit Medicine Details");
        jPanel1.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 40));

        btnEditMedicine.setBackground(new java.awt.Color(102, 102, 102));
        btnEditMedicine.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnEditMedicine.setForeground(new java.awt.Color(255, 255, 255));
        btnEditMedicine.setText("      Edit ");
        btnEditMedicine.setOpaque(true);
        btnEditMedicine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditMedicineMouseClicked(evt);
            }
        });
        jPanel1.add(btnEditMedicine, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 380, 130, 50));

        btnRemoveMedicine.setBackground(new java.awt.Color(102, 102, 102));
        btnRemoveMedicine.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnRemoveMedicine.setForeground(new java.awt.Color(189, 103, 107));
        btnRemoveMedicine.setText("  Remove");
        btnRemoveMedicine.setOpaque(true);
        btnRemoveMedicine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRemoveMedicineMouseClicked(evt);
            }
        });
        jPanel1.add(btnRemoveMedicine, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 380, 130, 50));

        txtMedDesc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMedDesc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtMedDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 910, 30));

        txtExpDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtExpDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 260, 30));

        txtMedPrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMedPrice.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtMedPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 260, 30));

        txtQtyOnHand.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtQtyOnHand.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtQtyOnHand, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 260, 30));

        btnAddNew.setBackground(new java.awt.Color(204, 204, 204));
        btnAddNew.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAddNew.setForeground(new java.awt.Color(255, 255, 255));
        btnAddNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/animalclinic/images/add.png"))); // NOI18N
        btnAddNew.setText(" New Medicine");
        btnAddNew.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAddNew.setOpaque(true);
        btnAddNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddNewMouseClicked(evt);
            }
        });
        jPanel1.add(btnAddNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 180, 40));

        cmbMedicineID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbMedicineID.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbMedicineIDItemStateChanged(evt);
            }
        });
        cmbMedicineID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMedicineIDActionPerformed(evt);
            }
        });
        jPanel1.add(cmbMedicineID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 62, 260, 30));

        cmbMedType.setBackground(new java.awt.Color(250, 255, 255));
        cmbMedType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Injection", "Lotion", "Tablet", "Other" }));
        cmbMedType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbMedType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMedTypeActionPerformed(evt);
            }
        });
        jPanel1.add(cmbMedType, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 260, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 1280, 430));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddNewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddNewMouseClicked
        DialogFormAddMedicine addMedicne = new DialogFormAddMedicine(HomeFrame.homeFrame, true);
        addMedicne.setVisible(true);
        if (DialogFormAddMedicine.isAdded()) {
            loadAllMed();
            loadAllMedicineIDs();
        }
    }//GEN-LAST:event_btnAddNewMouseClicked

    private void btnEditMedicineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMedicineMouseClicked
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date date = txtExpDate.getDate();
        MedicineDTO medicine = new MedicineDTO(cmbMedicineID.getSelectedItem().toString(), txtMedDesc.getText(), cmbMedType.getSelectedItem().toString(), df.format(date), Double.parseDouble(txtMedPrice.getText()), Integer.parseInt(txtQtyOnHand.getText()));
        try {
            boolean result = MedicineController.editMedicine(medicine);

            if (result) {
                JOptionPane.showMessageDialog(this, "Medicine has been successfully Edited.");
                loadAllMed();
                loadAllMedicineIDs();
            } else {
                JOptionPane.showMessageDialog(this, "Medicine hasn't been edited due to some error");
            }

        } catch (Exception ex) {
            Logger.getLogger(AddAppointmentPanel.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnEditMedicineMouseClicked

    private void cmbMedicineIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMedicineIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMedicineIDActionPerformed

    private void btnRemoveMedicineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoveMedicineMouseClicked
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date date = txtExpDate.getDate();
        MedicineDTO medicine = new MedicineDTO(cmbMedicineID.getSelectedItem().toString(), txtMedDesc.getText(), cmbMedType.getSelectedItem().toString(), df.format(date), Double.parseDouble(txtMedPrice.getText()), Integer.parseInt(txtQtyOnHand.getText()));
        try {
            boolean result = MedicineController.removeMedicine(medicine);
            if (result) {
                JOptionPane.showMessageDialog(this, "Medicine has been successfully Removed.");
                txtExpDate.setDate(null);
                txtMedDesc.setText(null);
                txtMedPrice.setText(null);
                txtQtyOnHand.setText(null);
                loadAllMed();
                loadAllMedicineIDs();

            } else {
                JOptionPane.showMessageDialog(this, "Medicine hasn't been Removed due to some error");
            }

        } catch (Exception ex) {
            Logger.getLogger(MedicinePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRemoveMedicineMouseClicked

    private void cmbMedicineIDItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbMedicineIDItemStateChanged
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try {
            if (cmbMedicineID.getSelectedIndex() == -1) {
                return;
            }
            MedicineDTO medicine = MedicineController.searchMedicineByID(cmbMedicineID.getSelectedItem().toString());
            if (medicine == null) {
                return;
            }
            txtMedDesc.setText(medicine.getDescription());
            cmbMedType.setSelectedItem(medicine.getType());
            txtExpDate.setDate(df.parse(medicine.getExpireDate()));
            txtMedPrice.setText(Double.toString(medicine.getPrice()));
            txtQtyOnHand.setText(Integer.toString(medicine.getQtyOnHand()));
        } catch (Exception ex) {
            Logger.getLogger(MedicinePanel.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_cmbMedicineIDItemStateChanged

    private void cmbMedTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMedTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMedTypeActionPerformed

    private void tblMedicineDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMedicineDataMouseClicked
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        if (tblMedicineData.getRowCount() != 0) {
            String id = (String) tblMedicineData.getValueAt(tblMedicineData.getSelectedRow(), 0);
            try {
                if (tblMedicineData.getRowCount() == -1) {
                    return;
                }
                MedicineDTO medicine = MedicineController.searchMedicineByID(id);
                if (medicine == null) {
                    return;
                }
                cmbMedicineID.setSelectedItem(medicine.getMID());
                txtMedDesc.setText(medicine.getDescription());
                cmbMedType.setSelectedItem(medicine.getType());
                txtExpDate.setDate(df.parse(medicine.getExpireDate()));
                txtMedPrice.setText(Double.toString(medicine.getPrice()));
                txtQtyOnHand.setText(Integer.toString(medicine.getQtyOnHand()));
            } catch (Exception ex) {
                Logger.getLogger(ViewOwnerPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_tblMedicineDataMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAddNew;
    private javax.swing.JLabel btnEditMedicine;
    private javax.swing.JLabel btnRemoveMedicine;
    private org.jdesktop.swingx.JXComboBox cmbMedType;
    private org.jdesktop.swingx.JXComboBox cmbMedicineID;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXTable tblMedicineData;
    private org.jdesktop.swingx.JXDatePicker txtExpDate;
    private javax.swing.JTextField txtMedDesc;
    private javax.swing.JTextField txtMedPrice;
    private javax.swing.JTextField txtQtyOnHand;
    // End of variables declaration//GEN-END:variables
    private void loadAllMedicineIDs() {
        try {
            ArrayList<MedicineDTO> allMed = MedicineController.getAllMedicines();
            cmbMedicineID.removeAllItems();
            if (allMed == null) {
                return;
            }
            for (MedicineDTO medicine : allMed) {
                cmbMedicineID.addItem(medicine.getMID());
            }
        } catch (Exception ex) {
            Logger.getLogger(MedicinePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadAllMed() {
        try {
            ArrayList<MedicineDTO> allMed = MedicineController.getAllMedicines();
            if (allMed == null) {
                return;
            }
            DefaultTableModel dtm = (DefaultTableModel) tblMedicineData.getModel();
            dtm.setRowCount(0);
            for (MedicineDTO medicine : allMed) {
                Object[] rawData = {medicine.getMID(), medicine.getDescription(), medicine.getType(), medicine.getExpireDate(), medicine.getPrice(), medicine.getQtyOnHand()};
                dtm.addRow(rawData);
            }

        } catch (Exception ex) {
            Logger.getLogger(MedicinePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
