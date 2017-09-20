package com.reyes.adiosillness;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void fever(View view) {
        Intent intentfever = new Intent(this, fever.class);
        startActivity(intentfever);
    }

    public void measles(View view) {
        Intent intentmeasles = new Intent(this, measles.class);
        startActivity(intentmeasles);
    }

    public void chickenpox(View view) {
        Intent intentchickenpox = new Intent(this, chickenpox.class);
        startActivity(intentchickenpox);
    }
}
