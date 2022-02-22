package com.jaguarteam.facare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ContratoHonestidad extends AppCompatActivity {

    private Bundle bundle;
    private Users myUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contrato_honestidad);
        bundle = getIntent().getExtras();
        if(bundle!=null) {
            myUser = (Users) bundle.getSerializable("Usuario");
        }
    }

    public void onClick(View view) {
        Intent miIntent;
        switch (view.getId()) {
            case R.id.RecuSiguiente:
                miIntent = new Intent(ContratoHonestidad.this, Cuestionario1.class);
                if(bundle!=null) {
                    miIntent.putExtra("Usuario",myUser);
                }
                startActivity(miIntent);
                break;
            case R.id.RecuCancelar:
                finish();
                break;
        }
    }
}