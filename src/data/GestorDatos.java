package data;

import model.*;

import java.io.*;

public class GestorDatos {

    // ============================
    // GUARDAR CLIENTES
    // ============================

    public static void guardarCliente(Cliente cliente) {

        try (BufferedWriter bw = new BufferedWriter(
                new FileWriter("resources/clientes.txt", true))) {

            bw.write(cliente.getNombre() + ";" +
                    cliente.getEdad() + ";" +
                    cliente.getRut() + ";" +
                    cliente.getDireccion().getCalle() + ";" +
                    cliente.getDireccion().getCiudad() + ";" +
                    cliente.getCorreo());

            bw.newLine();

        } catch (IOException e) {
            System.out.println("Error al guardar cliente.");
        }

    }

    // ============================
    // GUARDAR GUIAS
    // ============================

    public static void guardarGuia(Guia guia) {

        try (BufferedWriter bw = new BufferedWriter(
                new FileWriter("resources/guias.txt", true))) {

            bw.write(guia.getNombre() + ";" +
                    guia.getEdad() + ";" +
                    guia.getRut() + ";" +
                    guia.getDireccion().getCalle() + ";" +
                    guia.getDireccion().getCiudad() + ";" +
                    guia.getEspecialidad());

            bw.newLine();

        } catch (IOException e) {
            System.out.println("Error al guardar guía.");
        }

    }

    // ============================
    // GUARDAR PROVEEDORES
    // ============================

    public static void guardarProveedor(Proveedor proveedor) {

        try (BufferedWriter bw = new BufferedWriter(
                new FileWriter("resources/proveedores.txt", true))) {

            bw.write(proveedor.getNombre() + ";" +
                    proveedor.getEdad() + ";" +
                    proveedor.getRut() + ";" +
                    proveedor.getDireccion().getCalle() + ";" +
                    proveedor.getDireccion().getCiudad() + ";" +
                    proveedor.getEmpresa());

            bw.newLine();

        } catch (IOException e) {
            System.out.println("Error al guardar proveedor.");
        }

    }

    // ============================
    // CARGAR CLIENTES
    // ============================

    public static void cargarClientes(GestorPersonas gestor) {

        try (BufferedReader br = new BufferedReader(
                new FileReader("resources/clientes.txt"))) {

            String linea;

            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(";");

                Cliente cliente = new Cliente(
                        datos[0],
                        Integer.parseInt(datos[1]),
                        new Rut(datos[2]),
                        new Direccion(datos[3], datos[4]),
                        datos[5]
                );

                gestor.agregarPersona(cliente);

            }

        } catch (IOException e) {
            System.out.println("Error al leer clientes.");
        }

    }

    // ============================
    // CARGAR GUIAS
    // ============================

    public static void cargarGuias(GestorPersonas gestor) {

        try (BufferedReader br = new BufferedReader(
                new FileReader("resources/guias.txt"))) {

            String linea;

            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(";");

                Guia guia = new Guia(
                        datos[0],
                        Integer.parseInt(datos[1]),
                        new Rut(datos[2]),
                        new Direccion(datos[3], datos[4]),
                        datos[5]
                );

                gestor.agregarPersona(guia);

            }

        } catch (IOException e) {
            System.out.println("Error al leer guías.");
        }

    }

    // ============================
    // CARGAR PROVEEDORES
    // ============================

    public static void cargarProveedores(GestorPersonas gestor) {

        try (BufferedReader br = new BufferedReader(
                new FileReader("resources/proveedores.txt"))) {

            String linea;

            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(";");

                Proveedor proveedor = new Proveedor(
                        datos[0],
                        Integer.parseInt(datos[1]),
                        new Rut(datos[2]),
                        new Direccion(datos[3], datos[4]),
                        datos[5]
                );

                gestor.agregarPersona(proveedor);

            }

        } catch (IOException e) {
            System.out.println("Error al leer proveedores.");
        }

    }

}