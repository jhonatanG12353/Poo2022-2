package com.jhonatan.tallerPoo.dispensadorSnakcs.dominio;

public class Snacks {
    private int codigo;
    private int cantidadActualSnacks;
    private double precio;
    private String snacks;

    public Snacks(int codigo, int cantidadActualSnacks, double precio, String snacks) {
        this.codigo = codigo;
        this.cantidadActualSnacks = cantidadActualSnacks;
        this.precio = precio;
        this.snacks = snacks;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantidadActualSnacks() {
        return cantidadActualSnacks;
    }

    public void setCantidadActualSnacks(int cantidadActualSnacks) {
        this.cantidadActualSnacks = cantidadActualSnacks;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getSnacks() {
        return snacks;
    }

    public void setSnacks(String snacks) {
        this.snacks = snacks;
    }
}
