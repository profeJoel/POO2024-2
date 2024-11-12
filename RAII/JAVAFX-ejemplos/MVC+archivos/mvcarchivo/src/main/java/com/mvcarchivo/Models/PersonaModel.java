package com.mvcarchivo.Models;

public class PersonaModel {
    private String nombre;
    private String apellido;

    public PersonaModel(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return nombre + "," + apellido;
    }

    public static PersonaModel fromCSV(String csvLine) {
        String[] parts = csvLine.split(",");
        return new PersonaModel(parts[0], parts[1]);
    }
}
