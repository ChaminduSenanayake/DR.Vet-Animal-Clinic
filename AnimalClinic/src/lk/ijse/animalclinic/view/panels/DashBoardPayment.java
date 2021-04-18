/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.animalclinic.view.panels;

import lk.ijse.animalclinic.view.panels.MakePayementPanel;
import lk.ijse.animalclinic.view.panels.ViewPaymentPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import lk.ijse.animalclinic.view.HomeFrame;

/**
 *
 * @author chamindu
 */
public class DashBoardPayment extends javax.swing.JPanel {

    /**
     * Creates new form PaymentDashBoard
     */
    public DashBoardPayment() {
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

        jPanel33 = new javax.swing.JPanel();
        lblMakePayment = new javax.swing.JLabel();
        lblViewPayment = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblAddTreatment = new javax.swing.JLabel();

        jPanel33.setBackground(new java.awt.Color(42, 42, 42));
        jPanel33.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMakePayment.setBackground(new java.awt.Color(42, 42, 42));
        lblMakePayment.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblMakePayment.setForeground(new java.awt.Color(204, 204, 204));
        lblMakePayment.setText("   Make Payment");
        lblMakePayment.setOpaque(true);
        lblMakePayment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMakePaymentMouseClicked(evt);
            }
        });
        jPanel33.add(lblMakePayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 240, 70));

        lblViewPayment.setBackground(new java.awt.Color(42, 42, 42));
        lblViewPayment.setFont(new java.awt.Font("Verdana", 1, 17)); // NOI18N
        lblViewPayment.setForeground(new java.awt.Color(204, 204, 204));
        lblViewPayment.setText("   View Payment");
        lblViewPayment.setOpaque(true);
        lblViewPayment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblViewPaymentMouseClicked(evt);
            }
        });
        jPanel33.add(lblViewPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 238, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/animalclinic/images/coin-stack.png"))); // NOI18N
        jPanel33.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 140, 420));

        lblAddTreatment.setBackground(new java.awt.Color(40, 135, 173));
        lblAddTreatment.setFont(new java.awt.Font("Verdana", 1, 17)); // NOI18N
        lblAddTreatment.setForeground(new java.awt.Color(204, 204, 204));
        lblAddTreatment.setText("   Add Pet Treatment");
        lblAddTreatment.setOpaque(true);
        lblAddTreatment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddTreatmentMouseClicked(evt);
            }
        });
        jPanel33.add(lblAddTreatment, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblMakePaymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMakePaymentMouseClicked
        setLabelBackGround (lblAddTreatment,lblViewPayment,lblMakePayment);
        MakePayementPanel makePay=new MakePayementPanel();
        JPanel middlePanel = HomeFrame.getMiddlePanel();
        middlePanel.removeAll();
        makePay.setSize(middlePanel.getSize());
        middlePanel.add(makePay);
        middlePanel.revalidate();
        middlePanel.repaint();
    }//GEN-LAST:event_lblMakePaymentMouseClicked

    private void lblViewPaymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViewPaymentMouseClicked
        setLabelBackGround (lblMakePayment, lblAddTreatment,lblViewPayment);
        ViewPaymentPanel viewPanel=new ViewPaymentPanel();
        JPanel middlePanel = HomeFrame.getMiddlePanel();
        middlePanel.removeAll();
        viewPanel.setSize(middlePanel.getSize());
        middlePanel.add(viewPanel);
        middlePanel.revalidate();
        middlePanel.repaint();
    }//GEN-LAST:event_lblViewPaymentMouseClicked

    private void lblAddTreatmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddTreatmentMouseClicked
        setLabelBackGround (lblMakePayment,lblViewPayment, lblAddTreatment);
        AddPetTreatmentPanel addTreatmentPanel = new AddPetTreatmentPanel();
        JPanel middlePanel = HomeFrame.getMiddlePanel();
        middlePanel.removeAll();
        addTreatmentPanel.setSize(middlePanel.getSize());
        middlePanel.add(addTreatmentPanel);
        middlePanel.revalidate();
        middlePanel.repaint();
    }//GEN-LAST:event_lblAddTreatmentMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JLabel lblAddTreatment;
    private javax.swing.JLabel lblMakePayment;
    private javax.swing.JLabel lblViewPayment;
    // End of variables declaration//GEN-END:variables
public void setLabelBackGround(JLabel lbl1,JLabel lbl2,JLabel lblSelected){
    lbl1.setBackground(new Color(42, 42, 42));
    lbl2.setBackground(new Color(42, 42, 42));
    lblSelected.setBackground(new Color(40, 135, 173));
}
}