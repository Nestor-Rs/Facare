package com.jaguarteam.facare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class Cuestionario1 extends AppCompatActivity {

    private Bundle bundle;
    private Users myUser;
    private Cuestionario miCuestionario;
    private int checkBoxA;
    private CheckBox miChecks[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuestionario1);
        bundle = getIntent().getExtras();
        if(bundle!=null) {
            myUser = (Users) bundle.getSerializable("Usuario");
        }
        miCuestionario=new Cuestionario();
        checkBoxA=0;
        miChecks=new CheckBox[2];
        miChecks[0]=(CheckBox) findViewById(R.id.P1si);
        miChecks[1]=(CheckBox) findViewById(R.id.P1no);
    }

    public void CheckBoxPushA(View view){
        if(miChecks[0].isChecked()){
            if(miChecks[1].isChecked()){
                miChecks[1].setChecked(false);
            }
            checkBoxA+=1;
        }
        else{
            checkBoxA-=1;
        }
    }

    public void CheckBoxPushB(View view){
        if(miChecks[1].isChecked()){
            if(miChecks[0].isChecked()){
                miChecks[0].setChecked(false);
            }
        }
    }

    private  void Puntos(){
        for (int i=0;i<checkBoxA;i++){
            miCuestionario.SumaVulnerabilidad();
        }
    }

    public void onClick(View view) {
        Intent miIntent;
        switch (view.getId()) {
            case R.id.C1Siguiente:
                miIntent = new Intent(Cuestionario1.this, Cuestionario2.class);
                if(bundle!=null) {
                    Puntos();
                    miIntent.putExtra("Usuario",myUser);
                    miIntent.putExtra("Cuestionario",miCuestionario);
                }
                startActivity(miIntent);
                break;
        }
    }

}