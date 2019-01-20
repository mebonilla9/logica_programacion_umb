/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.appreactor.palindromo.negocio;

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
        while (true) {
            System.out.println("Digite una frase para saber si es palindromo");
            StringBuilder frase = new StringBuilder(new BufferedReader(new InputStreamReader(System.in)).readLine().trim());
            System.out.println(frase.toString().equals(frase.reverse().toString()) ? "1" : "0");
        }

    }

}
