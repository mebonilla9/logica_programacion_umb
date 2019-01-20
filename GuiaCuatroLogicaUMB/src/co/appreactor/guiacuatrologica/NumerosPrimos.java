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
public class NumerosPrimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Digita un numero para determinar si es primo o no");
            int numero = Integer.parseInt(br.readLine());
            int contador = 0;
            for (int i = numero; i > 0; i--) {
                if (numero % i == 0) {
                    contador++;
                }
                if (contador > 2) {
                    System.out.println("El numero digitado no es primo!");
                    return;
                }
            }
            System.out.println("El numero digitado es primo");

        } catch (Exception e) {
            e.printStackTrace(System.err);

        }
    }
}
