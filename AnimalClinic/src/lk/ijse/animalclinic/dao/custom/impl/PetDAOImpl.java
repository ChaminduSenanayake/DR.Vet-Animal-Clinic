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
import lk.ijse.animalclinic.core.dto.AppointmentDTO;
import lk.ijse.animalclinic.core.dto.PetDTO;
import lk.ijse.animalclinic.dao.custom.PetDAO;
import lk.ijse.animalclinic.dao.db.DBConnection;

/**
 *
 * @author chamindu
 */
public class PetDAOImpl implements PetDAO {

    @Override
    public boolean add(PetDTO pet) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "insert into pet values(?,?,?,?,?,?,?,?)";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, pet.getOwnerID());
        pstm.setObject(2, pet.getPetID());
        pstm.setObject(3, pet.getPetName());
        pstm.setObject(4, pet.getSex());
        pstm.setObject(5, pet.getBreed());
        pstm.setObject(6, pet.getDOB());
        pstm.setObject(7, pet.getWeight());
        pstm.setObject(8, pet.getDescription());
        int rst = pstm.executeUpdate();
        return (rst > 0);
    }

    @Override
    public boolean remove(PetDTO pet) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "Delete from pet where PID=?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, pet.getPetID());
        int rst = pstm.executeUpdate();
        return (rst > 0);
    }

    @Override
    public boolean edit(PetDTO pet) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "update pet set OID=?,pName=?,sex=?,breed=?,DOB =?,weight=?,description=? where PID=?";
        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setObject(1, pet.getOwnerID());
        pstm.setObject(2, pet.getPetName());
        pstm.setObject(3, pet.getSex());
        pstm.setObject(4, pet.getBreed());
        pstm.setObject(5, pet.getDOB());
        pstm.setObject(6, pet.getWeight());
        pstm.setObject(7, pet.getDescription());
        pstm.setObject(8, pet.getPetID());
        int rst = pstm.executeUpdate();
        return (rst > 0);
    }

    @Override
    public ArrayList<PetDTO> getAll() throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select * from pet";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<PetDTO> allPet = null;

        while (rst.next()) {
            if (allPet == null) {
                allPet = new ArrayList<>();
            }

            allPet.add(new PetDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6),
                    rst.getDouble(7),
                    rst.getString(8)));
        }
        return allPet;
    }

    @Override
    public PetDTO searchPetByID(String id) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select * from pet where PID='" + id + "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        if (rst.next()) {
            return new PetDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6),
                    rst.getDouble(7),
                    rst.getString(8));
        }
        return null;
    }

    @Override
    public PetDTO searchPetByName(String name) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select * from pet where pName='" + name + "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        if (rst.next()) {
            return new PetDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6),
                    rst.getDouble(7),
                    rst.getString(8));
        }
        return null;
    }

    @Override
    public PetDTO search(PetDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<PetDTO> getPets(String ownerID) throws Exception {
      Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select * from pet where OID='"+ownerID+"'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<PetDTO> allPet = null;

        while (rst.next()) {
            if (allPet == null) {
                allPet = new ArrayList<>();
            }

            allPet.add(new PetDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6),
                    rst.getDouble(7),
                    rst.getString(8)));
        }
        return allPet;
    }

}
