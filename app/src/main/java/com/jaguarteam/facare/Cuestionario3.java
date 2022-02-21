package com.jaguarteam.facare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Cuestionario3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuestionario3);
    }

    public void onClick(View view) {
        Intent miIntent;
        switch (view.getId()) {
            case R.id.C3Siguiente:
                miIntent = new Intent(Cuestionario3.this, Cuestionario4.class);
                startActivity(miIntent);
                break;
            case R.id.C3Anterior:
                finish();
                break;
        }
    }

}