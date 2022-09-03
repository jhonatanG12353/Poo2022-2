package com.jhonatan.tallerPoo.dispensadorSnacks.app;


import com.jhonatan.tallerPoo.dispensadorSnacks.dominio.DispensadorSnacks;

public class AppDispensadorSnacks {
    public static void main(String[] args) {

        DispensadorSnacks snacks = new DispensadorSnacks (); //new crea el objeto.
        //la parte snacks crea una referencia para el objeto.
        snacks.agregarUnSnacks(123,"jet",1000,"waffer");
        snacks.agregarUnSnacks(2324,"burbuja",800,"jet");
        snacks.agregarUnSnacks(2325,"mani_salado",1500,"la Especial");
        snacks.agregarUnSnacks(1321,"chocorramo",2000,"ramo");

        snacks.aumentarSnack(123,10);
        snacks.aumentarSnack(2324,12);
        snacks.aumentarSnack(2325,5);
        snacks.aumentarSnack(1321,7);

        snacks.quitarSnack(123);
        snacks.cantidadSnack(123);
        snacks.cantidadSnack(2324);

        snacks.snackAgotados();
        snacks.snackDisponibles();
        snacks.snackOrdenadoPrecio();
        snacks.snackOrdenadoCantidad();



    }

}
