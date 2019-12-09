package com.example.runtrackerappcs125;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {

    //
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button newRun = findViewById(R.id.newRun);
        Button viewRun = findViewById(R.id.viewRuns);
        newRun.setOnClickListener(unused -> newRunClicked());
        viewRun.setOnClickListener(unused -> viewRunClicked());
        System.out.println("Will go to new activity to enter Run date and timed length");
    }
    private void newRunClicked() {
        System.out.println("Will go to new activity to enter Run date and timed length");
        startActivity(new Intent(this, NewRunActivity.class));

    }
    private void viewRunClicked() {
        System.out.println("Will display the Runs the user has entered");
        startActivity(new Intent(this, CalenderActivity.class));

    }
}
