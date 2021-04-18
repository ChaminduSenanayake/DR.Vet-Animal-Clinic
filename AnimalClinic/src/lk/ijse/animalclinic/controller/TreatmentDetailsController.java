/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.animalclinic.controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import lk.ijse.animalclinic.core.dto.PaymentDTO;
import lk.ijse.animalclinic.core.dto.TreatmentDTO;
import lk.ijse.animalclinic.core.dto.TreatmentDetailsDTO;
import lk.ijse.animalclinic.dao.DAOFactory;
import lk.ijse.animalclinic.dao.custom.PaymentDAO;
import lk.ijse.animalclinic.dao.custom.TreatmentDetailsDAO;
import lk.ijse.animalclinic.dao.db.DBConnection;

/**
 *
 * @author chamindu
 */
public class TreatmentDetailsController {

    public static TreatmentDetailsDAO treatmentDetailDAO = (TreatmentDetailsDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.TRETMENTDETAILS);

    public static boolean addTreatmentDetail(TreatmentDetailsDTO tDetail) throws Exception {
        boolean result = treatmentDetailDAO.add(tDetail);
        return result;
    }

    public static ArrayList<TreatmentDetailsDTO> searchTreatmentDetails(String id) throws Exception {
        return treatmentDetailDAO.searchTreatmentDetails(id);

    }
}
