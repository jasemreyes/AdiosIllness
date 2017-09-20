package com.reyes.adiosillness;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class feverhealthplan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feverhealthplan);
    }
    public void fever(View view) {
        Intent intentfever = new Intent(this, fever.class);
        startActivity(intentfever);
    }
}
