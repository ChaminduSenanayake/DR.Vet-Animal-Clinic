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
public class PetDTO extends SuperDTO{
    private String ownerID;
    private String petID;
    private String petName;
    private String sex;
    private String Breed;
    private String DOB;
    private Double weight;
    private String description;

    public PetDTO(String ownerID, String petID, String petName, String sex, String Breed, String DOB, Double weight, String description) {
        this.ownerID = ownerID;
        this.petID = petID;
        this.petName = petName;
        this.sex = sex;
        this.Breed = Breed;
        this.DOB = DOB;
        this.weight = weight;
        this.description = description;
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
     * @return the petName
     */
    public String getPetName() {
        return petName;
    }

    /**
     * @param petName the petName to set
     */
    public void setPetName(String petName) {
        this.petName = petName;
    }

    /**
     * @return the sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex the sex to set
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * @return the Breed
     */
    public String getBreed() {
        return Breed;
    }

    /**
     * @param Breed the Breed to set
     */
    public void setBreed(String Breed) {
        this.Breed = Breed;
    }

    /**
     * @return the DOB
     */
    public String getDOB() {
        return DOB;
    }

    /**
     * @param DOB the DOB to set
     */
    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    /**
     * @return the weight
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(Double weight) {
        this.weight = weight;
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
   