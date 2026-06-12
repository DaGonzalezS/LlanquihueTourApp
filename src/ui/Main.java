package ui;

import data.GestorDatos;
import model.Tour;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        GestorDatos gestor = new GestorDatos();

        ArrayList<Tour> tours = gestor.leerTours();

        System.out.println("LISTA DE TOURS");
        System.out.println("----------------");

        for (Tour tour : tours) {
            System.out.println(tour);
        }

        System.out.println("\nTOURS GASTRONOMICOS");
        System.out.println("-------------------");

        for (Tour tour : tours) {

            if (tour.getTipo().equalsIgnoreCase("Gastronomico")) {
                System.out.println(tour);
            }
        }
    }
}