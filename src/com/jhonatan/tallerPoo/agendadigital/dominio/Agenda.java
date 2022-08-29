package com.jhonatan.tallerPoo.agendadigital.dominio;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Persona> persona;

    public Agenda() {
        persona = new ArrayList<>(50);
    }

    public void insertarPersona (String nombre ,String primerApellido, String segundoApellido , int numero) {
        Persona nuevo =new Persona (nombre, primerApellido,segundoApellido,numero);
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
    public void eliminarPersona(){
        for (int i=0 ; i< persona.size();i++){
            persona.remove(i);
            System.out.println("se elimino el elemento persona ");
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
    public void Buscarpersonanumero(int getNumero){//dentro del parentesis debo poner como buscar y hacer un if para que busque
        for (int i=0 ; i< persona.size();i++){
            if(getNumero == persona.get(i).getNumero()  ) {
                System.out.println(persona.get(i).getNombre());
                System.out.println(persona.get(i).getPrimerApellido());
                System.out.println(persona.get(i).getSegundoApellido());
                System.out.println(persona.get(i).getNumero());
            }
        }
    }
}


