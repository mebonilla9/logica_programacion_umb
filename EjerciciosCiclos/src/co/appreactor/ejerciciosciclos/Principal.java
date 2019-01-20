/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.appreactor.ejerciciosciclos;

import co.appreactor.superteclado.Teclado;
import java.util.Scanner;

/**
 *
 * @author Lord_Nightmare
 */
public class Principal {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Digite el numero para el factorial");
        int num = new Scanner(System.in).nextInt();
        System.out.println("El factorial de " + num + " es: " + factorial(num));
    }

    private static int factorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }

}
