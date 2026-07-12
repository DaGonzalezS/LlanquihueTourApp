package data;

import java.util.ArrayList;

import model.Registrable;
import model.Guia;
import model.Vehiculo;
import model.ColaboradorExterno;

public class GestorEntidades {

    private ArrayList<Registrable> entidades;

    public GestorEntidades() {
        entidades = new ArrayList<>();
    }

    public void agregarEntidad(Registrable entidad) {
        entidades.add(entidad);
    }

    public String mostrarEntidades() {
        if (entidades.isEmpty()) {
            return "No hay entidades registradas.";
        }

        StringBuilder sb = new StringBuilder();

        for (Registrable entidad : entidades) {

            if (entidad instanceof Guia) {
                sb.append("Guía\n");
            } else if (entidad instanceof Vehiculo) {
                sb.append("Vehículo\n");
            } else if (entidad instanceof ColaboradorExterno) {
                sb.append("Colaborador Externo\n");
            }

            sb.append(entidad.toString());
            sb.append("\n\n");
        }

        return sb.toString();
    }
}