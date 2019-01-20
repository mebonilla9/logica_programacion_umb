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
public class Nomina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
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
            nombre = br.readLine();
            System.out.println("Digita tu apellido");
            apellido = br.readLine();
            System.out.println("Digita tu cedula");
            cedula = br.readLine();
            System.out.println("Digita tu salario");
            salario = Double.parseDouble(br.readLine());
            System.out.println("Digita tu dias");
            dias = Integer.parseInt(br.readLine());

            double sueldo = (salario * dias) / DIAS_CONTRATO;
            double valorHora = ((salario * dias) / DIAS_CONTRATO) / 8;

            double subsidioTransporte = 0.0;

            if (salario <= (SALARIO_MINIMO * 2)) {
                subsidioTransporte += (SUBSIDIO_TRANSPORTE * dias) / 30;
            }

            double devengados = sueldo + subsidioTransporte;

            double valorSalud = sueldo * SALUD;
            double valorPension = sueldo * PENSION;

            double retefuente = 0;

            int salarios = (int) (salario / SALARIO_MINIMO);
            if (salarios > 0 && salarios < 4) {
                retefuente = 0;
            } else if (salarios >= 4 && salarios < 6) {
                retefuente += salario * 0.035;
            } else if (salarios >= 6 && salarios < 8) {
                retefuente += salario * 0.05;
            } else if (salarios >= 8) {
                retefuente += salario * 0.07;
            }

            double deducciones = valorSalud + valorPension + retefuente;

            double neto = devengados - deducciones;

            System.out.println("-------------------------------------------------");
            System.out.println("- Resultado de tu nomina:");
            System.out.println("- Nombre: " + nombre);
            System.out.println("- Apellido: " + apellido);
            System.out.println("- Cedula: " + cedula);
            System.out.println("- Salario: $ " + salario);
            System.out.println("- Valor por hora: $ " + valorHora);
            System.out.println("- Dias Trabajados: $ " + dias);
            System.out.println("- Sueldo Basico: $ " + sueldo);
            System.out.println("- Subsidio de transporte: $ " + subsidioTransporte);
            System.out.println("- Retencion en la fuente: $ " + retefuente);
            System.out.println("- Total Devengados: $ " + devengados);
            System.out.println("- Salud: $ " + valorSalud);
            System.out.println("- Pension: $ " + valorPension);
            System.out.println("- Total Deducciones: $ " + deducciones);
            System.out.println("- Neto Pagado: $ " + neto);
            System.out.println("-------------------------------------------------");
        } catch (Exception e) {
        }
    }

}
