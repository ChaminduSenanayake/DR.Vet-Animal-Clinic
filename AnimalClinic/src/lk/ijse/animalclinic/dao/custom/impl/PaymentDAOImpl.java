/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.animalclinic.dao.custom.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import lk.ijse.animalclinic.core.dto.OwnerDTO;
import lk.ijse.animalclinic.core.dto.PaymentDTO;
import lk.ijse.animalclinic.dao.custom.PaymentDAO;
import lk.ijse.animalclinic.dao.db.DBConnection;

/**
 *
 * @author chamindu
 */
public class PaymentDAOImpl implements PaymentDAO{

    @Override
    public boolean add(PaymentDTO payment) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "insert into payment values(?,?,?,?,?,?,?)";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, payment.getPaymentID());
        pstm.setObject(2, payment.getOID());
        pstm.setObject(3, payment.getPaymentDate());
        pstm.setObject(4, payment.getServiceCharge());
        pstm.setObject(5, payment.getTreatmentCharge());
        pstm.setObject(6, payment.getMedicineCharge());
        pstm.setObject(7, payment.getNetAmount());
        int rst = pstm.executeUpdate();
        return (rst > 0);
    }

    @Override
    public boolean remove(PaymentDTO payment) throws Exception {
       Connection connection = DBConnection.getInstance().getConnection();
        String sql = "Delete from payment where paymentID=?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1,payment.getPaymentID());
        int rst = pstm.executeUpdate();
        return (rst > 0);
    }

    @Override
    public boolean edit(PaymentDTO payment) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "update payment set OID=?,pDate=?,serviceCharge=?,treatmentCharge=?,medicineCharge =?,netAmount=? where paymentID=?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, payment.getOID());
        pstm.setObject(2, payment.getPaymentDate());
        pstm.setObject(3, payment.getServiceCharge());
        pstm.setObject(4, payment.getTreatmentCharge());
        pstm.setObject(5, payment.getMedicineCharge());
        pstm.setObject(6, payment.getNetAmount());
        pstm.setObject(7, payment.getPaymentID());
        int rst = pstm.executeUpdate();
        return (rst > 0);
    
    }

    @Override
    public PaymentDTO search(PaymentDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<PaymentDTO> getAll() throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select * from payment";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<PaymentDTO> allPayments = null;

        while (rst.next()) {
            if (allPayments == null) {
                allPayments = new ArrayList<>();
            }

            allPayments.add(new PaymentDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getDouble(4),
                    rst.getDouble(5),
                    rst.getDouble(6),
                    rst.getDouble(7)
            ));

        }

        return allPayments;
    }

    @Override
    public boolean removeByID(String id) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "Delete from payment where paymentID='"+id+"'";
        PreparedStatement pstm = connection.prepareStatement(sql);
        int rst = pstm.executeUpdate();
        return (rst > 0);
    }
    
    
}
