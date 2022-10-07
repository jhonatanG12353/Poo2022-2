package com.jhonatan.guayabita.AppGuayabita;

import com.jhonatan.guayabita.dominio.Jugador;

import javax.swing.*;
import java.util.ArrayList;

public class AppGuayabita  {
    protected static final ImageIcon ICONO = new ImageIcon(AppGuayabita.class.getResource("GuayabaP.png"));
    protected static final ImageIcon DADO1 = new ImageIcon(AppGuayabita.class.getResource("uno.png"));
    protected static final ImageIcon DADO2 = new ImageIcon(AppGuayabita.class.getResource("dos.png"));
    protected static final ImageIcon DADO3 = new ImageIcon(AppGuayabita.class.getResource("tres.png"));
    protected static final ImageIcon DADO4 = new ImageIcon(AppGuayabita.class.getResource("cuatro.png"));
    protected static final ImageIcon DADO5 = new ImageIcon(AppGuayabita.class.getResource("cinco.png"));
    protected static final ImageIcon DADO6 = new ImageIcon(AppGuayabita.class.getResource("seis.png"));
    protected static final ImageIcon DINERO = new ImageIcon(AppGuayabita.class.getResource("dinero.png"));


    private int pote;
    private int dado;
    private int turno;
    public static void main(String[] args) {
        AppGuayabita jugar = new AppGuayabita();
        jugar.menu();
    }
    private ArrayList<Jugador> jugadores;
    Jugador jugadoruno = new Jugador();
    Jugador jugadordos = new Jugador();

    public AppGuayabita() {

        this.pote = 0;
        this.dado = 0;
        this.turno = 0;
    }
    public void menu() {
        jugadores = new ArrayList<Jugador>();
        int opcion = 0;

        do {
            opcion = JOptionPane.showOptionDialog(null,
                    "---Bienvenido al juego de la Guayabita---" + "\n" + "�Que deseas hacer?", "guayabita",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                   ICONO, new String[] { "Jugar", "Ver Instruciones" },
                    null);

            if (opcion == 0) {
                    String nombre = (String) JOptionPane.showInputDialog(null, "Ingrese el nombre del jugador" ,
                            "Nombre", JOptionPane.WARNING_MESSAGE,ICONO,
                            null, null);
                String pote1 = (String) (JOptionPane.showInputDialog(null, "Ingrese el pote de " + nombre, "Nombre",
                        JOptionPane.WARNING_MESSAGE, ICONO, null,
                        null));

                jugadoruno.crearJugador(nombre);
                jugadoruno.crearPote(pote1);
                jugadores.add(jugadoruno);
                String nombre2 = (String) JOptionPane.showInputDialog(null, "Ingrese el nombre del jugador" ,
                        "Nombre", JOptionPane.WARNING_MESSAGE,ICONO,
                        null, null);
                String pote2 = (String) (JOptionPane.showInputDialog(null, "Ingrese el pote de " +nombre2, "Nombre",
                        JOptionPane.WARNING_MESSAGE, ICONO, null,
                        null));

                jugadordos.crearJugador(nombre2);
                jugadordos.crearPote(pote2);
                jugadores.add(jugadordos);
            }

            else if (opcion == 1) {

                JOptionPane.showMessageDialog(null,"INSTRUCCIONES\n\n Cada jugador debe colocar el valor del case en la mesa.\n"
                        + "Se efectuaran turnos, en los que el jugador lanza el dado,\n"
                        + "segun el resultado se pueden dar las siguientes posibilidades.\n"
                        + "Al sacar 1 o 6, pierde, y debe colocar el valor del case en la mesa, cambio de turno.\n"
                        + "Al sacar 2,3,4,5 posee un segundo turno.","Instrucciones",JOptionPane.PLAIN_MESSAGE,ICONO);
                menu();
            }
        } while (opcion == -1);

        juego();

    }
    public void juego() {



        this.pote = 500;

        jugadores.get(0).setPoteJugador(jugadores.get(0).getPoteJugador() - 250);
        jugadores.get(1).setPoteJugador(jugadores.get(1).getPoteJugador() - 250);


        segundoLanzar(this.dado);
    }

