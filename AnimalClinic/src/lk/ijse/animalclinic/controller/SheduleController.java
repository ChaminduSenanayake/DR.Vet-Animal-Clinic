/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.animalclinic.controller;

import java.util.ArrayList;
import lk.ijse.animalclinic.core.dto.OwnerDTO;
import lk.ijse.animalclinic.core.dto.SheduleDTO;
import lk.ijse.animalclinic.dao.DAOFactory;
import lk.ijse.animalclinic.dao.custom.OwnerDAO;
import lk.ijse.animalclinic.dao.custom.SheduleDAO;

/**
 *
 * @author chamindu
 */
public class SheduleController {

    public static SheduleDAO sheduleDAO = (SheduleDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.SHEDULE);

    public static boolean addShedule(SheduleDTO shedule) throws Exception {
        boolean result = sheduleDAO.add(shedule);
        return result;
    }

    public static boolean editShedule(SheduleDTO shedule) throws Exception {
        boolean result = sheduleDAO.edit(shedule);
        return result;
    }

    public static SheduleDTO searchSheduleByVet(String id) throws Exception {
        SheduleDTO result = sheduleDAO.searchSheduleByVetID(id);
        return result;
    }

    public static SheduleDTO searchSheduleByID(String id) throws Exception {
        SheduleDTO result = sheduleDAO.searchSheduleByID(id);
        return result;
    }

    public static ArrayList<SheduleDTO> getAllShedules() throws Exception {
        return sheduleDAO.getAll();
    }

    public static boolean removeShedule(SheduleDTO shedule) throws Exception {
        boolean result = sheduleDAO.remove(shedule);
        return result;
    }

    public static ArrayList<SheduleDTO> getAllShedulesByVetID(String id) throws Exception {
        return sheduleDAO.getAllShedulesByVetID(id);
    }

    public static ArrayList<SheduleDTO> getAllShedulesByDay(String day) throws Exception {
        return sheduleDAO.getAllShedulesByDay(day);
    }
}
