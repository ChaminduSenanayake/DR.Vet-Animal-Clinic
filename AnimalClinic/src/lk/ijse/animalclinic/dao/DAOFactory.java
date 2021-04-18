/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.animalclinic.dao;

import lk.ijse.animalclinic.dao.custom.AppointmentDAO;
import lk.ijse.animalclinic.dao.custom.impl.AppointmentDAOImpl;
import lk.ijse.animalclinic.dao.custom.impl.MedicineDAOImpl;
import lk.ijse.animalclinic.dao.custom.impl.OwnerDAOImpl;
import lk.ijse.animalclinic.dao.custom.impl.PaymentDAOImpl;
import lk.ijse.animalclinic.dao.custom.impl.PetDAOImpl;
import lk.ijse.animalclinic.dao.custom.impl.SheduleDAOImpl;
import lk.ijse.animalclinic.dao.custom.impl.TreatmentDAOImpl;
import lk.ijse.animalclinic.dao.custom.impl.TreatmentDetailsDAOImpl;
import lk.ijse.animalclinic.dao.custom.impl.VetDAOImpl;

/**
 *
 * @author chamindu
 */
public class DAOFactory {

    public enum DAOTypes {
        OWNER, PET, APPOINTMENT, VET,MEDICINE,TREATMENT,TRETMENTDETAILS,SHEDULE,PAYMENT
    }

    private static DAOFactory daoFactory;

    private DAOFactory() {

    }

    public static DAOFactory getInstance() {
        if (daoFactory == null) {
            daoFactory = new DAOFactory();
        }
        return daoFactory;
    }

    public SuperDAO getDAO(DAOTypes daoType) {
        switch (daoType) {
            case OWNER:
                return new OwnerDAOImpl();
            case PET:
                return new PetDAOImpl();
            case APPOINTMENT:
                return new AppointmentDAOImpl();
            case VET:
                return new VetDAOImpl();
            case MEDICINE:
                return new MedicineDAOImpl();
            case TREATMENT:
                return new TreatmentDAOImpl();
            case TRETMENTDETAILS:
                return new TreatmentDetailsDAOImpl();
            case SHEDULE:
                return new SheduleDAOImpl();
            case PAYMENT:
                return new PaymentDAOImpl();
            default:
                return null;
        }
    }
}
