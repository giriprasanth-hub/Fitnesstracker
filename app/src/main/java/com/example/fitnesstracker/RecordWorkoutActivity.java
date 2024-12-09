package com.example.fitnesstracker;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RecordWorkoutActivity extends AppCompatActivity {
    private EditText workoutType, duration;
    private Button saveWorkoutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record_workout);

        workoutType = findViewById(R.id.workoutType);
        duration = findViewById(R.id.duration);
        saveWorkoutButton = findViewById(R.id.saveWorkoutButton);

        saveWorkoutButton.setOnClickListener(v -> {
            String type = workoutType.getText().toString();
            String durationValue = duration.getText().toString();

            if (!type.isEmpty() && !durationValue.isEmpty()) {
                // Save workout data (Room Database or Firebase)
                Toast.makeText(this, "Workout Saved!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
