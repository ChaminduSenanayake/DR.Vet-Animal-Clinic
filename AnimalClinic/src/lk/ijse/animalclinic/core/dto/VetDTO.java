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
public class VetDTO extends SuperDTO{
    private String VID;
    private String fName;
    private String lName;
    private String NIC;
    private String Address;
    private String tel;
    private String description;

    public VetDTO(String VID, String fName, String lName, String NIC, String Address, String tel, String description) {
        this.VID = VID;
        this.fName = fName;
        this.lName = lName;
        this.NIC = NIC;
        this.Address = Address;
        this.tel = tel;
        this.description = description;
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
     * @return the fName
     */
    public String getfName() {
        return fName;
    }

    /**
     * @param fName the fName to set
     */
    public void setfName(String fName) {
        this.fName = fName;
    }

    /**
     * @return the lName
     */
    public String getlName() {
        return lName;
    }

    /**
     * @param lName the lName to set
     */
    public void setlName(String lName) {
        this.lName = lName;
    }

    /**
     * @return the NIC
     */
    public String getNIC() {
        return NIC;
    }

    /**
     * @param NIC the NIC to set
     */
    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    /**
     * @return the vAddress
     */
    public String getAddress() {
        return Address;
    }

    /**
     * @param vAddress the vAddress to set
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * @return the tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * @param tel the tel to set
     */
    public void setTel(String tel) {
        this.tel = tel;
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


}