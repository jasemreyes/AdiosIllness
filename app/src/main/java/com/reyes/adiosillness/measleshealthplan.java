package com.reyes.adiosillness;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class measleshealthplan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_measleshealthplan);
    }
    public void measles(View view) {
        Intent intentmeasles = new Intent(this, measles.class);
        startActivity(intentmeasles);
    }
}
