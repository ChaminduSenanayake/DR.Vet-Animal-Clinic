/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.animalclinic.dao.custom;

import java.util.ArrayList;
import lk.ijse.animalclinic.core.dto.PetDTO;
import lk.ijse.animalclinic.core.dto.SheduleDTO;
import lk.ijse.animalclinic.dao.SuperDAO;

/**
 *
 * @author chamindu
 */
public interface SheduleDAO extends SuperDAO<SheduleDTO>{
    public SheduleDTO searchSheduleByVetID(String id) throws Exception;
    public SheduleDTO searchSheduleByID(String date) throws Exception;
    public ArrayList<SheduleDTO> getAllShedulesByVetID(String id) throws Exception;
    public ArrayList<SheduleDTO> getAllShedulesByDay(String day) throws Exception;
}
