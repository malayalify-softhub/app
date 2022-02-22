package com.sree.myappjan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends AppCompatActivity {

    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
//
//        Thread obj = new Thread(){
//            @Override
//            public void run() {
//                try {
//                    sleep(5000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                Intent i = new Intent(getApplicationContext(), Login.class);
//                startActivity(i);
//                finish();
//            }
//        };
//
//        obj.start();

         handler = new Handler();

         handler.postDelayed(new Runnable() {
             @Override
             public void run() {
                 Intent i = new Intent(getApplicationContext(), Login.class);
                 startActivity(i);
                 finish();
             }
         },3000);
    }

}