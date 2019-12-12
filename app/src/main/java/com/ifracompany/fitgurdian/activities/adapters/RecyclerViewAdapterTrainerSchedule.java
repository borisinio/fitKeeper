package com.ifracompany.fitgurdian.activities.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.ifracompany.fitgurdian.R;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import de.hdodenhof.circleimageview.CircleImageView;


public class RecyclerViewAdapterTrainerSchedule extends RecyclerView.Adapter<RecyclerViewAdapterTrainerSchedule.ViewHolder> {
    private ArrayList<String> timeArray = new ArrayList();
    private ArrayList<String> contents = new ArrayList();
    Context context;


    public RecyclerViewAdapterTrainerSchedule(ArrayList<String> timeArray, ArrayList<String> contents, Context context) {
        System.out.println("okkkkkkkkkkkk");
        this.timeArray = timeArray;
        this.contents = contents;
        this.context = context;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.schedulelist,parent,false);
        ViewHolder viewHolder = new ViewHolder(view) ;

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.text.setText(timeArray.get(position)+contents.get(position));


    }

    @Override
    public int getItemCount() {
        return timeArray.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        TextView text;
        RelativeLayout scheduleTrainerList;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);


            text = itemView.findViewById(R.id.costumerName);
            scheduleTrainerList = itemView.findViewById(R.id.scheduleTrainerList);
        }


    }
}

