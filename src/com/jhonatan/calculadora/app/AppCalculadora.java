package com.jhonatan.calculadora.app;

import com.jhonatan.calculadora.dominio.Operacion;

import javax.swing.*;

public class AppCalculadora {
    public static void main(String[] args){
        Operacion op = new Operacion();
        double num1,num2;
        int opcion=5;

            while (opcion == 5){
                int opciones = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese una opcion: \n (1) Suma." +
                        "\n (2) Resta . \n (3) Multiplicacion. \n (4) Division  \n (5) si quieres salir "));
                switch (opciones) {
                    case 1:
                        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, " Ingrese el numero 1 de la operacion"));
                        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, " Ingrese el numero 2 de la operacion"));
                        op.suma(num1, num2);
                        JOptionPane.showMessageDialog(null, " El Resutaldo de la suma es: "+op.suma(num1,num2));
                        break;
                    case 2:
                        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, " Ingrese el numero 1 de la operacion"));
                        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, " Ingrese el numero 2 de la operacion"));
                        op.resta(num1, num2);
                        JOptionPane.showMessageDialog(null, " El Resutaldo de la Resta es: "+op.resta(num1,num2));
                        break;
                    case 3:
                        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, " Ingrese el numero 1 de la operacion"));
                        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, " Ingrese el numero 2 de la operacion"));
                        op.multiplicacion(num1, num2);
                        JOptionPane.showMessageDialog(null, " El Resutaldo de la Multiplicacion es: " + op.multiplicacion(num1,num2));
                        break;
                    case 4:
                        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, " Ingrese el numero 1 de la operacion"));
                        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, " Ingrese el numero 2 de la operacion"));
                        op.division(num1, num2);
                        JOptionPane.showMessageDialog(null, " El Resutaldo de la Division es: "+op.division(num1,num2));
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, " Usted a salido de la Calculadora \n Gracias");
                        opcion = 4;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Digite un Numero valido de operacion.");
                }
            }


    }

}
