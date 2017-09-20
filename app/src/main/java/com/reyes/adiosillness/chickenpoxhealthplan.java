package com.reyes.adiosillness;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class chickenpoxhealthplan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chickenpoxhealthplan);
    }

    public void chickenpox(View view) {
        Intent intentchickenpox = new Intent(this, chickenpox.class);
        startActivity(intentchickenpox);
    }
}
