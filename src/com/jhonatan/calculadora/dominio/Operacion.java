package com.jhonatan.calculadora.dominio;

public class Operacion {
    double num1;
    double  num2;
    double resultado;
    private static  final  int NUMERO_SOBRECARGA = 50;
    private static  final  int NUMERO_SOBRECARGADIVISION = 2;

    public Operacion() {
        this.num1 = 0;
        this.num2 = 0;
        this.resultado = 0;
    }
    public double suma (double num1, double num2){
        return resultado= num1 + num2;
    }
    public void suma (double num1){ //sobre carga
        resultado = num1 + NUMERO_SOBRECARGA;
        System.out.println("el resultado de la suma es: "+ resultado);
    }
    public double resta (double num1,double  num2){
        return resultado= num1 - num2;
    }
    public void resta (double  num1){
        resultado= num1 - NUMERO_SOBRECARGA;
        System.out.println("El resultado de la resta es: "+ resultado);
    }
    public double multiplicacion (double  num1, double  num2) {
        return resultado = num1 * num2;
    }
    public void multiplicacion (double  num1){
        resultado= num1 * NUMERO_SOBRECARGA;
        System.out.println("El resultado de la multiplicacion es: "+ resultado);
    }
    public double division (double  num1, double  num2){
        return resultado= num1 / num2;
    }
    public void division (double  num1){
        resultado= num1 / NUMERO_SOBRECARGADIVISION;
        System.out.println("El resultado de la division es: "+ resultado);
    }



}
