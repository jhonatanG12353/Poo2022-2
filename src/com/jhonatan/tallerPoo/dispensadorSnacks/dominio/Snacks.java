package com.jhonatan.tallerPoo.dispensadorSnacks.dominio;

public class Snacks {
    private long codigo;
    private int cantidadActualSnacks;
    private double precio;
    private String snacks;
    private String marca;

    public Snacks(long codigo, String snacks,  double precio, String marca) {
        this.codigo = codigo;
        this.precio = precio;
        this.snacks = snacks;
        this.marca = marca;
    }

    public long  getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCantidadActualSnacks() {
        return cantidadActualSnacks;
    }

    public void setCantidadActualSnacks(int cantidadActualSnacks) {
        this.cantidadActualSnacks = cantidadActualSnacks;
    }
}


