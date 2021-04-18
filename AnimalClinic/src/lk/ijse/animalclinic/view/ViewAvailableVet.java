/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.animalclinic.view;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import lk.ijse.animalclinic.controller.SheduleController;
import lk.ijse.animalclinic.controller.VetController;
import lk.ijse.animalclinic.core.dto.SheduleDTO;
import lk.ijse.animalclinic.core.dto.VetDTO;
import lk.ijse.animalclinic.view.panels.SchedulePanel;
import lk.ijse.animalclinic.view.panels.VeterinaryPanel;

/**
 *
 * @author chamindu
 */
public class ViewAvailableVet extends javax.swing.JDialog {
    DefaultTableModel dtmVetShedule;
    private static String VID=null;
    /**
     * Creates new form ViewAvailableVet
     */
    public ViewAvailableVet(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        dtmVetShedule=(DefaultTableModel)tblVetShedule.getModel();
        loadTableByVetID();
        loadAllVetIDs();
        cmbDay.setSelectedIndex(-1);
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
        jLabel28 = new javax.swing.JLabel();
        cmbVetIDSearch = new org.jdesktop.swingx.JXComboBox();
        jLabel30 = new javax.swing.JLabel();
        cmbDay = new org.jdesktop.swingx.JXComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVetShedule = new org.jdesktop.swingx.JXTable();
        lblCancel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(250, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(250, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(40, 135, 173), 5));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setText("Vet.ID         -");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 100, 30));

        cmbVetIDSearch.setBackground(new java.awt.Color(250, 255, 255));
        cmbVetIDSearch.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbVetIDSearchItemStateChanged(evt);
            }
        });
        jPanel1.add(cmbVetIDSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 190, 30));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setText("Day           -");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 80, 30));

        cmbDay.setBackground(new java.awt.Color(250, 255, 255));
        cmbDay.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SunDay", "MonDay", "TuesDay", "WednesDay", "ThursDay", "FriDay", "SaturDay" }));
        cmbDay.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbDayItemStateChanged(evt);
            }
        });
        jPanel1.add(cmbDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 190, 30));

        tblVetShedule.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "VetID", "Vet First Name", "Vet Last Name", "Day", "In Time", "Out Time"
            }
        ));
        tblVetShedule.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVetSheduleMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblVetShedule);
        if (tblVetShedule.getColumnModel().getColumnCount() > 0) {
            tblVetShedule.getColumnModel().getColumn(2).setPreferredWidth(200);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 79, 1190, 410));

        lblCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/animalclinic/images/Cancel_48px.png"))); // NOI18N
        lblCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCancelMouseClicked(evt);
            }
        });
        jPanel1.add(lblCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 10, 50, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbVetIDSearchItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbVetIDSearchItemStateChanged
        try {
            if (cmbVetIDSearch.getSelectedIndex() == -1) {
                return;
            }
            VetDTO vet = VetController.searchVetByID(cmbVetIDSearch.getSelectedItem().toString());
            if (vet == null) {
                return;
            }
            loadTableByVetID();

        } catch (Exception ex) {
            Logger.getLogger(SchedulePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbVetIDSearchItemStateChanged

    private void cmbDayItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbDayItemStateChanged
        try {
            if(cmbDay.getSelectedIndex()==-1)return;
            ArrayList<SheduleDTO> sheduleByVID=SheduleController.getAllShedulesByDay(cmbDay.getSelectedItem().toString());
            if(sheduleByVID==null)return;
            dtmVetShedule.setRowCount(0);
            for (SheduleDTO sheduleDTO : sheduleByVID) {
                VetDTO vet=VetController.searchVetByID(sheduleDTO.getVID());
                Object[] rowData={sheduleDTO.getVID(),vet.getfName(),vet.getlName(),sheduleDTO.getDay(),sheduleDTO.getInTime(),sheduleDTO.getOutTime()};
                dtmVetShedule.addRow(rowData);
            }
        } catch (Exception ex) {
            Logger.getLogger(SchedulePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }//GEN-LAST:event_cmbDayItemStateChanged

    private void lblCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCancelMouseClicked
        this.dispose();
    }//GEN-LAST:event_lblCancelMouseClicked

    private void tblVetSheduleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVetSheduleMouseClicked
        VID=(String) tblVetShedule.getValueAt(tblVetShedule.getSelectedRow(),0);
        isSelected();
        this.dispose();
        
    }//GEN-LAST:event_tblVetSheduleMouseClicked

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
            java.util.logging.Logger.getLogger(ViewAvailableVet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAvailableVet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAvailableVet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAvailableVet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ViewAvailableVet dialog = new ViewAvailableVet(new javax.swing.JFrame(), true);
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
    private org.jdesktop.swingx.JXComboBox cmbDay;
    private org.jdesktop.swingx.JXComboBox cmbVetIDSearch;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCancel;
    private org.jdesktop.swingx.JXTable tblVetShedule;
    // End of variables declaration//GEN-END:variables
private void loadTableByVetID() {
        try {
            if(cmbVetIDSearch.getSelectedIndex()==-1)return;
            ArrayList<SheduleDTO> sheduleByVID=SheduleController.getAllShedulesByVetID(cmbVetIDSearch.getSelectedItem().toString());
            if(sheduleByVID==null)return;
            dtmVetShedule.setRowCount(0);
            for (SheduleDTO sheduleDTO : sheduleByVID) {
                VetDTO vet=VetController.searchVetByID(sheduleDTO.getVID());
                Object[] rowData={sheduleDTO.getVID(),vet.getfName(),vet.getlName(),sheduleDTO.getDay(),sheduleDTO.getInTime(),sheduleDTO.getOutTime()};
                dtmVetShedule.addRow(rowData);
            }
        } catch (Exception ex) {
            Logger.getLogger(SchedulePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    private void loadAllVetIDs() {
        try {
            ArrayList<VetDTO> allVet = VetController.getAllVets();
            cmbVetIDSearch.removeAllItems();
            if (allVet == null) {
                return;
            }
            for (VetDTO vet : allVet) {
                cmbVetIDSearch.addItem(vet.getVID());
            }
        } catch (Exception ex) {
            Logger.getLogger(ViewAvailableVet.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    public static String getVID(){
        return VID;
    }

    public static boolean isSelected() {
        return true;
    }
}