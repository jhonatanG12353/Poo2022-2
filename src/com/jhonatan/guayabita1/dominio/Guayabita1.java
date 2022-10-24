package com.jhonatan.guayabita1.dominio;

import com.jhonatan.guayabita.dominio.Jugador;
import com.jhonatan.guayabita1.appGuayabita1.AppGuayabita1;

import java.util.ArrayList;

public class Guayabita1 extends AppGuayabita1 {
    private int pote;
    private int dado;
    private int turno;
    private int valorApuesta;

    public int getPote() {
        return pote;
    }
    public Guayabita1() {
        this.pote = pote;
        this.dado = dado;
        this.turno = turno;
    }

    public void Agregajugador1 (String nombre ,String pote1){
        jugadores1 = new ArrayList<Jugador1>();
        jugadoruno.crearJugador(nombre);
        jugadoruno.crearPote(pote1);
        jugadores1.add(jugadoruno);
    }
    public void AgregarJugador2(String nombre2, String pote2){
        jugadordos.crearJugador(nombre2);
        jugadordos.crearPote(pote2);
        jugadores1.add(jugadordos);
    }
    private ArrayList<Jugador1> jugadores1;
    Jugador1 jugadoruno = new Jugador1();
    Jugador1 jugadordos = new Jugador1();
    public void juego() {
        this.pote = 500;
        jugadores1.get(0).setPoteJugador(jugadores1.get(0).getPoteJugador() - 250);
        jugadores1.get(1).setPoteJugador(jugadores1.get(1).getPoteJugador() - 250);
        segundoLanzar(this.dado);
    }


    public int lanzar(){
        int apuesta = 0;
        int opcion = 0;
        if (this.turno % 2 == 0) {
            mensajeLanzarApuesta();
            if(mensajeLanzarApuesta()==0){
                this.dado = (int) (Math.random() * 6) + 1;
                if (this.dado == 1){
                    mensajeDado1();
                    this.turno++;
                }else if(this.dado == 2){
                    mensajeDado2();
                    apuesta=mensajeDado2();
                }else if(this.dado == 3){
                    mensajeDado3();
                    apuesta=mensajeDado3();
                }else if(this.dado == 4){
                    mensajeDado4();
                    apuesta=mensajeDado4();
                }else if(this.dado==5){
                    mensajeDado5();
                    apuesta = mensajeDado5();
                }else if(this.dado ==6){
                    mensajeDado6();
                    this.turno++;
                }
                else
                    System.exit(1);

            }
        }if (this.turno % 2 == 1){
            mensajeLanzarApuesta();
            if(mensajeLanzarApuesta()==0) {
                this.dado = (int) (Math.random() * 6) + 1;
                if (this.dado == 1) {
                    mensajeDado1();
                    this.turno++;
                } else if (this.dado == 2) {
                    mensajeDado2();
                    apuesta = mensajeDado2();
                } else if (this.dado == 3) {
                    mensajeDado3();
                    apuesta = mensajeDado3();
                } else if (this.dado == 4) {
                    mensajeDado4();
                    apuesta = mensajeDado4();
                } else if (this.dado == 5) {
                    mensajeDado5();
                    apuesta = mensajeDado5();
                } else if (this.dado == 6) {
                    mensajeDado6();
                    this.turno++;
                } else
                    System.exit(1);
            }
        }
        return apuesta;
    }
    private int segundoLanzar(int azar) {
        int restar = 0;
        while (this.pote > 0 && (jugadores1.get(this.turno % 2).getPoteJugador() >= 0)) {
         restar = this.valorApuesta;
            azar = apuesta();
            this.dado = (int) (Math.random() * 6) + 1;
            if (this.dado < azar && restar != 0){
                if (this.dado == 1){
                    mensajeDado1();
                }
                else if(this.dado==2){
                    mensajePerdidoDado2();
                }else if (this.dado==3){
                    mensajePerdidoDado3();
                }else if(this.dado==4){
                    mensajePerdidoDado4();
                }else if (this.dado==5){
                    mensajePerdidoDado5();
                }
                Restar(restar);
            }
            else if (this.dado > azar && restar != 0){
                if (this.dado == 3){
                    mensajeGandadoDado3();
                }else if(this.dado==4){
                    mensajeGandadoDado4();
                }else if(this.dado==5){
                    mensajePerdidoDado5();
                }else if (this.dado==6){
                    mensajeGandadoDado6();
                }
                Sumar(restar);
            }
            if(jugadores1.get(this.turno%2).getPoteJugador()==0)
            {
                break;
            }
        }
        if(this.pote==0)
        {
            juego();
        }
        return azar;
    }
    public int apuesta() {
        int restar = 0;
        int valor = 0;
        int apuesta = 0;
        apuesta = lanzar();

        if ((apuesta == 0) && this.dado > 1 && this.dado < 6) {
            do {

                if (Jugador.EsNumero(apuestaM())) {
                    restar = Integer.parseInt(apuestaM());
                    valor = jugadores1.get(this.turno % 2).getPoteJugador() - restar;
                }
            } while (valor < 0 || (this.pote - restar) < 0);
        }
        if (apuesta == 1) {
            this.turno++;
        }
        this.valorApuesta=restar;
        return restar;
    }
    public void Restar(int restar) {
        this.pote = (restar) + this.pote;
        restar = jugadores1.get(this.turno % 2).getPoteJugador() - restar;
        jugadores1.get(this.turno % 2).setPoteJugador(restar);
        this.turno++;
    }
    public void Sumar(int sumar) {
        this.pote = this.pote - sumar;
        sumar = jugadores1.get(this.turno % 2).getPoteJugador() + sumar;
        jugadores1.get(this.turno % 2).setPoteJugador(sumar);
        this.turno++;
    }
}
