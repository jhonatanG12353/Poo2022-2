package com.jhonatan.FigurasGeometricas.dominio;

public class Cuadrado extends FigurasGeometricas{

    public Cuadrado(double lado1, double lado2) {
        super(lado1, lado2);
    }
    @Override
    protected void perimetro(double lado1, double lado2) {
        super.perimetro(lado1, lado2);
        double periCuadrado = this.lado1 + this.lado2+this.lado1+this.lado2;
        System.out.println("el perimetro del cuadrado es"+periCuadrado);
    }
}
