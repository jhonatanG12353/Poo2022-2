package com.jhonatan.tallerPoo.agendadigital.app;

import com.jhonatan.tallerPoo.agendadigital.dominio.Agenda;

public class AppAgendaDigital {
    public static void main(String[] args) {
        Agenda agenda = new Agenda (); //instanciamos el objeto
        agenda. insertarPersona("Juan","gomez","gomez",12313543);
        agenda. insertarPersona("emily","Obando","Lopez",319475744);
        agenda. BuscarPersonaNumero(319475744);
        agenda. BuscarpersonaApellido("gomez");
        agenda. BuscarpersonaNombre("emily");




    }
}
