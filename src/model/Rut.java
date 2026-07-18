package model;

public class Rut {

    private String numero;

    public Rut(String numero) {
        this.numero = numero;
    }

    public static boolean esValido(String numero) {
        if (numero == null || numero.trim().isEmpty()) {
            return false;
        }

        return numero.trim().length() >= 8;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return numero;
    }
}