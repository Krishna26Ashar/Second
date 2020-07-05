package com.example.secondyearcivil;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SyCivil extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button logout;
    public static final String Pref_username = "SY_CIVIL";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sy_civil);

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

        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openClass();
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

    public void openClass()
    {
        Intent intent = new Intent(this, Class.class);
        startActivity(intent);

    }
    public void openLogin()
        {
            SharedPreferences settings = getSharedPreferences(Pref_username, 0);
            SharedPreferences.Editor editor = settings.edit();
            editor.remove("logged");
            editor.commit();
            finish();
            Intent intent = new Intent(SyCivil.this, LoginCivil.class);
            startActivity(intent);
        }

}

