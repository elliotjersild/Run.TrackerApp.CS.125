package com.example.runtrackerappcs125;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.HashMap;
import java.util.Map;

public class NewRunActivity extends AppCompatActivity {

    private String dateOfRun;

    private String timedRun;

    public static Map<String, String> storeRuns = new HashMap<>();



    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_run);
        Button enter = findViewById(R.id.enterExercise);
        enter.setOnClickListener(unused -> {

            EditText date = (EditText) findViewById(R.id.dateEntered);
            EditText timeRan = (EditText) findViewById(R.id.timeOfRun);
            //ConstraintLayout calender = findViewById(R.id.calenderGroup);
            String storeDate = date.getText().toString();
            String storeRun = timeRan.getText().toString();
            storeRuns.put(storeDate, storeRun);
            System.out.println("Map in new run " + storeRuns.keySet() + " " + storeRuns.entrySet());
            //System.out.println("You entered " + storeDate + " " + storeRun);
            Intent intent = new Intent(this, CalenderActivity.class);
            intent.putExtra("Date", storeDate);
            intent.putExtra("Run", storeRun);

            //System.out.println("Map has " + storeRuns.keySet() + " " + storeRuns.entrySet());
            //View chunkRun = getLayoutInflater().inflate(R.layout.chunk_run_info, calender, false);

        });
    }

}