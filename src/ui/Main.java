package ui;

import data.GestorEntidades;
import model.ColaboradorExterno;
import model.Guia;
import model.Vehiculo;

import javax.swing.*;


public class Main {

    public static void main(String[] args) {

        GestorEntidades gestor = new GestorEntidades();

        String[] opciones = {
                "Agregar Guía",
                "Agregar Vehículo",
                "Agregar Colaborador",
                "Mostrar Entidades",
                "Salir"
        };

        int opcion;

        do {

            opcion = JOptionPane.showOptionDialog(
                    null,
                    "Seleccione una opción",
                    "Llanquihue Tour",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]
            );

            switch (opcion) {

                case 0: {

                    String nombre = JOptionPane.showInputDialog("Nombre:");
                    String cargo = JOptionPane.showInputDialog("Cargo:");
                    String especialidad = JOptionPane.showInputDialog("Especialidad:");

                    gestor.agregarEntidad(
                            new Guia(nombre, cargo, especialidad)
                    );
                    JOptionPane.showMessageDialog(null, "Guía registrado correctamente.");
                    break;
                }

                case 1: {
                    String modelo = JOptionPane.showInputDialog("Modelo:");

                    String patente = JOptionPane.showInputDialog("Patente:");

                    gestor.agregarEntidad(
                            new Vehiculo(modelo, patente)
                    );
                    JOptionPane.showMessageDialog(null, "Vehículo registrado correctamente.");
                    break;
                }

                case 2: {

                    String nombre = JOptionPane.showInputDialog("Nombre:");
                    String cargo = JOptionPane.showInputDialog("Cargo:");
                    String empresa = JOptionPane.showInputDialog("Empresa:");

                    gestor.agregarEntidad(
                            new ColaboradorExterno(nombre, cargo, empresa)
                    );
                    JOptionPane.showMessageDialog(null, "Colaborador externo registrado correctamente.");
                    break;
                }

                case 3: {
                    JOptionPane.showMessageDialog(
                            null,
                            gestor.mostrarEntidades()
                    );
                    break;
                }
            }

        } while (opcion != 4 && opcion != -1);
    }
}