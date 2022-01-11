package com.example.dashboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    CardView card_home;
    CardView card_location;
    CardView card_profile;
    CardView card_logout;
    CardView card_about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        card_home = findViewById(R.id.card_home);
        card_location = findViewById(R.id.card_location);
        card_profile = findViewById(R.id.card_profile);
        card_logout = findViewById(R.id.card_logout);
        card_about = findViewById(R.id.card_about);

        card_home.setOnClickListener(this);
        card_location.setOnClickListener(this);
        card_profile.setOnClickListener(this);
        card_logout.setOnClickListener(this);
        card_about.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()){
            case R.id.card_home :
                i = new Intent(this,Home.class);
                startActivity(i);
                break;
            case R.id.card_location :
                i = new Intent(this,Location.class);
                startActivity(i);
                break;
            case R.id.card_profile :
                i = new Intent(this,Profile.class);
                startActivity(i);
                break;
            case R.id.card_about :
                i = new Intent(this,Aboutus.class);
                startActivity(i);
                break;
        }
    }
}