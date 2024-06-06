package com.example.studentmanagementsystem;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.studentmanagementsystem.Payment;

public class Addcourse extends AppCompatActivity {
    Button b2;
    private ImageSwitcher imageSwitcher;
    private int[] images = {R.drawable.is1, R.drawable.is2, R.drawable.is3,R.drawable.is4,R.drawable.is5,R.drawable.is6,R.drawable.is7}; // Replace these with your image resources
    private int currentIndex = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addcourse);
        Button b2=(Button)findViewById(R.id.payment);

        imageSwitcher = findViewById(R.id.imageSwitcher);
        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(getApplicationContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                return imageView;
            }
        });

        // Set initial image
        imageSwitcher.setImageResource(images[currentIndex]);

        // Set animations
        imageSwitcher.setInAnimation(this, android.R.anim.fade_in);
        imageSwitcher.setOutAnimation(this, android.R.anim.fade_out);

        // Previous button click listener
        Button prevButton = findViewById(R.id.prevButton);
        prevButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentIndex > 0) {
                    currentIndex--;
                    imageSwitcher.setImageResource(images[currentIndex]);
                }
            }
        });

        // Next button click listener
        Button nextButton = findViewById(R.id.nextButton);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentIndex < images.length - 1) {
                    currentIndex++;
                    imageSwitcher.setImageResource(images[currentIndex]);
                }
            }
        });
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder.setMessage("You are proceeding for Payment\nDo you want to continue?")
                        .setTitle("Dialog Box")
                        .setCancelable(false)
                        .setPositiveButton("Yes!", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "You chose yes to continue", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(Addcourse.this, Payment.class); // Replace YourNextActivity with the actual class you want to start
                                startActivity(intent);
                                finish();
                            }
                        })
                        .setNegativeButton("Nope", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "You chose no to continue, Thank you!!", Toast.LENGTH_SHORT).show();
                                dialogInterface.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.setTitle("Alert!");
                alert.show();

            }
        });
        Button efc = (Button) findViewById(R.id.efc);
        efc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent o=new Intent(Addcourse.this, Enrollment.class);
                startActivity(o);
            }
        });
    }
}
