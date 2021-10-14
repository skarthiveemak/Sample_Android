package com.example.sidemenu.EditPage;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
//"ID": 3,
//        "CaseID": "135245",
//        "Name": "Malai",
//        "Description": "sdfsdfdsf",
//        "InsurerVerificationNotes": "ccxvcx",
//        "T_VerificationNotes": "fsdfsdf",
//        "CreatedBy": "1",
//        "CreatedDate": "2021-08-07T11:15:28.000Z",
//        "LastModifiedBy": "2",
//        "I_AddressLine1": "ihsbdfh",
//        "I_AddressLine2": "ihsbdh",
//        "I_City": "sdfsd",
//        "I_Landmark": "sdfsdf",
//        "I_State": "fsdfsd",
//        "I_Pincode": "123123",
//        "LastModifiedDate": "2021-09-15T17:21:44.000Z",
//        "InsurerName": "Vinoth",
//        "PhoneNumber": "1231231231",
//        "AlternativePhoneNumber": "hsvbdfhj",
//        "EmailID": "sdf@gmail.coma",
//        "I_CaseID": "3",
//        "I_AddressID": "5",
//        "ReferenceNumber": "16815612",
//        "DueDate": "2021-08-27",
//        "ThirdpartyName": "dvdhjb",
//        "T_PhoneNumber": "1231231231",
//        "T_AddressID": "6",
//        "T_AddressLine1": "iufhsudib",
//        "T_AddressLine2": "ufbsidf",
//        "T_City": "fsdfd",
//        "T_Landmark": "fsdfsd",
//        "T_State": "fsdfsd",
//        "T_Pincode": "123123",
//        "T_EmailID": "kjdsbjk@gmail.com",
//        "T_AlternativePhoneNumber": "hbshidfb"
public class GetByIdModel {
    @SerializedName("ID")
    @Expose
    private int ID;

    @SerializedName("CaseID")
    @Expose
    private String CaseID;

    @SerializedName("Name")
    @Expose
    private String Name;

    @SerializedName("Description")
    @Expose
    private String Description;

    @SerializedName("InsurerVerificationNotes")
    @Expose
    private String InsurerVerificationNotes;

    @SerializedName("T_VerificationNotes")
    @Expose
    private String T_VerificationNotes;

    @SerializedName("I_AddressLine1")
    @Expose
    private String I_AddressLine1;

    @SerializedName("I_AddressLine2")
    @Expose
    private String I_AddressLine2;

    @SerializedName("I_City")
    @Expose
    private String I_City;

    @SerializedName("I_Landmark")
    @Expose
    private String I_Landmark;

    @SerializedName("I_State")
    @Expose
    private String I_State;

    @SerializedName("I_Pincode")
    @Expose
    private String I_Pincode;

    @SerializedName("InsurerName")
    @Expose
    private String InsurerName;

    @SerializedName("PhoneNumber")
    @Expose
    private String PhoneNumber;

    @SerializedName("AlternativePhoneNumber")
    @Expose
    private String AlternativePhoneNumber;

    @SerializedName("EmailID")
    @Expose
    private String EmailID;

    @SerializedName("I_CaseID")
    @Expose
    private String I_CaseID;

    @SerializedName("I_AddressID")
    @Expose
    private String I_AddressID;

    @SerializedName("ReferenceNumber")
    @Expose
    private String ReferenceNumber;

    @SerializedName("DueDate")
    @Expose
    private String DueDate;

    @SerializedName("ThirdpartyName")
    @Expose
    private String ThirdpartyName;

    @SerializedName("T_PhoneNumber")
    @Expose
    private String T_PhoneNumber;

    @SerializedName("T_AddressID")
    @Expose
    private String T_AddressID;

    @SerializedName("T_AddressLine1")
    @Expose
    private String T_AddressLine1;

    @SerializedName("T_AddressLine2")
    @Expose
    private String T_AddressLine2;

