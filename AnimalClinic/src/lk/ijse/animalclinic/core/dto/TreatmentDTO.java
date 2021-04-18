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
public class TreatmentDTO extends SuperDTO{
    private String TID;
    private String PID;
    private String VID;
    private String paymentID;
    private String diagnosis;
    private String description;
    private double treatmentCharge;

    public TreatmentDTO(String TID, String PID, String VID, String paymentID, String diagnosis, String description, double treatmentCharge) {
        this.TID = TID;
        this.PID = PID;
        this.VID = VID;
        this.paymentID = paymentID;
        this.diagnosis = diagnosis;
        this.description = description;
        this.treatmentCharge = treatmentCharge;
    }

    /**
     * @return the TID
     */
    public String getTID() {
        return TID;
    }

    /**
     * @param TID the TID to set
     */
    public void setTID(String TID) {
        this.TID = TID;
    }

    /**
     * @return the PID
     */
    public String getPID() {
        return PID;
    }

    /**
     * @param PID the PID to set
     */
    public void setPID(String PID) {
        this.PID = PID;
    }

    /**
     * @return the VID
     */
    public String getVID() {
        return VID;
    }

    /**
     * @param VID the VID to set
     */
    public void setVID(String VID) {
        this.VID = VID;
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
     * @return the diagnosis
     */
    public String getDiagnosis() {
        return diagnosis;
    }

    /**
     * @param diagnosis the diagnosis to set
     */
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
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

    
}
