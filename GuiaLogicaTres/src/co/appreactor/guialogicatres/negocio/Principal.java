/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.appreactor.guialogicatres.negocio;

import co.appreactor.superteclado.Teclado;

/**
 *
 * @author Lord_Nightmare
 */
public class Principal {

    private String[] nombres;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Principal().iniciar();
    }

    private void iniciar() {
        try {
            System.out.println("Ingrese la cantidad de nombres del arreglo");
            nombres = new String[Teclado.leerNumero()];
            int opcion = -1;
            int index = -1;
            while (opcion != 0) {
                opcion = menu();
                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese una posicion para guardar el nombre entre '0' y '" + (nombres.length - 1) + "'");
                        index = Teclado.leerNumero();
                        System.out.println("Escriba el nombre que desea guardar: ");
                        String nombre = Teclado.leerTexto();
                        asignarNombre(index, nombre);
                        break;
                    case 2:
                        System.out.println("Ingrese una posicion para guardar el nombre entre '0' y '" + (nombres.length - 1) + "'");
                        index = Teclado.leerNumero();
                        System.out.println("El nombre almacenado en la posicion '" + index + "' es: " + consultarNombre(index));
                        break;
                    case 0:

                        break;
                    default:
                        throw new IllegalArgumentException("Opcion invalida, se ha cerrado el programa");
                }
            }

        } catch (IllegalArgumentException | ArrayIndexOutOfBoundsException e) {
            e.printStackTrace(System.err);
        }

    }

    private void asignarNombre(int index, String nombre) throws IllegalArgumentException, ArrayIndexOutOfBoundsException {
        if (nombre.trim().equals("")) {
            throw new IllegalArgumentException("El valor del nombre no puede estar vacio");
        }
        nombres[index] = nombre;
    }

    private String consultarNombre(int index) throws ArrayIndexOutOfBoundsException {
        return nombres[index];
    }

    private int menu() {
        System.out.println("Elija una opcion");
        System.out.println("1. Guardar nombre");
        System.out.println("2. Consultar nombre");
        System.out.println("0. Salir");
        return Teclado.leerNumero();
    }

}
