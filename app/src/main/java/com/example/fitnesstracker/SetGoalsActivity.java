package com.example.fitnesstracker;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SetGoalsActivity extends AppCompatActivity {
    private EditText goalType, goalValue;
    private Button saveGoalButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_goals);

        goalType = findViewById(R.id.goalType);
        goalValue = findViewById(R.id.goalValue);
        saveGoalButton = findViewById(R.id.saveGoalButton);

        saveGoalButton.setOnClickListener(v -> {
            String type = goalType.getText().toString();
            String value = goalValue.getText().toString();

            if (!type.isEmpty() && !value.isEmpty()) {
                // Save goal data (Room Database or Firebase)
                Toast.makeText(this, "Goal Saved!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
