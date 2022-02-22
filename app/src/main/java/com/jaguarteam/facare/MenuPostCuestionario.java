package com.jaguarteam.facare;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class MenuPostCuestionario extends AppCompatActivity {
    private Bundle bundle;
    private Users myUser;
    private TextView Vulnearabilidad,Nombre,Hora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_post_cuestionario);
        bundle = getIntent().getExtras();

        Vulnearabilidad=findViewById(R.id.MenuPTexto1);
        Nombre = findViewById(R.id.MenuPTexto2);
        Hora = findViewById(R.id.MenuPTexto3);

        Vulnearabilidad.setBackgroundColor(Color.parseColor("#04ED00"));
        Nombre.setBackgroundColor(Color.parseColor("#04ED00"));
        Hora.setBackgroundColor(Color.parseColor("#04ED00"));
        if(bundle!=null){
            myUser =(Users) bundle.getSerializable("Usuario");
            PutName();
        }

    }

    public void PutName(){
        Nombre.setText(myUser.getNombre()+" "+myUser.getApellidoP()+" "+myUser.getApellidoM());
    }

}