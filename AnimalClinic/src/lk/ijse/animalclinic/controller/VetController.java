/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.animalclinic.controller;

import java.util.ArrayList;
import static lk.ijse.animalclinic.controller.PetController.petDAO;
import lk.ijse.animalclinic.core.dto.AppointmentDTO;
import lk.ijse.animalclinic.core.dto.PetDTO;
import lk.ijse.animalclinic.core.dto.VetDTO;
import lk.ijse.animalclinic.dao.DAOFactory;
import lk.ijse.animalclinic.dao.custom.AppointmentDAO;
import lk.ijse.animalclinic.dao.custom.VetDAO;

/**
 *
 * @author chamindu
 */
public class VetController {
    public static VetDAO vetDAO = (VetDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.VET);

    public static boolean addVet(VetDTO vet) throws Exception {
        boolean result =vetDAO.add(vet);
        return result;
    }
     public static boolean editVet(VetDTO vet) throws  Exception  {
        boolean result = vetDAO.edit(vet);
        return result;
    }
     public static VetDTO searchVetByID(String id) throws  Exception  {
        VetDTO result = vetDAO.searchVetByID(id);
        return result;
    }
     public static VetDTO searchVetByName(String NIC) throws  Exception  {
        VetDTO result = vetDAO.searchVetByNIC(NIC);
        return result;
    }
     public static ArrayList<VetDTO> getAllVets()throws Exception{
        return vetDAO.getAll();
    }
      public static boolean removeVet(VetDTO vet)throws Exception{
        boolean result = vetDAO.remove(vet);
        return result;
    }
}
