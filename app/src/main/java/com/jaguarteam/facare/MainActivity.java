package com.jaguarteam.facare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){
        Intent miIntent;
        switch (view.getId()){
            case R.id.Aingresar:
                Log.d("Depurar","Entre");
                miIntent = new Intent(MainActivity.this,ReguistroConCuentaAnahuac.class);
                startActivity(miIntent);
                break;
            case R.id.Aregistrar:
                Log.d("Depurar","Entre");
                miIntent = new Intent(MainActivity.this,login.class);
                startActivity(miIntent);
        }
    }

}

/*
switch (view.getId()){
            case R.id.Aingresar:
                Log.d("Depurar","Entre");
                miIntent = new Intent(MainActivity.this,login.class);
                startActivity(miIntent);
                break;
        }




**/