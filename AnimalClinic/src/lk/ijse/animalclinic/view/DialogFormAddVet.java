/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.animalclinic.view;

import lk.ijse.animalclinic.view.panels.AddAppointmentPanel;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import lk.ijse.animalclinic.common.IDGenarator;
import lk.ijse.animalclinic.common.Validation;
import lk.ijse.animalclinic.controller.OwnerController;
import lk.ijse.animalclinic.controller.VetController;
import lk.ijse.animalclinic.core.dto.OwnerDTO;
import lk.ijse.animalclinic.core.dto.VetDTO;
import static lk.ijse.animalclinic.view.DialogFormAddOwner.isAdded;

/**
 *
 * @author chamindu
 */
public class DialogFormAddVet extends javax.swing.JDialog {

    /**
     * Creates new form DialogFormAddVet
     */
    public DialogFormAddVet(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        getVetID();
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
        jLabel42 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        txtTelNo = new javax.swing.JTextField();
        txtVetID = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        txtNIC = new javax.swing.JTextField();
        btnAddVet = new javax.swing.JLabel();
        txtFirstName = new org.jdesktop.swingx.JXTextField();
        txtLastName = new org.jdesktop.swingx.JXTextField();
        btnCancel = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        txtDesc = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(250, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(40, 135, 173), 3));
        jPanel1.setPreferredSize(new java.awt.Dimension(1080, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(40, 135, 173));
        jLabel42.setText("Tel.No         -");
        jPanel1.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 100, 30));

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(40, 135, 173));
        jLabel55.setText("Vet Name   -");
        jPanel1.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 100, 30));

        txtTelNo.setBackground(new java.awt.Color(250, 255, 255));
        txtTelNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTelNo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtTelNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTelNoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTelNoFocusLost(evt);
            }
        });
        txtTelNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelNoActionPerformed(evt);
            }
        });
        jPanel1.add(txtTelNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 240, 240, 30));

        txtVetID.setEditable(false);
        txtVetID.setBackground(new java.awt.Color(250, 255, 255));
        txtVetID.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtVetID.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtVetID, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 60, 240, 30));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(40, 135, 173));
        jLabel28.setText("Vet.ID         -");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 100, 30));

        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(40, 135, 173));
        jLabel60.setText("Address      -");
        jPanel1.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 100, 30));

        txtAddress.setBackground(new java.awt.Color(250, 255, 255));
        txtAddress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAddress.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        jPanel1.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 300, 955, 30));

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(40, 135, 173));
        jLabel38.setText("NIC              -");
        jPanel1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 100, 30));

        txtNIC.setBackground(new java.awt.Color(250, 255, 255));
        txtNIC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNIC.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNIC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNICFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNICFocusLost(evt);
            }
        });
        txtNIC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNICActionPerformed(evt);
            }
        });
        jPanel1.add(txtNIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 180, 240, 30));

        btnAddVet.setBackground(new java.awt.Color(102, 102, 102));
        btnAddVet.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAddVet.setForeground(new java.awt.Color(255, 255, 255));
        btnAddVet.setText("       Add Vet");
        btnAddVet.setOpaque(true);
        btnAddVet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddVetMouseClicked(evt);
            }
        });
        jPanel1.add(btnAddVet, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 410, 130, 50));

        txtFirstName.setBackground(new java.awt.Color(250, 255, 255));
        txtFirstName.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtFirstName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtFirstName.setPrompt("First Name");
        txtFirstName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFirstNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFirstNameFocusLost(evt);
            }
        });
        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 120, 240, 30));

        txtLastName.setBackground(new java.awt.Color(250, 255, 255));
        txtLastName.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtLastName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLastName.setPrompt("Last Name");
        txtLastName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLastNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLastNameFocusLost(evt);
            }
        });
        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 700, 30));

        btnCancel.setBackground(new java.awt.Color(102, 102, 102));
        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("       Cancel");
        btnCancel.setOpaque(true);
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCancelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnCancelMouseReleased(evt);
            }
        });
        jPanel1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 410, 130, 50));

        jLabel54.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(29, 120, 156));
        jLabel54.setText("Add New Veterinary Surgeon ");
        jPanel1.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 410, 40));

        jLabel61.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(40, 135, 173));
        jLabel61.setText("Description-");
        jPanel1.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 100, 30));

        txtDesc.setBackground(new java.awt.Color(250, 255, 255));
        txtDesc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDesc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescActionPerformed(evt);
            }
        });
        jPanel1.add(txtDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 360, 955, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtTelNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelNoActionPerformed
        txtAddress.requestFocus();
    }//GEN-LAST:event_txtTelNoActionPerformed

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnCancelMouseClicked

    private void btnCancelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMousePressed
        btnCancel.setBackground(new Color(200, 200, 200));
    }//GEN-LAST:event_btnCancelMousePressed

    private void btnCancelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseReleased
        btnCancel.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_btnCancelMouseReleased

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        txtDesc.requestFocus();
    }//GEN-LAST:event_txtAddressActionPerformed

    private void btnAddVetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddVetMouseClicked
        if (txtAddress.getText().isEmpty() || txtDesc.getText().isEmpty() || txtFirstName.getText().isEmpty() || txtLastName.getText().isEmpty() || txtNIC.getText().isEmpty() || txtTelNo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "please fill all");
        } else {
            VetDTO vet = new VetDTO(txtVetID.getText(), txtFirstName.getText(), txtLastName.getText(), txtNIC.getText(), txtAddress.getText(), txtTelNo.getText(), txtDesc.getText());

            try {
                boolean result = VetController.addVet(vet);

                if (result) {
                    JOptionPane.showMessageDialog(this, "Veterinary has been successfully added.");
                    isAdded();
                    this.dispose();

                } else {
                    JOptionPane.showMessageDialog(this, "Veterinary hasn't been added due to some error");
                }

            } catch (Exception ex) {
                Logger.getLogger(AddAppointmentPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnAddVetMouseClicked

    private void txtDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescActionPerformed

    private void txtFirstNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFirstNameFocusGained
        txtFirstName.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtFirstNameFocusGained

    private void txtFirstNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFirstNameFocusLost
        if (Validation.name(txtFirstName)) {
            btnAddVet.setEnabled(true);
        } else {
            btnAddVet.setEnabled(false);
            txtFirstName.setForeground(Color.red);
        }
    }//GEN-LAST:event_txtFirstNameFocusLost

    private void txtLastNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLastNameFocusGained
        txtLastName.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtLastNameFocusGained

    private void txtLastNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLastNameFocusLost
        if (Validation.name(txtLastName)) {
            btnAddVet.setEnabled(true);
        } else {
            btnAddVet.setEnabled(false);
            txtLastName.setForeground(Color.red);
        }
    }//GEN-LAST:event_txtLastNameFocusLost

    private void txtNICFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNICFocusGained
        txtNIC.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtNICFocusGained

    private void txtNICFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNICFocusLost
        if (Validation.nicValidation(txtNIC)) {
            btnAddVet.setEnabled(true);
        } else {
            btnAddVet.setEnabled(false);
            txtNIC.setForeground(Color.red);
        }
    }//GEN-LAST:event_txtNICFocusLost

    private void txtTelNoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelNoFocusGained
        txtTelNo.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtTelNoFocusGained

    private void txtTelNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelNoFocusLost
        if (Validation.phoneNumber(txtTelNo)) {
            btnAddVet.setEnabled(true);
        } else {
            btnAddVet.setEnabled(false);
            txtTelNo.setForeground(Color.red);
        }
    }//GEN-LAST:event_txtTelNoFocusLost

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        txtLastName.requestFocus();
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        txtNIC.requestFocus();
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void txtNICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNICActionPerformed
        txtTelNo.requestFocus();
    }//GEN-LAST:event_txtNICActionPerformed

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
            java.util.logging.Logger.getLogger(DialogFormAddVet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogFormAddVet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogFormAddVet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogFormAddVet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogFormAddVet dialog = new DialogFormAddVet(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAddVet;
    private javax.swing.JLabel btnCancel;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtDesc;
    private org.jdesktop.swingx.JXTextField txtFirstName;
    private org.jdesktop.swingx.JXTextField txtLastName;
    private javax.swing.JTextField txtNIC;
    private javax.swing.JTextField txtTelNo;
    private javax.swing.JTextField txtVetID;
    // End of variables declaration//GEN-END:variables
    public static boolean isAdded() {
        return true;
    }

    private void getVetID() {
        String newID;
        try {
            newID = IDGenarator.getNewID("vet", "VID", "V");
            txtVetID.setText(newID);
        } catch (SQLException ex) {
            Logger.getLogger(DialogFormAddVet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DialogFormAddVet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}