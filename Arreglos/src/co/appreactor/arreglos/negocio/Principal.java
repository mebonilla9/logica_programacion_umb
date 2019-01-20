/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.appreactor.arreglos.negocio;

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
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese 5 nombres");
        String[] nombres = new String[5];
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Nombre "+(i+1)+": ");
            nombres[i] = lector.readLine();
        }
        
        System.out.println("Imprimiendo la lista de nombres");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println((i+1)+": "+nombres[i]);
        }
    }    
}
