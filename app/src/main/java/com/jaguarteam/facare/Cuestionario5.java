package com.jaguarteam.facare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Cuestionario5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuestionario5);
    }

    public void onClick(View view) {
        Intent miIntent;
        switch (view.getId()) {
            case R.id.C5Siguiente:
                miIntent = new Intent(Cuestionario5.this, MenuPostCuestionario.class);
                startActivity(miIntent);
                break;
            case R.id.C5Anterior:
                finish();
                break;
        }
    }

}