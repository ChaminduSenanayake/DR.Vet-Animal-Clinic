/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.animalclinic.core.dto;

import java.util.Date;

/**
 *
 * @author chamindu
 */
public class MedicineDTO extends SuperDTO {

    private String MID;
    private String description;
    private String type;
    private String ExpireDate;
    private double price;
    private int QtyOnHand;

    public MedicineDTO(String MID, String description, String type, String ExpireDate, double price, int QtyOnHand) {
        this.MID = MID;
        this.description = description;
        this.type = type;
        this.ExpireDate = ExpireDate;
        this.price = price;
        this.QtyOnHand = QtyOnHand;
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
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the ExpireDate
     */
    public String getExpireDate() {
        return ExpireDate;
    }

    /**
     * @param ExpireDate the ExpireDate to set
     */
    public void setExpireDate(String ExpireDate) {
        this.ExpireDate = ExpireDate;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the QtyOnHand
     */
    public int getQtyOnHand() {
        return QtyOnHand;
    }

    /**
     * @param QtyOnHand the QtyOnHand to set
     */
    public void setQtyOnHand(int QtyOnHand) {
        this.QtyOnHand = QtyOnHand;
    }

    

}
