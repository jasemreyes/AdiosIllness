package com.reyes.adiosillness;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class measles extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_measles);
    }
    public void MainActivity(View view) {
        Intent intenthome = new Intent(this, MainActivity.class);
        startActivity(intenthome);
    }
    public void measleshealthplan(View view) {
        Intent intentmeasleshealthplan = new Intent(this, measleshealthplan.class);
        startActivity(intentmeasleshealthplan);
    }
}
