package com.jhonatan.dispensadorDeCerveza.dominio;

public class Dispensador {
    private String marca;
    private double capacidad;
    private double cantidadActual;
    private double temperatura;
    private Cerveza cervezaActual;
    public Dispensador(String marca, double capacidad) {
        this.marca = marca;
        this.capacidad = capacidad;
        this.temperatura = temperatura;
    }

    public  boolean servir(double cantidadAServir) {
        if (temperaturaValida() && cantidadAServirValida(cantidadAServir)){
            this.cantidadActual -= cantidadAServir;
            return true;
        }
        return false;
    }

    private boolean cantidadAServirValida(double cantidadAServir){
        return cantidadAServir > 0 && cantidadAServir <= this.cantidadActual;
    }

    private boolean temperaturaValida(){
        return this.temperatura <= 10 && this.temperatura >= -10;
    }

    public boolean cambiarTemperatura(double nuevaTemp) {
        if (nuevaTemp <= 10 && nuevaTemp >= -10) {
            temperatura = nuevaTemp;
            System.out.println("La temperatura cambio exitosamente");
            return true;
        }

        System.out.println("La temperatura que trata de establecer no esta dentro del intervalo autorizado");
        return false;
    }

    public  void cambiarCerveza(Cerveza nuevaCerveza){
        this.vaciar();
        this.cervezaActual = nuevaCerveza;
        this.temperatura = nuevaCerveza.getTempRecomendada();
        this.llenar();
    }

    public void llenar() {
        this.cantidadActual = this.capacidad;
        System.out.println("El dispensador se llenó con " + this.cervezaActual.getMarca());
    }

    public void vaciar() {
        this.cantidadActual = 0;
        System.out.println("El dispensador se vació exitosamente");
    }

    public String getMarca() {
        return marca;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public Cerveza getCervezaActual() {
        return cervezaActual;
    }

}