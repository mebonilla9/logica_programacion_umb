/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.appreactor.sumadematrices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Manuel Ernesto Bonilla Muñoz
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try (BufferedReader lector = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                System.out.println("Suma de matrices");
                double[][] matrizA = new double[2][3];
                double[][] matrizB = new double[2][3];
                
                System.out.println("");
                System.out.println("Digite una cantidad de 6 valores para almacenar en la matriz A");
                System.out.println("");

                for (int i = 0; i < matrizA.length; i++) {
                    for (int j = 0; j < matrizA[i].length; j++) {
                        System.out.println("Ingresa el numero " + ((i + j) + 1) + " Para la matriz A");
                        matrizA[i][j] = Double.parseDouble(lector.readLine());
                    }
                }

                System.out.println("");
                System.out.println("Digite una cantidad de 6 valores para almacenar en la matriz B");
                System.out.println("");

                for (int i = 0; i < matrizB.length; i++) {
                    for (int j = 0; j < matrizB[i].length; j++) {
                        System.out.println("Ingresa el numero " + ((i + j) + 1) + " Para la matriz A");
                        matrizB[i][j] = Double.parseDouble(lector.readLine());
                    }
                }

                System.out.println("");
                System.out.println("Matriz A");
                System.out.println("");

                for (int i = 0; i < matrizA.length; i++) {
                    for (int j = 0; j < matrizA[i].length; j++) {
                        System.out.print(matrizA[i][j] + " ");
                    }
                    System.out.println("");
                }

                System.out.println("");
                System.out.println("Matriz B");
                System.out.println("");

                for (int i = 0; i < matrizB.length; i++) {
                    for (int j = 0; j < matrizB[i].length; j++) {
                        System.out.print(matrizB[i][j] + " ");
                    }
                    System.out.println("");
                }

                System.out.println("");
                System.out.println("Resultado de la suma de las matrices");
                System.out.println("");

                for (int i = 0; i < matrizA.length; i++) {
                    for (int j = 0; j < matrizA[i].length; j++) {
                        System.out.print(matrizA[i][j] + matrizB[i][j] + " ");
                    }
                    System.out.println("");
                }

            }
        } catch (ArrayIndexOutOfBoundsException | IOException e) {
            String mensaje = e instanceof ArrayIndexOutOfBoundsException ? "Posicion de la matriz no encontrada" : "Error en la captura de datos del ususario";
            System.out.println("Error: " + mensaje);
            e.printStackTrace(System.err);
        }

    }

}
