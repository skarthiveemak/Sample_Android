package com.example.sidemenu.EditPage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.example.sidemenu.ApiClient;
import com.example.sidemenu.CaseDetailsReqInterface;
import com.example.sidemenu.MainActivity;
import com.example.sidemenu.MainAdapter;
import com.example.sidemenu.R;

import java.util.ArrayList;
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

    CaseDetailsReqInterface caseDetailsReqInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editpage);
        // assign Variable
        drawerLayout = findViewById(R.id.drawer_layout);
        btMenu = findViewById(R.id.bt_menu);
        recyclerView = findViewById(R.id.recycler_view);

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



        getbyID();
    }

    @Override
    protected void onPause() {
        super.onPause();
        // close drawer
        MainActivity.closeDrawer(drawerLayout);
    }

    private void getbyID() {
        Call<List<GetByIdModel>> call = caseDetailsReqInterface.getcasebyid();

        call.enqueue(new Callback<List<GetByIdModel>>() {
            @Override
            public void onResponse(Call<List<GetByIdModel>> call, Response<List<GetByIdModel>> response) {
                getByIdModels =new ArrayList<>(response.body());
                editpageAdapter = new EditpageAdapter(EditpageActivity.this,getByIdModels);
                myrecyclerview.setAdapter(editpageAdapter);
                Log.e("Success.._", "onResponse: " + response.body() );
            }

            @Override
            public void onFailure(Call<List<GetByIdModel>> call, Throwable t) {
                Log.e("Failed.._", "onFailure: " + t.getLocalizedMessage() );
            }
        });


    }
}