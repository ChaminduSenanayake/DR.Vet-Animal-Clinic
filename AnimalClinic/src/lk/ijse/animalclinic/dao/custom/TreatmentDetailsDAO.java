/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.animalclinic.dao.custom;

import java.util.ArrayList;
import lk.ijse.animalclinic.core.dto.TreatmentDTO;
import lk.ijse.animalclinic.core.dto.TreatmentDetailsDTO;
import lk.ijse.animalclinic.dao.SuperDAO;

/**
 *
 * @author chamindu
 */
public interface TreatmentDetailsDAO extends SuperDAO<TreatmentDetailsDTO>{
    public ArrayList<TreatmentDetailsDTO> searchTreatmentDetails(String id) throws Exception;
}
