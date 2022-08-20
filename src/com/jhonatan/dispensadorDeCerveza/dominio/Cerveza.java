package com.jhonatan.dispensadorDeCerveza.dominio;

public class Cerveza {
    private String Duff_beer;
    private String marca;
    private double tempRecomendada;

    public Cerveza(String duff_beer, String marca, double tempRecomendada) {
        Duff_beer = duff_beer;
        this.marca = marca;
        this.tempRecomendada = tempRecomendada;
    }

    public String getDuff_beer() {
        return Duff_beer;
    }

    public String getMarca() {
        return marca;
    }

    public double getTempRecomendada() {
        return tempRecomendada;
    }

    public void setTempRecomendada(double tempRecomendada) {
        this.tempRecomendada = tempRecomendada;
    }
}
