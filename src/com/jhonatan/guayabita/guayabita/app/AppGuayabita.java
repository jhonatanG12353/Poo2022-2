package com.jhonatan.guayabita.guayabita.app;

import com.jhonatan.guayabita.guayabita.dominio.Jugadores;

import javax.swing.*;
import java.util.Arrays;

public class AppGuayabita {
    private static final ImageIcon ICONO = new ImageIcon(AppGuayabita.class.getResource("guayabita.png"));
    private static final int JUGAR = 0;
    private static final int PUNTAJE = 2;
    private static final int INSTRUCCIONES = 1;

    public static void main(String[] args) {
        Jugadores jugadores = new Jugadores();

        while(true) {
            int opcion = JOptionPane.showOptionDialog(null, "Bienvenido al Juego de la Guayabita", "Juego de la Guayabita",
                    0, 0, ICONO,
                    Arrays.asList("Jugar", "Instrucciones", "Puntaje").toArray(), null);

            switch(opcion){
                case JUGAR:
                     if (jugadores.getJugador1() == null){
                         String nombreJugador;
                         nombreJugador = (String) JOptionPane.showInputDialog(null,"Ingrese el Nombre del Jugador 1.","ingrese nombre",JOptionPane.PLAIN_MESSAGE,ICONO,null,null);
                         jugadores.setJugador1(nombreJugador);
                     }
                    if (jugadores.getJugador2() == null){
                        String nombreJugador;
                        nombreJugador = (String) JOptionPane.showInputDialog(null,"Ingrese el Nombre del Jugador 2.","ingrese nombre",JOptionPane.PLAIN_MESSAGE,ICONO,null,null);
                        jugadores.setJugador2(nombreJugador);
                    }
                    break;
                case INSTRUCCIONES:
                    JOptionPane.showMessageDialog(null,"instrucciones guayabita","Juego de la guayabita",JOptionPane.PLAIN_MESSAGE,ICONO);
                    break;
                case PUNTAJE:
                    break;
            }
        }
    }

}


