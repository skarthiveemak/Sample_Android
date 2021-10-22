package com.example.sidemenu.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CasedetailsPutModel {
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
    @SerializedName("ReferenceNumber")
    @Expose
    private String referenceNumber;
    @SerializedName("DueDate")
    @Expose
    private String dueDate;
    @SerializedName("LastModifiedBy")
    @Expose
    private String lastModifiedBy;
    @SerializedName("StatusID")
    @Expose
    private String statusID;
    @SerializedName("insDetails")
    @Expose
    private PutInsDetailsModel insDetails;

    @SerializedName("insAddress")
    @Expose
    private PutInsAddressModel insAddress;
    @SerializedName("tpartyDetails")
    @Expose
    private PutTpDetailsModel tpartyDetails;
    @SerializedName("tpartyAddress")
    @Expose
    private PutTpAddressModel tpartyAddress;
    @SerializedName("insanswers")
    @Expose
    private List<PutInsAnswerModel> insanswers = null;
    @SerializedName("tpanswers")
    @Expose
    private List<PutTpAnswerModel> tpanswers = null;

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

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public String getStatusID() {
        return statusID;
    }

    public void setStatusID(String statusID) {
        this.statusID = statusID;
    }

    public PutInsDetailsModel getInsDetails() {
        return insDetails;
    }

    public void setInsDetails(PutInsDetailsModel insDetails) {
        this.insDetails = insDetails;
    }


    public PutInsAddressModel getInsAddress() {
        return insAddress;
    }

    public void setInsAddress(PutInsAddressModel insAddress) {
        this.insAddress = insAddress;
    }

    public PutTpDetailsModel getTpartyDetails() {
        return tpartyDetails;
    }

    public void setTpartyDetails(PutTpDetailsModel tpartyDetails) {
        this.tpartyDetails = tpartyDetails;
    }

    public PutTpAddressModel getTpartyAddress() {
        return tpartyAddress;
    }

    public void setTpartyAddress(PutTpAddressModel tpartyAddress) {
        this.tpartyAddress = tpartyAddress;
    }

    public List<PutInsAnswerModel> getInsanswers() {
        return insanswers;
    }

    public void setInsanswers(List<PutInsAnswerModel> insanswers) {
        this.insanswers = insanswers;
    }

    public List<PutTpAnswerModel> getTpanswers() {
        return tpanswers;
    }

    public void setTpanswers(List<PutTpAnswerModel> tpanswers) {
        this.tpanswers = tpanswers;
    }

}
