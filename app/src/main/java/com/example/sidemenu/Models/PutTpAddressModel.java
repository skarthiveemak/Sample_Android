package com.example.sidemenu.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PutTpAddressModel {
    @SerializedName("ID")
    @Expose
    private Integer id;
    @SerializedName("T_AddressID")
    @Expose
    private String tAddressID;
    @SerializedName("T_AddressLine1")
    @Expose
    private String tAddressLine1;
    @SerializedName("T_AddressLine2")
    @Expose
    private String tAddressLine2;
    @SerializedName("T_City")
    @Expose
    private String tCity;
    @SerializedName("T_State")
    @Expose
    private String tState;
    @SerializedName("T_Pincode")
    @Expose
    private String tPincode;
    @SerializedName("T_Landmark")
    @Expose
    private String tLandmark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTAddressID() {
        return tAddressID;
    }

    public void setTAddressID(String tAddressID) {
        this.tAddressID = tAddressID;
    }

    public String getTAddressLine1() {
        return tAddressLine1;
    }

    public void setTAddressLine1(String tAddressLine1) {
        this.tAddressLine1 = tAddressLine1;
    }

    public String getTAddressLine2() {
        return tAddressLine2;
    }

    public void setTAddressLine2(String tAddressLine2) {
        this.tAddressLine2 = tAddressLine2;
    }

    public String getTCity() {
        return tCity;
    }

    public void setTCity(String tCity) {
        this.tCity = tCity;
    }

    public String getTState() {
        return tState;
    }

    public void setTState(String tState) {
        this.tState = tState;
    }

    public String getTPincode() {
        return tPincode;
    }

    public void setTPincode(String tPincode) {
        this.tPincode = tPincode;
    }

    public String getTLandmark() {
        return tLandmark;
    }

    public void setTLandmark(String tLandmark) {
        this.tLandmark = tLandmark;
    }
}
