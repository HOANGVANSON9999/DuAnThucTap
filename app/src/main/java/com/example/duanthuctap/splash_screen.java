package com.example.duanthuctap;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class splash_screen extends AppCompatActivity {
    TextView appname;
    View lottie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        appname = findViewById(R.id.appname);
        lottie = findViewById(R.id.lottie);
        appname.animate().translationY(-1400).setDuration(2700).setStartDelay(0);
        lottie.animate().translationY(2000).setDuration(2700).setStartDelay(2900);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(splash_screen.this, LoginActivity.class);
                startActivity(intent);
            }
        }, 5000);
    }
}