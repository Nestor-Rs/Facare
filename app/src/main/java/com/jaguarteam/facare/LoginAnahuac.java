package com.jaguarteam.facare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class LoginAnahuac extends AppCompatActivity {

    private List<Users> myUsers= new ArrayList<>();
    private TextView txtUser,txtContra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_anahuac);
        readUser();
        txtUser=findViewById(R.id.User);
        txtContra=findViewById(R.id.Contrasena);
    }

    public void readUser(){
        InputStream is = getResources().openRawResource(R.raw.acaredb);
        BufferedReader reader = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
        String line="";

        try {
            //Saltar header de csv
            reader.readLine();

            while (((line= reader.readLine()) != null)) {
                //Split con las comas
                String[] tokens = line.split(",");
                //Leer los datos
                Users myUser = new Users();
                //falta set session pero eso hasta validad el usuario
                myUser.setNombre(tokens[1]);
                myUser.setApellidoP(tokens[2]);
                myUser.setApellidoM(tokens[3]);
                myUser.setCorreo(tokens[4]);
                myUser.setContrasena(tokens[5]);
                myUser.setCampus(tokens[6]);
                myUser.setPoliticas(Boolean.parseBoolean(tokens[7]));
                myUsers.add(myUser);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Users BuscarUsuario(String correo, String contrasena){
        Users myUser=null;
        for (int i=0;i<myUsers.size();i++){
            if(myUsers.get(i).getCorreo().equals(correo) && myUsers.get(i).getContrasena().equals(contrasena)){
                Log.wtf("Consola","Entre al if");
                myUser=myUsers.get(i);
            }
        }
        return myUser;
    }

    public void iniciarSesion(){

        if(txtUser.getText().toString().isEmpty()){
            txtUser.setError("Ingresa tu correo");
        }
        else if(txtContra.getText().toString().isEmpty()){
            txtContra.setError("Ingresa tu contraseña");
        }
        else {
            Users SessionUser = BuscarUsuario(txtUser.getText().toString(),txtContra.getText().toString());
            if(SessionUser!=null){
                SessionUser.setSesion(true);
                if(SessionUser.isPoliticas()){
                    Intent miIntent = new Intent(LoginAnahuac.this, MenuCuestionario.class);
                    miIntent.putExtra("Usuario",SessionUser);
                    startActivity(miIntent);
                }
                else{
                    Intent miIntent = new Intent(LoginAnahuac.this, AvisoPrivacidad.class);
                    miIntent.putExtra("Usuario",SessionUser);
                    startActivity(miIntent);
                }
            }
        }
    }

    public void onClick(View view) {
        Intent miIntent;
        switch (view.getId()) {
            case R.id.LEntrar:
                iniciarSesion();
                break;
            case R.id.LCancelar:
                finish();
                break;
            case R.id.LRecuperarContra:
                miIntent = new Intent(LoginAnahuac.this,RecuperarContra.class);
                startActivity(miIntent);
                break;
            case R.id.LRegistrarte:
                miIntent = new Intent(LoginAnahuac.this,ReguistroConCuentaAnahuac.class);
                startActivity(miIntent);
        }
    }
}