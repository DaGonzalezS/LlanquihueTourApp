package model;

public class Vehiculo implements Registrable {

    private String modelo;
    private String patente;

    public Vehiculo(String modelo, String patente) {
        this.modelo = modelo;
        this.patente = patente;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    @Override
    public String toString() {
        return modelo + " (Patente: " + patente + ")";
    }

    @Override
    public void mostrarResumen() {
        System.out.println("Vehículo: " + toString());

    }
}
