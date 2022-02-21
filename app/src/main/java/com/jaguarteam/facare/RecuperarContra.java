package com.jaguarteam.facare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class RecuperarContra extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recuperar_contra);
    }
    public void onClick(View view) {
        Intent miIntent;
        switch (view.getId()) {
            case R.id.RecuSiguiente:
                /*miIntent = new Intent(RecuperarContra.this, );
                startActivity(miIntent);*/
                break;
            case R.id.RecuCancelar:
                finish();
                break;
        }
    }
}