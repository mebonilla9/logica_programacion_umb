/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.appreactor.contadordeletras.negocio;

import co.appreactor.contadordeletras.modelo.Comparador;
import co.appreactor.superteclado.Teclado;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Lord_Nightmare
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Ingresa una frase para evaluar");
        String frase = Teclado.leerTexto();
        Comparador cp = new Comparador(frase.toLowerCase());
        cp.evaluar();
        cp.imprimirComparacion();
    }

}
