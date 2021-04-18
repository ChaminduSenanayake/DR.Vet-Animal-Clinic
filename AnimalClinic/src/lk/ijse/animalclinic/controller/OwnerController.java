/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.animalclinic.controller;

import java.util.ArrayList;
import lk.ijse.animalclinic.core.dto.OwnerDTO;
import lk.ijse.animalclinic.dao.DAOFactory;
import lk.ijse.animalclinic.dao.custom.OwnerDAO;

/**
 *
 * @author chamindu
 */
public class OwnerController {

    public static OwnerDAO ownerDAO = (OwnerDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.OWNER);

    public static boolean addOwner(OwnerDTO owner) throws Exception {
        boolean result = ownerDAO.add(owner);
        return result;
    }

    public static boolean editOwner(OwnerDTO owner) throws Exception {
        boolean result = ownerDAO.edit(owner);
        return result;
    }

    public static OwnerDTO searchOwnerByID(String id) throws Exception {
        OwnerDTO result = ownerDAO.searchOwnerByID(id);
        return result;
    }

    public static OwnerDTO searchOwnerByNIC(String NIC) throws Exception {
        OwnerDTO result = ownerDAO.searchByNIC(NIC);
        return result;
    }
     
    public static ArrayList<OwnerDTO> getAllOwners()throws Exception{
        return ownerDAO.getAll();
    }
     public static boolean removeOwner(OwnerDTO owner)throws Exception{
        boolean result = ownerDAO.remove(owner);
        return result;
    }

}
