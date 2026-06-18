package data;

import model.Tour;
import model.Guia;

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

                if (datos.length < 5) {
                    System.out.println("Línea incompleta.");
                    continue;
                }

                String nombre = datos[0];
                String tipo = datos[1];
                double precio = Double.parseDouble(datos[2]);
                String nombreGuia = datos[3];
                String especialidad = datos[4];

                Guia guia = new Guia(nombreGuia, especialidad);

                Tour tour = new Tour(nombre, tipo, precio, guia);

                listaTours.add(tour);
            }

            lector.close();

        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado.");
        } catch (NumberFormatException e) {
            System.out.println("Precio inválido en el archivo.");
        }

        return listaTours;
    }
}