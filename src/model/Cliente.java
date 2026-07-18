package model;

import interfaces.Registrable;

public class Cliente extends Persona implements Registrable {

    private String correo;

    public Cliente(String nombre, int edad, Rut rut, Direccion direccion, String correo) {
        super(nombre, edad, rut, direccion);
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String mostrarResumen() {
        return "===== CLIENTE =====";
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCorreo: " + correo;
    }

}