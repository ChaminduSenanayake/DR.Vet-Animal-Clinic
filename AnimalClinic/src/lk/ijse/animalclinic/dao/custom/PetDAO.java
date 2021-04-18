/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/
package lk.ijse.animalclinic.dao.custom;

import java.util.ArrayList;
import lk.ijse.animalclinic.core.dto.PetDTO;
import lk.ijse.animalclinic.dao.SuperDAO;

/**
 *
 * @author chamindu
 */
public interface PetDAO extends SuperDAO<PetDTO>{
     public PetDTO searchPetByID(String id) throws Exception;
     public PetDTO searchPetByName(String name) throws Exception;
     public ArrayList<PetDTO> getPets(String ownerID) throws Exception;
}
