package com.jaguarteam.facare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegistroSinCorreoA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_sin_correo);
    }



    public void onClick(View view) {
        Intent miIntent;
        switch (view.getId()) {
            case R.id.buttonRegistroSinCorreo:
                miIntent = new Intent(RegistroSinCorreoA.this, AvisoPrivacidad.class);
                startActivity(miIntent);
                break;
        }
    }
}