package com.example.studentmanagementsystem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {
    private Button contextbt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Button club=(Button) findViewById(R.id.club);
        Button add=(Button) findViewById(R.id.add);
        Button about=(Button) findViewById(R.id.about);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        contextbt = findViewById(R.id.button);
        registerForContextMenu(contextbt);

        club.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),Switcher.class);
                startActivity(i);
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),Addcourse.class);
                startActivity(i);
            }
        });
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),Aboutkec.class);
                startActivity(i);
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int itemId = item.getItemId();
        if (itemId == R.id.menuProfile){
            Toast.makeText(this,"Logging in into Your Profile!",Toast.LENGTH_SHORT).show();
            Intent in1=new Intent(getApplicationContext(),MainActivity2.class);
            startActivity(in1);

        }
        if (itemId == R.id.menuSettings){
            Toast.makeText(this,"Logging in into Settings",Toast.LENGTH_SHORT).show();

        }
        if (itemId == R.id.menuMoreOptions){
            Toast.makeText(this,"Giving More Options",Toast.LENGTH_SHORT).show();

        }
        if (itemId == R.id.menuHistory){
            Toast.makeText(this,"Student Academic History",Toast.LENGTH_SHORT).show();

        }
        if (itemId == R.id.menuAppCare){
            Toast.makeText(this,"Appcare",Toast.LENGTH_SHORT).show();

        }
        if (itemId == R.id.menuExit){
            Toast.makeText(this,"Exiting",Toast.LENGTH_SHORT).show();

        }
        if (itemId == R.id.menuDevices){
            Toast.makeText(this,"Profile Clicked",Toast.LENGTH_SHORT).show();
            Intent in1=new Intent(getApplicationContext(),MainActivity2.class);
            startActivity(in1);

        }
        if (itemId == R.id.menuLogout){
            Toast.makeText(this,"Logging Out",Toast.LENGTH_SHORT).show();
            Intent in1=new Intent(getApplicationContext(),MainActivity2.class);
            startActivity(in1);
        }


        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {


        MenuInflater menuInflater = new MenuInflater(this);
        menuInflater.inflate(R.menu.option_menu, menu);

        return true;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.context,menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        Intent in=new Intent(getApplicationContext(),Location.class);
        startActivity(in);
        return super.onContextItemSelected(item);
    }

}


