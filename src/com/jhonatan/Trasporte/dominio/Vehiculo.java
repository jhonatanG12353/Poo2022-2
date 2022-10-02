package com.jhonatan.Trasporte.dominio;

public class Vehiculo {
    protected long serial;
    protected String marca;
    protected  String modelo;
    protected  int capacidad;
    protected  String color;

    public long getSerial() {
        return serial;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getColor() {
        return color;
    }
}
