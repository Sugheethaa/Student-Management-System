package com.example.studentmanagementsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class Switcher extends AppCompatActivity {

    private GridView gridView;
    private int[] imageIds = {R.drawable.club1, R.drawable.club2, R.drawable.club3, R.drawable.club4, R.drawable.club5}; // Replace with your image resource IDs

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switcher);

        gridView = findViewById(R.id.gridview);

        // Create an adapter to populate the GridView
        ImageAdapter adapter = new ImageAdapter(this, imageIds);
        gridView.setAdapter(adapter);
    }
}
