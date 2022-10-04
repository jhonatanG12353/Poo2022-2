package com.jhonatan.FigurasGeometricas.dominio;

public class FigurasGeometricas {
    protected double lado1;
    protected double lado2;
    public FigurasGeometricas(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    protected void perimetro(double lado1,double lado2){
        double perimetro = this.lado1 + this.lado2;
        System.out.println("el perimetro del cuadrado es"+perimetro);
    }
    protected void area(double lado1, double lado2){
        double area= this.lado1*this.lado2;
    }
}
