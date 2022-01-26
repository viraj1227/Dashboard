package com.example.dashboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    CardView admin_donor;
    CardView admin_blood_bank;
    CardView admin_recepient;
    CardView admin_noti;
    CardView admin_profile;
    CardView admin_request;
    CardView admin_about_us;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        admin_donor = findViewById(R.id.admin_donor);
        admin_blood_bank = findViewById(R.id.admin_bank);
        admin_recepient = findViewById(R.id.admin_rec);
        admin_request = findViewById(R.id.admin_request);
        admin_noti = findViewById(R.id.admin_noti);
        admin_profile = findViewById(R.id.admin_profile);
        admin_about_us = findViewById(R.id.admin_about);

        admin_donor.setOnClickListener(this);
        admin_blood_bank.setOnClickListener(this);
        admin_recepient.setOnClickListener(this);
        admin_request.setOnClickListener(this);
        admin_noti.setOnClickListener(this);
        admin_profile.setOnClickListener(this);
        admin_about_us.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()){
            case R.id.admin_donor :
                i = new Intent(this, Donor.class);
                startActivity(i);
                break;
            case R.id.admin_bank:
                i = new Intent(this, BloodBank.class);
                startActivity(i);
                break;
            case R.id.admin_rec:
                i = new Intent(this,Recepient.class);
                startActivity(i);
                break;
            case R.id.admin_request:
                i = new Intent(this, Request.class);
                startActivity(i);
                break;
            case R.id.admin_noti :
                i = new Intent(this,Notification.class);
                startActivity(i);
                break;
            case R.id.admin_profile :
                i = new Intent(this,Profile.class);
                startActivity(i);
                break;
            case R.id.admin_about :
                i = new Intent(this,Aboutus.class);
                startActivity(i);
                break;
        }
    }
}