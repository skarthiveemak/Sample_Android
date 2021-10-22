package com.example.sidemenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
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
    RelativeLayout loadingcircle;

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
        loadingcircle = findViewById(R.id.loading_layout);


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
        loadingcircle.setVisibility(View.VISIBLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE,WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
        Call<CasebyLoggedModel> call = caseDetailsReqInterface.getloggeduser();
        call.enqueue(new Callback<CasebyLoggedModel>() {
            private static final String TAG = "TAG";

            @Override
            public void onResponse(Call<CasebyLoggedModel> call, Response<CasebyLoggedModel> response) {

               // ArrayList<> data = response.body();
              //  casebyLoggedModels = new ArrayList<>(response.body().getPageOfItems());
                ArrayList<PageOfItem> pageitems =new ArrayList<>(response.body().getPageOfItems());
                String mycaseid2 =   response.body().getPageOfItems().get(0).getCaseID().toString();

                caseDetailsAdapter = new CaseDetailsAdapter(CardDesignActivity.this,pageitems);
                caserecyclerView.setAdapter(caseDetailsAdapter);
                Toast.makeText(CardDesignActivity.this,"Success",Toast.LENGTH_LONG).show();
                Log.e(TAG, "onResponse: " + response.body() );
                loadingcircle.setVisibility(View.GONE);
                getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
            }

            @Override
            public void onFailure(Call<CasebyLoggedModel> call, Throwable t) {
                Log.e("Error:::", "onFailure: "+ t.getLocalizedMessage() );
            }

        });

    }

    //search the case
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.main_menu,menu);
        MenuItem menuItem =menu.findItem(R.id.action_search);
        SearchView searchView =(SearchView)menuItem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                caseDetailsAdapter.getFilter().filter(newText);
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onPause() {
        super.onPause();
        // close drawer
        MainActivity.closeDrawer(drawerLayout);
    }
}