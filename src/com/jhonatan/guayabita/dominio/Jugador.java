package com.jhonatan.guayabita.dominio;

import com.jhonatan.guayabita.AppGuayabita.AppGuayabita;

import javax.swing.*;

public class Jugador extends AppGuayabita {
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
    public String crearJugador() {
        do {
            this.nameJugador = (String) JOptionPane.showInputDialog(null, "Ingrese el nombre del jugador" ,
                    "Nombre", JOptionPane.WARNING_MESSAGE,ICONO,
                    null, null);

        }while((this.nameJugador ==null) || this.nameJugador.trim().isEmpty());
        return this.nameJugador;
    }
    public int crearPote()
    {
        String convertPote;
        do {
            convertPote = (String) (JOptionPane.showInputDialog(null, "Ingrese el pote de " +this.nameJugador, "Nombre",
                    JOptionPane.WARNING_MESSAGE, ICONO, null,
                    null));
            {
                if (Jugador.EsNumero(convertPote)) {
                    this.poteJugador = Integer.parseInt(convertPote);

                }
            }
        }while(this.poteJugador <=100);
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
