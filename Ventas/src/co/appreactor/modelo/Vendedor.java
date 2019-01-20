/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.appreactor.modelo;

import co.appreactor.superteclado.Teclado;

/**
 *
 * @author Manuel Ernesto Bonilla Muñoz <mebonilla9@gmail.com>
 */
public class Vendedor {

    private int cantidadPequenas;
    private double valorPequenas;

    private int cantidadMedianas;
    private double valorMedianas;

    private int cantidadGrandes;
    private double valorGrandes;

    private String nombre;
    private final double[] cantidadVentas;

    public Vendedor(int numeroVentas) {
        cantidadVentas = new double[numeroVentas];
    }

    public void ingresarVentas() {
        for (int i = 0; i < cantidadVentas.length; i++) {
            System.out.print("Digite el valor de la venta No " + (i + 1) + ": $");
            cantidadVentas[i] = Teclado.leerNumeroDecimal();
        }
    }

    public void obtenerVentasPequenas() {
        for (int i = 0; i < cantidadVentas.length; i++) {
            if (cantidadVentas[i] <= 200.0) {
                valorPequenas += cantidadVentas[i];
                cantidadPequenas++;
            }
        }
        System.out.println("Cantidad de ventas pequeñas = " + cantidadPequenas);
        System.out.println("Valor promedio de las ventas pequeñas = " + (Double.isNaN(valorPequenas / cantidadPequenas) ? 0 : (valorPequenas / cantidadPequenas)));
    }

    public void obtenerVentasMedianas() {
        for (int i = 0; i < cantidadVentas.length; i++) {
            if (cantidadVentas[i] > 200.0 && cantidadVentas[i] < 400.0) {
                valorMedianas += cantidadVentas[i];
                cantidadMedianas++;
            }
        }
        System.out.println("Cantidad de ventas medianas = " + cantidadMedianas);
        System.out.println("Valor promedio de las ventas medianas = " + (Double.isNaN(valorMedianas / cantidadMedianas) ? 0 : (valorMedianas / cantidadMedianas)));
    }

    public void obtenerVentasGrandes() {
        for (int i = 0; i < cantidadVentas.length; i++) {
            if (cantidadVentas[i] > 400.0) {
                valorGrandes += cantidadVentas[i];
                cantidadGrandes++;
            }
        }
        System.out.println("Cantidad de ventas grandes = " + cantidadGrandes);
        System.out.println("Valor promedio de las ventas grandes = " + (Double.isNaN(valorGrandes / cantidadGrandes) ? 0 : (valorGrandes / cantidadGrandes)));
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

    @Override
    public String toString() {
        StringBuilder armador = new StringBuilder();
        armador.append("=====================================================\n");
        armador.append("= Nombre del Vendedor: ");
        armador.append(this.nombre);
        armador.append("\n");
        armador.append("= Resumen ventas pequeñas: (Cantidad: ");
        armador.append(this.cantidadPequenas);
        armador.append(") (Promedio Ventas: ");
        armador.append(this.valorPequenas / this.cantidadPequenas);
        armador.append(")\n");
        armador.append("= Resumen ventas medianas: (Cantidad: ");
        armador.append(this.cantidadMedianas);
        armador.append(") (Promedio Ventas: ");
        armador.append(this.valorMedianas / this.cantidadMedianas);
        armador.append(")\n");
        armador.append("= Resumen ventas grandes: (Cantidad: ");
        armador.append(this.cantidadGrandes);
        armador.append(") (Promedio Ventas: ");
        armador.append(this.valorGrandes / this.cantidadGrandes);
        armador.append(")\n");
        armador.append("=====================================================\n");
        return armador.toString();
    }

}
