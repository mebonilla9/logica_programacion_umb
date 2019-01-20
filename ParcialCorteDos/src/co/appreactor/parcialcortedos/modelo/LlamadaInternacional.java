/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.appreactor.parcialcortedos.modelo;

import co.appreactor.parcialcortedos.negocio.constantes.EInternacionales;

/**
 *
 * @author Manuel Ernesto Bonilla <email>mebonilla9@gmail.com</email>
 * <code>1023876679</code>
 */
public class LlamadaInternacional {

    private EInternacionales llamada;
    private int minutos;
    private double totalLlamada;

    public LlamadaInternacional(EInternacionales llamada, int minutos) {
        this.llamada = llamada;
        this.minutos = minutos;
        this.totalLlamada = llamada.getPrecio() * minutos;
    }

    /**
     * @return the llamada
     */
    public EInternacionales getLlamada() {
        return llamada;
    }

    /**
     * @param llamada the llamada to set
     */
    public void setLlamada(EInternacionales llamada) {
        this.llamada = llamada;
    }

    /**
     * @return the minutos
     */
    public int getMinutos() {
        return minutos;
    }

    /**
     * @param minutos the minutos to set
     */
    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    /**
     * @return the totalLlamada
     */
    public double getTotalLlamada() {
        return totalLlamada;
    }

    /**
     * @param totalLlamada the totalLlamada to set
     */
    public void setTotalLlamada(double totalLlamada) {
        this.totalLlamada = totalLlamada;
    }

}
