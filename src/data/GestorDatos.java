package data;

import model.Tour;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorDatos {

    public ArrayList<Tour> leerTours() {

        ArrayList<Tour> listaTours = new ArrayList<>();

        try {

            File archivo = new File("resources/tours.txt");
            Scanner lector = new Scanner(archivo);

            while (lector.hasNextLine()) {

                String linea = lector.nextLine();

                String[] datos = linea.split(";");

                String nombre = datos[0];
                String tipo = datos[1];
                double precio = Double.parseDouble(datos[2]);

                Tour tour = new Tour(nombre, tipo, precio);

                listaTours.add(tour);
            }

            lector.close();

        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado.");
        }

        return listaTours;
    }
}