/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.appreactor.guiacuatrologica;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 * @author Lord_Nightmare
 */
public class OrdenarNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int[] numeros = new int[5];
            for (int i = 0; i < numeros.length; i++) {
                System.out.println("Ingresa el valor del numero "+(i+1));
                numeros[i] = Integer.parseInt(br.readLine());
            }
            
            Arrays.sort(numeros);
            
            for (int i = 0; i < numeros.length; i++) {
                System.out.println("Numero "+(i+1)+": "+numeros[i]);
            }

        } catch (Exception e) {
            e.printStackTrace(System.err);

        }
    }
    
}
