package com.example.sidemenu.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PutTpDetailsModel {

    @SerializedName("ID")
    @Expose
    private Integer id;
    @SerializedName("ThirdpartyName")
    @Expose
    private String thirdpartyName;
    @SerializedName("T_PhoneNumber")
    @Expose
    private String tPhoneNumber;
    @SerializedName("T_EmailID")
    @Expose
    private String tEmailID;
    @SerializedName("T_VerificationNotes")
    @Expose
    private String tVerificationNotes;
    @SerializedName("T_AlternativePhoneNumber")
    @Expose
    private String tAlternativePhoneNumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getTEmailID() {
        return tEmailID;
    }

    public void setTEmailID(String tEmailID) {
        this.tEmailID = tEmailID;
    }

    public String getTVerificationNotes() {
        return tVerificationNotes;
    }

    public void setTVerificationNotes(String tVerificationNotes) {
        this.tVerificationNotes = tVerificationNotes;
    }

    public String getTAlternativePhoneNumber() {
        return tAlternativePhoneNumber;
    }

    public void setTAlternativePhoneNumber(String tAlternativePhoneNumber) {
        this.tAlternativePhoneNumber = tAlternativePhoneNumber;
    }
}
