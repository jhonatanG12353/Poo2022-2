package com.jhonatan.parcial.dominio;

import java.util.ArrayList;

public class Tienda {
    private long codigo;
    private String nombre;
    private static ArrayList<String> tipo;
    public Tienda(){this.tipo = new ArrayList<String>();}
    public Tienda(long codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        boolean tiendaActiva = true;
    }
    public void agregarCategoria(String categoria){
        tipo.add(categoria);
    }

}
