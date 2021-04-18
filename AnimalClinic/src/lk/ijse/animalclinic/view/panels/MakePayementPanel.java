/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.animalclinic.view.panels;

import java.awt.Dialog;
import java.sql.Connection;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import lk.ijse.animalclinic.controller.OwnerController;
import lk.ijse.animalclinic.controller.PaymentController;
import lk.ijse.animalclinic.core.dto.OwnerDTO;
import lk.ijse.animalclinic.core.dto.PaymentDTO;
import lk.ijse.animalclinic.dao.db.DBConnection;
import lk.ijse.jasper.IJSEJasperViewer;
import lk.ijse.jasper.JasperUtil;
import lk.ijse.jasper.Report;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperReportsContext;

/**
 *
 * @author chamindu
 */
@Report("lk.ijse.animalclinic.reports")
public class MakePayementPanel extends javax.swing.JPanel {

    /**
     * Creates new form PayementDashBoard
     */
    public MakePayementPanel() {
        initComponents();
        txtPaymentDate.setText(AddPetTreatmentPanel.getPaymentDate());
        txtPaymentID.setText(AddPetTreatmentPanel.getPaymentID2());
        txtTreatmentCharge.setText(AddPetTreatmentPanel.getTreatmentCharge());
        txtMedicineCharge.setText(AddPetTreatmentPanel.getMeidicneCharge());
        //txtServiceCharge.setText("266");
        txtOwnerID.setText(AddPetTreatmentPanel.getOwnerID());
        try {
            OwnerDTO owner=OwnerController.searchOwnerByID(AddPetTreatmentPanel.getOwnerID());
            txtOwnerFName.setText(owner.getFirstName()+" "+owner.getLastName());
        } catch (Exception ex) {
            Logger.getLogger(MakePayementPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        jLabel41 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        txtServiceCharge = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        txtBalance = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        txtPaymentDate = new javax.swing.JTextField();
        txtTreatmentCharge = new javax.swing.JTextField();
        txtPaidAmount = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        txtMedicineCharge = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        txtOwnerID = new javax.swing.JTextField();
        btnSave = new javax.swing.JLabel();
        txtPaymentID = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        txtOwnerFName = new org.jdesktop.swingx.JXTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        txtNetAmount = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.setPreferredSize(new java.awt.Dimension(160, 30));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel41.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(204, 204, 204));
        jLabel41.setText("Payment");
        jPanel1.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 40));

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel43.setText("Owner Name          -");
        jPanel1.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 140, 30));

        txtServiceCharge.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtServiceCharge.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtServiceCharge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtServiceChargeActionPerformed(evt);
            }
        });
        jPanel1.add(txtServiceCharge, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 260, 30));

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel44.setText("Owner.ID                -");
        jLabel44.setPreferredSize(new java.awt.Dimension(160, 30));
        jPanel1.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 160, 30));

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel48.setText("Treatment Charge  -");
        jLabel48.setPreferredSize(new java.awt.Dimension(160, 30));
        jPanel1.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 160, 30));

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel49.setText("Payment Date         -");
        jLabel49.setPreferredSize(new java.awt.Dimension(160, 30));
        jPanel1.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 160, 30));

        txtBalance.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBalance.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 590, 260, 30));

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel50.setText("Paid Amount           -");
        jLabel50.setPreferredSize(new java.awt.Dimension(160, 30));
        jPanel1.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 160, 30));

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel51.setText("Service Charge        -");
        jLabel51.setPreferredSize(new java.awt.Dimension(160, 30));
        jPanel1.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 160, 30));

        txtPaymentDate.setEditable(false);
        txtPaymentDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPaymentDate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtPaymentDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 260, 30));

        txtTreatmentCharge.setEditable(false);
        txtTreatmentCharge.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTreatmentCharge.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtTreatmentCharge, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 260, 30));

        txtPaidAmount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPaidAmount.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPaidAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaidAmountActionPerformed(evt);
            }
        });
        jPanel1.add(txtPaidAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 530, 260, 30));

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel53.setText("Blance                      -");
        jLabel53.setPreferredSize(new java.awt.Dimension(160, 30));
        jPanel1.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, 160, 30));

        txtMedicineCharge.setEditable(false);
        txtMedicineCharge.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMedicineCharge.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtMedicineCharge, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 260, 30));

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel54.setText("Net Amount            -");
        jLabel54.setPreferredSize(new java.awt.Dimension(160, 30));
        jPanel1.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 160, 30));

        txtOwnerID.setEditable(false);
        txtOwnerID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtOwnerID.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtOwnerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 260, 30));

        btnSave.setBackground(new java.awt.Color(102, 102, 102));
        btnSave.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("        Save");
        btnSave.setOpaque(true);
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveMouseClicked(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 650, 180, 60));

        txtPaymentID.setEditable(false);
        txtPaymentID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPaymentID.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtPaymentID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 260, 30));

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel46.setText("Payment.ID            -");
        jLabel46.setPreferredSize(new java.awt.Dimension(160, 30));
        jPanel1.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 160, 30));

        txtOwnerFName.setEditable(false);
        txtOwnerFName.setPrompt("First Name");
        jPanel1.add(txtOwnerFName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 260, 30));

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("         Print");
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 650, 180, 60));

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel52.setText("Medicine Charge     -");
        jLabel52.setPreferredSize(new java.awt.Dimension(160, 30));
        jPanel1.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 160, 30));

        txtNetAmount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNetAmount.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtNetAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, 260, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/animalclinic/images/reportprint.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 40, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/animalclinic/images/reportprint.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 400, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        getNetAmount();
        PaymentDTO payment = new PaymentDTO(txtPaymentID.getText(),txtOwnerID.getText(),txtPaymentDate.getText(),
                Double.parseDouble(txtServiceCharge.getText()), 
                Double.parseDouble(txtTreatmentCharge.getText()), 
                Double.parseDouble(txtMedicineCharge.getText()), 
                Double.parseDouble(txtNetAmount.getText()));
        try {
            boolean result = PaymentController.updatePayment(payment);

            if (result) {
                JOptionPane.showMessageDialog(this, "Payment has been successfully Added.");

            } else {
                JOptionPane.showMessageDialog(this, "Payment hasn't been edited due to some error");
            }

        } catch (Exception ex) {
            Logger.getLogger(AddAppointmentPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }//GEN-LAST:event_btnSaveMouseClicked

    private void txtServiceChargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtServiceChargeActionPerformed
        getNetAmount();
        txtPaidAmount.requestFocus();
    }//GEN-LAST:event_txtServiceChargeActionPerformed

    private void txtPaidAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaidAmountActionPerformed
        double netAmount = Double.parseDouble(txtNetAmount.getText());
        double balance=Double.parseDouble(txtPaidAmount.getText())-netAmount;
        txtBalance.setText(Double.toString(balance));
        txtBalance.requestFocus();
    }//GEN-LAST:event_txtPaidAmountActionPerformed

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        JasperUtil.init(MakePayementPanel.class);

        JasperReportsContext ctx = JasperUtil.getReportContext();

        try {
            JasperReport compiledReport = JasperUtil.getCompiledReport("Treatment.jasper");

            JasperFillManager fillManager = JasperFillManager.getInstance(ctx);

            HashMap<String, Object> reportParams = new HashMap<>();
            reportParams.put("paymentID", txtPaymentID.getText());
            Connection conn=DBConnection.getInstance().getConnection();
            JasperPrint filledReport = fillManager.
                    fill(compiledReport, reportParams, conn);
            
            IJSEJasperViewer frmJasperViewer = new IJSEJasperViewer(filledReport);
            frmJasperViewer.setTitle("My Report");
            frmJasperViewer.setSize(1600,720);
            frmJasperViewer.setModalExclusionType(Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
            frmJasperViewer.setVisible(true);
            
        } catch (JRException ex) {
            Logger.getLogger(MakePayementPanel.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
       JasperUtil.init(MakePayementPanel.class);

        JasperReportsContext ctx = JasperUtil.getReportContext();

        try {
            JasperReport compiledReport = JasperUtil.getCompiledReport("MedicineDetails.jasper");

            JasperFillManager fillManager = JasperFillManager.getInstance(ctx);

            HashMap<String, Object> reportParams = new HashMap<>();
            reportParams.put("paymentID", txtPaymentID.getText());
            Connection conn=DBConnection.getInstance().getConnection();
            JasperPrint filledReport = fillManager.
                    fill(compiledReport, reportParams, conn);
            
            IJSEJasperViewer frmJasperViewer = new IJSEJasperViewer(filledReport);
            frmJasperViewer.setTitle("My Report");
            frmJasperViewer.setSize(1600,720);
            frmJasperViewer.setModalExclusionType(Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
            frmJasperViewer.setVisible(true);
            
        } catch (JRException ex) {
            Logger.getLogger(MakePayementPanel.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_jLabel1MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtBalance;
    private javax.swing.JTextField txtMedicineCharge;
    private javax.swing.JTextField txtNetAmount;
    private org.jdesktop.swingx.JXTextField txtOwnerFName;
    private javax.swing.JTextField txtOwnerID;
    private javax.swing.JTextField txtPaidAmount;
    private javax.swing.JTextField txtPaymentDate;
    private javax.swing.JTextField txtPaymentID;
    private javax.swing.JTextField txtServiceCharge;
    private javax.swing.JTextField txtTreatmentCharge;
    // End of variables declaration//GEN-END:variables

    private void getNetAmount() {
       Double sCharge=Double.parseDouble(txtServiceCharge.getText());
       Double tCharge=Double.parseDouble(txtTreatmentCharge.getText());
       Double mCharge=Double.parseDouble(txtMedicineCharge.getText());
       Double netAmount=sCharge+tCharge+mCharge;
       txtNetAmount.setText(Double.toString(netAmount));
    }

}
