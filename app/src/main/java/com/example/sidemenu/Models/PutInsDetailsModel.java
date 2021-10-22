package com.example.sidemenu.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PutInsDetailsModel {
    @SerializedName("ID")
    @Expose
    private Integer id;
    @SerializedName("InsurerName")
    @Expose
    private String insurerName;
    @SerializedName("PhoneNumber")
    @Expose
    private String phoneNumber;
    @SerializedName("EmailID")
    @Expose
    private String emailID;
    @SerializedName("I_AddressID")
    @Expose
    private String iAddressID;
    @SerializedName("AlternativePhoneNumber")
    @Expose
    private String alternativePhoneNumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInsurerName() {
        return insurerName;
    }

    public void setInsurerName(String insurerName) {
        this.insurerName = insurerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getIAddressID() {
        return iAddressID;
    }

    public void setIAddressID(String iAddressID) {
        this.iAddressID = iAddressID;
    }

    public String getAlternativePhoneNumber() {
        return alternativePhoneNumber;
    }

    public void setAlternativePhoneNumber(String alternativePhoneNumber) {
        this.alternativePhoneNumber = alternativePhoneNumber;
    }
}
