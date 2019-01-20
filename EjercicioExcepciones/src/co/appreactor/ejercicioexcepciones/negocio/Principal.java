/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.appreactor.ejercicioexcepciones.negocio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lord_Nightmare
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String nombres[][] = {{"Manuel", "Berenice", "Flor"}, {"Sebastian", "Diego", "Leonardo"}};
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < nombres.length; i++) {
            for (int j = 0; j <= nombres[i].length; j++) {
                try {
                    System.out.print(nombres[i][j] + " ");
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("");
                    System.out.println("Error causado por: " + e);
                    System.out.println("");
                }
            }
            System.out.println("");
        }
        System.out.println("Digite un nombre a buscar en el arreglo");
        String buscar = lector.readLine();
        System.out.println(consultarNombre(nombres, buscar));
        
    }
    
    private static String consultarNombre(String[][] nombres, String buscar){
        for (int i = 0; i < nombres.length; i++) {
            for (int j = 0; j < nombres[i].length; j++) {
                if(nombres[i][j].equals(buscar)){
                    return buscar+" encontrado en la posicion ("+i+","+j+") de la matriz";
                }
            }
        }
        return "El nombre "+buscar+" no ha sido encontrado";
    }

}
