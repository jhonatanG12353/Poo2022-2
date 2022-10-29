package com.jhonatan.interfaces.app;

import com.jhonatan.interfaces.dominio.*;
import com.jhonatan.interfaces.dominio.CelularBasico;
import com.jhonatan.interfaces.dominio.CelularIntermedio;
import com.jhonatan.interfaces.dominio.CelularSemiavanzado;
import com.jhonatan.interfaces.dominio.Persona;

import java.util.Arrays;
import java.util.List;

public class AppInterface {
    public static void main(String[] args) {
        Persona alejandro = new Persona("Alejandro", "ASDFG", "hash123", 9999, "Fredy44");
        Persona sofia = new Persona("Sofia", "QWERTY", "hash123", 5421, "Fredy43");
        Persona daniel = new Persona("Daniel", "ZXCVB", "hash991", 1234, "Dibujo22+");
        Persona pedro = new Persona("Pedro", "JALRS", "hash536", 1424, "Passw12353");

        CelularBasico nokia = new CelularBasico("Nokia 1100", daniel);
        CelularSemiavanzado xiaomi = new CelularSemiavanzado("Xiaomi", alejandro);
        CelularIntermedio huawei = new CelularIntermedio("Huawei P44", sofia);
        CelularAvanzado iphone =  new CelularAvanzado("Iphone 14 Pro MAx",pedro);

        tratarDeDesbloquear(Arrays.asList(nokia, xiaomi, huawei, iphone), sofia);
        System.out.println("------------------------------------------------------");
        tratarDeDesbloquear(Arrays.asList(nokia, xiaomi, huawei, iphone), alejandro);
        System.out.println("------------------------------------------------------");
        tratarDeDesbloquear(Arrays.asList(nokia, xiaomi, huawei, iphone), pedro);
    }

    public static void tratarDeDesbloquear(List<Desbloqueable> celulares, Persona persona) {
        celulares.forEach(celuco -> {
            String marca = ((Celular) celuco).getMarca();
            boolean puedeDesbloquear = celuco.desbloquear(persona);

            System.out.println(persona.getNombre() + " pudo desbloquear el " + marca + "? " + puedeDesbloquear);
        });
    }
}
