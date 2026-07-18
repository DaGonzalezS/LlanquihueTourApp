package ui;

import data.GestorDatos;
import data.GestorPersonas;
import model.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GestorPersonas gestor = new GestorPersonas();

        int opcion;

        do {

            System.out.println("\n===== LLANQUIHUE TOUR =====");
            System.out.println("1. Registrar Cliente");
            System.out.println("2. Registrar Guía");
            System.out.println("3. Registrar Proveedor");
            System.out.println("4. Mostrar Personas");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Edad: ");
                    int edad = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Rut (mínimo 8 caracteres): ");
                    String rut = sc.nextLine();

                    if (!Rut.esValido(rut)) {
                        System.out.println("\n[ERROR]: El RUT ingresado no es válido (Debe tener mínimo 8 caracteres).");
                        System.out.println("Registro cancelado.");
                        break;
                    }

                    System.out.print("Calle: ");
                    String calle = sc.nextLine();

                    System.out.print("Ciudad: ");
                    String ciudad = sc.nextLine();

                    System.out.print("Correo: ");
                    String correo = sc.nextLine();

                    Cliente cliente = new Cliente(
                            nombre,
                            edad,
                            new Rut(rut),
                            new Direccion(calle, ciudad),
                            correo
                    );

                    GestorDatos.guardarCliente(cliente);
                    System.out.println("\nCliente registrado correctamente.");
                    break;

                case 2:

                    System.out.print("Nombre: ");
                    nombre = sc.nextLine();

                    System.out.print("Edad: ");
                    edad = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Rut (mínimo 8 caracteres): ");
                    rut = sc.nextLine();

                    if (!Rut.esValido(rut)) {
                        System.out.println("\n[ERROR]: El RUT ingresado no es válido (Debe tener mínimo 8 caracteres).");
                        System.out.println("Registro cancelado.");
                        break;
                    }

                    System.out.print("Calle: ");
                    calle = sc.nextLine();

                    System.out.print("Ciudad: ");
                    ciudad = sc.nextLine();

                    System.out.print("Especialidad: ");
                    String especialidad = sc.nextLine();

                    Guia guia = new Guia(
                            nombre,
                            edad,
                            new Rut(rut),
                            new Direccion(calle, ciudad),
                            especialidad
                    );

                    GestorDatos.guardarGuia(guia);
                    System.out.println("\nGuía registrada correctamente.");
                    break;

                case 3:

                    System.out.print("Nombre: ");
                    nombre = sc.nextLine();

                    System.out.print("Edad: ");
                    edad = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Rut (mínimo 8 caracteres): ");
                    rut = sc.nextLine();

                    if (!Rut.esValido(rut)) {
                        System.out.println("\n[ERROR]: El RUT ingresado no es válido (Debe tener mínimo 8 caracteres).");
                        System.out.println("Registro cancelado.");
                        break;
                    }

                    System.out.print("Calle: ");
                    calle = sc.nextLine();

                    System.out.print("Ciudad: ");
                    ciudad = sc.nextLine();

                    System.out.print("Empresa: ");
                    String empresa = sc.nextLine();

                    Proveedor proveedor = new Proveedor(
                            nombre,
                            edad,
                            new Rut(rut),
                            new Direccion(calle, ciudad),
                            empresa
                    );

                    GestorDatos.guardarProveedor(proveedor);
                    System.out.println("\nProveedor registrado correctamente.");
                    break;

                case 4:

                    gestor.limpiarPersonas();

                    GestorDatos.cargarClientes(gestor);
                    GestorDatos.cargarGuias(gestor);
                    GestorDatos.cargarProveedores(gestor);

                    System.out.println(gestor.mostrarPersonas());
                    break;

                case 5:

                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 5);

        sc.close();
    }
}