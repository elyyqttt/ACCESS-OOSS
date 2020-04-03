package com.example.loginmodule;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MembersFrame extends AppCompatActivity {
    private Button backbmembers1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_members_frame);
        backcal();
        ConstraintLayout constraintLayout = findViewById(R.id.layout_grad);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(4500);
        animationDrawable.setExitFadeDuration(4500);
        animationDrawable.start();
    }
    protected void backcal() {
        backbmembers1 = findViewById(R.id.backbmembers);
        backbmembers1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), MainMenuFinal.class);
                startActivity(intent);
            }
        });
    }
}
