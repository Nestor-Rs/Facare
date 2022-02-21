package com.jaguarteam.facare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ReguistroConCuentaAnahuac extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reguistro_con_cuenta_anahuac);
    }
    public void onClick(View view) {
        Intent miIntent;
        switch (view.getId()) {
            case R.id.buttonRegistroCorreo:
                miIntent = new Intent(ReguistroConCuentaAnahuac.this, AvisoPrivacidad.class);
                startActivity(miIntent);
                break;
        }
    }
}