package com.jhonatan.dispensadorDeCerveza.app;

import com.jhonatan.dispensadorDeCerveza.dominio.Cerveza;
import com.jhonatan.dispensadorDeCerveza.dominio.Dispensador;

public class AppDispensadorCerveza {

    public static void main(String[] args) {
        Cerveza duff_lite= new Cerveza("duff lite");
         Dispensador = new Dispensador ("black and Decker", 1000);

        Dispensador.cambiarCerveza(duff_lite);
        boolean sirvioBien = Dispensador.servir(250);


}

}
