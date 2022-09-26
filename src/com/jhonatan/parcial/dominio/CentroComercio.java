package com.jhonatan.parcial.dominio;

import java.util.ArrayList;

public class CentroComercio {
    public static  final  int CAPACIDAD = 100;
    public int capacidadActual;
    private String nombre;
    private static ArrayList<Tienda> local;

    public CentroComercio(){this.local = new ArrayList<>();}

    public boolean abrirTienda(long codigo, String nombre){
        if (local.contains(codigo)== false && local.contains(nombre) ==false && capacidadActual <=CAPACIDAD ){
            System.out.println("la tienda se puede abrir");
            Tienda tienda= new Tienda (codigo,nombre);
            local.add(tienda);
            int capacidadParcial = CAPACIDAD - capacidadActual;
            boolean tiendaActiva = true;
            System.out.println("En estos momentos puede ingresa %d tiendas"+capacidadParcial);
            return  true;
        }else {
            System.out.println("El codigo o el nombre ya existen, por favor ingrese otra tienda");
            int capacidadParcial = CAPACIDAD - capacidadActual;
            System.out.println("En estos momentos puede ingresa %d tiendas"+capacidadParcial);
            return false;
        }
        // tienda.contains(long codigo) && tienda.contains(nombre)
        // validad la capacidad de la tienda, que la tienda ya no se encuentrer abierta

    }
    public void cerrarTienda  (long codigo){
        if(local.contains(codigo)==true ){
            boolean tiendaActiva = false;
            local.remove(codigo);
            System.out.println("La tienda se cerro Exitosamente");
        }else{
            System.out.println("no se pudo cerrar la tienda!!");
        }
    }
    public Tienda buscarTiendaNombre(String nombre){
        if (local.contains(nombre)== true){
            System.out.println("la tienda es :"+ nombre);
        }else {
            System.out.println("la tienda no existe");
        }

        return null;
    }
    public void buscarTiendaCodigo(long codigo){
        if (local.contains(codigo)== true){
            System.out.println("El codigo de la tienda es :"+ codigo);
        }else {
            System.out.println("El codigo de la tienda no existe");
        }
    }
    public void buscarTiendaCategoria (String categoria){
    }
    public void ordenarTiendaPorNombre(){

    }





}
