package com.jhonatan.banco.app;

import com.jhonatan.banco.dominio.CuentaBancaria;
import com.jhonatan.banco.dominio.Persona;

public class AppBanco {
    public static void main(String[] args) {
        CuentaBancaria cuentaAlfredo = new CuentaBancaria();
        cuentaAlfredo.activa = true;
        cuentaAlfredo.propietario = new Persona("Alfredo");

        CuentaBancaria cuentaViviana = new CuentaBancaria();
        cuentaViviana.activa = false;
        cuentaViviana.propietario = new Persona("Viviana", 123);

        cuentaAlfredo.consignar(100000);
        cuentaAlfredo.retirar(50000);
        cuentaAlfredo.transferir(cuentaViviana, 45000);

        System.out.println(cuentaAlfredo.consultarSaldoActual());
        System.out.println(cuentaViviana.consultarSaldoActual());
    }
}