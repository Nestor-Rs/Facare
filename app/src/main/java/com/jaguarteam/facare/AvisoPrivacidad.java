package com.jaguarteam.facare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class AvisoPrivacidad extends AppCompatActivity {

    private Bundle bundle;
    private Users myUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aviso_privacidad);
        bundle = getIntent().getExtras();
        if(bundle!=null) {
            myUser = (Users) bundle.getSerializable("Usuario");
        }
    }
    public void onClick(View view) {
        Intent miIntent;
        switch (view.getId()) {
            case R.id.AvisorGuardar:
                miIntent = new Intent(AvisoPrivacidad.this, MenuCuestionario.class);
                if(bundle!=null) {
                    miIntent.putExtra("Usuario",myUser);
                }
                startActivity(miIntent);
                break;
            case R.id.AvisoCerrar:
                finish();
                break;
        }
    }

}