package com.example.sidemenu;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {
    // Initialize Variable
    Activity activity;
    ArrayList<String> arrayList;

    // Create constructor
    public MainAdapter(Activity activity,ArrayList<String> arrayList){
        this.activity = activity;
        this.arrayList = arrayList;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Initialize View
        View view = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_drawer_main,parent,false);
        // Return holder view
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // set text on text view
        holder.textView.setText(arrayList.get(position));

        holder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // get clicked item position
                int position = holder.getAdapterPosition();
                // check condition
                switch (position){
                    case 0:
                        // when position equal to zero return to home page
                        activity.startActivity(new Intent(activity,MainActivity.class).
                                setFlags(Intent.FLAG_ACTIVITY_NEW_TASK ));
                        break;
                    case 1:
                        // when position os equal to one redirect to dashboard page
                        activity.startActivity(new Intent(activity,Dashboard.class).
                                setFlags(Intent.FLAG_ACTIVITY_NEW_TASK));

                        break;
                    case 2:
                        // when position equal to 2
                        // Redirect to about page
                        activity.startActivity(new Intent(activity, About.class)
                        .setFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
                        break;
                    case 3:
                        // when position equal to 3
                        //Initialize alert dialog
                        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                        // set Title
                        builder.setTitle("Logout");
                        builder.setMessage("Are you sure to logout");
                        //positive button
                        builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                // finish all activity
                                activity.finishAffinity();

                                //exit app
                                System.exit(0);

                            }
                        });

                        // Negative cancel button
                        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                            }
                        });
                        // show dialog
                        builder.show();
                        break;
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        // return array list size
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        // initialize variable
        TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            // Assign variable
            textView = itemView.findViewById(R.id.text_view);
        }
    }
}
