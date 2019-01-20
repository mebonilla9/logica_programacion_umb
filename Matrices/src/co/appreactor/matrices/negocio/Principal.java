/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.appreactor.matrices.negocio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lord_Nightmare
 */
public class Principal {

    public static void main(String[] args) throws IOException {
        /**
         * @param args the command line arguments
         */
        String carros[][] = {{"Ford", "Porshe", "Ferrary"}, {"Lamborghini", "Marusia", "Honda"},
        {"Mazda", "Kia", "Wolksvagen"}, {"Lamborghini", "Marusia", "Honda"}};

        String frutas[][] = {{"Fresa", "Banano", "Mora"}, {"Uva", "Anon", "Kiwi"}, {"Granadilla", "Pitaya"}, {"Granada", "Frambuesa", "Zarzamora", "Mora Azul"}};

        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Digite una fruta para buscar");
        String frutica = lector.readLine();
        
        for (int i = 0; i < frutas.length; i++) {
            for (int j = 0; j < frutas[i].length; j++) {
                if (frutas[i][j].equalsIgnoreCase(frutica)) {
                    System.out.println(frutas[i][j]+" encontrada en la posicion ("+i+", "+j+")");
                    return;
                }
            }
        }
        System.out.println("Fruta no encontrada");
    }

}
