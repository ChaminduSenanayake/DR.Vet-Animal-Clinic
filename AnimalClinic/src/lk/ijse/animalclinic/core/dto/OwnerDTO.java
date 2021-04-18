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
public class OwnerDTO extends SuperDTO{

    private String OID;
    private String firstName;
    private String lastName;
    private String address;
    private String tel;
    private String NIC;

    public OwnerDTO(String OID, String firstName, String lastName, String address, String tel, String NIC) {
        this.OID = OID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.tel = tel;
        this.NIC = NIC;
    }

    public OwnerDTO(String OID, String tel, String NIC) {
        this.OID = OID;
        this.tel = tel;
        this.NIC = NIC;
    }

    public OwnerDTO(String text) {
        this.OID = OID;
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
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
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
   

}
