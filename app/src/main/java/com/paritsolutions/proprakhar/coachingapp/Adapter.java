package com.paritsolutions.proprakhar.coachingapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private Context mContext;
    private List<String> myInteger;

    public Adapter(Context context,List<String> myInt){
        mContext=context;
        myInteger=myInt;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(mContext).inflate(R.layout.batchdesign,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.button.setText(myInteger.get(position));
    }

    @Override
    public int getItemCount() {
        return myInteger.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

//        public TextView textView;
        public Button button;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
//            textView=itemView.findViewById(R.id.textView);
            button=itemView.findViewById(R.id.button);
        }
    }

}
