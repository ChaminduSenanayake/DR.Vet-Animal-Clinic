/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.animalclinic.controller;

import java.util.ArrayList;
import static lk.ijse.animalclinic.controller.AppointmentController.appointmentDAO;
import static lk.ijse.animalclinic.controller.OwnerController.ownerDAO;
import lk.ijse.animalclinic.core.dto.AppointmentDTO;
import lk.ijse.animalclinic.core.dto.MedicineDTO;
import lk.ijse.animalclinic.core.dto.OwnerDTO;
import lk.ijse.animalclinic.core.dto.PetDTO;
import lk.ijse.animalclinic.dao.DAOFactory;
import lk.ijse.animalclinic.dao.custom.MedicineDAO;

/**
 *
 * @author chamindu
 */
public class MedicineController {
    public static MedicineDAO medicineDAO = (MedicineDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.MEDICINE);

    public static boolean addMedicine(MedicineDTO medicine) throws Exception {
        boolean result = medicineDAO.add(medicine);
        return result;
    }

    public static boolean editMedicine(MedicineDTO medicine) throws Exception {
        boolean result = medicineDAO.edit(medicine);
        return result;
    }

    public static ArrayList<MedicineDTO> getAllMedicines()throws Exception{
        return medicineDAO.getAll();
    }
     public static boolean removeMedicine(MedicineDTO medicine)throws Exception{
        boolean result = medicineDAO.remove(medicine);
        return result;
    }

    public static MedicineDTO searchMedicineByID(String id)throws Exception {
        MedicineDTO result = medicineDAO.searchMedicineByID(id);
        return result;
    }
    public static ArrayList<MedicineDTO> searchMedicineByType(String type)throws Exception {
        return medicineDAO.searchMedicineByType(type);
    }
}