    public int lanzar() {
        int apuesta = 0;


        int opcion = 0;
        if (this.turno % 2 == 0) {

            opcion = JOptionPane.showConfirmDialog(null,
                    jugadores.get(this.turno % 2).getNameJugador() + ", el pote actual es de " + this.pote
                            + " �Deseas lanzar el apuesta ",
                    "Lanzamiento", JOptionPane.YES_NO_OPTION, JOptionPane.YES_NO_OPTION,
                    ICONO);
            {
                if (opcion == 0) {

                    this.dado = (int) (Math.random() * 6) + 1;
                    if (this.dado == 1) {
                        JOptionPane.showConfirmDialog(null,
                                jugadores.get(0).getNameJugador()
                                        + ". Con este dado no puedes apostar...\nPasa el turno",
                                "Lanzamiento", JOptionPane.DEFAULT_OPTION, JOptionPane.NO_OPTION,
                                DADO1);
                        this.turno++;
                    }
                    else if (this.dado == 2) {
                        apuesta = JOptionPane.showConfirmDialog(null,
                                jugadores.get(0).getNameJugador() + " Este es tu dado\n"
                                        + "�Deseas hacer una apuesta?",
                                "Lanzamiento", JOptionPane.YES_NO_OPTION, JOptionPane.YES_NO_OPTION,
                                DADO2);
                    } else if (this.dado == 3) {
                        apuesta = JOptionPane.showConfirmDialog(null,
                                jugadores.get(0).getNameJugador() + ". Este es tu dado\n"
                                        + "�Deseas hacer una apuesta?",
                                "Lanzamiento", JOptionPane.YES_NO_OPTION, JOptionPane.YES_NO_OPTION,
                                DADO3);
                    } else if (this.dado == 4) {
                        apuesta = JOptionPane.showConfirmDialog(null,
                                jugadores.get(0).getNameJugador() + ". Este es tu dado\n"
                                        + "�Deseas hacer una apuesta?",
                                "Lanzamiento", JOptionPane.YES_NO_OPTION, JOptionPane.YES_NO_OPTION,
                                DADO4);

                    } else if (this.dado == 5) {
                        apuesta = JOptionPane.showConfirmDialog(null,
                                jugadores.get(0).getNameJugador() + ". Este es tu dado\n"
                                        + "�Deseas hacer una apuesta?",
                                "Lanzamiento", JOptionPane.YES_NO_OPTION, JOptionPane.YES_NO_OPTION,
                                DADO5);
                    } else if (this.dado == 6) {
                        JOptionPane.showConfirmDialog(null,
                                jugadores.get(0).getNameJugador()
                                        + ". Con este dado no puedes apostar...\nPasa el turno",
                                "Lanzamiento", JOptionPane.DEFAULT_OPTION, JOptionPane.NO_OPTION,
                                DADO6);
                        this.turno++;
                    }
                } else
                    System.exit(1);
            }
        }
        if (this.turno % 2 == 1) {

            opcion = JOptionPane.showConfirmDialog(null,
                    jugadores.get(this.turno % 2).getNameJugador() + ", el pote actual es de " + this.pote
                            + " �Deseas lanzar el apuesta ",
                    "Lanzamiento", JOptionPane.YES_NO_OPTION, JOptionPane.YES_NO_OPTION,
                    ICONO);
            {
                if (opcion == 0) {
                    this.dado = (int) (Math.random() * 6) + 1;
                    if (this.dado == 1) {
                        JOptionPane.showConfirmDialog(null,
                                jugadores.get(1).getNameJugador()
                                        + ". Con este dado no puedes apostar...\nPasa el turno",
                                "Lanzamiento", JOptionPane.DEFAULT_OPTION, JOptionPane.NO_OPTION,
                                DADO1);
                        this.turno++;
                    }
                    else if (this.dado == 2) {
                        apuesta = JOptionPane.showConfirmDialog(null,
                                jugadores.get(1).getNameJugador() + ". Este es tu dado\n\n"
                                        + "�Deseas hacer una apuesta?",
                                "Lanzamiento", JOptionPane.YES_NO_OPTION, JOptionPane.YES_NO_OPTION,
                                DADO2);
                    } else if (this.dado == 3) {
                        apuesta = JOptionPane.showConfirmDialog(null,
                                jugadores.get(1).getNameJugador() + ". Este es tu dado\n\n"
                                        + "�Deseas hacer una apuesta?",
                                "Lanzamiento", JOptionPane.YES_NO_OPTION, JOptionPane.YES_NO_OPTION,
                                DADO3);
                    } else if (this.dado == 4) {
                        apuesta = JOptionPane.showConfirmDialog(null,
                                jugadores.get(1).getNameJugador() + ". Este es tu dado\n\n"
                                        + "�Deseas hacer una apuesta?",
                                "Lanzamiento", JOptionPane.YES_NO_OPTION, JOptionPane.YES_NO_OPTION,
                                DADO4);
                    } else if (this.dado == 5) {
                        apuesta = JOptionPane.showConfirmDialog(null,
                                jugadores.get(1).getNameJugador() + ". Este es tu dado\n\n"
                                        + "�Deseas hacer una apuesta?",
                                "Lanzamiento", JOptionPane.YES_NO_OPTION, JOptionPane.YES_NO_OPTION,
                                DADO5);
                    } else if (this.dado == 6) {
                        JOptionPane.showConfirmDialog(null,
                                jugadores.get(0).getNameJugador()
                                        + ". Con este dado no puedes apostar...\nPasa el turno",
                                "Lanzamiento", JOptionPane.DEFAULT_OPTION, JOptionPane.NO_OPTION,
                                DADO6);
                        this.turno++;
                    }

                }
                else
                    System.exit(1);
            }
        }
        return apuesta;
    }
    public int segundoLanzar(int azar) {
        int restar = 0;
        while (this.pote > 0 && (jugadores.get(this.turno % 2).getPoteJugador() >= 0)) {
            restar = apuesta();
            azar = this.dado;
            this.dado = (int) (Math.random() * 6) + 1;
            if (this.dado < azar && restar != 0) {

                if (this.dado == 1) {
                    JOptionPane.showConfirmDialog(null,
                            jugadores.get(this.turno % 2).getNameJugador()
                                    + ". El dado que has sacado es menor o igua al anterior...\n Has perdido ",
                            "Perder", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_OPTION,
                            DADO1);

                } else if (this.dado == 2) {
                    JOptionPane.showConfirmDialog(null,
                            jugadores.get(this.turno % 2).getNameJugador()
                                    + ". El dado que has sacado es menor o igual anterior...\n Has perdido ",
                            "Perder", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_OPTION,
                            DADO2);

                } else if (this.dado == 3) {
                    JOptionPane.showConfirmDialog(null,
                            jugadores.get(this.turno % 2).getNameJugador()
                                    + ". El dado que has sacado es menor o igual anterior...\n Has perdido ",
                            "Perder", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_OPTION,
                            DADO3);
                } else if (this.dado == 4) {
                    JOptionPane.showConfirmDialog(null,
                            jugadores.get(this.turno % 2).getNameJugador()
                                    + ". El dado que has sacado es menor o igual anterior...\n Has perdido ",
                            "Perder", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_OPTION,
                            DADO4);
                } else if (this.dado == 5) {
                    JOptionPane.showConfirmDialog(null,
                            jugadores.get(this.turno % 2).getNameJugador()
                                    + ". El dado que has sacado es menor o igua al anterior...\n Has perdido ",
                            "Perder", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_OPTION,
                            DADO5);
                }
                Restar(restar);
            }
            else if (this.dado > azar && restar != 0) {
                if (this.dado == 3) {
                    JOptionPane.showConfirmDialog(null,
                            jugadores.get(this.turno % 2).getNameJugador()
                                    + ". El dado que has sacado es mayor al anterior...\n Has ganado ",
                            "Ganar", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_OPTION,
                            DADO3);
                } else if (this.dado == 4) {
                    JOptionPane.showConfirmDialog(null,
                            jugadores.get(this.turno % 2).getNameJugador()
                                    + ". El dado que has sacado es mayor al anterior...\n Has ganado ",
                            "Ganar", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_OPTION,
                            DADO4);
                } else if (this.dado == 5) {
                    JOptionPane.showConfirmDialog(null,
                            jugadores.get(this.turno % 2).getNameJugador()
                                    + ". El dado que has sacado es mayor al anterior...\n Has ganado ",
                            "Ganar", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_OPTION,
                            DADO5);
                } else if (this.dado == 6) {
                    JOptionPane.showConfirmDialog(null,
                            jugadores.get(this.turno % 2).getNameJugador()
                                    + ". El dado que has sacado es mayor al anterior...\n Has ganado",
                            "Ganar", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_OPTION,
                            DADO6);
                }
                Sumar(restar);
            }
            if(jugadores.get(this.turno%2).getPoteJugador()==0)
            {
                break;
            }
        }
        if(this.pote==0)
        {
            juego();
        }
        return azar;
    }

