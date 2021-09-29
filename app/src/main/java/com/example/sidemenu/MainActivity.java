package com.example.sidemenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    // intialize variable
    DrawerLayout drawerLayout;
    ImageView btMenu;
    RecyclerView recyclerView;
    static ArrayList<String> arrayList = new ArrayList<>();
    MainAdapter adapter;

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

        // Clear array list
        arrayList.clear();

        //add menu item in array list
        arrayList.add("Home");
        arrayList.add("Case View"); // dashboard renames as case view
        arrayList.add("About");
        arrayList.add("Logout");


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
    }

    @Override
    protected void onPause() {
        super.onPause();
        // close drawer
        closeDrawer(drawerLayout);
    }
}