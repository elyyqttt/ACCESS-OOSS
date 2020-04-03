package com.example.loginmodule;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import gr.net.maroulis.library.EasySplashScreen;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        EasySplashScreen config = new EasySplashScreen(SplashScreen.this)
                .withFullScreen()
                .withBackgroundResource(R.drawable.design_splashscreen)
                .withSplashTimeOut(4000)
                .withTargetActivity(MainMenuFinal.class);

        View easySC = config.create();
        setContentView(easySC);
    }
}
