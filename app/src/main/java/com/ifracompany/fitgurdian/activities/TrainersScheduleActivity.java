package com.ifracompany.fitgurdian.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.ifracompany.fitgurdian.R;
import com.ifracompany.fitgurdian.activities.adapters.RecyclerViewAdapter;

import java.util.ArrayList;

public class TrainersScheduleActivity extends AppCompatActivity {

    private ArrayList<String> timeArray = new ArrayList();
    private ArrayList<String> contents = new ArrayList();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trainers_schedule);
        initImageBitmaps();

    }

    private void initImageBitmaps() {

        timeArray.add("08:00");
        contents.add("אימון להומר סימפסון");
        timeArray.add("08:00");
        contents.add("אימון להומר סימפסון");
        timeArray.add("08:00");
        contents.add("אימון להומר סימפסון");
        timeArray.add("08:00");
        contents.add("אימון להומר סימפסון");
        timeArray.add("08:00");
        contents.add("אימון להומר סימפסון");
        timeArray.add("08:00");
        contents.add("אימון להומר סימפסון");


        initRecyclerView();
    }

    private void initRecyclerView(){

        RecyclerView recyclerView = findViewById(R.id.recyclerViewScheduleDateTrainer);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter( timeArray, contents , this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
