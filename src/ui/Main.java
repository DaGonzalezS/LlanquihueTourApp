package ui;

import data.GestorDatos;
import model.Tour;

import java.util.ArrayList;
import java.util.SortedMap;

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

        System.out.println("\nTOURS DE AVENTURA");
        System.out.println("-------------------");

        for (Tour tour : tours) {
            if (tour.getTipo().equalsIgnoreCase("Aventura")) {
                System.out.println(tour);
            }
        }

        System.out.println("\nTOURS ECONOMICOS (Precio menor o igual a $40.000)");
        System.out.println("-------------------");

        for (Tour tour : tours) {
            if (tour.getPrecio() <= 40000) {
                System.out.println(tour);
            }
        }
    }
}