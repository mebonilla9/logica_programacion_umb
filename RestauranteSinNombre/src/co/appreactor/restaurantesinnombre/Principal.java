/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.appreactor.restaurantesinnombre;

import co.appreactor.superteclado.Teclado;

/**
 *
 * @author Lord_Nightmare
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bienvenido al restaurante sin nombre!");
        // establecer la estructura del ciclo while para la continuidad
        // de la ejecucion del proyecto
        
        int opcion = -1;
        int producto = 0;
        while (opcion != 0) {
            // asignar a la variable opcion el retorno de invocar al metodo
            // menuOpciones()
            opcion = menuOpciones();
            // evaluar el valor de la variable opcion
            switch (opcion) {
                case 1:
                    mostrarCarta();
                    break;
                case 2:
                    producto = Teclado.leerNumero();
                    break;
                case 3:
                    System.out.println("opcion 3");
                    break;
                case 0:
                    System.out.println("Gracias por usar este poderosisimo software!");
                    break;
                default:
                    System.out.println("Opcion invalida, intente nuevamente");
                    break;
            }
        }
    }
    
    // Estructura basica de javadoc
    /**
     * Metodo que permite retornar una opcion de menu para el metodo main
     * y afectar el flujo de datos del programa.
     * @return <code>int</code> valor de la opcion seleccionada por el
     * usuario.
     */
    private static int menuOpciones(){
        System.out.println("Seleccione una opcion!");
        System.out.println("1. Consultar carta");
        System.out.println("2. Comprar producto");
        System.out.println("3. Imprimir factura");
        System.out.println("0. Salir programa.");
        return Teclado.leerNumero();
    }
    
    private static void mostrarCarta(){
        System.out.println("----------------------------------");
        System.out.println("1 - Perro caliente      - $8000");
        System.out.println("2 - Hamburguesa         - $9000");
        System.out.println("3 - Papas a la francesa - $3000");
        System.out.println("4 - Gaseosa             - $1500");
        System.out.println("5 - Pola                - $2000");
        System.out.println("----------------------------------");
    }
    
}