    public int apuesta() {
        String converPote = "";
        int restar = 0;
        int valor = 0;
        int apuesta = 0;
        apuesta = lanzar();

        if ((apuesta == 0) && this.dado > 1 && this.dado < 6) {
            do {
                converPote = (String) JOptionPane.showInputDialog(null,
                        "Ingresa lo que deseas apostar,  " + jugadores.get(this.turno % 2).getNameJugador(), "Apuesta",
                        JOptionPane.WARNING_MESSAGE, ICONO, null, null);
                if (Jugador.EsNumero(converPote)) {
                    restar = Integer.parseInt(converPote);
                    valor = jugadores.get(this.turno % 2).getPoteJugador() - restar;
                }
            } while (valor < 0 || (this.pote - restar) < 0);
        }
        if (apuesta == 1) {
            this.turno++;
        }
        return restar;

    }

    public void Restar(int restar) {
        this.pote = (restar) + this.pote;
        restar = jugadores.get(this.turno % 2).getPoteJugador() - restar;
        jugadores.get(this.turno % 2).setPoteJugador(restar);
        JOptionPane.showConfirmDialog(null,
                jugadores.get(this.turno % 2).getNameJugador() + ". Tu dinero actual es "
                        + jugadores.get(this.turno % 2).getPoteJugador(),
                "Ganacias", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                DINERO);
        this.turno++;
    }
    public void Sumar(int sumar) {
        this.pote = this.pote - sumar;
        sumar = jugadores.get(this.turno % 2).getPoteJugador() + sumar;
        jugadores.get(this.turno % 2).setPoteJugador(sumar);
        JOptionPane.showConfirmDialog(null,
                jugadores.get(this.turno % 2).getNameJugador() + ". Tu dinero actual  es  "
                        + jugadores.get(this.turno % 2).getPoteJugador(),
                "Ganacias", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                DINERO);
        this.turno++;
    }
}