package com.example.loginmodule;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenuFinal extends AppCompatActivity {

    //private Button logbutton;
    private Button membersbutton;
    private Button ordersbutton;
    private Button lockerbutton;
    private Button calendarbutton;
    private Button loginbutton;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainmenu);

        ConstraintLayout constraintLayout = findViewById(R.id.linearLayout);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(4500);
        animationDrawable.setExitFadeDuration(4500);
        animationDrawable.start();

        members();
        orders();
        lockers();
        calendar();
    }

   /* protected void logOut() {
        logbutton = findViewById(R.id.logoutbutton);
        logbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), MainActivity.class);
                startActivity(intent);
                /*final ProgressDialog progressDialog = new ProgressDialog(MainMenuFinal.this,
                        R.style.AppTheme_Dark_Dialog);
                progressDialog.setIndeterminate(true);
                progressDialog.setMessage("Authenticating...");
                progressDialog.show();
            }
        })
    } */
    protected void login() {
        loginbutton = findViewById(R.id.loginbutton);
        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getBaseContext(), CreateAccount.class);
                startActivity(intent);
            }
        });
    }
    protected void members() {
        membersbutton = findViewById(R.id.members);
        membersbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getBaseContext(), CreateAccount.class);
                startActivity(intent);
            }
        });
    }

    protected void orders() {
        ordersbutton = findViewById(R.id.orders);
        ordersbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getBaseContext(), OrdersFrame.class);
                startActivity(intent);
            }
        });
    }

    protected void lockers() {
        lockerbutton = findViewById(R.id.locker);
        lockerbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getBaseContext(), LockerFrame.class);
                startActivity(intent);
            }
        });
    }

    protected void calendar() {
        calendarbutton = findViewById(R.id.calendar);
        calendarbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getBaseContext(), CalendarFrame.class);
                startActivity(intent);
            }
        });
    }
}
