package com.jhonatan.FigurasGeometricas.dominio;

public class Circulo extends FigurasGeometricas {
    protected  double radio;
    public static final double PI =3.1416;
    public  static  final int NUM = 2;

    public Circulo(double lado1, double lado2) {
        super(lado1, lado2);
        radio=lado1;
    }

    @Override
    protected void perimetro(double lado1, double lado2) {
        super.perimetro(lado1, lado2);
        double peri = lado1 * PI * NUM;
        System.out.println("el perimetro del triangulo es "+peri);
    }
}
