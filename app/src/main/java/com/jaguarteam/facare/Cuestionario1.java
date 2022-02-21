package com.jaguarteam.facare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Cuestionario1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuestionario1);
    }

    public void onClick(View view) {
        Intent miIntent;
        switch (view.getId()) {
            case R.id.C1Siguiente:
                miIntent = new Intent(Cuestionario1.this, Cuestionario2.class);
                startActivity(miIntent);
                break;
        }
    }

}