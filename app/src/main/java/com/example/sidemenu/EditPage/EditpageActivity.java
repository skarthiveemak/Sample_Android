package com.example.sidemenu.EditPage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.sidemenu.ApiClient;
import com.example.sidemenu.CaseDetailsReqInterface;
import com.example.sidemenu.MainActivity;
import com.example.sidemenu.MainAdapter;
import com.example.sidemenu.Models.CasedetailsPutModel;
import com.example.sidemenu.Models.PutInsAddressModel;
import com.example.sidemenu.Models.PutInsAnswerModel;
import com.example.sidemenu.Models.PutInsDetailsModel;
import com.example.sidemenu.Models.PutTpAddressModel;
import com.example.sidemenu.Models.PutTpAnswerModel;
import com.example.sidemenu.Models.PutTpDetailsModel;
import com.example.sidemenu.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class EditpageActivity extends AppCompatActivity {
    // Initialize variable

    DrawerLayout drawerLayout;
    ImageView btMenu;
    RecyclerView recyclerView;
    private RecyclerView myrecyclerview;
    ArrayList<GetByIdModel> getByIdModels = new ArrayList<>();
    EditpageAdapter editpageAdapter;
    Button irukabtn,duedate;
    RelativeLayout loadingcircleedit;
    String Ialternumber,putcaseid,putrefnum,putagentname;
    EditText id,caseid,refnumber,agentname,desc,insname,Imobnumber,Iemailid,Iad1,Iad2,Icity,Istate,Ipin,Ilandmark,
            IveriNotes,Tpname,TpMobnumber,TpEmail,Tpalternum,Tpad1,Tpad2,TpCity,Tpstate,TpPin,Tplandmark,TpveriNotes;

    CaseDetailsReqInterface caseDetailsReqInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editpage);
        // assign Variable
        drawerLayout = findViewById(R.id.drawer_layout);
        btMenu = findViewById(R.id.bt_menu);
        recyclerView = findViewById(R.id.recycler_view);
        irukabtn = (Button) findViewById(R.id.iruka_btn);
        loadingcircleedit = findViewById(R.id.loading_layout_edit);

        // Edit text assign variable
       // caseid = findViewById(R.id.et_e_case_id);



        //set layout manager
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        // set adapter
        recyclerView.setAdapter(new MainAdapter(this, MainActivity.arrayList));

        btMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open drawer
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

        myrecyclerview= (RecyclerView) findViewById(R.id.editpage_recyclerview);

        myrecyclerview.setLayoutManager(new LinearLayoutManager(this));
        caseDetailsReqInterface = ApiClient.getclient().create(CaseDetailsReqInterface.class);

        String reqid = getIntent().getStringExtra("data");
        final int myint = Integer.parseInt(reqid);
        Toast.makeText(this,reqid,Toast.LENGTH_LONG).show();

