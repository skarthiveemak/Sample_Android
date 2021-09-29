package com.example.sidemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class splashscreen extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 2000;

    //Hooks
    View first,second,third,fourth,fifth;
    TextView a,slogan;

    // Animations
    Animation topanimation, bottomanimation, middleanimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // full screen splash no notification bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splashscreen);

        topanimation = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottomanimation = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);
        middleanimation = AnimationUtils.loadAnimation(this, R.anim.middle_animation);

        //Hooks
        first = findViewById(R.id.first_line);
        second = findViewById(R.id.second_line);
        third = findViewById(R.id.third_line);
        fourth = findViewById(R.id.fourth_line);
        fifth = findViewById(R.id.fifth_line);

        a = findViewById(R.id.a);
        slogan = findViewById(R.id.tagline);

        // setting animation
        first.setAnimation(topanimation);
        second.setAnimation(topanimation);
        third.setAnimation(topanimation);
        fourth.setAnimation(topanimation);
        fifth.setAnimation(topanimation);

        a.setAnimation(middleanimation);
        slogan.setAnimation(bottomanimation);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(splashscreen.this, MainActivity.class);
                startActivity(intent);
                finish();

            }
        }, SPLASH_TIME_OUT);
    }
}