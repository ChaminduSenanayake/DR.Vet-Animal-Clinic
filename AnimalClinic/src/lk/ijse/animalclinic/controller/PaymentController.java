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
import static lk.ijse.animalclinic.controller.PetController.petDAO;
import lk.ijse.animalclinic.core.dto.OwnerDTO;
import lk.ijse.animalclinic.core.dto.PaymentDTO;
import lk.ijse.animalclinic.core.dto.PetDTO;
import lk.ijse.animalclinic.core.dto.TreatmentDTO;
import lk.ijse.animalclinic.core.dto.TreatmentDetailsDTO;
import lk.ijse.animalclinic.dao.DAOFactory;
import lk.ijse.animalclinic.dao.custom.PaymentDAO;
import lk.ijse.animalclinic.dao.custom.PetDAO;
import lk.ijse.animalclinic.dao.db.DBConnection;

/**
 *
 * @author chamindu
 */
public class PaymentController {
    private static boolean result1=false;
    public static PaymentDAO paymentDAO= (PaymentDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.PAYMENT);
    public static boolean addPayment(PaymentDTO payment) throws Exception {
        result1 = paymentDAO.add(payment);
        return result1;
    }
    public static boolean updatePayment(PaymentDTO payment) throws Exception {
        boolean result = paymentDAO.edit(payment);
        return result;
    }
    public static ArrayList<PaymentDTO> getAllPayments()throws Exception{
        return paymentDAO.getAll();
    }
    public static boolean removePayment(String paymentID)throws Exception{
        boolean result = paymentDAO.removeByID(paymentID);
        return result;
    }
    
   /* public static boolean removePayment(PaymentDTO payment,TreatmentDTO treatment, ArrayList<TreatmentDetailsDTO> allTDetails) throws Exception {
            Connection connection = DBConnection.getInstance().getConnection();

        try {
            connection.setAutoCommit(false);
            boolean result1 = PaymentController.addPayment(payment);
            if (!result1) {
                connection.rollback();
                return false;
            }
            System.out.println("payment");

            boolean result2 = treatmentDAO.add(treatment);
            if (!result2) {
                connection.rollback();
                return false;
            }
            System.out.println("Treatment");
            for (TreatmentDetailsDTO allTreatmentDetail : allTDetails) {        
               boolean result3 = TreatmentDetailsController.addTreatmentDetail(allTreatmentDetail);    
               if (!result3) {
                   connection.rollback();
                    return false;
                }
            }
            System.out.println("TreatmentDetail");
            connection.commit();
            return true;
        } catch (SQLException ex) {
            connection.rollback();
            return false;
        } finally {
            connection.setAutoCommit(true);
        }
    }*/
    public static boolean isAdded(){
        return result1;
    }
}
