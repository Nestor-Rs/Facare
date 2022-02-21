package com.jaguarteam.facare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Cuestionario2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuestionario2);
    }

    public void onClick(View view) {
        Intent miIntent;
        switch (view.getId()) {
            case R.id.C2Siguiente:
                miIntent = new Intent(Cuestionario2.this, Cuestionario3.class);
                startActivity(miIntent);
                break;
            case R.id.C2Anterior:
                finish();
                break;
        }
    }

}