//        duedate = (Button) findViewById(R.id.et_e_due_date);
//        duedate.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                pickmydate();
//            }
//        });

        irukabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = (EditText) findViewById(R.id.et_e_ID);
                caseid = (EditText) findViewById(R.id.et_e_case_id);
                refnumber = (EditText) findViewById(R.id.et_e_ref_number);
                agentname = (EditText) findViewById(R.id.et_e_agent_name);
                duedate = (Button) findViewById(R.id.et_e_due_date);
                desc = (EditText) findViewById(R.id.et_e_description);
                insname = (EditText) findViewById(R.id.et_e_i_name);
                Imobnumber = (EditText) findViewById(R.id.et_e_i_mobile);
                Iemailid = (EditText) findViewById(R.id.et_e_i_email);
                Iad1 = (EditText) findViewById(R.id.et_e_i_address_line_1);
                Iad2 = (EditText) findViewById(R.id.et_e_i_address_line_2);
                Icity = (EditText) findViewById(R.id.et_e_i_city);
                Istate = (EditText) findViewById(R.id.et_e_i_state);
                Ipin = (EditText) findViewById(R.id.et_e_i_pincode);
                Ilandmark = (EditText) findViewById(R.id.et_e_i_landmark);
                IveriNotes = (EditText) findViewById(R.id.et_e_i_questions);
                Tpname = (EditText) findViewById(R.id.et_e_tp_name);
                TpMobnumber = (EditText) findViewById(R.id.et_e_tp_mobile);
                TpEmail = (EditText) findViewById(R.id.et_e_tp_email);
                Tpad1 = (EditText) findViewById(R.id.et_e_tp_address_line_1);
                Tpad2 = (EditText) findViewById(R.id.et_e_tp_address_line_2);
                TpCity = (EditText) findViewById(R.id.et_e_tp_city);
                Tpstate = (EditText) findViewById(R.id.et_e_tp_state);
                TpPin = (EditText) findViewById(R.id.et_e_tp_pincode);
                Tplandmark = (EditText) findViewById(R.id.et_e_tp_landmark);
                TpveriNotes = (EditText) findViewById(R.id.et_e_tp_questions);

                // ins details
                PutInsDetailsModel putInsDetailsModel = new PutInsDetailsModel();
                putInsDetailsModel.setInsurerName(insname.getText().toString());
                putInsDetailsModel.setId(myint);
                putInsDetailsModel.setPhoneNumber(Imobnumber.getText().toString());
                putInsDetailsModel.setEmailID(Iemailid.getText().toString());
                putInsDetailsModel.setIAddressID(getByIdModels.get(0).getI_AddressID().toString());
                putInsDetailsModel.setAlternativePhoneNumber(getByIdModels.get(0).getAlternativePhoneNumber().toString());

                // ins Add
                PutInsAddressModel putInsAddressModel = new PutInsAddressModel();
                putInsAddressModel.setIAddressID(getByIdModels.get(0).getI_AddressID().toString());
                putInsAddressModel.setIAddressLine1(Iad1.getText().toString());
                putInsAddressModel.setIAddressLine2(Iad2.getText().toString());
                putInsAddressModel.setICity(Icity.getText().toString());
                putInsAddressModel.setIState(Istate.getText().toString());
                putInsAddressModel.setIPincode(Ipin.getText().toString());
                putInsAddressModel.setILandmark(Ilandmark.getText().toString());

                // tp details
                PutTpDetailsModel putTpDetailsModel = new PutTpDetailsModel();
                putTpDetailsModel.setId(myint);
                putTpDetailsModel.setThirdpartyName(Tpname.getText().toString());
                putTpDetailsModel.setTPhoneNumber(TpMobnumber.getText().toString());
                putTpDetailsModel.setTEmailID(TpEmail.getText().toString());
                putTpDetailsModel.setTVerificationNotes(TpveriNotes.getText().toString());
                putTpDetailsModel.setTAlternativePhoneNumber(getByIdModels.get(0).getT_AlternativePhoneNumber().toString());

                // tp address
                PutTpAddressModel putTpAddressModel = new PutTpAddressModel();
                putTpAddressModel.setId(myint);
                putTpAddressModel.setTAddressID(getByIdModels.get(0).getT_AddressID().toString());
                putTpAddressModel.setTAddressLine1(Tpad1.getText().toString());
                putTpAddressModel.setTAddressLine2(Tpad2.getText().toString());
                putTpAddressModel.setTCity(TpCity.getText().toString());
                putTpAddressModel.setTState(Tpstate.getText().toString());
                putTpAddressModel.setTPincode(TpPin.getText().toString());
                putTpAddressModel.setTLandmark(Tplandmark.getText().toString());

                ArrayList<PutInsAnswerModel>  putInsAnswerModel =
                        new ArrayList<>(Arrays.asList(new PutInsAnswerModel("yesi",19)));

                // tp answer
                ArrayList<PutTpAnswerModel> putTpAnswerModels =
                        new ArrayList<>(Arrays.asList(new PutTpAnswerModel("2kms",22)));

                CasedetailsPutModel myputdata = new CasedetailsPutModel();
                myputdata.setCaseID(caseid.getText().toString());
                myputdata.setName(agentname.getText().toString());
                myputdata.setDescription(desc.getText().toString());
                myputdata.setInsurerVerificationNotes(IveriNotes.getText().toString());
                myputdata.setTVerificationNotes(TpveriNotes.getText().toString());
                myputdata.setReferenceNumber(refnumber.getText().toString());
                myputdata.setDueDate(duedate.getText().toString());
                myputdata.setLastModifiedBy("2");
                myputdata.setStatusID("3");
                myputdata.setInsDetails(putInsDetailsModel);
                myputdata.setInsAddress(putInsAddressModel);
                myputdata.setTpartyDetails(putTpDetailsModel);
                myputdata.setTpartyAddress(putTpAddressModel);
                myputdata.setInsanswers(putInsAnswerModel);
                myputdata.setTpanswers(putTpAnswerModels);


                Call<CasedetailsPutModel> call = caseDetailsReqInterface.putcasedetails(myputdata);

                call.enqueue(new Callback<CasedetailsPutModel>() {
                    @Override
                    public void onResponse(Call<CasedetailsPutModel> call, Response<CasedetailsPutModel> response) {
                        Log.e("success", "onResponse: " + response.body());
                    }

                    @Override
                    public void onFailure(Call<CasedetailsPutModel> call, Throwable t) {
                        Log.e("failiue", "onFailure: " + t.getLocalizedMessage());
                    }
                });
                Log.e("QQQQQ", "onClick: " + getByIdModels.get(0).getI_AddressID().toString() );

            }
        });

        getbyID(myint);

    }

//    private void pickmydate() {
//        Calendar calendar = Calendar.getInstance();
//        int YEAR = calendar.get(Calendar.YEAR);
//        int MONTH = calendar.get(Calendar.MONTH);
//        int DATE = calendar.get(Calendar.DATE);
//        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
//            @Override
//            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
//                String dateString = year +"/"+month+"/"+dayOfMonth;
//                Toast.makeText(getApplicationContext(),dateString,Toast.LENGTH_LONG).show();
//            }
//        },YEAR,MONTH,DATE);
//    }


    @Override
    protected void onPause() {
        super.onPause();
        // close drawer
        MainActivity.closeDrawer(drawerLayout);
    }

    private void getbyID(int ID) {
        loadingcircleedit.setVisibility(View.VISIBLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE,WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
        Call<List<GetByIdModel>> call = caseDetailsReqInterface.getcasebyid(ID);
        irukabtn.setEnabled(false);

        call.enqueue(new Callback<List<GetByIdModel>>() {
            @Override
            public void onResponse(Call<List<GetByIdModel>> call, Response<List<GetByIdModel>> response) {
                getByIdModels =new ArrayList<>(response.body());
                editpageAdapter = new EditpageAdapter(EditpageActivity.this,getByIdModels);
                myrecyclerview.setAdapter(editpageAdapter);
                Log.e("Success.._", "onResponse: " + response.body() );
                loadingcircleedit.setVisibility(View.GONE);
                getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
                irukabtn.setEnabled(true);
            }

            @Override
            public void onFailure(Call<List<GetByIdModel>> call, Throwable t) {
                Log.e("Failed.._", "onFailure: " + t.getLocalizedMessage() );
                loadingcircleedit.setVisibility(View.GONE);
                getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
                irukabtn.setEnabled(true);
            }
        });
    }
}