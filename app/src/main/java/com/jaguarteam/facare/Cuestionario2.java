package com.jaguarteam.facare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class Cuestionario2 extends AppCompatActivity {

    private Bundle bundle;
    private Users myUser;
    private Cuestionario miCuestionario;
    private CheckBox miChecks[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuestionario2);

        bundle = getIntent().getExtras();
        if(bundle!=null) {
            myUser = (Users) bundle.getSerializable("Usuario");
            miCuestionario = (Cuestionario) bundle.getSerializable("Cuestionario");
        }
        miChecks=new CheckBox[11];
        miChecks[0]=(CheckBox) findViewById(R.id.C1P0);
        miChecks[1]=(CheckBox) findViewById(R.id.C1P1);
        miChecks[2]=(CheckBox) findViewById(R.id.C1P2);
        miChecks[3]=(CheckBox) findViewById(R.id.C1P3);
        miChecks[4]=(CheckBox) findViewById(R.id.C1P4);
        miChecks[5]=(CheckBox) findViewById(R.id.C1P5);
        miChecks[6]=(CheckBox) findViewById(R.id.C1P6);
        miChecks[7]=(CheckBox) findViewById(R.id.C1P7);
        miChecks[8]=(CheckBox) findViewById(R.id.C1P8);
        miChecks[9]=(CheckBox) findViewById(R.id.C1P9);
        miChecks[10]=(CheckBox) findViewById(R.id.C1P10);
    }

    public void Ninguno(View view){
        if(miChecks[0].isChecked()){
            for (int i=1;i<11;i++){
                if(miChecks[i].isChecked()){
                    miChecks[i].setChecked(false);
                }
            }
        }
    }
    public void Otro(View view){
        if(miChecks[0].isChecked()){
            miChecks[0].setChecked(false);
        }
    }

    public void OtrosCampos(){
        for (int i=0;i<10;i++){
            if(miChecks[i+1].isChecked()){
                miCuestionario.SumaVulnerabilidad();
            }
        }

    }


    public void onClick(View view) {
        Intent miIntent;
        switch (view.getId()) {
            case R.id.C2Siguiente:
                miIntent = new Intent(Cuestionario2.this, Cuestionario3.class);
                if(bundle!=null) {
                    OtrosCampos();
                    miIntent.putExtra("Usuario",myUser);
                    miIntent.putExtra("Cuestionario",miCuestionario);
                }
                startActivity(miIntent);
                break;
            case R.id.C2Anterior:
                finish();
                break;
        }
    }

}