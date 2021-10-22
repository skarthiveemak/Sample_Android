package com.example.sidemenu.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PutInsAddressModel {
    @SerializedName("I_AddressID")
    @Expose
    private String iAddressID;
    @SerializedName("I_AddressLine1")
    @Expose
    private String iAddressLine1;
    @SerializedName("I_AddressLine2")
    @Expose
    private String iAddressLine2;
    @SerializedName("I_City")
    @Expose
    private String iCity;
    @SerializedName("I_State")
    @Expose
    private String iState;
    @SerializedName("I_Pincode")
    @Expose
    private String iPincode;
    @SerializedName("I_Landmark")
    @Expose
    private String iLandmark;

    public String getIAddressID() {
        return iAddressID;
    }

    public void setIAddressID(String iAddressID) {
        this.iAddressID = iAddressID;
    }

    public String getIAddressLine1() {
        return iAddressLine1;
    }

    public void setIAddressLine1(String iAddressLine1) {
        this.iAddressLine1 = iAddressLine1;
    }

    public String getIAddressLine2() {
        return iAddressLine2;
    }

    public void setIAddressLine2(String iAddressLine2) {
        this.iAddressLine2 = iAddressLine2;
    }

    public String getICity() {
        return iCity;
    }

    public void setICity(String iCity) {
        this.iCity = iCity;
    }

    public String getIState() {
        return iState;
    }

    public void setIState(String iState) {
        this.iState = iState;
    }

    public String getIPincode() {
        return iPincode;
    }

    public void setIPincode(String iPincode) {
        this.iPincode = iPincode;
    }

    public String getILandmark() {
        return iLandmark;
    }

    public void setILandmark(String iLandmark) {
        this.iLandmark = iLandmark;
    }
}
