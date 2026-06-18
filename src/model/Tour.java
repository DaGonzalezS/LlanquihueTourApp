package model;

public class Tour {

    private String nombre;
    private String tipo;
    private double precio;
    private Guia guia;

    public Tour(String nombre, String tipo, double precio, Guia guia) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
        this.guia = guia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio <= 0) {
            System.out.println("Precio inválido");
        }else{
            this.precio = precio;
        }
    }

    public Guia getGuia() {
        return guia;
    }

    public void setGuia(Guia guia) {
        this.guia = guia;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "nombre = '" + nombre + '\'' +
                ", tipo = '" + tipo + '\'' +
                ", precio = " + precio +
                ", guía = " + guia +
                '}';
    }
}

