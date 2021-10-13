package com.example.sidemenu;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CaseDetailsReqInterface {
    @GET("casedetails/getall")
    Call<List<CasedetailsModel>> getcasedetails();

    @GET("casedetails/usercase/1/50/3")
    Call<CasebyLoggedModel> getloggeduser();


}
