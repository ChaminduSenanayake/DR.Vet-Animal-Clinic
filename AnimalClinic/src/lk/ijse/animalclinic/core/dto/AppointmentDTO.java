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
public class AppointmentDTO extends SuperDTO{

    private String appID;
    private String ownerID;
    private String petID;
    private String vetID;
    private String date;
    private String Time;

    public AppointmentDTO(String appID, String ownerID, String petID, String vetID, String date, String Time) {
        this.appID = appID;
        this.ownerID = ownerID;
        this.petID = petID;
        this.vetID = vetID;
        this.date = date;
        this.Time = Time;
    }

    /**
     * @return the appID
     */
    public String getAppID() {
        return appID;
    }

    /**
     * @param appID the appID to set
     */
    public void setAppID(String appID) {
        this.appID = appID;
    }

    /**
     * @return the ownerID
     */
    public String getOwnerID() {
        return ownerID;
    }

    /**
     * @param ownerID the ownerID to set
     */
    public void setOwnerID(String ownerID) {
        this.ownerID = ownerID;
    }

    /**
     * @return the petID
     */
    public String getPetID() {
        return petID;
    }

    /**
     * @param petID the petID to set
     */
    public void setPetID(String petID) {
        this.petID = petID;
    }

    /**
     * @return the vetID
     */
    public String getVetID() {
        return vetID;
    }

    /**
     * @param vetID the vetID to set
     */
    public void setVetID(String vetID) {
        this.vetID = vetID;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the Time
     */
    public String getTime() {
        return Time;
    }

    /**
     * @param Time the Time to set
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

}