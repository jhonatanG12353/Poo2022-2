package com.jhonatan.guayabita.dominio;
public class Jugador  {
    private String nameJugador;
    private int poteJugador;
    public static boolean EsNumero(String cadena){
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe){
            return false;
        }
    }
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

    public String getNameJugador() {
        return nameJugador;
    }
    public void setNameJugador(String nameJugador) {
        this.nameJugador = nameJugador;
    }
    public int getPoteJugador() {
        return poteJugador;
    }
    public void setPoteJugador(int poteJugador) {
        this.poteJugador = poteJugador;
    }

}
