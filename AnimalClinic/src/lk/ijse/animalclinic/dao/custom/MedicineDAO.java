/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.animalclinic.dao.custom;

import java.util.ArrayList;
import lk.ijse.animalclinic.core.dto.MedicineDTO;
import lk.ijse.animalclinic.core.dto.OwnerDTO;
import lk.ijse.animalclinic.dao.SuperDAO;

/**
 *
 * @author chamindu
 */
public interface MedicineDAO extends SuperDAO<MedicineDTO> {

    public MedicineDTO searchMedicineByID(String id) throws Exception;
    public boolean updateMedicineByID(String id,int qtyOnHand) throws Exception;
    public ArrayList<MedicineDTO> searchMedicineByType(String Type) throws Exception;
}
