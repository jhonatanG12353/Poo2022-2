package com.jhonatan.guayabita.dominio;

public class Jugadores {
    private String jugador1;
    private String jugador2;
    private double dineroJugador1;
    private double dineroJugador2;
    private int ganadasjugador1;
    private int ganadasJugador2;
    private int empate;

    public String getJugador1() {
        return jugador1;
    }

    public void setJugador1(String jugador1) {
        this.jugador1 = jugador1;
    }

    public String getJugador2() {
        return jugador2;
    }

    public void setJugador2(String jugador2) {
        this.jugador2 = jugador2;
    }

    public double getDineroJugador1() {
        return dineroJugador1;
    }

    public double getDineroJugador2() {
        return dineroJugador2;
    }

    public void setDineroJugador1(double dineroJugador1) {
        this.dineroJugador1 = dineroJugador1;
    }

    public void setDineroJugador2(double dineroJugador2) {
        this.dineroJugador2 = dineroJugador2;
    }

    public int getGanadasjugador1() {
        return ganadasjugador1;
    }

    public void setGanadasjugador1(int ganadasjugador1) {
        this.ganadasjugador1 = ganadasjugador1;
    }

    public int getGanadasJugador2() {
        return ganadasJugador2;
    }

    public void setGanadasJugador2(int ganadasJugador2) {
        this.ganadasJugador2 = ganadasJugador2;
    }

    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }
}
