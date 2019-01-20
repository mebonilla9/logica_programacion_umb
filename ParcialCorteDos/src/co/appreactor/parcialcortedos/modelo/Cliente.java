/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.appreactor.parcialcortedos.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Manuel Ernesto Bonilla <email>mebonilla9@gmail.com</email>
 * <code>1023876679</code>
 */
public class Cliente {

    private String nombre;
    private List<LlamadaInternacional> llamadas;

    /**
     *
     * @param nombre
     */
    public Cliente(String nombre) {
        this.nombre = nombre;
        this.llamadas = new ArrayList<>();
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the llamadas
     */
    public List<LlamadaInternacional> getLlamadas() {
        return llamadas;
    }

    /**
     * @param llamadas the llamadas to set
     */
    public void setLlamadas(List<LlamadaInternacional> llamadas) {
        this.llamadas = llamadas;
    }

    @Override
    public String toString() {
        StringBuilder resumen = new StringBuilder();
        resumen.append("+------------------------\n");
        resumen.append("+ Resumen de llamadas del cliente: ");
        resumen.append(this.nombre);
        resumen.append("\n");
        resumen.append("+------------------------\n");
        for (LlamadaInternacional llamada : llamadas) {
            resumen.append("+ ");
            resumen.append(llamada.getLlamada().getZona());
            resumen.append(" (");
            resumen.append(llamada.getLlamada().getZona());
            resumen.append(")\n+ Valor Minuto: ");
            resumen.append(llamada.getLlamada().getPrecio()).append("\n");
            resumen.append("+ Minutos: ").append(llamada.getMinutos()).append("\n");
            resumen.append("+ Total: ").append(llamada.getTotalLlamada());
            resumen.append("\n+------------------------\n");
        }
        return resumen.toString();
    }

}
