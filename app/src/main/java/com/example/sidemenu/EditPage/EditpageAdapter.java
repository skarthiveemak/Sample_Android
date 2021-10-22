package com.example.sidemenu.EditPage;

import android.app.DatePickerDialog;
import android.content.Context;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sidemenu.R;

import java.util.ArrayList;
import java.util.Calendar;

public class EditpageAdapter extends RecyclerView.Adapter<EditpageAdapter.ViewHolder> {
    private Context context;
    private ArrayList<GetByIdModel> getbyidlist;

    public EditpageAdapter(Context context, ArrayList<GetByIdModel> getbyidlist) {
        this.context = context;
        this.getbyidlist = getbyidlist;
    }

    @NonNull
    @Override
    public EditpageAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
         View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.editpageform, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull EditpageAdapter.ViewHolder holder, int position) {
        GetByIdModel getByIdModel = getbyidlist.get(position);
        String CaseID = getbyidlist.get(position).getCaseID();
        String RefNumber = getbyidlist.get(position).getReferenceNumber();
        String DueDate = getbyidlist.get(position).getDueDate();
        String agentName = getbyidlist.get(position).getName();
        String Description = getbyidlist.get(position).getDescription();
        String InsName = getbyidlist.get(position).getInsurerName();
        String IMobilenum = getbyidlist.get(position).getPhoneNumber();
        String IEmail = getbyidlist.get(position).getEmailID();
        String IAdl1 = getbyidlist.get(position).getI_AddressLine1();
        String IAdl2 = getbyidlist.get(position).getI_AddressLine2();
        String ICity = getbyidlist.get(position).getI_City();
        String IState = getbyidlist.get(position).getI_State();
        String IPincode = getbyidlist.get(position).getI_Pincode();
        String Ilandmark = getbyidlist.get(position).getI_Landmark();
        String Iquestions = getbyidlist.get(position).getInsurerVerificationNotes();

        holder.setData(CaseID,RefNumber,DueDate,agentName,Description,InsName,IMobilenum,IEmail,IAdl1,IAdl2,ICity,IState,IPincode,Ilandmark,Iquestions);
        holder.ettpName.setText(getByIdModel.getThirdpartyName());
        holder.ettpmob.setText(getByIdModel.getT_PhoneNumber());
        holder.ettpemail.setText(getByIdModel.getT_EmailID());
        holder.ettpAd1.setText(getByIdModel.getT_AddressLine1());
        holder.ettpAd2.setText(getByIdModel.getT_AddressLine2());
        holder.ettpCity.setText(getByIdModel.getT_City());
        holder.ettpState.setText(getByIdModel.getI_State());
        holder.ettpPincode.setText(getByIdModel.getI_Pincode());
        holder.ettpLandmark.setText(getByIdModel.getI_Landmark());
        holder.ettpQuestns.setText(getByIdModel.getT_VerificationNotes());
       // holder.etID.setText(getByIdModel.getID());
    }

    @Override
    public int getItemCount() {
        return getbyidlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public EditText etID,etCaseid, etName, etDesc, etRefNum,etIname,etImob,etIEmail,etIAd1,etIAd2,etIcity,etIState,etIPincode,etIlandmark,etIQust;
        public EditText ettpName,ettpmob,ettpemail,ettpAd1,ettpAd2,ettpCity,ettpState,ettpPincode,ettpLandmark,ettpQuestns;
        public Button btnduedate;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            etID = itemView.findViewById(R.id.et_e_ID);
            etCaseid = itemView.findViewById(R.id.et_e_case_id);
            etRefNum = itemView.findViewById(R.id.et_e_ref_number);
            btnduedate = itemView.findViewById(R.id.et_e_due_date);
            etName = itemView.findViewById(R.id.et_e_agent_name);
            etDesc = itemView.findViewById(R.id.et_e_description);
            etIname=itemView.findViewById(R.id.et_e_i_name);
            etImob = itemView.findViewById(R.id.et_e_i_mobile);
            etIEmail = itemView.findViewById(R.id.et_e_i_email);
            etIAd1 = itemView.findViewById(R.id.et_e_i_address_line_1);
            etIAd2 = itemView.findViewById(R.id.et_e_i_address_line_2);
            etIcity = itemView.findViewById(R.id.et_e_i_city);
            etIState = itemView.findViewById(R.id.et_e_i_state);
            etIPincode = itemView.findViewById(R.id.et_e_i_pincode);
            etIlandmark = itemView.findViewById(R.id.et_e_i_landmark);
            etIQust = itemView.findViewById(R.id.et_e_i_questions);

            ettpName = (EditText) itemView.findViewById(R.id.et_e_tp_name);
            ettpmob = (EditText) itemView.findViewById(R.id.et_e_tp_mobile);
            ettpemail = (EditText) itemView.findViewById(R.id.et_e_tp_email);
            ettpAd1 = (EditText) itemView.findViewById(R.id.et_e_tp_address_line_1);
            ettpAd2 = (EditText) itemView.findViewById(R.id.et_e_tp_address_line_2);
            ettpCity = (EditText) itemView.findViewById(R.id.et_e_tp_city);
            ettpState = (EditText) itemView.findViewById(R.id.et_e_tp_state);
            ettpPincode = (EditText) itemView.findViewById(R.id.et_e_tp_pincode);
            ettpLandmark = (EditText) itemView.findViewById(R.id.et_e_tp_landmark);
            ettpQuestns = (EditText) itemView.findViewById(R.id.et_e_tp_questions);


//            itemView.findViewById(R.id.update_btn).setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    String mycaseid = etCaseid.getText().toString();
//                    Toast.makeText(context.getApplicationContext(),mycaseid,Toast.LENGTH_LONG).show();
//
//                }
//            });

            btnduedate.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int YEAR = 2019;
                    int MONTH = 3;
                    int DATE = 19;
                    DatePickerDialog datePickerDialog = new DatePickerDialog(context, new DatePickerDialog.OnDateSetListener() {
                        @Override
                        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                            String dateString = year +"-"+month+"-"+dayOfMonth;
                            btnduedate.setText(dateString);
//                Toast.makeText(context.getApplicationContext(),dateString,Toast.LENGTH_LONG).show();
                            Calendar calendar1 = Calendar.getInstance();
                            calendar1.set(Calendar.YEAR, year);
                            calendar1.set(Calendar.MONTH, month);
                            calendar1.set(Calendar.DATE, dayOfMonth);

                            CharSequence dateCharSequence = DateFormat.format("yyyy-MM-dd",calendar1);
                            btnduedate.setText(dateCharSequence);
                        }
                    },YEAR,MONTH,DATE);
                    datePickerDialog.show();
                }
            });
        }


        public void setData(String caseID, String refNumber, String dueDate, String agentName, String description, String insName, String iMobilenum, String iEmail, String iAdl1, String iAdl2, String iCity, String iState, String iPincode, String ilandmark, String iquestions) {
            etCaseid.setText(caseID);
            etRefNum.setText(refNumber);
            btnduedate.setText(dueDate);
            etName.setText(agentName);
            etDesc.setText(description);
            etIname.setText(insName);
            etImob.setText(iMobilenum);
            etIEmail.setText(iEmail);
            etIAd1.setText(iAdl1);
            etIAd2.setText(iAdl2);
            etIcity.setText(iCity);
            etIState.setText(iState);
            etIPincode.setText(iPincode);
            etIlandmark.setText(ilandmark);
            etIQust.setText(iquestions);
        }


    }

//    public void datepickmethod() {
//        Calendar calendar = Calendar.getInstance();
//        int YEAR = calendar.get(Calendar.YEAR);
//        int MONTH = calendar.get(Calendar.MONTH);
//        int DATE = calendar.get(Calendar.DATE);
//        DatePickerDialog datePickerDialog = new DatePickerDialog(context.getApplicationContext(), new DatePickerDialog.OnDateSetListener() {
//            @Override
//            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
//                String dateString = year +"/"+month+"/"+dayOfMonth;
//                Toast.makeText(context.getApplicationContext(),dateString,Toast.LENGTH_LONG).show();
//            }
//        },YEAR,MONTH,DATE);
//        datePickerDialog.show();
//    }
}
