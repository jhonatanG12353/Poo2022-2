package com.jhonatan.calculadora.dominio;

public class Operaciones {
    int num1;
    int  num2;
    double resultado;
    private static  final  int NUMERO_SOBRECARGA = 50;
    private static  final  int NUMERO_SOBRECARGADIVISION = 2;

    public Operaciones() {
        this.num1 = 0;
        this.num2 = 0;
        this.resultado = 0;
    }
    public void suma (int num1, int num2){
        resultado= num1 + num2;
        System.out.println("el resultado de la suma es: "+ resultado);
    }
    public void suma (int num1){ //sobre carga
        resultado = num1 + NUMERO_SOBRECARGA;
        System.out.println("el resultado de la suma es: "+ resultado);
    }
    public void resta (int num1,int num2){
        resultado= num1 - num2;
        System.out.println("El resultado de la resta es: "+ resultado);
    }
    public void resta (int num1){
        resultado= num1 - NUMERO_SOBRECARGA;
        System.out.println("El resultado de la resta es: "+ resultado);
    }
    public void multiplicacion (int num1, int num2){
        resultado= num1 * num2;
        System.out.println("El resultado de la multiplicacion es: "+ resultado);
    }
    public void multiplicacion (int num1){
        resultado= num1 * NUMERO_SOBRECARGA;
        System.out.println("El resultado de la multiplicacion es: "+ resultado);
    }
    public void division (int num1, int num2){
        resultado= num1 / num2;
        System.out.println("El resultado de la division es: "+ resultado);
    }
    public void division (int num1){
        resultado= num1 / NUMERO_SOBRECARGADIVISION;
        System.out.println("El resultado de la division es: "+ resultado);
    }



}
