package com.ifracompany.fitgurdian.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ifracompany.fitgurdian.R;

public class HomeActivity extends AppCompatActivity {
    Button sceduleBtn, menuBtn, progresBtn, tipsBtn , payBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        System.out.println("Home activity");
        sceduleBtn = findViewById(R.id.sceduleBtn);
        progresBtn = findViewById(R.id.progresBtn);
        payBtn = findViewById(R.id.payBtn);

        progresBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(HomeActivity.this, ProgressActivity.class);
                startActivity(i);
            }

        });

        sceduleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(HomeActivity.this, SceduleActivity.class);
                startActivity(i);
            }
        });


        payBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(HomeActivity.this, PaymentActivity.class);
                startActivity(i);
            }
        });
    }
}
