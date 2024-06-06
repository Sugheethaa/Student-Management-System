package com.example.studentmanagementsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

// FirstActivity.java
public class MainActivity extends AppCompatActivity {

    private EditText nameEditText;
    private EditText rollNumberEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEditText = findViewById(R.id.nameEditText);
        rollNumberEditText = findViewById(R.id.rollNumberEditText);

        Button sendButton = findViewById(R.id.sendButton);
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameEditText.getText().toString();
                String rollNumber = rollNumberEditText.getText().toString();

                // Create an Intent to start the second activity
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("NAME_KEY", name);
                intent.putExtra("ROLL_KEY", rollNumber);
                startActivity(intent);
            }
        });
    }
}
