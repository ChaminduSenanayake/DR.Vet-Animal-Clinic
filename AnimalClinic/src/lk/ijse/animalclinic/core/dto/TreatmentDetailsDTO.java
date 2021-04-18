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
public class TreatmentDetailsDTO extends SuperDTO{
    private String TID;
    private String MID;
    private int medicineQty;
    private double medicineUnitPrice;
    private double medicineAmount;

    public TreatmentDetailsDTO(String TID, String MID, int medicineQty, double medicineUnitPrice, double medicineAmount) {
        this.TID = TID;
        this.MID = MID;
        this.medicineQty = medicineQty;
        this.medicineUnitPrice = medicineUnitPrice;
        this.medicineAmount = medicineAmount;
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
     * @return the MID
     */
    public String getMID() {
        return MID;
    }

    /**
     * @param MID the MID to set
     */
    public void setMID(String MID) {
        this.MID = MID;
    }

    /**
     * @return the medicineQty
     */
    public int getMedicineQty() {
        return medicineQty;
    }

    /**
     * @param medicineQty the medicineQty to set
     */
    public void setMedicineQty(int medicineQty) {
        this.medicineQty = medicineQty;
    }

    /**
     * @return the medicineUnitPrice
     */
    public double getMedicineUnitPrice() {
        return medicineUnitPrice;
    }

    /**
     * @param medicineUnitPrice the medicineUnitPrice to set
     */
    public void setMedicineUnitPrice(double medicineUnitPrice) {
        this.medicineUnitPrice = medicineUnitPrice;
    }

    /**
     * @return the medicineAmount
     */
    public double getMedicineAmount() {
        return medicineAmount;
    }

    /**
     * @param medicineAmount the medicineAmount to set
     */
    public void setMedicineAmount(double medicineAmount) {
        this.medicineAmount = medicineAmount;
    }

 

  

}