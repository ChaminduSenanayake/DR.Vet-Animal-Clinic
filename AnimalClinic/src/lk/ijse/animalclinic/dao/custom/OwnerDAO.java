/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.animalclinic.dao.custom;

import lk.ijse.animalclinic.core.dto.OwnerDTO;
import lk.ijse.animalclinic.dao.SuperDAO;

/**
 *
 * @author chamindu
 */
public interface OwnerDAO extends SuperDAO<OwnerDTO>{
     public OwnerDTO searchOwnerByID(String id) throws Exception;
     public OwnerDTO searchByNIC(String NIC) throws Exception;
}
