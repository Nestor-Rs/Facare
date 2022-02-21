package com.jaguarteam.facare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ContratoHonestidad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contrato_honestidad);
    }

    public void onClick(View view) {
        Intent miIntent;
        switch (view.getId()) {
            case R.id.RecuSiguiente:
                miIntent = new Intent(ContratoHonestidad.this, Cuestionario1.class);
                startActivity(miIntent);
                break;
            case R.id.RecuCancelar:
                finish();
                break;
        }
    }
}