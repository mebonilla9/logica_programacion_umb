/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.appreactor.negocio;

import co.appreactor.modelo.Vendedor;
import co.appreactor.superteclado.Teclado;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Manuel Ernesto Bonilla Muñoz <mebonilla9@gmail.com>
 */
public class Principal {

    private List<Vendedor> listaVendedores = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Principal().iniciar();
    }

    private void iniciar() {
        System.out.println("Bienvenido al sistema de registro de vendedores y ventas");
        System.out.println("Digite una opcion para continuar");
        int opcion = -1;
        while (opcion != 0) {
            opcion = menu();
            switch (opcion) {
                case 1:
                    registrarVendedor();
                    break;
                case 2:
                    Vendedor vendedorElegido = subMenuVendedores();
                    System.out.println(vendedorElegido.toString());
                    break;
                case 3:
                    System.out.println("Resumen de ventas de vendedor");
                    for (Vendedor vendedor : listaVendedores) {
                        System.out.println(vendedor.toString());
                        System.out.println("");
                    }
                    break;
                case 0:
                    System.out.println("Gracias por usar este poderosisimo software");
                    break;
                default:
                    System.out.println("Opcion Invalida");
                    break;
            }
        }
    }

    private int menu() {
        System.out.println("1. Registrar Ventas de Vendedor");
        System.out.println("2. Mostrar resumen de Vendedor");
        System.out.println("3. Resumen general de vendedores");
        System.out.println("0. Salir");
        return Teclado.leerNumero();
    }

    private Vendedor subMenuVendedores() {
        System.out.println("Seleccione un Vendedor para visualizar el resumen de ventas");
        for (int i = 0; i < listaVendedores.size(); i++) {
            System.out.println((i + 1) + ". " + listaVendedores.get(i).getNombre());
        }
        int vendedorIndex = Teclado.leerNumero() - 1;
        while (vendedorIndex < 0 && vendedorIndex > listaVendedores.size()) {
            System.out.println("Debes ingresar un numero asociado al vendedor para continuar");
            vendedorIndex = Teclado.leerNumero() - 1;
        }
        return listaVendedores.get(vendedorIndex);
    }

    private void registrarVendedor() {
        System.out.println("Digite el nombre del vendedor: ");
        String nombre = Teclado.leerTexto();
        System.out.println("Digite el numero de ventas del Vendedor");
        int ventas = Teclado.leerNumero();
        Vendedor vendedor = new Vendedor(ventas);
        vendedor.setNombre(nombre);
        vendedor.ingresarVentas();
        vendedor.obtenerVentasPequenas();
        vendedor.obtenerVentasMedianas();
        vendedor.obtenerVentasGrandes();
        listaVendedores.add(vendedor);
        System.out.println("El vendedor ha sido Registrado");
    }

}
