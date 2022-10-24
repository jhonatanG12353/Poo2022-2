package com.jhonatan.nomina.dominio;

import java.util.ArrayList;

public class Nomina {
    private ArrayList<Empleado> empleados = new ArrayList<>();
    public void AgregarEmpleados(Empleado empleado){
        empleados.add(empleado);
    }
    public void calcularNomina(){
        for (Empleado emp : empleados) {

        }
    }
    public void listarDirectos(){

    }
    public void listarFreeLancers(){

    }

}
