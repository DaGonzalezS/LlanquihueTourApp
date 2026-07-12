package model;

public class Guia extends Persona implements Registrable {

    private String especialidad;

    public Guia(String nombre, String cargo, String especialidad) {
        super(nombre, cargo);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {

        return especialidad;
    }

    public void setEspecialidad(String especialidad) {

        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return super.toString() + " | Especialidad: " + especialidad;
    }

    @Override
    public void mostrarResumen() {
        System.out.println("Guía: " + toString());
    }
}