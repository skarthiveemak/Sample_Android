package com.example.sidemenu;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.text.Editable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sidemenu.EditPage.EditpageActivity;

import java.util.ArrayList;
import java.util.Collection;

public class CaseDetailsAdapter extends RecyclerView.Adapter<CaseDetailsAdapter.ViewHolder> implements Filterable{
    private Context context;
    private final ArrayList<CasebyLoggedModel> casebyLoggedModels = new ArrayList<>();
    private ArrayList<PageOfItem> pageOfItems = new ArrayList<>();
     ArrayList<PageOfItem>caseListAll;

    public CaseDetailsAdapter(Context context, ArrayList<PageOfItem> pageOfItems) {
        this.pageOfItems = pageOfItems;
        this.caseListAll = new ArrayList<>(pageOfItems);
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
        holder.tv_ID.setText(Integer.toString(pageOfItem.getID()));
    }

    @Override
    public int getItemCount() {
        return pageOfItems.size();
    }

    @Override
    public Filter getFilter() {
        return filter;
    }

    Filter filter =new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            ArrayList<PageOfItem> filteredlist =new ArrayList<>();
            if (constraint.toString().isEmpty()){
                filteredlist.addAll(caseListAll);
            }else {
                    for (PageOfItem cases : caseListAll){
                        if (cases.getCaseID().toLowerCase().contains(constraint.toString().toLowerCase())){
                                filteredlist.add(cases);
                        }
                }
            }
            FilterResults filterResults = new FilterResults();
            filterResults.values = filteredlist;
            return filterResults;
        }

        @SuppressLint("NotifyDataSetChanged")
        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            pageOfItems.clear();
            pageOfItems.addAll((Collection<? extends PageOfItem>) results.values);
            notifyDataSetChanged();
        }
    };

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tv_name,tv_status,tv_due_date,tv_caseid;
        private EditText tv_ID;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_ID = (EditText) itemView.findViewById(R.id.tv_ID);
           tv_caseid = (TextView) itemView.findViewById(R.id.tv_caseid);
            tv_name = (TextView) itemView.findViewById(R.id.tv_name);
            tv_due_date = (TextView) itemView.findViewById(R.id.tv_due_date);
            tv_status = (TextView) itemView.findViewById(R.id.tv_status);

            itemView.findViewById(R.id.btn_edit2).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    String value= tv_ID.getText().toString();
                   // Toast.makeText(context.getApplicationContext(),value ,Toast.LENGTH_LONG).show();

                    Intent intent = new Intent(v.getContext(), EditpageActivity.class).putExtra("data",value);
                    context.startActivity(intent);
                }
            });
        }
    }
}
