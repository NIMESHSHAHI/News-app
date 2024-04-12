package com.example.newsapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.example.newsapp.utils.FirebaseUtil;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (FirebaseUtil.isLoggedIn()){
                    startActivity(new Intent(SplashActivity.this,MainActivity.class));
                }else {
                    startActivity(new Intent(SplashActivity.this,SignUpActivity.class));
                }
               finish();
            }
        },3000);
    }
}