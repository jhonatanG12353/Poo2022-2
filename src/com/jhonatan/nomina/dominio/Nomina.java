package com.jhonatan.nomina.dominio;

import java.util.ArrayList;

public class Nomina {
    private ArrayList<Empleado> empleados = new ArrayList<>();
    private long nomina;

    public void calcularNomina(){
        for (Empleado emp : empleados) {
            System.out.println("El salario de "+emp.getNombre()+" es de " +emp.calcularSalario());
            nomina +=emp.calcularSalario();
        }
        System.out.println("La nomina de todos los trabajadores es: "+nomina);
        System.out.println("-------------------------------------------------------");
        listarPromotores(empleados);
        listarDirectos(empleados);
        listarFreeLancers(empleados);
        System.out.println("-------------------------------------------------------");
    }
    public void agregarusuario(Empleado empleado){
        empleados.add(empleado);
    }
    public void listarDirectos(ArrayList<Empleado> empleado){
        for (Empleado emp : empleados){
            if(emp instanceof Directo){
                System.out.println("El empleado "+emp.getNombre()+" es directo.");
            }
        }
    }
    public void listarFreeLancers(ArrayList<Empleado> empleado){
        for (Empleado emp : empleados){
            if(emp instanceof Freelance){
                System.out.println("El empleado "+emp.getNombre()+" es Freelancers.");
            }
        }
    }
    public void listarPromotores(ArrayList<Empleado> empleado){
        for (Empleado emp : empleados){
            if(emp instanceof Promotor){
                System.out.println("El empleado "+emp.getNombre()+" es Promotor.");
            }
        }
    }

}
