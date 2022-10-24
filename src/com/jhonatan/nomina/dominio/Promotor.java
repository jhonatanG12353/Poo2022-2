package com.jhonatan.nomina.dominio;

public class Promotor extends Empleado{
    public static final int VALOR_VOLANTE = 15000;
    private int volantesRepartidos;
    private long valorVolante;
    private int comprasVolante;

    public Promotor(String nombre, int volantesRepartidos, long valorVolante, int comprasVolante) {
        super(nombre);
        this.volantesRepartidos = volantesRepartidos;
        this.valorVolante = valorVolante;
        this.comprasVolante = comprasVolante;
    }
    @Override
    protected long calcularSalario() {
        return ((valorVolante*volantesRepartidos)+(comprasVolante*VALOR_VOLANTE));
    }

    public String getnombre() {
        return getnombre();
    }
}
