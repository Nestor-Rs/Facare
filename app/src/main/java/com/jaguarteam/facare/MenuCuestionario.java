package com.jaguarteam.facare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MenuCuestionario extends AppCompatActivity {


    private Bundle bundle;
    private Users myUser;
    private TextView Encabezado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_cuestionario);
        bundle = getIntent().getExtras();
        if(bundle!=null) {
            myUser = (Users) bundle.getSerializable("Usuario");
            Encabezado = findViewById(R.id.EncabezadoMenu);
            PutName();
        }
    }

    public void PutName(){
        Encabezado.setText("Estimado(a) "+myUser.getNombre()+" "+myUser.getApellidoP()+" "+myUser.getApellidoM());
    }

    public void onClick(View view) {
        Intent miIntent;
        switch (view.getId()) {
            case R.id.ResponderCuestionario:
                miIntent = new Intent(MenuCuestionario.this, ContratoHonestidad.class);
                if(bundle!=null) {
                    miIntent.putExtra("Usuario",myUser);
                }
                startActivity(miIntent);
                break;
        }
    }

}