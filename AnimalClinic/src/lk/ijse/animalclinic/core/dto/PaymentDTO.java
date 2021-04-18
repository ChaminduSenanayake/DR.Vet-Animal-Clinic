/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.animalclinic.core.dto;

/**
 *
 * @author chamindu
 */
public class PaymentDTO extends SuperDTO{
    private String paymentID;
    private String OID;
    private String paymentDate;
    private double serviceCharge;
    private double treatmentCharge;
    private double medicineCharge;
    private double netAmount;

    public PaymentDTO(String paymentID, String OID, String paymentDate, double serviceCharge, double treatmentCharge, double medicineCharge, double netAmount) {
        this.paymentID = paymentID;
        this.OID = OID;
        this.paymentDate = paymentDate;
        this.serviceCharge = serviceCharge;
        this.treatmentCharge = treatmentCharge;
        this.medicineCharge = medicineCharge;
        this.netAmount = netAmount;
    }

    /**
     * @return the paymentID
     */
    public String getPaymentID() {
        return paymentID;
    }

    /**
     * @param paymentID the paymentID to set
     */
    public void setPaymentID(String paymentID) {
        this.paymentID = paymentID;
    }

    /**
     * @return the OID
     */
    public String getOID() {
        return OID;
    }

    /**
     * @param OID the OID to set
     */
    public void setOID(String OID) {
        this.OID = OID;
    }

    /**
     * @return the paymentDate
     */
    public String getPaymentDate() {
        return paymentDate;
    }

    /**
     * @param paymentDate the paymentDate to set
     */
    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    /**
     * @return the serviceCharge
     */
    public double getServiceCharge() {
        return serviceCharge;
    }

    /**
     * @param serviceCharge the serviceCharge to set
     */
    public void setServiceCharge(double serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    /**
     * @return the treatmentCharge
     */
    public double getTreatmentCharge() {
        return treatmentCharge;
    }

    /**
     * @param treatmentCharge the treatmentCharge to set
     */
    public void setTreatmentCharge(double treatmentCharge) {
        this.treatmentCharge = treatmentCharge;
    }

    /**
     * @return the medicineCharge
     */
    public double getMedicineCharge() {
        return medicineCharge;
    }

    /**
     * @param medicineCharge the medicineCharge to set
     */
    public void setMedicineCharge(double medicineCharge) {
        this.medicineCharge = medicineCharge;
    }

    /**
     * @return the netAmount
     */
    public double getNetAmount() {
        return netAmount;
    }

    /**
     * @param netAmount the netAmount to set
     */
    public void setNetAmount(double netAmount) {
        this.netAmount = netAmount;
    }

   
    
}
