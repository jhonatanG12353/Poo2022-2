package com.jhonatan.guayabita.dominio;

import com.jhonatan.guayabita.AppGuayabita.AppGuayabita;

import javax.swing.*;
import java.util.ArrayList;

public class Guayabita extends AppGuayabita {

    private int pote;
    private int dado;
    private int turno;
    private ArrayList<Jugador> jugadores;



    // clase jugador
    Jugador jugadoruno = new Jugador();
    Jugador jugadordos = new Jugador();


    //Constructor
    public Guayabita() {

        this.pote = 0;
        this.dado = 0;
        this.turno = 0;
    }

    // menu inicial
    public void menu() {
        // Inciar el array
        jugadores = new ArrayList<Jugador>();
        int opcion = 0;
        // iniciar

        do {
            opcion = JOptionPane.showOptionDialog(null,
                    "---Bienvenido al juego de la Guayabita---" + "\n" + "�Que deseas hacer?", "guayabita",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                   ICONO, new String[] { "Jugar", "Ver Instruciones" },
                    null);

            if (opcion == 0) {

                jugadoruno.crearJugador();
                jugadoruno.crearPote();
                jugadores.add(jugadoruno);
                jugadordos.crearJugador();
                jugadordos.crearPote();
                jugadores.add(jugadordos);
            }

            else if (opcion == 1) {

                JOptionPane.showMessageDialog(null,
                        "---------Instruciones---------\n El juego de la guayabita\n\"S� el jugador saca 1 o 6 entonces pierde la posibilidad de apostar y por ende\\n\"\r\n"
                                + "													+\"cede el turno al otro jugador.\\n\\n\"\r\n"
                                + "													+ \"S� por el contrario saca un n�mero del 2 al 5 tiene la posibilidad de apostar por\\n\"\r\n"
                                + "													+\"el pote que hay en juego. Si elige que no quiere apostar cede su turno, pero s�\\n\"\r\n"
                                + "													+\"quiere hacerlo el juego le debe permitir ingresar el monto por el que desea\\n\"\r\n"
                                + "													+\"apostar y luego tirar nuevamente el dado.\\n\\n\"\r\n"
                                + "													+\"El jugador puede apostar por la totalidad del pote o por una parte (por ejemplo,\\n\"\r\n"
                                + "													+\"si el pote es de $1200 el jugador puede apostar $1200 o un valor inferior). Se\\n\"\r\n"
                                + "													+\"debe controlar que el jugador si cuente con el valor de la apuesta que desea\\n\"\r\n"
                                + "													+\"realizar.\\n\\n\"\r\n"
                                + "													+\"S� el jugador saca un n�mero mayor al que sac� en la tirada anterior entonces\\n\"\r\n"
                                + "													+\"se lleva el dinero del pote (la parte que apost�). Si por el contrario el jugador\\n\"\r\n"
                                + "													+\"saca un n�mero igual o inferior entonces tendr� que entregar lo que apost� al\\n\"\r\n"
                                + "													+\"pote y as� este ir� aumentando.\\n\\n\"\r\n"
                                + "													+\"S� despu�s de una jugada el pote queda en $0, el juego vuelve a comenzar con\\n\"\r\n"
                                + "													+\"$200 (Ambos jugadores aportan de a $100).\\n\\n\"\r\n"
                                + "													+\"Despu�s de esto al otro jugador se le pregunta si desea lanzar el dado y\\n\"\r\n"
                                + "													+\"comienza su flujo nuevamente.\\n\\n\"\r\n"
                                + "													+\"El juego termina cuando uno de los dos jugadores no tenga dinero suficiente\\n\"\r\n"
                                + "													+\"para iniciar una ronda.\";\r\n"
                                + "");
                menu();
            }
        } while (opcion == -1);

        // call el metodo de juego()
        juego();

    }
    //juego es llmado desde menu, Crea el pote inicial
    public void juego() {



        this.pote = 200;

        jugadores.get(0).setPoteJugador(jugadores.get(0).getPoteJugador() - 100);
        jugadores.get(1).setPoteJugador(jugadores.get(1).getPoteJugador() - 100);


        segundoLanzar(this.dado);
    }
    //Primer lanzamiento
    public int lanzar() {
        int apuesta = 0;


        int opcion = 0;

        //Sgun el tuerno
        if (this.turno % 2 == 0) {

            opcion = JOptionPane.showConfirmDialog(null,
                    jugadores.get(this.turno % 2).getNameJugador() + ", el pote actual es de " + this.pote
                            + " �Deseas lanzar el apuesta ",
                    "Lanzamiento", JOptionPane.YES_NO_OPTION, JOptionPane.YES_NO_OPTION,
                    ICONO);
            {
//Valida la opcion elgida por el jugador
                if (opcion == 0) {

                    //random para el dado
                    this.dado = (int) (Math.random() * 6) + 1;
//Validador de dados
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
//valida el turno
        if (this.turno % 2 == 1) {

            opcion = JOptionPane.showConfirmDialog(null,
                    jugadores.get(this.turno % 2).getNameJugador() + ", el pote actual es de " + this.pote
                            + " �Deseas lanzar el apuesta ",
                    "Lanzamiento", JOptionPane.YES_NO_OPTION, JOptionPane.YES_NO_OPTION,
                    ICONO);
            {
                if (opcion == 0) {

                    //random para sacar el dado
                    this.dado = (int) (Math.random() * 6) + 1;

                    //validad el dado
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
                //cierra la ventana si no quiere apostar

                else
                    System.exit(1);
            }



        }
        return apuesta;

    }
    //lanzamiento por segunda vez
    public int segundoLanzar(int azar) {

        int restar = 0;

        //mientras el pote sea >0 y los jugadores tengan dinero
        while (this.pote > 0 && (jugadores.get(this.turno % 2).getPoteJugador() >= 0)) {

            restar = apuesta();
            azar = this.dado;

            //dado del segundo lanzamiento
            this.dado = (int) (Math.random() * 6) + 1;
//compara el dado anterior con el nuevo
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