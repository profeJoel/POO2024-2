package com.clases;

public class Usuario {
    private String nombre;
    private String correo;
    private String fecha;

    public Usuario(String nombre, String correo, String fecha){
        this.nombre = nombre;
        this.correo = correo;
        this.fecha =fecha;
    }

    public String toString(){
        return "> " + this.nombre + ", " + this.correo + ", " + this.fecha;
    }
}
