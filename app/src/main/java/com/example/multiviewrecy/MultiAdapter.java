package com.example.multiviewrecy;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MultiAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static int TYPE_CALL =1;
    private static int TYPE_EMAIL=2;
    Context context;
    ArrayList<Multiemploy> multiemploys;

    public MultiAdapter(Context context, ArrayList<Multiemploy> multiemploys) {
        this.context = context;
        this.multiemploys = multiemploys;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {

        View view;

        if (viewType == TYPE_CALL)
        {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.calls_item,parent,false);
            return new callviewholder(view);
        }else{
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.email_item,parent,false);
            return new emailholder(view);
        }

    }

    @Override
    public int getItemViewType(int position) {
        if(TextUtils.isEmpty(multiemploys.get(position).getEmail())){
            return TYPE_CALL;
        }else{
            return TYPE_EMAIL;
        }
    }

    @Override
    public void onBindViewHolder( RecyclerView.ViewHolder holder, int position) {

        if(getItemViewType(position)==TYPE_CALL){
            ((callviewholder)holder).setcalldetails(multiemploys.get(position));
        }
        else {

            ((emailholder)holder).setemaildetails(multiemploys.get(position));
        }

    }

    @Override
    public int getItemCount() {
        return multiemploys.size();
    }


    class callviewholder extends RecyclerView.ViewHolder{

        TextView username,address;

        public callviewholder( View itemView) {
            super(itemView);

            username = itemView.findViewById(R.id.phoneusername);
            address = itemView.findViewById(R.id.phoneaddress);

        }

        public void setcalldetails(Multiemploy multiemploy)
        {
            username.setText(multiemploy.getUsername());
            address.setText(multiemploy.getAddress());
        }
    }



    class emailholder extends RecyclerView.ViewHolder{

        TextView username,address,email;

        public emailholder( View itemView) {
            super(itemView);

            username = itemView.findViewById(R.id.emailusername);
            address = itemView.findViewById(R.id.emailaddress);
            email = itemView.findViewById(R.id.Email);
        }

        public void setemaildetails(Multiemploy multiemploy)
        {
            username.setText(multiemploy.getUsername());
            address.setText(multiemploy.getAddress());
        }
    }

}
