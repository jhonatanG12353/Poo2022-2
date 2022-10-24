package com.jhonatan.nomina.dominio;

import java.util.ArrayList;

public class Nomina {
    private ArrayList<Empleado> empleados = new ArrayList<>();
    public ArrayList<Empleado> empleadosDirectos = new ArrayList<>();
    public ArrayList<Empleado> empleadosFreeLancer = new ArrayList<>();
    public ArrayList<Empleado> empleadosPromotores = new ArrayList<>();
    private long nomina;

    public void calcularNomina(){
        for (Empleado emp : empleados) {
            System.out.println("El salario de "+emp.getNombre()+" es de " +emp.calcularSalario());
        }

    }
    public void listarDirectos(Empleado empleado){
        empleados.add(empleado);
        empleadosDirectos.add(empleado);
    }
    public void listarFreeLancers(Empleado empleado){
        empleados.add(empleado);
        empleadosFreeLancer.add(empleado);
    }
    public void listarPromotores(Empleado empleado){
        empleados.add(empleado);
        empleadosPromotores.add(empleado);
    }

}
