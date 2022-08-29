package com.jhonatan.tallerPoo.dispensadorSnakcs.dominio;

import com.jhonatan.tallerPoo.agendadigital.dominio.Persona;

import java.util.ArrayList;

public class DispensadorSnacks {
    private ArrayList <Snacks> snacks;

    public void Snacks() {
        snacks = new ArrayList<>(12);
    }
    public void insertarsnacks (int cantidadActual ,int codigo, double precio, String snacks ) {
        Snacks nuevo =new Snacks (cantidadActual, codigo , precio , snacks);
        snacks.add(nuevo);
    }



}
