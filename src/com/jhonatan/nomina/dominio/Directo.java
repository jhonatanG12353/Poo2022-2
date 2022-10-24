package com.jhonatan.nomina.dominio;

public class Directo extends Empleado{
    public static final float APORTE_SALUD = (float) 0.05;
    public static final float PENSION = 0.065f;
    protected long salario;

    public Directo(String nombre, long salario) {
        super(nombre);
        this.salario = salario;
    }
    @Override
    protected long calcularSalario() {
        return (salario-calcularAporte());
    }

    public String getnombre() {
        return getnombre();
    }

    public long calcularSalud(){
        return (long)(salario * APORTE_SALUD);
    }
    public long calcularPension(){
        return (long) (salario * PENSION);
    }
    public long calcularAporte(){
        return (calcularSalud()+calcularPension());
    }


}
