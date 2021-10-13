package com.example.sidemenu;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CasedetailsModel {
    @SerializedName("ID")
    @Expose
    private Integer id;
    @SerializedName("CaseID")
    @Expose
    private String caseID;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("Description")
    @Expose
    private String description;
    @SerializedName("InsurerVerificationNotes")
    @Expose
    private String insurerVerificationNotes;
    @SerializedName("T_VerificationNotes")
    @Expose
    private String tVerificationNotes;
    @SerializedName("CreatedBy")
    @Expose
    private String createdBy;
    @SerializedName("CreatedDate")
    @Expose
    private String createdDate;
    @SerializedName("LastModifiedBy")
    @Expose
    private String lastModifiedBy;
    @SerializedName("LastModifiedDate")
    @Expose
    private String lastModifiedDate;
    @SerializedName("InsurerName")
    @Expose
    private String insurerName;
    @SerializedName("PhoneNumber")
    @Expose
    private String phoneNumber;
    @SerializedName("AlternativePhoneNumber")
    @Expose
    private String alternativePhoneNumber;
    @SerializedName("EmailID")
    @Expose
    private String emailID;
    @SerializedName("AddressLine1")
    @Expose
    private String addressLine1;
    @SerializedName("AddressLine2")
    @Expose
    private String addressLine2;
    @SerializedName("ThirdpartyName")
    @Expose
    private String thirdpartyName;
    @SerializedName("T_PhoneNumber")
    @Expose
    private String tPhoneNumber;
    @SerializedName("T_AlternativePhoneNumber")
    @Expose
    private String tAlternativePhoneNumber;
    @SerializedName("taddress")
    @Expose
    private String taddress;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCaseID() {
        return caseID;
    }

    public void setCaseID(String caseID) {
        this.caseID = caseID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInsurerVerificationNotes() {
        return insurerVerificationNotes;
    }

    public void setInsurerVerificationNotes(String insurerVerificationNotes) {
        this.insurerVerificationNotes = insurerVerificationNotes;
    }

    public String getTVerificationNotes() {
        return tVerificationNotes;
    }

    public void setTVerificationNotes(String tVerificationNotes) {
        this.tVerificationNotes = tVerificationNotes;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
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

    public String getAlternativePhoneNumber() {
        return alternativePhoneNumber;
    }

    public void setAlternativePhoneNumber(String alternativePhoneNumber) {
        this.alternativePhoneNumber = alternativePhoneNumber;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getThirdpartyName() {
        return thirdpartyName;
    }

    public void setThirdpartyName(String thirdpartyName) {
        this.thirdpartyName = thirdpartyName;
    }

    public String getTPhoneNumber() {
        return tPhoneNumber;
    }

    public void setTPhoneNumber(String tPhoneNumber) {
        this.tPhoneNumber = tPhoneNumber;
    }

    public String getTAlternativePhoneNumber() {
        return tAlternativePhoneNumber;
    }

    public void setTAlternativePhoneNumber(String tAlternativePhoneNumber) {
        this.tAlternativePhoneNumber = tAlternativePhoneNumber;
    }

    public String getTaddress() {
        return taddress;
    }

    public void setTaddress(String taddress) {
        this.taddress = taddress;
    }
}
