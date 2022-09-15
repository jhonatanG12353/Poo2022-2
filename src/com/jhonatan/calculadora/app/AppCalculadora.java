package com.jhonatan.calculadora.app;

import com.jhonatan.calculadora.dominio.Operaciones;

public class AppCalculadora {
    public static void main(String[] args){
        Operaciones op = new Operaciones();
        op.suma(123,456);
        op.resta(300,200);
        op.multiplicacion(2,4);
        op.division(20,4);
        op.suma(500);
        op.resta(150);
        op.multiplicacion(50);
        op.division(600);
    }

}
