package com.example.sidemenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CardDesignActivity extends AppCompatActivity {
    // Initialize variable
    DrawerLayout drawerLayout;
    ImageView btMenu;
    RecyclerView recyclerView;

    CaseDetailsReqInterface caseDetailsReqInterface;
    ArrayList<CasedetailsModel> casedetailsModels = new ArrayList<>();
    ArrayList<CasebyLoggedModel> casebyLoggedModels = new ArrayList<>();
    ArrayList<PageOfItem> pageOfItems = new ArrayList<>();
    private CaseDetailsAdapter caseDetailsAdapter;
    private RecyclerView caserecyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_design);

        // assign Variable
        drawerLayout = findViewById(R.id.drawer_layout);
        btMenu = findViewById(R.id.bt_menu);
        recyclerView = findViewById(R.id.recycler_view);

        caserecyclerView = (RecyclerView) findViewById(R.id.case_recyclerview);
        caserecyclerView.setLayoutManager(new LinearLayoutManager(this));
        caseDetailsReqInterface = ApiClient.getclient().create(CaseDetailsReqInterface.class);
        getCaseByLoggedUser();


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


    }

    private void getCaseByLoggedUser() {
        Call<CasebyLoggedModel> call = caseDetailsReqInterface.getloggeduser();
        call.enqueue(new Callback<CasebyLoggedModel>() {
            private static final String TAG = "TAG";

            @Override
            public void onResponse(Call<CasebyLoggedModel> call, Response<CasebyLoggedModel> response) {

               // ArrayList<> data = response.body();
              //  casebyLoggedModels = new ArrayList<>(response.body().getPageOfItems());
                ArrayList<PageOfItem> pageitems =new ArrayList<>(response.body().getPageOfItems());
                caseDetailsAdapter = new CaseDetailsAdapter(CardDesignActivity.this,pageitems);
                caserecyclerView.setAdapter(caseDetailsAdapter);
                Toast.makeText(CardDesignActivity.this,"Success",Toast.LENGTH_LONG).show();
                Log.e(TAG, "onResponse: " + response.body() );
            }

            @Override
            public void onFailure(Call<CasebyLoggedModel> call, Throwable t) {
                Log.e("Error:::", "onFailure: "+ t.getLocalizedMessage() );
            }
        });





    }

    @Override
    protected void onPause() {
        super.onPause();
        // close drawer
        MainActivity.closeDrawer(drawerLayout);
    }
}