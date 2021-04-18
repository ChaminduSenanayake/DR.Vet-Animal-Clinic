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
import lk.ijse.animalclinic.core.dto.PetDTO;
import lk.ijse.animalclinic.core.dto.SheduleDTO;
import lk.ijse.animalclinic.dao.custom.SheduleDAO;
import lk.ijse.animalclinic.dao.db.DBConnection;

/**
 *
 * @author chamindu
 */
public class SheduleDAOImpl implements SheduleDAO {

    @Override
    public boolean add(SheduleDTO shedule) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "insert into shedule values(?,?,?,?,?)";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, shedule.getSID());
        pstm.setObject(2, shedule.getVID());
        pstm.setObject(3, shedule.getDay());
        pstm.setObject(4, shedule.getInTime());
        pstm.setObject(5, shedule.getOutTime());

        int rst = pstm.executeUpdate();
        return (rst > 0);
    }

    @Override
    public boolean remove(SheduleDTO shedule) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "Delete from shedule where SID=?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, shedule.getSID());
        int rst = pstm.executeUpdate();
        return (rst > 0);
    }

    @Override
    public boolean edit(SheduleDTO shedule) throws Exception {
       Connection connection = DBConnection.getInstance().getConnection();
        String sql = "update shedule set VID=?,day=?,inTime=?,outTime=? where SID=?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, shedule.getVID());
        pstm.setObject(2, shedule.getDay());
        pstm.setObject(3, shedule.getInTime());
        pstm.setObject(4, shedule.getOutTime());
        pstm.setObject(5, shedule.getSID());
        int rst = pstm.executeUpdate();
        return (rst > 0);
    }

    @Override
    public SheduleDTO search(SheduleDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<SheduleDTO> getAll() throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select * from shedule";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<SheduleDTO> allShedules = null;

        while (rst.next()) {
            if (allShedules == null) {
                allShedules = new ArrayList<>();
            }

            allShedules.add(new SheduleDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5)
                    
            ));

        }

        return allShedules;
    }

    @Override
    public SheduleDTO searchSheduleByVetID(String id) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        String SQL = "select * from shedule where VID='" + id + "'";
        ResultSet rst = stm.executeQuery(SQL);

        if (rst.next()) {
            return new SheduleDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5));
        }

        return null;
    }

   

    @Override
    public SheduleDTO searchSheduleByID(String id) throws Exception {
         Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        String SQL = "select * from shedule where SID='" + id + "'";
        ResultSet rst = stm.executeQuery(SQL);

        if (rst.next()) {
            return new SheduleDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5));
        }

        return null;
    }

    @Override
    public ArrayList<SheduleDTO> getAllShedulesByVetID(String id) throws Exception {
       Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select * from shedule where VID='"+id+"'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<SheduleDTO> allShedules = null;

        while (rst.next()) {
            if (allShedules == null) {
                allShedules = new ArrayList<>();
            }

            allShedules.add(new SheduleDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5)
                    
            ));

        }

        return allShedules;
    
    }

    @Override
    public ArrayList<SheduleDTO> getAllShedulesByDay(String day) throws Exception {
       Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select * from shedule where Day='"+day+"'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<SheduleDTO> allShedules = null;
        while (rst.next()) {
            if (allShedules == null) {
                allShedules = new ArrayList<>();
            }

            allShedules.add(new SheduleDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5)));

        }
        return allShedules;
    }

    

}
