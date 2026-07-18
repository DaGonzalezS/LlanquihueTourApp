package model;

public class Persona {

    private String nombre;
    private int edad;
    private Rut rut;
    private Direccion direccion;

    public Persona(String nombre, int edad, Rut rut, Direccion direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.rut = rut;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Rut getRut() {
        return rut;
    }

    public void setRut(Rut rut) {
        this.rut = rut;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                "\nEdad: " + edad +
                "\nRut: " + rut +
                "\nDirección: " + direccion;
    }

}