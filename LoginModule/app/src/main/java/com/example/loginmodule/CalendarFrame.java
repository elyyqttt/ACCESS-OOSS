package com.example.loginmodule;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;

public class CalendarFrame extends AppCompatActivity {
    private Button backbcalendar;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar_frame);
        //backcal();
        showcalendar();
    }

    protected void showcalendar() {
        textView = findViewById(R.id.date);
        CalendarView calendarView = findViewById(R.id.calendarView);
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                String date = month + "/" + dayOfMonth + "/" + year;

                textView.setText(date);
            }
        });
    }
    /*protected void backcal() {
       // backbcalendar = findViewById(R.id.backbcal);
        //backbcalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), MainMenuFinal.class);
                startActivity(intent);
            }
        });
    }*/
}
