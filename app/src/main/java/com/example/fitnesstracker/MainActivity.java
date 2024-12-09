package com.example.fitnesstracker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button recordWorkoutButton = findViewById(R.id.recordWorkoutButton);
        Button setGoalsButton = findViewById(R.id.setGoalsButton);
        Button viewProgressButton = findViewById(R.id.viewProgressButton);

        // Navigate to Record Workout Activity
        recordWorkoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RecordWorkoutActivity.class);
                startActivity(intent);
            }
        });

        // Navigate to Set Goals Activity
        setGoalsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SetGoalsActivity.class);
                startActivity(intent);
            }
        });

        // Navigate to View Progress Activity
        viewProgressButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ViewProgressActivity.class);
                startActivity(intent);
            }
        });
    }
}
