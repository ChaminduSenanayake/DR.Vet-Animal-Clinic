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
import java.util.Date;
import lk.ijse.animalclinic.core.dto.AppointmentDTO;
import lk.ijse.animalclinic.core.dto.OwnerDTO;
import lk.ijse.animalclinic.dao.custom.AppointmentDAO;
import lk.ijse.animalclinic.dao.db.DBConnection;

/**
 *
 * @author chamindu
 */
public class AppointmentDAOImpl implements AppointmentDAO {

    @Override
    public boolean add(AppointmentDTO appointment) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "insert into appointment values(?,?,?,?,?,?)";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, appointment.getAppID());
        pstm.setObject(2, appointment.getOwnerID());
        pstm.setObject(3, appointment.getPetID());
        pstm.setObject(4, appointment.getVetID());
        pstm.setObject(5, appointment.getDate());
        pstm.setObject(6, appointment.getTime());
        int rst = pstm.executeUpdate();
        return (rst > 0);
    }

    @Override
    public boolean remove(AppointmentDTO appointment) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "Delete from appointment where AID=?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, appointment.getAppID());
        int rst = pstm.executeUpdate();
        return (rst > 0);
    }

    @Override
    public boolean edit(AppointmentDTO appointment) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "update appointment set VID=?,PID=?,date=?,time=? where AID=? ";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, appointment.getVetID());
        pstm.setObject(2, appointment.getPetID());
        pstm.setObject(3, appointment.getDate());
        pstm.setObject(4, appointment.getDate());
        pstm.setObject(5, appointment.getAppID());
        int rst = pstm.executeUpdate();
        return (rst > 0);
    }


    @Override
    public ArrayList<AppointmentDTO> getAll() throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select * from appointment";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<AppointmentDTO> allApp = null;

        while (rst.next()) {
            if (allApp == null) {
                allApp = new ArrayList<>();
            }

            allApp.add(new AppointmentDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6)
            ));

        }

        return allApp;
    }

    @Override
    public AppointmentDTO search(AppointmentDTO app) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select * from appointment where AID='" +app.getAppID() + "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        if (rst.next()) {
            return new AppointmentDTO(
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
    public ArrayList<AppointmentDTO> getAllAppointments(Date date) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select * from appointment where date='"+date+"'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<AppointmentDTO> allApp = null;

        while (rst.next()) {
            if (allApp == null) {
                allApp = new ArrayList<>();
            }

            allApp.add(new AppointmentDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6)
            ));

        }

        return allApp;
    }

    @Override
    public AppointmentDTO searchAppointmentByID(String id) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        String SQL = "select * from appointment where AID='" + id + "'";
        ResultSet rst = stm.executeQuery(SQL);

        if (rst.next()) {
            return new AppointmentDTO(
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
    public ArrayList<AppointmentDTO> searchAppointmentByDate(String date) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        String SQL = "select * from appointment where date='" + date + "'";
        ResultSet rst = stm.executeQuery(SQL);
        ArrayList<AppointmentDTO> allApp = null;

        while (rst.next()) {
            if (allApp == null) {
                allApp = new ArrayList<>();
            }

            allApp.add(new AppointmentDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6)
            ));

        }

        return allApp;
    }
   

}
