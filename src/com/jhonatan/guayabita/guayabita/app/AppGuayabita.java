package com.jhonatan.guayabita.guayabita.app;

import com.jhonatan.guayabita.guayabita.dominio.Dado;
import com.jhonatan.guayabita.guayabita.dominio.Jugadores;

import javax.swing.*;
import java.util.Arrays;

public class AppGuayabita {
    private static final ImageIcon ICONO = new ImageIcon(AppGuayabita.class.getResource("guayabita.png"));
    public static final ImageIcon DADO1 = new ImageIcon(AppGuayabita.class.getResource("dado1.png"));
    private static final ImageIcon DADO2 = new ImageIcon(AppGuayabita.class.getResource("dado2.png"));
    private static final ImageIcon DADO3 = new ImageIcon(AppGuayabita.class.getResource("dado3.png"));
    private static final ImageIcon DADO4 = new ImageIcon(AppGuayabita.class.getResource("dado4.png"));
    private static final ImageIcon DADO5 = new ImageIcon(AppGuayabita.class.getResource("dado5.png"));
    private static final ImageIcon DADO6 = new ImageIcon(AppGuayabita.class.getResource("dado6.png"));

    private static final int JUGAR = 0;
    private static final int PUNTAJE = 2;
    private static final int INSTRUCCIONES = 1;
    private static final int SALIR= 3;

    public static void main(String[] args) {
        Jugadores jugadores = new Jugadores();
        Dado dado = new Dado();
        boolean op= true;
        while(op==true) {
            int opcion = JOptionPane.showOptionDialog(null, "Bienvenido al Juego de la Guayabita", "Juego de la Guayabita",
                    0, 0, ICONO,
                    Arrays.asList("Jugar", "Instrucciones", "Puntaje","Salir").toArray(), null);

            switch(opcion){
                case JUGAR:
                     if (jugadores.getJugador1() == null){
                         String nombreJugador;
                         nombreJugador = (String) JOptionPane.showInputDialog(null,"Ingrese el Nombre del Jugador 1.","ingrese nombre",JOptionPane.PLAIN_MESSAGE,ICONO,null,null);
                         jugadores.setJugador1(nombreJugador);
                     }
                    if (jugadores.getJugador1() != null){
                        double dinerJugador1;
                        dinerJugador1 = Double.parseDouble((String) JOptionPane.showInputDialog(null,"Ingrese el Dinero del Jugador 1.","ingrese Dinero de Juego",JOptionPane.PLAIN_MESSAGE,ICONO,null,null));
                        jugadores.setDineroJugador1(dinerJugador1);
                    }
                    if (jugadores.getJugador2() == null){
                        String nombreJugador;
                        nombreJugador = (String) JOptionPane.showInputDialog(null,"Ingrese el Nombre del Jugador 2.","ingrese nombre",JOptionPane.PLAIN_MESSAGE,ICONO,null,null);
                        jugadores.setJugador2(nombreJugador);
                    }
                    if (jugadores.getJugador2() != null){
                        double dinerJugador2;
                        dinerJugador2 = Double.parseDouble((String) JOptionPane.showInputDialog(null,"Ingrese el Dinero del Jugador 1.","ingrese Dinero de Juego",JOptionPane.PLAIN_MESSAGE,ICONO,null,null));
                        jugadores.setDineroJugador2(dinerJugador2);
                    }
                    break;
                case INSTRUCCIONES:
                    JOptionPane.showMessageDialog(null,"instrucciones guayabita","Juego de la guayabita",JOptionPane.PLAIN_MESSAGE,ICONO);
                    break;
                case PUNTAJE:
                    break;
                case SALIR :
                    JOptionPane.showMessageDialog(null,"Gracias por Jugar, Hasta la Proxima!!!","Salida del Juego de la guayabita",JOptionPane.PLAIN_MESSAGE,ICONO);
                    op=false;
                    break;
            }
        }
    }

}


