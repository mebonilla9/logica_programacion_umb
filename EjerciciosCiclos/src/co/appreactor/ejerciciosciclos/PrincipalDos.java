/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.appreactor.ejerciciosciclos;

import java.util.Scanner;

/**
 *
 * @author Lord_Nightmare
 */
public class PrincipalDos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Digite el valor maximo de numero triangular");
        int limite = new Scanner(System.in).nextInt();
        int inicio = 0;
        while (inicio < limite) {
            inicio++;
            System.out.println("El numero triangular de :" + inicio + " es: " + ((inicio * (inicio + 1)) / 2));
        }
        System.out.println("fin");
    }

}
