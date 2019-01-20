/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.appreactor.guiacuatrologica;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Lord_Nightmare
 */
public class NumerosEnteros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("digita un numero entero");
            int numero = Integer.parseInt(br.readLine());
            if (numero < 0) {
                System.out.println("Has digitado un numero negativo");
            }
            if (numero > 0) {
                System.out.println("Has digitado un numero positivo");
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
    
}
