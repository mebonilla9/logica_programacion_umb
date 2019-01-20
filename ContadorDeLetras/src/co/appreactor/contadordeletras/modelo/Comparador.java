/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.appreactor.contadordeletras.modelo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Lord_Nightmare
 */
public class Comparador {

    private final String evaluador;
    private Map<String, Integer> revisor;

    public Comparador(String evaluador) {
        this.evaluador = evaluador;
        this.revisor = new HashMap<>();
    }

    public void evaluar() {
        char[] frase = this.evaluador.toCharArray();
        // ordenamiento ascendente automatico
        int contadorLetra = 0;
        Arrays.sort(frase);
        char letraAnt = frase[0];
        for (int i = 0; i < frase.length; i++) {
            char letra = frase[i];
            if (letra == letraAnt) {
                contadorLetra++;
            } else {
                revisor.put(letraAnt+"", contadorLetra);
                contadorLetra = 1;
            }
            letraAnt = letra;
        }
        revisor.put(letraAnt+"", contadorLetra);
    }

    public void imprimirComparacion() {
        for (Map.Entry<String, Integer> entry : revisor.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}
