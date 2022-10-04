package com.jhonatan.guayabita.dominio;

public class Guayabita {


    public static final int APUESTA_MINIMA=500;
    private double valorApostar1;
    private double valorApostar2;
    private double pote;


    public double getValorApostar1() {
        return valorApostar1;
    }

    public void setValorApostar1(double valorApostar1) {
        this.valorApostar1 = valorApostar1;
    }

    public double getValorApostar2() {
        return valorApostar2;
    }

    public void setValorApostar2(double valorApostar2) {
        this.valorApostar2 = valorApostar2;
    }
    public boolean apuestaCorrecta (double dineroInicial , double apuesta){
        if(dineroInicial>=apuesta && apuesta>APUESTA_MINIMA){return true;} else {return false;}
    }
    public double poteApuestas(double Valor1){
        pote= pote+ Valor1;
        setPote(pote);
        return pote; }

    public double getPote() {
        return pote;
    }

    public void setPote(double pote) {
        this.pote = pote;
    }
}
