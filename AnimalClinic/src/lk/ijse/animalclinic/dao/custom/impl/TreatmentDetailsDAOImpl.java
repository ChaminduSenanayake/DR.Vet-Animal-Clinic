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
import lk.ijse.animalclinic.core.dto.TreatmentDTO;
import lk.ijse.animalclinic.core.dto.TreatmentDetailsDTO;
import lk.ijse.animalclinic.dao.custom.TreatmentDetailsDAO;
import lk.ijse.animalclinic.dao.db.DBConnection;

/**
 *
 * @author chamindu
 */
public class TreatmentDetailsDAOImpl implements TreatmentDetailsDAO{

    @Override
    public boolean add(TreatmentDetailsDTO tDetails) throws Exception {
       Connection connection = DBConnection.getInstance().getConnection();
        String sql = "insert into treatmentDetails values(?,?,?,?,?)";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, tDetails.getTID());
        pstm.setObject(2, tDetails.getMID());
        pstm.setObject(3, tDetails.getMedicineQty());
        pstm.setObject(4, tDetails.getMedicineUnitPrice());
        pstm.setObject(5, tDetails.getMedicineAmount());
        int rst = pstm.executeUpdate();
        return (rst > 0);
    }

    @Override
    public boolean remove(TreatmentDetailsDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean edit(TreatmentDetailsDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TreatmentDetailsDTO search(TreatmentDetailsDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<TreatmentDetailsDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<TreatmentDetailsDTO> searchTreatmentDetails(String id) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        String SQL = "select * from treatmentDetails where TID='" + id + "'";
        ResultSet rst = stm.executeQuery(SQL);
        ArrayList<TreatmentDetailsDTO> allTreatmentDetails = null;

        while (rst.next()) {
            if (allTreatmentDetails == null) {
                allTreatmentDetails = new ArrayList<>();
            }
            allTreatmentDetails.add(new TreatmentDetailsDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getInt(3),
                    rst.getDouble(4),
                    rst.getDouble(5)
            ));
            
        }
    return allTreatmentDetails;
    }
    
}
