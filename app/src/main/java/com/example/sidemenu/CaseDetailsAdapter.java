package com.example.sidemenu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CaseDetailsAdapter extends RecyclerView.Adapter<CaseDetailsAdapter.ViewHolder> {
    private Context context;
    private ArrayList<CasebyLoggedModel> casebyLoggedModels = new ArrayList<>();
    private ArrayList<PageOfItem> pageOfItems = new ArrayList<>();

    public CaseDetailsAdapter(Context context, ArrayList<PageOfItem> pageOfItems) {
        this.pageOfItems = pageOfItems;
        this.context = context;
    }

    @NonNull
    @Override
    public CaseDetailsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_card_view_card_design,parent,false);
        return new CaseDetailsAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CaseDetailsAdapter.ViewHolder holder, int position) {
        PageOfItem pageOfItem = pageOfItems.get(position);
        holder.tv_name.setText(pageOfItem.getName());
        holder.tv_caseid.setText(pageOfItem.getCaseID());
        holder.tv_due_date.setText(pageOfItem.getDueDate());
        holder.tv_status.setText(pageOfItem.getStatusName());

    }

    @Override
    public int getItemCount() {
        return pageOfItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tv_name,tv_status,tv_due_date,tv_caseid;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
           tv_caseid = (TextView) itemView.findViewById(R.id.tv_caseid);
            tv_name = (TextView) itemView.findViewById(R.id.tv_name);
            tv_due_date = (TextView) itemView.findViewById(R.id.tv_due_date);
            tv_status = (TextView) itemView.findViewById(R.id.tv_status);
        }
    }
}
