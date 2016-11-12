package com.developeraugma.augmadeveloper.beginnerclassfirst.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.developeraugma.augmadeveloper.beginnerclassfirst.MainActivity;
import com.developeraugma.augmadeveloper.beginnerclassfirst.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread timer= new Thread(){
            @Override
            public void run() {
                try {
                    sleep(500);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                    Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();

                }
            }
        };
        timer.start();

    }
}
