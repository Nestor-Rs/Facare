package com.jaguarteam.facare;

import java.io.Serializable;

public class Cuestionario implements Serializable {

    private int Vulnerabilidad;

    Cuestionario(){
        Vulnerabilidad=0;
    }

    public  void  SumaVulnerabilidad(){
        Vulnerabilidad++;
    }

    public int getVulnerabilidad(){
        if(Vulnerabilidad>10){
            return 2;
        }
        else if(Vulnerabilidad>0){
            return 1;
        }
        else{
            return 0;
        }
    }
}
