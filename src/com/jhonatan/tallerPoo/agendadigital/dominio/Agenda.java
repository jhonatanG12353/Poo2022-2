package com.jhonatan.tallerPoo.agendadigital.dominio;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private ArrayList<Persona> persona;
    private static  final  int LIMITE_AGENDA = 50;
    public Agenda() {
       this.persona = new ArrayList<>(50);
    }

    public void insertarPersona (String nombre ,String primerApellido, String segundoApellido , int numero) {
        Persona nuevo = new Persona (nombre, primerApellido,segundoApellido,numero);
        persona.add(nuevo);
    }
    public void verAgenda(){
        for(int i =0 ;i <persona.size();i++){ //el persona.size() es para que lea el tamaño de la lista
            System.out.println(persona.get(i).getNombre() );
            //persona.get(i) es para acceder a la posicion y get.Nombre es para imprimir lo que tiene la lista en esa posicion
            System.out.println(persona.get(i).getPrimerApellido());
            System.out.println(persona.get(i).getSegundoApellido());
            System.out.println(persona.get(i).getNumero());
        }
    }
    public void eliminarPersona(int telefono){
        Persona contactoAEliminar = this.BuscarPersonaNumero(telefono);
        if (contactoAEliminar != null) {
            this.persona.remove(contactoAEliminar);
        }
    }
    public void BuscarpersonaNombre(String getNombre){//dentro del parentesis debo poner como buscar y hacer un if para que busque
        for (int i=0 ; i< persona.size();i++){
            if(getNombre == persona.get(i).getNombre()  ) {
                System.out.println(persona.get(i).getNombre());
                System.out.println(persona.get(i).getPrimerApellido());
                System.out.println(persona.get(i).getSegundoApellido());
                System.out.println(persona.get(i).getNumero());
            }
        }
    }
    public void BuscarpersonaApellido(String getPrimerApellido){//dentro del parentesis debo poner como buscar y hacer un if para que busque
        for (int i=0 ; i< persona.size();i++){
            if(getPrimerApellido == persona.get(i).getPrimerApellido()  ) {
                System.out.println(persona.get(i).getNombre());
                System.out.println(persona.get(i).getPrimerApellido());
                System.out.println(persona.get(i).getSegundoApellido());
                System.out.println(persona.get(i).getNumero());
            }
        }
    }
    public Persona BuscarPersonaNumero(int numeroABuscar){//dentro del parentesis debo poner como buscar y hacer un if para que busque
        Persona contactoBuscado = null;
        for (Persona contacto : this.persona) {
            if (contacto.getNumero() == numeroABuscar) {
                contactoBuscado = contacto;
            }
        }
        return contactoBuscado;
    }
    public Persona cambiarNumero(long numero, long numeroNuevo) {
    return null;
    }

    public List<Persona> ordenar() {



        return null;
    }
    
}




