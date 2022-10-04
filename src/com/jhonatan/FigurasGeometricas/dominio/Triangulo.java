package com.jhonatan.FigurasGeometricas.dominio;

public class Triangulo extends FigurasGeometricas{
    protected double ladoTriangulo;
    protected double alturaTriangulo;
    protected double hipotenusa;


    public Triangulo(double lado1, double lado2) {
        super(lado1, lado2);
        ladoTriangulo=lado1;
        alturaTriangulo=lado2;
    }

    @Override
    protected void perimetro(double lado1, double lado2) {
        super.perimetro(lado1, lado2);
        double perimetrotriangulo=(this.ladoTriangulo*this.ladoTriangulo)+(this.alturaTriangulo*this.alturaTriangulo);
        perimetrotriangulo= Math.sqrt(perimetrotriangulo);
        System.out.println("El perimetro del triengulo es"+perimetrotriangulo);
    }
}
