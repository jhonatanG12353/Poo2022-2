package com.jhonatan.facturacion.app;

import com.jhonatan.banco.dominio.Persona;
import com.jhonatan.facturacion.dominio.Facturacion;

public class AppFacturacion {
    public static void main(String[] args) {
        Persona andrea = new Persona("Andrea");
        Persona javier = new Persona("Javier");

        Facturacion sistemaFac = new Facturacion();

        sistemaFac.crearFactura(andrea, 100000);
        sistemaFac.crearFactura(javier, 100000);

        System.out.println(sistemaFac.obtenerTotalFacturas());
        System.out.println(sistemaFac.obtenerInfoFacturas());

    }
}
