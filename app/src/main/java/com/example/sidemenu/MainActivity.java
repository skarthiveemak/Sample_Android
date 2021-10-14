package com.example.sidemenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sidemenu.EditPage.EditpageActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    // intialize variable
    DrawerLayout drawerLayout;
    ImageView btMenu;
    RecyclerView recyclerView;
    public static ArrayList<String> arrayList = new ArrayList<>();
    MainAdapter adapter;
    EditText caseid;
    ImageButton editbtn,viewbtn;


    public static void closeDrawer(DrawerLayout drawerLayout) {
        // check condition
        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            // when drawer is open
            // close drawer
            drawerLayout.closeDrawer(GravityCompat.START);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Assign Variable

        drawerLayout = findViewById(R.id.drawer_layout);
        btMenu = findViewById(R.id.bt_menu);
        recyclerView = findViewById(R.id.recycler_view);
        caseid = findViewById(R.id.et_caseid);
        editbtn = findViewById(R.id.btn_edit);
        viewbtn = findViewById(R.id.btn_view);

        // Clear array list
        arrayList.clear();

        //add menu item in array list
        arrayList.add("Home");
        arrayList.add("Case View"); // dashboard renames as case view
        arrayList.add("About");
        arrayList.add("Card Design Test");
        arrayList.add("Logout");
        arrayList.add("Edit Page");



        // initialize adapter
        adapter = new MainAdapter(this,arrayList);
        // set layout manager
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //set adapter
        recyclerView.setAdapter(adapter);



        btMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // open drawer
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

        editbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, expansionLayout.class);
                startActivity(intent);
            }
        });

        viewbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EditpageActivity.class);
                startActivity(intent);
            }
        });

        caseid.setText("12EA153");
        EditText name = findViewById(R.id.et_name);
                name.setText("Karthik");
        EditText duedate = findViewById(R.id.et_due_date);
        duedate.setText("12-12-2012");
        EditText status = findViewById(R.id.et_status);
        status.setText("Assigned");

    }

    @Override
    protected void onPause() {
        super.onPause();
        // close drawer
        closeDrawer(drawerLayout);
    }
}