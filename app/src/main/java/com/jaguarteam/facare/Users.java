package com.jaguarteam.facare;

import java.io.Serializable;

public class Users  implements Serializable {
    private boolean Sesion;
    private String Nombre;
    private String ApellidoP;
    private String ApellidoM;
    private String Correo;
    private String Contrasena;
    private String Campus;
    private boolean Politicas;

    Users(){
        Sesion=false;
        Nombre="";
        ApellidoP="";
        ApellidoM="";
        Correo="";
        Contrasena="";
        Campus="";
        Politicas=false;
    }

    public void setSesion(boolean sesion) {
        Sesion = sesion;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setApellidoP(String apellidoP) {
        ApellidoP = apellidoP;
    }

    public void setApellidoM(String apellidoM) {
        ApellidoM = apellidoM;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public void setContrasena(String contrasena) {
        Contrasena = contrasena;
    }

    public void setCampus(String campus) {
        Campus = campus;
    }

    public void setPoliticas(boolean politicas) {
        Politicas = politicas;
    }

    public boolean isSesion() {
        return Sesion;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellidoP() {
        return ApellidoP;
    }

    public String getApellidoM() {
        return ApellidoM;
    }

    public String getCorreo() {
        return Correo;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public String getCampus() {
        return Campus;
    }

    public boolean isPoliticas() {
        return Politicas;
    }
}
