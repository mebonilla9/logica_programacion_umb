/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.appreactor.anagrama;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 * @author Lord_Nightmare
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            BufferedReader lec = new BufferedReader(new InputStreamReader(System.in));

            char[] palabraUno = lec.readLine().toCharArray();
            char[] palabraDos = lec.readLine().toCharArray();

            Arrays.sort(palabraUno);
            Arrays.sort(palabraDos);

            if (String.valueOf(palabraUno).equals(String.valueOf(palabraDos))) {
                System.out.println("Las palabras son iguales no se puede evaluar si es anagrama");
                return;
            }
             
            if (palabraUno.length != palabraDos.length) {
                System.out.println("La longitud de las palabras no coincide");
                return;
            }

            for (int i = 0; i < palabraDos.length; i++) {
                if (palabraUno[i] != palabraDos[i]) {
                    System.out.println("Las palabras digitadas no son anagramas!");
                    return;
                }
            }
            System.out.println("Las palabras son anagramas!");

        } catch (Exception e) {
            e.printStackTrace(System.err);
        }

    }

}
