package com.ifracompany.fitgurdian.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.ifracompany.fitgurdian.R;


public class SignInActivity extends AppCompatActivity {
    ImageView imageView;
    TextView name ,email , id;
    Button signOutBtn, moveForwardBtn, trainerBtn;
    GoogleSignInClient mGoogleSignInClient;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        moveForwardBtn = findViewById(R.id.moveOnFromSignInBtn);
        trainerBtn = findViewById(R.id.TrainerBtn);
        moveForwardBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent i = new Intent(SignInActivity.this, HomeActivity.class);
                    startActivity(i);
                }

        });

        trainerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(SignInActivity.this, TrainerHomeActivity.class);
                startActivity(i);
            }

        });

        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().build();
        mGoogleSignInClient = GoogleSignIn.getClient(this, gso);

        imageView = findViewById(R.id.imageViewSignIn);
        //name = findViewById(R.id.textName);
        //
        // email = findViewById(R.id.textEmail);
        //id = findViewById(R.id.textId);
        signOutBtn = findViewById(R.id.buttonOut);
        signOutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    // ...
                    case R.id.buttonOut:
                        signOut();
                        break;
                    // ...
                }
            }
        });

        GoogleSignInAccount acct = GoogleSignIn.getLastSignedInAccount(this);
        if (acct != null) {
            String personName = acct.getDisplayName();
            String personEmail = acct.getEmail();
            String personId = acct.getId();
            Uri personPhoto = acct.getPhotoUrl();

            //name.setText(personName);
            //email.setText(personEmail);
            //id.setText(personId);
             Glide.with(this).load(String.valueOf(personPhoto)).into(imageView);
        }
    }
    private void signOut() {

        mGoogleSignInClient.signOut()
                .addOnCompleteListener(this, new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        Toast.makeText(SignInActivity.this ,"התנתקת בהצלחה !" , Toast.LENGTH_LONG).show();
                        finish();
                    }
                });
    }
}
