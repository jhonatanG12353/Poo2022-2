package com.jhonatan.nomina.app;

import com.jhonatan.nomina.dominio.*;

public class AppNomina {
    public static void main(String[] args) {
        Directo Juan = new Directo("Juan",4840000);
        Vendedor Julian = new Vendedor("Julian",2050000,45510000);
        Freelance Johanna = new Freelance("Johanna",71000,89);
        Vendedor Carolina = new Vendedor("Carolina",980000,35989000);
        Directo David = new Directo("David",3975000);
        Freelance Gustavo = new Freelance("Gustavo",42500,65);
        Promotor Pedro = new Promotor("pedro",1200,300,62);
        Nomina nom = new Nomina();
        nom.listarDirectos(Juan);
        nom.listarDirectos(Julian);
        nom.listarDirectos(Carolina);
        nom.listarDirectos(David);
        nom.listarFreeLancers(Johanna);
        nom.listarFreeLancers(Gustavo);
        nom.listarPromotores(Pedro);
        nom.calcularNomina();
        System.out.println("El empleado Julian tuvo una comision de:" + Julian.calcularcomision());
        System.out.println("El empleado Carolina tuvo una comision de:" + Carolina.calcularcomision());
    }
}
