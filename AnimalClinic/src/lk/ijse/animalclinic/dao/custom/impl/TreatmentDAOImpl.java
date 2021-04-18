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
import lk.ijse.animalclinic.core.dto.SheduleDTO;
import lk.ijse.animalclinic.core.dto.TreatmentDTO;
import lk.ijse.animalclinic.dao.custom.TreatmentDAO;
import lk.ijse.animalclinic.dao.db.DBConnection;

/**
 *
 * @author chamindu
 */
public class TreatmentDAOImpl implements TreatmentDAO{

    @Override
    public boolean add(TreatmentDTO treatment) throws Exception {
       Connection connection = DBConnection.getInstance().getConnection();
        String sql = "insert into treatment values(?,?,?,?,?,?,?)";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, treatment.getTID());
        pstm.setObject(2, treatment.getPID());
        pstm.setObject(3, treatment.getVID());
        pstm.setObject(4, treatment.getPaymentID());
        pstm.setObject(5, treatment.getDiagnosis());
        pstm.setObject(6, treatment.getDescription());
        pstm.setObject(7, treatment.getTreatmentCharge());
        int rst = pstm.executeUpdate();
        return (rst > 0);
    }

    @Override
    public boolean remove(TreatmentDTO treatment) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "Delete from treatment where TID=?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, treatment.getTID());
        int rst = pstm.executeUpdate();
        return (rst > 0);  
    }

    @Override
    public boolean edit(TreatmentDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TreatmentDTO search(TreatmentDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<TreatmentDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<TreatmentDTO> searchByPaymentID(String id) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        String SQL = "select * from treatment where paymentID='" + id + "'";
        ResultSet rst = stm.executeQuery(SQL);
        ArrayList<TreatmentDTO> allTreatment = null;

        while (rst.next()) {
            if (allTreatment == null) {
                allTreatment = new ArrayList<>();
            }
            allTreatment.add(new TreatmentDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6),
                    rst.getDouble(7)
            ));
            
        }
    return allTreatment;
    }
    
    
}

 
