package com.jaguarteam.facare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Cuestionario4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuestionario4);
    }

    public void onClick(View view) {
        Intent miIntent;
        switch (view.getId()) {
            case R.id.C4Siguiente:
                miIntent = new Intent(Cuestionario4.this, Cuestionario5.class);
                startActivity(miIntent);
                break;
            case R.id.C4Anterior:
                finish();
                break;
        }
    }

}