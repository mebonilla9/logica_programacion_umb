/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.appreactor.nominasinnombre;

import co.appreactor.superteclado.Teclado;

/**
 *
 * @author Lord_Nightmare
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        final double SALARIO_MINIMO = 781424;
        final double SUBSIDIO_TRANSPORTE = 88221;
        final int DIAS_CONTRATO = 30;
        final double SALUD = 0.04;
        final double PENSION = 0.04;

        String nombre;
        String apellido;
        String cedula;
        double salario;
        int dias;

        System.out.println("Bienvenido a tu calculador de nomina");
        System.out.println("Digita tu nombre");
        nombre = Teclado.leerTexto();
        System.out.println("Digita tu apellido");
        apellido = Teclado.leerTexto();
        System.out.println("Digita tu cedula");
        cedula = Teclado.leerTexto();
        System.out.println("Digita tu salario");
        salario = Teclado.leerNumeroDecimal();
        System.out.println("Digita tu dias");
        dias = Teclado.leerNumero();

        double sueldo = (salario * dias) / DIAS_CONTRATO;

        double subsidioTransporte = 0.0;

        if (salario <= (SALARIO_MINIMO * 2)) {
            subsidioTransporte += (SUBSIDIO_TRANSPORTE * dias) / 30;
        }

        double devengados = sueldo + subsidioTransporte;

        double valorSalud = sueldo * SALUD;
        double valorPension = sueldo * PENSION;

        double deducciones = valorSalud + valorPension;

        double neto = devengados - deducciones;

        System.out.println("-------------------------------------------------");
        System.out.println("- Resultado de tu nomina:");
        System.out.println("- Nombre: " + nombre);
        System.out.println("- Apellido: " + apellido);
        System.out.println("- Cedula: " + cedula);
        System.out.println("- Salario: $ " + salario);
        System.out.println("- Dias Trabajados: $ " + dias);
        System.out.println("- Sueldo Basico: $ " + sueldo);
        System.out.println("- Subsidio de transporte: $ " + subsidioTransporte);
        System.out.println("- Total Devengados: $ " + devengados);
        System.out.println("- Salud: $ " + valorSalud);
        System.out.println("- Pension: $ " + valorPension);
        System.out.println("- Total Deducciones: $ " + deducciones);
        System.out.println("- Neto Pagado: $ " + neto);
        System.out.println("-------------------------------------------------");
    }

}
