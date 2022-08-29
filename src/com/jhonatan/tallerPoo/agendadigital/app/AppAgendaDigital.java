package com.jhonatan.tallerPoo.agendadigital.app;

import com.jhonatan.tallerPoo.agendadigital.dominio.Agenda;

public class AppAgendaDigital {
    public static void main(String[] args) {
        Agenda agenda = new Agenda (); //instanciamos el objeto
        agenda. insertarPersona("Juan","Gomez","Obando",12313543);
        agenda. insertarPersona("emily","Gomez","Obando",12313543);
        agenda. verAgenda();
        agenda. BuscarpersonaNombre("juan");
        agenda. verAgenda();

    }
}
