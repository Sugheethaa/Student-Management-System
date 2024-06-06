package com.example.studentmanagementsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

// SecondActivity.java
public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        TextView resultTextView = findViewById(R.id.resultTextView);
        Button bt=(Button)findViewById(R.id.cgpa);
        Button next1=(Button) findViewById(R.id.next1);
        Button si=(Button) findViewById(R.id.si);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(), Calculator.class);
                startActivity(i);
            }
        });
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),MainActivity4.class);
                startActivity(i);
            }
        });
        si.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(getApplicationContext(), StudentInfo.class);
                startActivity(in);
            }
        });

        // Get data from the first activity
        String name = getIntent().getStringExtra("NAME_KEY");
        String rollNumber = getIntent().getStringExtra("ROLL_KEY");

        // Display the data in the TextView
        resultTextView.setText(name + "(" + rollNumber+")");
    }
}

