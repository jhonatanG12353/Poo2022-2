package com.jhonatan.facturacion.dominio;

import com.jhonatan.banco.dominio.Persona;

public class FacturaSinIva extends Factura {
    public FacturaSinIva(long valor, Persona persona) {
        super(valor, persona);
    }

    @Override
    public long calcularTotal() {
        return super.valor;
    }
}
