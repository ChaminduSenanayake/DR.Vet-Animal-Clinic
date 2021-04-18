/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.animalclinic.controller;

import java.util.ArrayList;
import static lk.ijse.animalclinic.controller.OwnerController.ownerDAO;
import lk.ijse.animalclinic.core.dto.OwnerDTO;
import lk.ijse.animalclinic.core.dto.PetDTO;
import lk.ijse.animalclinic.dao.DAOFactory;
import lk.ijse.animalclinic.dao.custom.OwnerDAO;
import lk.ijse.animalclinic.dao.custom.PetDAO;

/**
 *
 * @author chamindu
 */
public class PetController {

    public static PetDAO petDAO = (PetDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.PET);

    public static boolean addPet(PetDTO pet) throws Exception {
        boolean result = petDAO.add(pet);
        return result;
    }

    public static boolean editPet(PetDTO pet) throws Exception {
        boolean result = petDAO.edit(pet);
        return result;
    }

    public static PetDTO searchPetByID(String id) throws Exception {
        PetDTO result = petDAO.searchPetByID(id);
        return result;
    }

    public static PetDTO searchPetByName(String name) throws Exception {
        PetDTO result = petDAO.searchPetByName(name);
        return result;
    }
    public static ArrayList<PetDTO> getPets(String ownerID) throws Exception {
        return petDAO.getPets(ownerID);
    }
     public static boolean removePet(PetDTO pet)throws Exception{
        boolean result = petDAO.remove(pet);
        return result;
    }
    
}
