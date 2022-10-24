package com.jhonatan.nomina.dominio;

public class Vendedor extends Directo{

    public static final int TOPE_MAX=1000000;
    public static  final float PORCENTAJE_BAJO=0.045f;
    public static final float PORCENTAJE_MAX=0.035f;
    private long ventasDelMes;
    public String getnombre() {
        return getnombre();
    }

    public Vendedor(String nombre, long salario, long ventasDelMes) {
        super(nombre, salario);
        this.ventasDelMes = ventasDelMes;
    }
    public long calcularcomision(){
        if(salario<TOPE_MAX){
            return (long) (ventasDelMes*PORCENTAJE_BAJO);
        }
        else  {
        return (long) (ventasDelMes*PORCENTAJE_MAX);
        }
    }
    protected long calcularSalario() {
        return (salario-calcularAporte()+calcularcomision());
    }

}