    @SerializedName("T_City")
    @Expose
    private String T_City;

    @SerializedName("T_Landmark")
    @Expose
    private String T_Landmark;

    @SerializedName("T_State")
    @Expose
    private String T_State;

    @SerializedName("T_Pincode")
    @Expose
    private String T_Pincode;

    @SerializedName("T_EmailID")
    @Expose
    private String T_EmailID;

    @SerializedName("T_AlternativePhoneNumber")
    @Expose
    private String T_AlternativePhoneNumber;

    @SerializedName("CreatedBy")
    @Expose
    private String CreatedBy;

    @SerializedName("CreatedDate")
    @Expose
    private String CreatedDate;

    @SerializedName("LastModifiedBy")
    @Expose
    private String LastModifiedBy;






    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCaseID() {
        return CaseID;
    }

    public void setCaseID(String caseID) {
        CaseID = caseID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getInsurerVerificationNotes() {
        return InsurerVerificationNotes;
    }

    public void setInsurerVerificationNotes(String insurerVerificationNotes) {
        InsurerVerificationNotes = insurerVerificationNotes;
    }

    public String getT_VerificationNotes() {
        return T_VerificationNotes;
    }

    public void setT_VerificationNotes(String t_VerificationNotes) {
        T_VerificationNotes = t_VerificationNotes;
    }

    public String getI_AddressLine1() {
        return I_AddressLine1;
    }

    public void setI_AddressLine1(String i_AddressLine1) {
        I_AddressLine1 = i_AddressLine1;
    }

    public String getI_AddressLine2() {
        return I_AddressLine2;
    }

    public void setI_AddressLine2(String i_AddressLine2) {
        I_AddressLine2 = i_AddressLine2;
    }

    public String getI_City() {
        return I_City;
    }

    public void setI_City(String i_City) {
        I_City = i_City;
    }

    public String getI_Landmark() {
        return I_Landmark;
    }

    public void setI_Landmark(String i_Landmark) {
        I_Landmark = i_Landmark;
    }

    public String getI_State() {
        return I_State;
    }

    public void setI_State(String i_State) {
        I_State = i_State;
    }

    public String getI_Pincode() {
        return I_Pincode;
    }

    public void setI_Pincode(String i_Pincode) {
        I_Pincode = i_Pincode;
    }

    public String getInsurerName() {
        return InsurerName;
    }

    public void setInsurerName(String insurerName) {
        InsurerName = insurerName;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getAlternativePhoneNumber() {
        return AlternativePhoneNumber;
    }

    public void setAlternativePhoneNumber(String alternativePhoneNumber) {
        AlternativePhoneNumber = alternativePhoneNumber;
    }

    public String getEmailID() {
        return EmailID;
    }

    public void setEmailID(String emailID) {
        EmailID = emailID;
    }

    public String getI_CaseID() {
        return I_CaseID;
    }

    public void setI_CaseID(String i_CaseID) {
        I_CaseID = i_CaseID;
    }

    public String getI_AddressID() {
        return I_AddressID;
    }

    public void setI_AddressID(String i_AddressID) {
        I_AddressID = i_AddressID;
    }

    public String getReferenceNumber() {
        return ReferenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        ReferenceNumber = referenceNumber;
    }

    public String getDueDate() {
        return DueDate;
    }

    public void setDueDate(String dueDate) {
        DueDate = dueDate;
    }

    public String getThirdpartyName() {
        return ThirdpartyName;
    }

    public void setThirdpartyName(String thirdpartyName) {
        ThirdpartyName = thirdpartyName;
    }

    public String getT_PhoneNumber() {
        return T_PhoneNumber;
    }

    public void setT_PhoneNumber(String t_PhoneNumber) {
        T_PhoneNumber = t_PhoneNumber;
    }

    public String getT_AddressID() {
        return T_AddressID;
    }

    public void setT_AddressID(String t_AddressID) {
        T_AddressID = t_AddressID;
    }

    public String getT_AddressLine1() {
        return T_AddressLine1;
    }

    public void setT_AddressLine1(String t_AddressLine1) {
        T_AddressLine1 = t_AddressLine1;
    }

    public String getT_AddressLine2() {
        return T_AddressLine2;
    }

    public void setT_AddressLine2(String t_AddressLine2) {
        T_AddressLine2 = t_AddressLine2;
    }

    public String getT_City() {
        return T_City;
    }

    public void setT_City(String t_City) {
        T_City = t_City;
    }

    public String getT_Landmark() {
        return T_Landmark;
    }

    public void setT_Landmark(String t_Landmark) {
        T_Landmark = t_Landmark;
    }

    public String getT_State() {
        return T_State;
    }

    public void setT_State(String t_State) {
        T_State = t_State;
    }

    public String getT_Pincode() {
        return T_Pincode;
    }

    public void setT_Pincode(String t_Pincode) {
        T_Pincode = t_Pincode;
    }

    public String getT_EmailID() {
        return T_EmailID;
    }

    public void setT_EmailID(String t_EmailID) {
        T_EmailID = t_EmailID;
    }

    public String getT_AlternativePhoneNumber() {
        return T_AlternativePhoneNumber;
    }

    public void setT_AlternativePhoneNumber(String t_AlternativePhoneNumber) {
        T_AlternativePhoneNumber = t_AlternativePhoneNumber;
    }

    public String getCreatedBy() {
        return CreatedBy;
    }

    public void setCreatedBy(String createdBy) {
        CreatedBy = createdBy;
    }

    public String getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(String createdDate) {
        CreatedDate = createdDate;
    }

    public String getLastModifiedBy() {
        return LastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        LastModifiedBy = lastModifiedBy;
    }

    @Override
    public String toString() {
        return "GetByIdModel{" +
                "ID=" + ID +
                ", CaseID='" + CaseID + '\'' +
                ", Name='" + Name + '\'' +
                ", Description='" + Description + '\'' +
                ", InsurerVerificationNotes='" + InsurerVerificationNotes + '\'' +
                ", T_VerificationNotes='" + T_VerificationNotes + '\'' +
                ", I_AddressLine1='" + I_AddressLine1 + '\'' +
                ", I_AddressLine2='" + I_AddressLine2 + '\'' +
                ", I_City='" + I_City + '\'' +
                ", I_Landmark='" + I_Landmark + '\'' +
                ", I_State='" + I_State + '\'' +
                ", I_Pincode='" + I_Pincode + '\'' +
                ", InsurerName='" + InsurerName + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", AlternativePhoneNumber='" + AlternativePhoneNumber + '\'' +
                ", EmailID='" + EmailID + '\'' +
                ", I_CaseID='" + I_CaseID + '\'' +
                ", I_AddressID='" + I_AddressID + '\'' +
                ", ReferenceNumber='" + ReferenceNumber + '\'' +
                ", DueDate='" + DueDate + '\'' +
                ", ThirdpartyName='" + ThirdpartyName + '\'' +
                ", T_PhoneNumber='" + T_PhoneNumber + '\'' +
                ", T_AddressID='" + T_AddressID + '\'' +
                ", T_AddressLine1='" + T_AddressLine1 + '\'' +
                ", T_AddressLine2='" + T_AddressLine2 + '\'' +
                ", T_City='" + T_City + '\'' +
                ", T_Landmark='" + T_Landmark + '\'' +
                ", T_State='" + T_State + '\'' +
                ", T_Pincode='" + T_Pincode + '\'' +
                ", T_EmailID='" + T_EmailID + '\'' +
                ", T_AlternativePhoneNumber='" + T_AlternativePhoneNumber + '\'' +
                ", CreatedBy='" + CreatedBy + '\'' +
                ", CreatedDate='" + CreatedDate + '\'' +
                ", LastModifiedBy='" + LastModifiedBy + '\'' +
                '}';
    }
}
