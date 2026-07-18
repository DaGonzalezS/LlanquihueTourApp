package model;

import interfaces.Registrable;

public class Proveedor extends Persona implements Registrable {

    private String empresa;

    public Proveedor(String nombre, int edad, Rut rut, Direccion direccion, String empresa) {
        super(nombre, edad, rut, direccion);
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public String mostrarResumen() {
        return "===== PROVEEDOR =====";
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nEmpresa: " + empresa;
    }

}