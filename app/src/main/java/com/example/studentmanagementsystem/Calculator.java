package com.example.studentmanagementsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Calculator extends AppCompatActivity {

    private EditText gradePointsEditText;
    private EditText subjectsEditText;
    private TextView cgpaTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        gradePointsEditText = findViewById(R.id.gradePointsEditText);
        subjectsEditText = findViewById(R.id.subjectsEditText);
        cgpaTextView = findViewById(R.id.cgpaTextView);

        Button calculateButton = findViewById(R.id.calculateButton);
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateCGPA();
            }
        });
    }

    private void calculateCGPA() {
        String gradePointsStr = gradePointsEditText.getText().toString();
        String subjectsStr = subjectsEditText.getText().toString();

        if (!gradePointsStr.isEmpty() && !subjectsStr.isEmpty()) {
            double totalGradePoints = Double.parseDouble(gradePointsStr);
            int totalSubjects = Integer.parseInt(subjectsStr);

            double cgpa = totalGradePoints / totalSubjects;
            cgpaTextView.setText("CGPA: " + String.format("%.2f", cgpa));
        } else {
            cgpaTextView.setText("Please enter valid grade points and subjects.");
        }
    }
}
