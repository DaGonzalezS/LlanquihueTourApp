package model;

import interfaces.Registrable;

public class Guia extends Persona implements Registrable {

    private String especialidad;

    public Guia(String nombre, int edad, Rut rut, Direccion direccion, String especialidad) {
        super(nombre, edad, rut, direccion);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String mostrarResumen() {
        return "===== GUÍA =====";
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nEspecialidad: " + especialidad;
    }

}