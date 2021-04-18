/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.animalclinic.dao.custom;

import lk.ijse.animalclinic.core.dto.PetDTO;
import lk.ijse.animalclinic.core.dto.VetDTO;
import lk.ijse.animalclinic.dao.SuperDAO;

/**
 *
 * @author chamindu
 */
public interface VetDAO extends SuperDAO<VetDTO>{
    public VetDTO searchVetByID(String id) throws Exception;
    public VetDTO searchVetByNIC(String name) throws Exception;
}
