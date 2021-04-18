/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.animalclinic.dao.custom;

import java.util.ArrayList;
import java.util.Date;
import lk.ijse.animalclinic.core.dto.AppointmentDTO;
import lk.ijse.animalclinic.core.dto.OwnerDTO;
import lk.ijse.animalclinic.dao.SuperDAO;

/**
 *
 * @author chamindu
 */
public interface AppointmentDAO extends SuperDAO<AppointmentDTO>{
     public ArrayList<AppointmentDTO> getAllAppointments(Date date)throws Exception;
     public AppointmentDTO searchAppointmentByID(String id) throws Exception;
     public ArrayList<AppointmentDTO> searchAppointmentByDate(String date) throws Exception;
}
