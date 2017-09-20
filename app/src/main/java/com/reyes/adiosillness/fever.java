package com.reyes.adiosillness;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class fever extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fever);
    }
    public void MainActivity(View view) {
        Intent intenthome = new Intent(this, MainActivity.class);
        startActivity(intenthome);
    }
    public void feverhealthplan(View view) {
        Intent intentfeverhealthplan = new Intent(this, feverhealthplan.class);
        startActivity(intentfeverhealthplan);
    }
}
