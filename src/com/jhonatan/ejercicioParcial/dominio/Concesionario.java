package com.jhonatan.ejercicioParcial.dominio;

import java.util.ArrayList;
public class Concesionario {
    private String nombre;
    private int CapacidadActual=0;
    private static  final  int CAPACIDAD_TOTAL = 15;
    private static ArrayList<Moto>moto;

    public Concesionario(String nombre) {
        this.nombre = nombre;
    }

    public Concesionario() {
        this.moto = new ArrayList<>();
    }

    private boolean ingresarMoto(long serial, String marca, int precio, int cilindraje ){
        if (insertarMotoCorrectamente(1) == true && CapacidadActual <= CAPACIDAD_TOTAL){
            Moto motos = new Moto (serial, marca,precio,cilindraje);
            moto.add(motos);
            return true;
        }
        return false;
    }
    private boolean insertarMotoCorrectamente (long serial){
        if (buscarSerial(1)==false){
            return true;
        }
        return false;
    }
    public boolean buscarSerial (long serial){
        boolean existe = moto.contains(serial);
        if (existe){
            System.out.println("la moto existe en el sistema : "+ moto);
            return true;
        }else {
            System.out.println("la moto no existe en el sistema.");
            return false;
        }
    }

    public boolean buscarMarca(String marca){
        boolean existe = moto.contains(marca);
        if (existe){
            System.out.println("la moto existe en el sistema : "+ moto);
            return true;
        }else {
            System.out.println("la moto no existe en el sistema.");
            return false;
        }

    }


    public int getCapacidadActual() {
        return CapacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        CapacidadActual = capacidadActual;
    }
}
