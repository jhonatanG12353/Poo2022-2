package com.jhonatan.dispensadorDeCerveza.app;

import com.jhonatan.dispensadorDeCerveza.dominio.Cerveza;
import com.jhonatan.dispensadorDeCerveza.dominio.Dispensador;
import java.util.Scanner;
public class AppDispensadorCerveza {

    public static void main(String[] args) {
        Cerveza duff_lite= new Cerveza("Duff","Duff_Lite", -4);
        Cerveza duff_Original = new Cerveza("Duff","Duff_Original", -10);
         Dispensador dispensadora = new Dispensador ("black and Decker", 1000);

         dispensadora.getCervezaActual().setTempRecomendada(-5);

        System.out.println("¿Desea cambiar la cerveza? si desea cambiar la cerveza por favor Digite 1, de lo contrario digite cual quier otro numero");
        Scanner cambioCerveza = new Scanner(System.in);
        int n = cambioCerveza.nextInt();
        if(n ==1) {
            dispensadora.cambiarCerveza(duff_lite);
            dispensadora.cambiarCerveza(duff_Original);
        }else{
            System.out.println("no se cambio la cerveza");

        }
        Scanner numeroingreso =new Scanner (System.in);
        System.out.println("ingrese un numero a servir");
        int cantidad = numeroingreso.nextInt();

        boolean sirvioBien = dispensadora.servir(cantidad);
        if (sirvioBien) {
            System.out.println("Se sirvió " + dispensadora.getCervezaActual().getDuff_beer() + " a "
                    + dispensadora.getTemperatura() + "°c correctamente. Queda " + dispensadora.getCapacidad());
        } else {
            System.out.println("No se pudo servir cerveza.");
        }

    }
}
