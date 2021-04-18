/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.animalclinic.controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import static lk.ijse.animalclinic.controller.OwnerController.ownerDAO;
import static lk.ijse.animalclinic.controller.PaymentController.paymentDAO;
import static lk.ijse.animalclinic.controller.SheduleController.sheduleDAO;
import lk.ijse.animalclinic.core.dto.MedicineDTO;
import lk.ijse.animalclinic.core.dto.OwnerDTO;
import lk.ijse.animalclinic.core.dto.PaymentDTO;
import lk.ijse.animalclinic.core.dto.SheduleDTO;
import lk.ijse.animalclinic.core.dto.TreatmentDTO;
import lk.ijse.animalclinic.core.dto.TreatmentDetailsDTO;
import lk.ijse.animalclinic.dao.DAOFactory;
import lk.ijse.animalclinic.dao.custom.MedicineDAO;
import lk.ijse.animalclinic.dao.custom.PaymentDAO;
import lk.ijse.animalclinic.dao.custom.TreatmentDAO;
import lk.ijse.animalclinic.dao.custom.TreatmentDetailsDAO;
import lk.ijse.animalclinic.dao.db.DBConnection;

/**
 *
 * @author chamindu
 */
public class TreatmentController {
    private static MedicineDAO medicineDAO = (MedicineDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.MEDICINE);
    private static TreatmentDAO treatmentDAO = (TreatmentDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.TREATMENT);

    public static boolean addTreatmet(TreatmentDTO treatment, ArrayList<TreatmentDetailsDTO> allTDetails) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();

        try {
            connection.setAutoCommit(false);

            boolean result1 = treatmentDAO.add(treatment);
            if (!result1) {
                connection.rollback();
                return false;
            }

            for (TreatmentDetailsDTO allTreatmentDetail : allTDetails) {
                boolean result2 = TreatmentDetailsController.addTreatmentDetail(allTreatmentDetail);
                if (!result2) {
                    connection.rollback();
                    return false;
                }
                MedicineDTO medicineSearch=medicineDAO.searchMedicineByID(allTreatmentDetail.getMID());
                int qtyOnHand=medicineSearch.getQtyOnHand();
                int newQtyOnHand=qtyOnHand-allTreatmentDetail.getMedicineQty();
                boolean result3 = medicineDAO.updateMedicineByID(allTreatmentDetail.getMID(),newQtyOnHand);
                

                if (!result3) {
                    connection.rollback();
                    return false;
                }
            }

            connection.commit();
            return true;
        } catch (SQLException ex) {
            connection.rollback();
            return false;
        } finally {
            connection.setAutoCommit(true);
        }
    }

    public static ArrayList<TreatmentDTO> searchTreatment(String id) throws Exception {
        return treatmentDAO.searchByPaymentID(id);

    }

    public static boolean removeTreatment(TreatmentDTO tD) throws Exception {
        boolean result = treatmentDAO.remove(tD);
        return result;
    }

}
