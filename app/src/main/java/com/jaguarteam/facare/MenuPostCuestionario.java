package com.jaguarteam.facare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MenuPostCuestionario extends AppCompatActivity {
    private Bundle bundle;
    private Users myUser;
    private TextView Encabezado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_post_cuestionario);
        bundle = getIntent().getExtras();
        if(bundle!=null){
            myUser =(Users) bundle.getSerializable("Usuario");
            Encabezado=findViewById(R.id.MenuPTexto1);
            PutName();
        }
    }

    public void PutName(){
        Encabezado.setText(myUser.getNombre()+" "+myUser.getApellidoP()+" "+myUser.getApellidoM());
    }

}