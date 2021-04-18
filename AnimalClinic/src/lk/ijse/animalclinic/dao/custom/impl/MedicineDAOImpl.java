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
import lk.ijse.animalclinic.core.dto.MedicineDTO;
import lk.ijse.animalclinic.core.dto.OwnerDTO;
import lk.ijse.animalclinic.dao.custom.MedicineDAO;
import lk.ijse.animalclinic.dao.db.DBConnection;

/**
 *
 * @author chamindu
 */
public class MedicineDAOImpl implements MedicineDAO {

    @Override
    public boolean add(MedicineDTO medicine) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "insert into medicine values(?,?,?,?,?,?)";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, medicine.getMID());
        pstm.setObject(2, medicine.getDescription());
        pstm.setObject(3, medicine.getType());
        pstm.setObject(4, medicine.getExpireDate());
        pstm.setObject(5, medicine.getPrice());
        pstm.setObject(6, medicine.getQtyOnHand());
        int rst = pstm.executeUpdate();
        return (rst > 0);
    }

    @Override
    public boolean remove(MedicineDTO medicine) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "Delete from medicine where MID=?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, medicine.getMID());
        int rst = pstm.executeUpdate();
        return (rst > 0);
    }

    @Override
    public boolean edit(MedicineDTO medicine) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "update medicine set description=?,type=?,expireDate=?,price=?,qtyOnHand=? where MID=? ";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, medicine.getDescription());
        pstm.setObject(2, medicine.getType());
        pstm.setObject(3, medicine.getExpireDate());
        pstm.setObject(4, medicine.getPrice());
        pstm.setObject(5, medicine.getQtyOnHand());
        pstm.setObject(6, medicine.getMID());
        int rst = pstm.executeUpdate();
        return (rst > 0);
    }

    @Override
    public MedicineDTO search(MedicineDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<MedicineDTO> getAll() throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select * from medicine";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<MedicineDTO> allMed = null;

        while (rst.next()) {
            if (allMed == null) {
                allMed = new ArrayList<>();
            }

            allMed.add(new MedicineDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getDouble(5),
                    rst.getInt(6)
            ));

        }
        return allMed;

    }

    @Override
    public MedicineDTO searchMedicineByID(String id) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        String SQL = "select * from medicine where MID='" + id + "'";
        ResultSet rst = stm.executeQuery(SQL);

        if (rst.next()) {
            return new MedicineDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getDouble(5),
                    rst.getInt(6));
        }

        return null;
    }

    @Override
    public ArrayList<MedicineDTO> searchMedicineByType(String type) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        String SQL = "select * from medicine where type='" + type + "'";
        ResultSet rst = stm.executeQuery(SQL);
        ArrayList<MedicineDTO> allMed = null;
        while (rst.next()) {
            if (allMed == null) {
                allMed = new ArrayList<>();
            }

            allMed.add(new MedicineDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getDouble(5),
                    rst.getInt(6)
            ));

        }
        return allMed;

    }

    @Override
    public boolean updateMedicineByID(String id, int qtyOnHand) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "update medicine set qtyOnHand=? where MID=? ";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, qtyOnHand);
        pstm.setObject(2, id);
        int rst = pstm.executeUpdate();
        return (rst > 0);
    }
}
