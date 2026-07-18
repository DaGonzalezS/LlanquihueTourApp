package data;

import interfaces.Registrable;

import java.util.ArrayList;

public class GestorPersonas {

    private ArrayList<Registrable> personas;

    public GestorPersonas() {
        personas = new ArrayList<>();
    }

    public void agregarPersona(Registrable persona) {
        personas.add(persona);
    }

    public void limpiarPersonas() {
        personas.clear();
    }

    public String mostrarPersonas() {

        if (personas.isEmpty()) {
            return "No hay personas registradas.";
        }

        StringBuilder sb = new StringBuilder();

        for (Registrable persona : personas) {

            sb.append(persona.mostrarResumen()).append("\n");
            sb.append(persona.toString()).append("\n");
            sb.append("---------------------------------\n");

        }

        return sb.toString();
    }

}