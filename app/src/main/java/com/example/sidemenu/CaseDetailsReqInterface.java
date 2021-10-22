package com.example.sidemenu;

import com.example.sidemenu.EditPage.GetByIdModel;
import com.example.sidemenu.Models.CasedetailsPutModel;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface CaseDetailsReqInterface {
    @GET("casedetails/getall")
    Call<List<CasedetailsModel>> getcasedetails();

    @GET("casedetails/usercase/1/50/3")
    Call<CasebyLoggedModel> getloggeduser();

    @GET("casedetails/case/{id}")
    Call<List<GetByIdModel>> getcasebyid(@Path("id") int id);

    @PUT("casedetails/")
    Call<CasedetailsPutModel> putcasedetails(@Body CasedetailsPutModel mydata );

}
