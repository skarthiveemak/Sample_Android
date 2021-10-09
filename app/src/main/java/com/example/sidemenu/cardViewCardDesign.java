package com.example.sidemenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;

public class cardViewCardDesign extends AppCompatActivity {

    EditText caseid;
    ImageButton btnEdit;
    CaseDetailsReqInterface caseDetailsReqInterface;
    ArrayList<PageOfItem> pageOfItems = new ArrayList<>();
    private CaseDetailsAdapter caseDetailsAdapter;
    private RecyclerView caserecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view_card_design);

    caseid = findViewById(R.id.et_case_id);
    btnEdit = findViewById(R.id.btn_edit);

    caseid.setText("Mine");



    btnEdit.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            caseid.setText("Mine");
        }
    });





    }
}