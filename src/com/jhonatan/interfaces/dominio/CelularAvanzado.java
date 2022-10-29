package com.jhonatan.interfaces.dominio;

public class CelularAvanzado extends CelularSemiavanzado implements Desbloqueable {
    private String rostroCorrecto;
    private String passwordCorrecto;
    private String huellaCorrecta;

    public CelularAvanzado(String marca, Persona propietario) {
        super(marca, propietario);
        this.passwordCorrecto = propietario.getPassword();
        this.huellaCorrecta = propietario.getHuella();
        this.rostroCorrecto=propietario.getRostro();
    }
    public boolean desbloquear(Persona persona) {
        if (rostroCorrecto.equals(persona.getRostro()) || passwordCorrecto.equals(persona.getPassword()) || huellaCorrecta.equals((persona.getPassword()))) {
            return true;
        }
        return super.desbloquear(persona);
    }
}
