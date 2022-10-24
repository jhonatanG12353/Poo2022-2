package com.jhonatan.guayabita1.appGuayabita1;

import com.jhonatan.guayabita.AppGuayabita.AppGuayabita;
import com.jhonatan.guayabita1.dominio.Guayabita1;

import javax.swing.*;

public class AppGuayabita1 {
    public static void main(String[] args) {
        AppGuayabita1 j = new AppGuayabita1();
        j.menu();
    }
    protected static final ImageIcon ICONO = new ImageIcon(AppGuayabita.class.getResource("GuayabaP.png"));
    protected static final ImageIcon DADO1 = new ImageIcon(AppGuayabita.class.getResource("uno.png"));
    protected static final ImageIcon DADO2 = new ImageIcon(AppGuayabita.class.getResource("dos.png"));
    protected static final ImageIcon DADO3 = new ImageIcon(AppGuayabita.class.getResource("tres.png"));
    protected static final ImageIcon DADO4 = new ImageIcon(AppGuayabita.class.getResource("cuatro.png"));
    protected static final ImageIcon DADO5 = new ImageIcon(AppGuayabita.class.getResource("cinco.png"));
    protected static final ImageIcon DADO6 = new ImageIcon(AppGuayabita.class.getResource("seis.png"));
    static Guayabita1 g = new Guayabita1();
    public void menu() {

        int opcion = 0;
        do {
            opcion = JOptionPane.showOptionDialog(null,
                    "---Bienvenido al juego de la Guayabita---" + "\n" + "Que deseas hacer?", "guayabita",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                    ICONO, new String[] { "Jugar", "Ver Instruciones" },
                    null);
            if (opcion == 0) {
                String nombre = (String) JOptionPane.showInputDialog(null, "Ingrese el nombre del jugador" ,
                        "Nombre", JOptionPane.WARNING_MESSAGE,ICONO,
                        null, null);

                String pote1 = (String) JOptionPane.showInputDialog(null, "Ingrese el pote de " + nombre, "Nombre",
                        JOptionPane.WARNING_MESSAGE, ICONO, null,
                        null);
                g.Agregajugador1(nombre, pote1);

                String nombre2 = (String) JOptionPane.showInputDialog(null, "Ingrese el nombre del jugador" ,
                        "Nombre", JOptionPane.WARNING_MESSAGE,ICONO,
                        null, null);
                String pote2 = (String) JOptionPane.showInputDialog(null, "Ingrese el pote de " +nombre2, "Nombre",
                        JOptionPane.WARNING_MESSAGE, ICONO, null,
                        null);
                g.AgregarJugador2(nombre2,pote2);

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
        g.juego();
        apuestaM();

    }
    public String apuestaM(){
        String converPote = (String) JOptionPane.showInputDialog(null,
                "Ingresa lo que deseas apostar,  ", "Apuesta",
                JOptionPane.WARNING_MESSAGE, ICONO, null, null);
        return converPote;
    }
    public int mensajeLanzarApuesta(){
        int opcion = JOptionPane.showConfirmDialog(null,
                " el pote actual es de " + g.getPote()
                        + " �Deseas lanzar el apuesta ",
                "Lanzamiento", JOptionPane.YES_NO_OPTION, JOptionPane.YES_NO_OPTION,
                ICONO);
        return opcion;
    }
    public void mensajeDado1(){
        JOptionPane.showConfirmDialog(null, " Con este dado no puedes apostar...\nPasa el turno",
                "Lanzamiento", JOptionPane.DEFAULT_OPTION, JOptionPane.NO_OPTION,
                DADO1);
    }
    public int mensajeDado2(){
        int apuesta = JOptionPane.showConfirmDialog(null,
                " Este es tu dado\n"
                        + "�Deseas hacer una apuesta?",
                "Lanzamiento", JOptionPane.YES_NO_OPTION, JOptionPane.YES_NO_OPTION,
                DADO2);
        return apuesta;
    }
    public int mensajeDado3(){
        int apuesta = JOptionPane.showConfirmDialog(null,
                " Este es tu dado\n"
                        + "�Deseas hacer una apuesta?",
                "Lanzamiento", JOptionPane.YES_NO_OPTION, JOptionPane.YES_NO_OPTION,
                DADO3);
        return apuesta;
    }
    public int mensajeDado4(){
        int apuesta = JOptionPane.showConfirmDialog(null,
                " Este es tu dado\n"
                        + "�Deseas hacer una apuesta?",
                "Lanzamiento", JOptionPane.YES_NO_OPTION, JOptionPane.YES_NO_OPTION,
                DADO4);
        return apuesta;
    }
    public int mensajeDado5(){
        int apuesta = JOptionPane.showConfirmDialog(null,
                " Este es tu dado\n"
                        + "�Deseas hacer una apuesta?",
                "Lanzamiento", JOptionPane.YES_NO_OPTION, JOptionPane.YES_NO_OPTION,
                DADO5);
        return apuesta;
    }
    public void mensajeDado6(){
        JOptionPane.showConfirmDialog(null,
                 " Con este dado no puedes apostar...\nPasa el turno",
                "Lanzamiento", JOptionPane.DEFAULT_OPTION, JOptionPane.NO_OPTION,
                DADO6);
    }
    public void mensajePerdidoDado2(){
        JOptionPane.showConfirmDialog(null,
                 " El dado que has sacado es menor o igual anterior...\n Has perdido ",
                "Perder", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_OPTION,
                DADO2);

    }
    public void mensajePerdidoDado3(){
        JOptionPane.showConfirmDialog(null,
                " El dado que has sacado es menor o igual anterior...\n Has perdido ",
                "Perder", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_OPTION,
                DADO3);

    }
    public void mensajePerdidoDado4(){
        JOptionPane.showConfirmDialog(null,
                " El dado que has sacado es menor o igual anterior...\n Has perdido ",
                "Perder", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_OPTION,
                DADO4);

    }
    public void mensajePerdidoDado5(){
        JOptionPane.showConfirmDialog(null,
                " El dado que has sacado es menor o igual anterior...\n Has perdido ",
                "Perder", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_OPTION,
                DADO5);

    }
    public void mensajeGandadoDado3(){
            JOptionPane.showConfirmDialog(null,
                     " El dado que has sacado es mayor al anterior...\n Has ganado ",
                    "Ganar", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_OPTION,
                    DADO3);
    }
    public void mensajeGandadoDado4(){
        JOptionPane.showConfirmDialog(null,
                " El dado que has sacado es mayor al anterior...\n Has ganado ",
                "Ganar", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_OPTION,
                DADO4);
    }
    public void mensajeGandadoDado5(){
        JOptionPane.showConfirmDialog(null,
                " El dado que has sacado es mayor al anterior...\n Has ganado ",
                "Ganar", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_OPTION,
                DADO5);
    }
    public void mensajeGandadoDado6(){
        JOptionPane.showConfirmDialog(null,
                " El dado que has sacado es mayor al anterior...\n Has ganado ",
                "Ganar", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_OPTION,
                DADO6);
    }
}
