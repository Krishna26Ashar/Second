package com.example.secondyearmech;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SyMech extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button logout;
    public static final String Pref_username = "SY_MECH";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sy_mech);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTimeTable();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSyllabus();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGrade();
            }
        });

        logout = (Button) findViewById(R.id.logout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLogin();
            }
        });


    }
    public void openTimeTable()
    {
        Intent intent = new Intent(this, TimeTable.class);
        startActivity(intent);

    }

    public void openSyllabus()
    {
        Intent intent = new Intent(this, Syllabus.class);
        startActivity(intent);

    }

    public void openGrade()
    {
        Intent intent = new Intent(this, Grade.class);
        startActivity(intent);

    }

    public void openLogin()
    {
        SharedPreferences settings = getSharedPreferences(Pref_username, 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.remove("logged");
        editor.commit();
        finish();
        Intent intent = new Intent(SyMech.this, LoginMech.class);
        startActivity(intent);
    }

}
