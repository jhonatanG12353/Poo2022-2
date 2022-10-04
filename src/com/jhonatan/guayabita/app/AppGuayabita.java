package com.jhonatan.guayabita.app;

import com.jhonatan.guayabita.dominio.Dado;
import com.jhonatan.guayabita.dominio.Guayabita;
import com.jhonatan.guayabita.dominio.Jugadores;

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
        Guayabita guayabita = new Guayabita();
        Dado dado = new Dado();
        boolean op= true;
        while(op==true) {
            int opcion = JOptionPane.showOptionDialog(null, "Bienvenido al Juego de la Guayabita", "Juego de la Guayabita",
                    0, 0, ICONO,
                    Arrays.asList("Jugar", "Instrucciones", "Puntaje","Salir").toArray(), null);

            switch(opcion){
                case JUGAR:
                         if (jugadores.getJugador1() == null){
                             String nombreJugador = (String) JOptionPane.showInputDialog(null,"Ingrese el Nombre del Jugador 1.","ingrese nombre",JOptionPane.PLAIN_MESSAGE,ICONO,null,null);
                             jugadores.setJugador1(nombreJugador);
                             double dinerJugador1 = Double.parseDouble((String) JOptionPane.showInputDialog(null,"Ingrese el Dinero del Jugador 1.","ingrese Dinero de Juego",JOptionPane.PLAIN_MESSAGE,ICONO,null,null));
                             jugadores.setDineroJugador1(dinerJugador1);
                         }
                        if (jugadores.getJugador2() == null){
                            String nombreJugador = (String) JOptionPane.showInputDialog(null,"Ingrese el Nombre del Jugador 2.","ingrese nombre",JOptionPane.PLAIN_MESSAGE,ICONO,null,null);
                            jugadores.setJugador2(nombreJugador);
                            double dinerJugador2 = Double.parseDouble((String) JOptionPane.showInputDialog(null,"Ingrese el Dinero del Jugador 1.","ingrese Dinero de Juego",JOptionPane.PLAIN_MESSAGE,ICONO,null,null));
                            jugadores.setDineroJugador2(dinerJugador2);
                        }
                        JOptionPane.showMessageDialog(null,"INICIO DEL JUEGO  APUESTA MINIMA 500$ \n\n  APUESTA JUGADOR 1.","Juego de la guayabita",JOptionPane.PLAIN_MESSAGE,ICONO);
                        if (jugadores.getJugador1() != null){
                            double valorApuesta= Double.parseDouble((String) JOptionPane.showInputDialog(null,"Ingrese el Dinero del Jugador 1.","ingrese Dinero de Juego",JOptionPane.PLAIN_MESSAGE,ICONO,null,null));
                            guayabita.setValorApostar1(valorApuesta);
                            if(guayabita.apuestaCorrecta(jugadores.getDineroJugador1(), guayabita.getValorApostar1())==true){
                                guayabita.poteApuestas(valorApuesta);
                            }

                        }
                        JOptionPane.showMessageDialog(null,"INICIO DEL JUEGO  APUESTA MINIMA 500$  \n\n  APUESTA JUGADOR 2.","Juego de la guayabita",JOptionPane.PLAIN_MESSAGE,ICONO);
                        if (jugadores.getJugador2() != null){
                            double valorApuesta= Double.parseDouble((String) JOptionPane.showInputDialog(null,"Ingrese el Dinero del Jugador 2.","ingrese Dinero de Juego",JOptionPane.PLAIN_MESSAGE,ICONO,null,null));
                            guayabita.setValorApostar2(valorApuesta);
                            guayabita.apuestaCorrecta(jugadores.getDineroJugador2(), guayabita.getValorApostar2());
                            if(guayabita.apuestaCorrecta(jugadores.getDineroJugador1(), guayabita.getValorApostar1())==true){
                                guayabita.poteApuestas(valorApuesta);
                            }
                        }


                    break;
                case INSTRUCCIONES:
                    JOptionPane.showMessageDialog(null,"INSTRUCCIONES\n\n Cada jugador debe colocar el valor del case en la mesa.\n"
                            + "Se efectuaran turnos, en los que el jugador lanza el dado,\n"
                            + "segun el resultado se pueden dar las siguientes posibilidades.\n"
                            + "Al sacar 1 o 6, pierde, y debe colocar el valor del case en la mesa, cambio de turno.\n"
                            + "Al sacar 2,3,4,5 posee un segundo turno.");
                    break;
                case PUNTAJE:
                    if(jugadores.getJugador1() == null){
                    jugadores.setDineroJugador1(jugadores.getDineroJugador1());
                }
                    if (jugadores.getJugador2() == null){
                        jugadores.setDineroJugador2(jugadores.getDineroJugador2());
                    }
                    JOptionPane.showMessageDialog(null,"                PUNTAJES \n "+ jugadores.getJugador1()+": "+jugadores.getGanadasjugador1()
                            +"\n" +jugadores.getJugador2()+": " +jugadores.getGanadasJugador2() +"\n Empates: "+ jugadores.getEmpate()+"\n Total Pote:"+guayabita.getPote(),"Juego de la Guayabita",0,ICONO);

                    break;
                case SALIR :
                    JOptionPane.showMessageDialog(null,"Gracias por Jugar. \n \n Hasta la Proxima!!!","Salida del Juego de la guayabita",JOptionPane.PLAIN_MESSAGE,ICONO);
                    op=false;
                    break;
            }
        }
    }
    public static String IngresarNombre(){
        String nombreJugador;
        do {
            nombreJugador = JOptionPane.showInputDialog(null,"Ingrese un nombre: ");
        }while(nombreJugador == null || nombreJugador.trim().isEmpty());
        return nombreJugador;
    }

}


