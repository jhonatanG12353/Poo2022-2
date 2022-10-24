package com.jhonatan.facturacion.dominio;

import com.jhonatan.banco.dominio.Persona;

public class FacturaDescuento extends FacturaConIva{

    public FacturaDescuento(long valor, Persona persona, double iva) {
        super(valor, persona, iva);
    }

}
