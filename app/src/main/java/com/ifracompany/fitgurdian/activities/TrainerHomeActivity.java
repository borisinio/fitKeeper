package com.ifracompany.fitgurdian.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ifracompany.fitgurdian.R;

public class TrainerHomeActivity extends AppCompatActivity {
    Button personalZoneBtn , trainerCostumerListBtn , trainerScheduleBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trainer_home);
        trainerScheduleBtn = findViewById(R.id.scheduleTrainerBtn);
        personalZoneBtn = findViewById(R.id.personalZoneBtn);
        trainerCostumerListBtn = findViewById(R.id.costumersListBtn);
        personalZoneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(TrainerHomeActivity.this, PersonalZoneTActivity.class);
                startActivity(i);
            }

        });

        trainerCostumerListBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(TrainerHomeActivity.this, TrainersCostumersActivity.class);
                startActivity(i);
            }

        });

        trainerScheduleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(TrainerHomeActivity.this, TrainersScheduleActivity.class);
                startActivity(i);
            }

        });

    }
}
