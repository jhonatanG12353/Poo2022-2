package com.jhonatan.guayabita1.dominio;

import com.jhonatan.guayabita.dominio.Jugador;

public class Jugador1 {
    private String nameJugador;
    private int poteJugador;
    // VERIFICADOR DE NUMERO
    public static boolean EsNumero(String cadena){
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe){
            return false;
        }
    }
    //creador de nombre para que no se rompa el juego
    public String crearJugador(String nombre) {
        do {
            this.nameJugador = nombre;
        }while((this.nameJugador ==null) || this.nameJugador.trim().isEmpty());
        return this.nameJugador;
    }
    public int crearPote(String pote)
    {
        String convertPote;
        do {
            convertPote = pote;
            {
                if (Jugador.EsNumero(convertPote)) {
                    this.poteJugador = Integer.parseInt(convertPote);

                }
            }
        }while(this.poteJugador <=250);
        return this.poteJugador;
    }

    public void setNameJugador(String nameJugador) {
        this.nameJugador = nameJugador;
    }

    public String getNameJugador() {
        return nameJugador;
    }

    public int getPoteJugador() {
        return poteJugador;
    }

    public void setPoteJugador(int poteJugador) {
        this.poteJugador = poteJugador;
    }
}
