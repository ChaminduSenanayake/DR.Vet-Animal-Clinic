/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.animalclinic.dao.custom.impl;

import java.security.acl.Owner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.print.DocFlavor;
import lk.ijse.animalclinic.core.dto.OwnerDTO;
import lk.ijse.animalclinic.dao.custom.OwnerDAO;
import lk.ijse.animalclinic.dao.db.DBConnection;

/**
 *
 * @author chamindu
 */
public class OwnerDAOImpl implements OwnerDAO {

    @Override
    public boolean add(OwnerDTO Owner) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "insert into owner values(?,?,?,?,?,?)";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, Owner.getOID());
        pstm.setObject(2, Owner.getFirstName());
        pstm.setObject(3, Owner.getLastName());
        pstm.setObject(4, Owner.getAddress());
        pstm.setObject(5, Owner.getTel());
        pstm.setObject(6, Owner.getNIC());
        int rst = pstm.executeUpdate();
        return (rst > 0);
    }

    @Override
    public boolean remove(OwnerDTO owner) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "Delete from owner where OID=?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, owner.getOID());
        int rst = pstm.executeUpdate();
        return (rst > 0);
    }

    @Override
    public boolean edit(OwnerDTO owner) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "update owner set oFName=?,oLName=?,address=?,tel=?,NIC=? where OID=?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, owner.getFirstName());
        pstm.setObject(2, owner.getLastName());
        pstm.setObject(3, owner.getAddress());
        pstm.setObject(4, owner.getTel());
        pstm.setObject(5, owner.getNIC());
        pstm.setObject(6, owner.getOID());
        int rst = pstm.executeUpdate();
        return (rst > 0);
    }

    @Override
    public ArrayList<OwnerDTO> getAll() throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select * from owner";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<OwnerDTO> allOwners = null;

        while (rst.next()) {
            if (allOwners == null) {
                allOwners = new ArrayList<>();
            }

            allOwners.add(new OwnerDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6)
            ));

        }

        return allOwners;
    }

    @Override
    public OwnerDTO searchOwnerByID(String id) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        String SQL = "select * from owner where OID='" + id + "'";
        ResultSet rst = stm.executeQuery(SQL);

        if (rst.next()) {
            return new OwnerDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6));
        }

        return null;
    }

    @Override
    public OwnerDTO searchByNIC(String NIC) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        String SQL = "select * from owner where NIC='" + NIC + "'";
        ResultSet rst = stm.executeQuery(SQL);
        if (rst.next()) {
            return new OwnerDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6));
        }

        return null;
    }

    @Override
    public OwnerDTO search(OwnerDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
