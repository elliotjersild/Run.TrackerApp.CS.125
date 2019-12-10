package com.example.runtrackerappcs125;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.TextView;


import org.w3c.dom.Text;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Date;
import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.DayViewFacade;


public class CalenderActivity extends AppCompatActivity {
    //private NewRunActivity runActivity = new NewRunActivity();
    private Map<String, String> map = new HashMap<>();

    private TextView date;

    private TextView run;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender);
        CalendarView calender = (CalendarView) findViewById(R.id.calendarView2);
        //calender.setDateTextAppearance(R.style.TextAppearance_AppCompat_Body1);
        date = (TextView) findViewById(R.id.myDate);
        run = (TextView) findViewById(R.id.runTime);
        date.setVisibility(View.GONE);
        run.setVisibility(View.GONE);
        //Intent intent = getIntent();
        //String date1 = intent.getStringExtra("Date");
        //String run1 = intent.getStringExtra("Run");
        //calender.getDate();
        calender.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            /**
             * add 1 to month variable
             */
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int month, int day) {
                String dateToDisplay = (month + 1) + "/" + day + "/" + year;
                //updateMap();
                //calender.setDateTextAppearance(R.style.Color);
                System.out.println("date to display: " + dateToDisplay);
                System.out.println("Map in calender " + NewRunActivity.storeRuns.keySet() + " " +
                        NewRunActivity.storeRuns.entrySet());
                int setYear = year;
                int setMonth = month + 1;
                int setDay = day;
                CalendarDay.from(year, month + 1, day);


                for (Map.Entry<String, String> entry : NewRunActivity.storeRuns.entrySet()) {
                    System.out.println("Before if statement");


                    //if (entry.getKey().equals)
                        //calender.setDateTextAppearance(R.style.TextAppearance_AppCompat_Display2);
                    if (entry.getKey().equals(dateToDisplay)) {
                        run.setText(entry.getValue());
                        run.setVisibility(View.VISIBLE);
                        date.setText(dateToDisplay);
                        date.setVisibility(View.VISIBLE);
                        System.out.println("String date" + dateToDisplay + "Map date:" +
                                entry.getKey() + "Time ran " + entry.getValue());
                    } else {
                        date.setText("Did not run on this date.");
                        run.setVisibility(View.GONE);
                    }
                }
            }
        });
    }
    /**
    public boolean shouldDecorate(CalendarDay day) {
        return false;
    }
    public void decorate(DayViewFacade view) {
        return;
    } */

    public void updateColor() {


    }
}
