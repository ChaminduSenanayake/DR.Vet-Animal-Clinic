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
import lk.ijse.animalclinic.core.dto.PetDTO;
import lk.ijse.animalclinic.core.dto.VetDTO;
import lk.ijse.animalclinic.dao.custom.VetDAO;
import lk.ijse.animalclinic.dao.db.DBConnection;

/**
 *
 * @author chamindu
 */
public class VetDAOImpl implements VetDAO {

    @Override
    public boolean add(VetDTO vet) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "insert into vet values(?,?,?,?,?,?,?)";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, vet.getVID());
        pstm.setObject(2, vet.getfName());
        pstm.setObject(3, vet.getlName());
        pstm.setObject(4, vet.getNIC());
        pstm.setObject(5, vet.getAddress());
        pstm.setObject(6, vet.getTel());
        pstm.setObject(7, vet.getDescription());
        int rst = pstm.executeUpdate();
        return (rst > 0);
    }

    @Override
    public boolean remove(VetDTO vet) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "Delete from vet where VID=?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, vet.getVID());
        int rst = pstm.executeUpdate();
        return (rst > 0);
    }

    @Override
    public boolean edit(VetDTO vet) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "update vet set fName=?,lName=?,NIC=?,vAddress=?,tel=?,description=? where VID=?";
        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setObject(1, vet.getfName());
        pstm.setObject(2, vet.getlName());
        pstm.setObject(3, vet.getNIC());
        pstm.setObject(4, vet.getAddress());
        pstm.setObject(5, vet.getTel());
        pstm.setObject(6, vet.getDescription());
        pstm.setObject(7, vet.getVID());
        int rst = pstm.executeUpdate();
        return (rst > 0);
    }

    @Override
    public ArrayList<VetDTO> getAll() throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select * from vet";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<VetDTO> allVet = null;

        while (rst.next()) {
            if (allVet == null) {
                allVet = new ArrayList<>();
            }

            allVet.add(new VetDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6),
                    rst.getString(7)));
        }
        return allVet;

    }

    @Override
    public VetDTO searchVetByID(String id) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select * from vet where VID='" + id + "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        if (rst.next()) {
            return new VetDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6),
                    rst.getString(7));
        }
        return null;

    }

    @Override
    public VetDTO searchVetByNIC(String NIC) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select * from vet where NIC='" + NIC + "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        if (rst.next()) {
            return new VetDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6),
                    rst.getString(7));
        }
        return null;
    }

    @Override
    public VetDTO search(VetDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
