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
import lk.ijse.animalclinic.controller.OwnerController;
import lk.ijse.animalclinic.controller.PetController;
import lk.ijse.animalclinic.core.dto.OwnerDTO;
import lk.ijse.animalclinic.core.dto.PetDTO;
import lk.ijse.animalclinic.view.DialogFormAddOwner;
import lk.ijse.animalclinic.view.HomeFrame;

/**
 *
 * @author chamindu
 */
public class ViewOwnerPanel extends javax.swing.JPanel {

    /**
     * Creates new form PetPanel
     */
    public ViewOwnerPanel() {
        initComponents();
        loadAllOwnerIDs();
        loadAllOwners();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel11 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        txtNIC = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        btnAddOwner = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        txtOwnerFirstName = new org.jdesktop.swingx.JXTextField();
        txtOwnerLastName = new org.jdesktop.swingx.JXTextField();
        btnRemoveOwner = new javax.swing.JLabel();
        txtTelNo = new javax.swing.JTextField();
        btnEditOwner = new javax.swing.JLabel();
        cmbOwnerID = new org.jdesktop.swingx.JXComboBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblOwnerData = new org.jdesktop.swingx.JXTable();
        jLabel43 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setText("Owner ID    -");
        jPanel11.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 110, 30));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Name           -");
        jPanel11.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 110, 30));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Tel.No          -");
        jPanel11.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 110, 30));

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel55.setText("NIC              -");
        jPanel11.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 110, 30));

        txtNIC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNIC.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel11.add(txtNIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 240, 30));

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel56.setText("Address       -");
        jPanel11.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 110, 30));

        btnAddOwner.setBackground(new java.awt.Color(204, 204, 204));
        btnAddOwner.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAddOwner.setForeground(new java.awt.Color(255, 255, 255));
        btnAddOwner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/animalclinic/images/add.png"))); // NOI18N
        btnAddOwner.setText("New Owner");
        btnAddOwner.setOpaque(true);
        btnAddOwner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddOwnerMouseClicked(evt);
            }
        });
        jPanel11.add(btnAddOwner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 150, 40));

        txtAddress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAddress.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        jPanel11.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 150, 1020, 30));

        txtOwnerFirstName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtOwnerFirstName.setPrompt("First Name");
        jPanel11.add(txtOwnerFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, 240, 30));

        txtOwnerLastName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtOwnerLastName.setPrompt("Last Name");
        jPanel11.add(txtOwnerLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(785, 50, 350, 30));

        btnRemoveOwner.setBackground(new java.awt.Color(102, 102, 102));
        btnRemoveOwner.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnRemoveOwner.setForeground(new java.awt.Color(189, 103, 107));
        btnRemoveOwner.setText("   Remove ");
        btnRemoveOwner.setOpaque(true);
        btnRemoveOwner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRemoveOwnerMouseClicked(evt);
            }
        });
        jPanel11.add(btnRemoveOwner, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 270, 140, 50));

        txtTelNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTelNo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel11.add(txtTelNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 100, 220, 30));

        btnEditOwner.setBackground(new java.awt.Color(102, 102, 102));
        btnEditOwner.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnEditOwner.setForeground(new java.awt.Color(255, 255, 255));
        btnEditOwner.setText("     Edit");
        btnEditOwner.setOpaque(true);
        btnEditOwner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditOwnerMouseClicked(evt);
            }
        });
        jPanel11.add(btnEditOwner, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 270, 120, 50));

        cmbOwnerID.setBackground(new java.awt.Color(250, 255, 255));
        cmbOwnerID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbOwnerID.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbOwnerIDItemStateChanged(evt);
            }
        });
        jPanel11.add(cmbOwnerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 50, 220, 30));

        add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 1280, 320));

        tblOwnerData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Owner ID", "First Name", "Last Name", "Telephone Number", "NIC", "Address"
            }
        ));
        tblOwnerData.setEditable(false);
        tblOwnerData.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        tblOwnerData.setRowHeight(25);
        tblOwnerData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOwnerDataMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblOwnerData);
        if (tblOwnerData.getColumnModel().getColumnCount() > 0) {
            tblOwnerData.getColumnModel().getColumn(2).setPreferredWidth(100);
            tblOwnerData.getColumnModel().getColumn(5).setPreferredWidth(300);
        }

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1280, 320));

        jLabel43.setBackground(new java.awt.Color(51, 255, 255));
        jLabel43.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(204, 204, 204));
        jLabel43.setText("Owner Details");
        add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void btnAddOwnerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddOwnerMouseClicked
        DialogFormAddOwner addOwner = new DialogFormAddOwner(HomeFrame.homeFrame, true);
        addOwner.setVisible(true);
        if (DialogFormAddOwner.isAdded()) {
            loadAllOwnerIDs();
            loadAllOwners();
        }
    }//GEN-LAST:event_btnAddOwnerMouseClicked

    private void btnEditOwnerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditOwnerMouseClicked
        OwnerDTO owner = new OwnerDTO(cmbOwnerID.getSelectedItem().toString(), txtOwnerFirstName.getText(), txtOwnerLastName.getText(), txtAddress.getText(), txtTelNo.getText(), txtNIC.getText());
        try {
            boolean result = OwnerController.editOwner(owner);

            if (result) {
                JOptionPane.showMessageDialog(this, "Owner has been successfully Edited.");
                loadAllOwners();
            } else {
                JOptionPane.showMessageDialog(this, "Owner hasn't been edited due to some error");
            }
        } catch (Exception ex) {
            Logger.getLogger(AddAppointmentPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEditOwnerMouseClicked

    private void cmbOwnerIDItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbOwnerIDItemStateChanged
        try {
            if (cmbOwnerID.getSelectedIndex() == -1)return;
                OwnerDTO owner = OwnerController.searchOwnerByID(cmbOwnerID.getSelectedItem().toString());
                if (owner == null) return;
                txtOwnerFirstName.setText(owner.getFirstName());
                txtOwnerLastName.setText(owner.getLastName());
                txtAddress.setText(owner.getAddress());
                txtTelNo.setText(owner.getTel());
                txtNIC.setText(owner.getNIC());
        } catch (Exception ex) {
            Logger.getLogger(AddAppointmentPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbOwnerIDItemStateChanged

    private void btnRemoveOwnerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoveOwnerMouseClicked
        OwnerDTO owner = new OwnerDTO(cmbOwnerID.getSelectedItem().toString(), txtOwnerFirstName.getText(), txtOwnerLastName.getText(), txtAddress.getText(), txtTelNo.getText(), txtNIC.getText());
        try {
            boolean result =OwnerController.removeOwner(owner);
            if (result) {
                JOptionPane.showMessageDialog(this, "Owner has been successfully Removed.");
                txtAddress.setText(null);
                txtNIC.setText(null);
                txtOwnerFirstName.setText(null);
                txtTelNo.setText(null);
                loadAllOwnerIDs();
                loadAllOwners() ;
            } else {
                JOptionPane.showMessageDialog(this, "Owner hasn't been Removed due to some error");
            }

        } catch (Exception ex) {
            Logger.getLogger(MedicinePanel.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_btnRemoveOwnerMouseClicked

    private void tblOwnerDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOwnerDataMouseClicked
       String id=(String) tblOwnerData.getValueAt(tblOwnerData.getSelectedRow(),0);
        try {
            if (tblOwnerData.getRowCount()==-1)return;
            OwnerDTO owner = OwnerController.searchOwnerByID(id);
            if (owner == null)return;
                cmbOwnerID.setSelectedItem(owner.getOID());
                txtOwnerFirstName.setText(owner.getFirstName());
                txtOwnerLastName.setText(owner.getLastName());
                txtTelNo.setText(owner.getNIC());
                txtNIC.setText(owner.getTel());
                txtAddress.setText(owner.getAddress());
         } catch (Exception ex) { 
            Logger.getLogger(ViewOwnerPanel.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_tblOwnerDataMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAddOwner;
    private javax.swing.JLabel btnEditOwner;
    private javax.swing.JLabel btnRemoveOwner;
    private org.jdesktop.swingx.JXComboBox cmbOwnerID;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JScrollPane jScrollPane3;
    private org.jdesktop.swingx.JXTable tblOwnerData;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtNIC;
    private org.jdesktop.swingx.JXTextField txtOwnerFirstName;
    private org.jdesktop.swingx.JXTextField txtOwnerLastName;
    private javax.swing.JTextField txtTelNo;
    // End of variables declaration//GEN-END:variables

    private void loadAllOwnerIDs() {
        try {
            ArrayList<OwnerDTO> allOwners = OwnerController.getAllOwners();
            cmbOwnerID.removeAllItems();
            if (allOwners == null) {
                return;
            }
            for (OwnerDTO owner : allOwners) {
                cmbOwnerID.addItem(owner.getOID());
            }
        } catch (Exception ex) {
            Logger.getLogger(AddAppointmentPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void loadAllOwners() {
        try {
            ArrayList<OwnerDTO> allOwners = OwnerController.getAllOwners();
            DefaultTableModel dtm = (DefaultTableModel)tblOwnerData.getModel();
            dtm.setRowCount(0);

            if (allOwners != null) {

                for (OwnerDTO owner : allOwners) {

                    Object[] rowData = {
                        owner.getOID(),
                        owner.getFirstName(),
                        owner.getLastName(),
                        owner.getTel(),
                        owner.getNIC(),
                        owner.getAddress()
                    };

                    dtm.addRow(rowData);

                }

            }

        } catch (Exception ex) {
            Logger.getLogger(ViewOwnerPanel.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
}
