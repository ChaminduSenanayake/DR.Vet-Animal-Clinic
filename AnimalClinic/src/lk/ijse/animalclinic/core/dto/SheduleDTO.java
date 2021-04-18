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
public class SheduleDTO extends SuperDTO{
    private String SID;
    private String VID;
    private String day;
    private String inTime;
    private String outTime;

    public SheduleDTO(String SID, String VID, String day, String inTime, String outTime) {
        this.SID = SID;
        this.VID = VID;
        this.day = day;
        this.inTime = inTime;
        this.outTime = outTime;
    }

    /**
     * @return the SID
     */
    public String getSID() {
        return SID;
    }

    /**
     * @param SID the SID to set
     */
    public void setSID(String SID) {
        this.SID = SID;
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
     * @return the day
     */
    public String getDay() {
        return day;
    }

    /**
     * @param day the day to set
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * @return the inTime
     */
    public String getInTime() {
        return inTime;
    }

    /**
     * @param inTime the inTime to set
     */
    public void setInTime(String inTime) {
        this.inTime = inTime;
    }

    /**
     * @return the outTime
     */
    public String getOutTime() {
        return outTime;
    }

    /**
     * @param outTime the outTime to set
     */
    public void setOutTime(String outTime) {
        this.outTime = outTime;
    }

   
}
