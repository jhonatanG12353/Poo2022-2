package com.jhonatan.guayabita.guayabita.dominio;
public class Dado {
    public int lanzardado() {
        int numDado = (int) (Math.random()*6+1);
        return  numDado;
    }

}