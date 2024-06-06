package com.example.studentmanagementsystem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Aboutkec extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_kec);
        Button bt1=(Button)findViewById(R.id.button2);
        Button bt2=(Button)findViewById(R.id.button3);
        Button bt3=(Button)findViewById(R.id.button4);
        Button bt4=(Button)findViewById(R.id.button12);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm=getSupportFragmentManager();
                fm.beginTransaction().replace(R.id.fragmentContainerView1, Frag1.class,null).setReorderingAllowed(true).addToBackStack("name").commit();
            }

        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fm=getSupportFragmentManager();
                fm.beginTransaction().replace(R.id.fragmentContainerView1, Frag2.class,null).setReorderingAllowed(true).addToBackStack("name").commit();
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fm=getSupportFragmentManager();
                fm.beginTransaction().replace(R.id.fragmentContainerView1, Frag3.class,null).setReorderingAllowed(true).addToBackStack("name").commit();
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), MainActivity4.class);
                startActivity(i);
            }
        });
    }
}

