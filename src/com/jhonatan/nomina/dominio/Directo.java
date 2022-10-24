package com.jhonatan.nomina.dominio;

public class Directo extends Empleado{
    public static final float APORTE_SALUD = (float) 0.05;
    public static final float PENSION = 0.065f;
    protected long Salario;

    public Directo(String nombre, long salario) {
        super(nombre);
        Salario = salario;
    }
    @Override
    protected long calcularSalario() {
        return (Salario-calcularAporte());
    }
    public long calcularSalud(){
        return (long)(Salario * APORTE_SALUD);
    }
    public long calcularPension(){
        return (long) (Salario * PENSION);
    }
    public long calcularAporte(){
        return (calcularSalud()+calcularPension());
    }

}
