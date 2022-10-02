package com.jhonatan.Trasporte.dominio;

public class Taxi extends Carro{
    private int nroPasajeros;
    private String empresa;

    public int getNroPasajeros() {
        return nroPasajeros;
    }

    public void setNroPasajeros(int nroPasajeros) {
        this.nroPasajeros = nroPasajeros;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}
