package com.bojun.weekcalendarview;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.loonggg.weekcalendar.view.WeekCalendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WeekCalendar weekCalendar = findViewById(R.id.week_calendar);
        weekCalendar.setOnDateClickListener(new WeekCalendar.OnDateClickListener() {
            @Override
            public void onDateClick(String time) {
                Toast.makeText(MainActivity.this,"time:"+time,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
