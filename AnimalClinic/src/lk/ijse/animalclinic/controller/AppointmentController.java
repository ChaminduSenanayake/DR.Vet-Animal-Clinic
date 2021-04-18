/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.animalclinic.controller;

import java.util.ArrayList;
import java.util.Date;
import static lk.ijse.animalclinic.controller.MedicineController.medicineDAO;
import lk.ijse.animalclinic.core.dto.AppointmentDTO;
import lk.ijse.animalclinic.core.dto.MedicineDTO;
import lk.ijse.animalclinic.core.dto.PetDTO;
import lk.ijse.animalclinic.dao.DAOFactory;
import lk.ijse.animalclinic.dao.custom.AppointmentDAO;
import lk.ijse.animalclinic.dao.custom.PetDAO;

/**
 *
 * @author chamindu
 */
public class AppointmentController {
    public static AppointmentDAO appointmentDAO = (AppointmentDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.APPOINTMENT);

    public static boolean addAppointment(AppointmentDTO appointment) throws Exception {
        boolean result = appointmentDAO.add(appointment);
        return result;
    }
    public static boolean removeAppointment(AppointmentDTO appointment)throws Exception{
        boolean result = appointmentDAO.remove(appointment);
        return result;
    }
    public static boolean editAppointment(AppointmentDTO appointment) throws Exception {
        boolean result = appointmentDAO.edit(appointment);
        return result;
    }
    public static ArrayList<AppointmentDTO> getAllAppointments(Date date)throws Exception{
        return appointmentDAO.getAllAppointments(date);
    }
    public static ArrayList<AppointmentDTO> getAll()throws Exception{
        return appointmentDAO.getAll();
    }
    public static AppointmentDTO searchAppointmentByID(String id)throws Exception {
        AppointmentDTO result = appointmentDAO.searchAppointmentByID(id);
        return result;
    }
    public static ArrayList<AppointmentDTO> searchAppointmentByDate(String date)throws Exception {
         return appointmentDAO.searchAppointmentByDate(date);
        
    }
}
