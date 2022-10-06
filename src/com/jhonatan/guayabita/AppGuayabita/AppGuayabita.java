package com.jhonatan.guayabita.AppGuayabita;

import com.jhonatan.guayabita.dominio.Guayabita;

import javax.swing.*;

public class AppGuayabita {
    protected static final ImageIcon ICONO = new ImageIcon(AppGuayabita.class.getResource("GuayabaP.png"));
    protected static final ImageIcon DADO1 = new ImageIcon(AppGuayabita.class.getResource("uno.png"));
    protected static final ImageIcon DADO2 = new ImageIcon(AppGuayabita.class.getResource("dos.png"));
    protected static final ImageIcon DADO3 = new ImageIcon(AppGuayabita.class.getResource("tres.png"));
    protected static final ImageIcon DADO4 = new ImageIcon(AppGuayabita.class.getResource("cuatro.png"));
    protected static final ImageIcon DADO5 = new ImageIcon(AppGuayabita.class.getResource("cinco.png"));
    protected static final ImageIcon DADO6 = new ImageIcon(AppGuayabita.class.getResource("seis.png"));
    protected static final ImageIcon DINERO = new ImageIcon(AppGuayabita.class.getResource("dinero.png"));
    public static void main(String[] args) {

        Guayabita jugar = new Guayabita();
        jugar.menu();



    }
}