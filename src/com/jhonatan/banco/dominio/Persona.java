package com.jhonatan.banco.dominio;

public class Persona {
    private String nombre;
    private int cedula;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre, int cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCedula() {
        return cedula;
    }
}
