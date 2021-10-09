package com.example.sidemenu;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class PageOfItem {
    @SerializedName("AssignmentID")
    @Expose
    private Integer AssignmentID;

    @SerializedName("CaseID")
    @Expose
    private String CaseID;

    @SerializedName("ID")
    @Expose
    private Integer ID;

    @SerializedName("Name")
    @Expose
    private String Name;

    @SerializedName("InsurerName")
    @Expose
    private String InsurerName;

    @SerializedName("StatusName")
    @Expose
    private String StatusName;

    @SerializedName("DueDate")
    @Expose
    private String DueDate;

    @SerializedName("AppUserID")
    @Expose
    private String AppUserID;

    // Assignment ID
    private Integer getAssignmentID() {
        return AssignmentID;
    }
    public void setAssignmentID(Integer AssignmentID) {
        this.AssignmentID = AssignmentID;
    }

    // ID
    public Integer getID (){
        return ID;
    }
    public void setID(Integer ID){
        this.ID = ID;
    }

    // Case ID
    public String getCaseID(){
        return CaseID;
    }
    public void setCaseID(String caseID){
        CaseID = caseID;
    }

    // Name
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }

    // Insurer Name
    public String getInsurerName() {
        return InsurerName;
    }
    public void setInsurerName(String insurerName) {
        InsurerName = insurerName;
    }

    // Status Name
    public String getStatusName() {
        return StatusName;
    }
    public void setStatusName(String statusName) {
        StatusName = statusName;
    }

    // Due Date
    public String getDueDate() {
        return DueDate;
    }
    public void setDueDate(String dueDate) {
        DueDate = dueDate;
    }

    // Appuser ID
    public String getAppUserID() {
        return AppUserID;
    }
    public void setAppUserID(String appUserID) {
        AppUserID = appUserID;
    }


    // to String
    @Override
    public String toString() {
        return "PageOfItem{" +
                "AssignmentID=" + AssignmentID +
                ", CaseID='" + CaseID + '\'' +
                ", ID=" + ID +
                ", Name='" + Name + '\'' +
                ", InsurerName='" + InsurerName + '\'' +
                ", StatusName='" + StatusName + '\'' +
                ", DueDate='" + DueDate + '\'' +
                ", AppUserID='" + AppUserID + '\'' +
                '}';
    }
}
