package com.jhonatan.calculadora.dominio;

import javax.swing.*;

public class Operaciones {
    double num1;
    double  num2;
    double resultado;
    private static  final  int NUMERO_SOBRECARGA = 50;
    private static  final  int NUMERO_SOBRECARGADIVISION = 2;

    public Operaciones() {
        this.num1 = 0;
        this.num2 = 0;
        this.resultado = 0;
    }
    public void suma (double num1, double num2){
        resultado= num1 + num2;
        JOptionPane.showMessageDialog(null, " El Resutaldo de la suma es: "+resultado);
    }
    public void suma (double num1){ //sobre carga
        resultado = num1 + NUMERO_SOBRECARGA;
        System.out.println("el resultado de la suma es: "+ resultado);
    }
    public void resta (double num1,double  num2){
        resultado= num1 - num2;
        JOptionPane.showMessageDialog(null, " El Resutaldo de la Resta es: "+resultado);
    }
    public void resta (double  num1){
        resultado= num1 - NUMERO_SOBRECARGA;
        System.out.println("El resultado de la resta es: "+ resultado);
    }
    public void multiplicacion (double  num1, double  num2) {
        resultado = num1 * num2;
        JOptionPane.showMessageDialog(null, " El Resutaldo de la Multiplicacion es: " + resultado);
    }
    public void multiplicacion (double  num1){
        resultado= num1 * NUMERO_SOBRECARGA;
        System.out.println("El resultado de la multiplicacion es: "+ resultado);
    }
    public void division (double  num1, double  num2){
        resultado= num1 / num2;
        JOptionPane.showMessageDialog(null, " El Resutaldo de la Division es: "+resultado);
    }
    public void division (double  num1){
        resultado= num1 / NUMERO_SOBRECARGADIVISION;
        System.out.println("El resultado de la division es: "+ resultado);
    }



}
