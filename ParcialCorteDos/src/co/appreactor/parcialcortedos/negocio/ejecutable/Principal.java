/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.appreactor.parcialcortedos.negocio.ejecutable;

import co.appreactor.parcialcortedos.modelo.Cliente;
import co.appreactor.parcialcortedos.modelo.LlamadaInternacional;
import co.appreactor.parcialcortedos.negocio.constantes.EInternacionales;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Manuel Ernesto Bonilla <email>mebonilla9@gmail.com</email>
 * <code>1023876679</code>
 */
public class Principal {

    private BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
    private final Map<Integer, EInternacionales> mapa;

    private List<Cliente> clientesRegistrados;

    public Principal() {
        this.mapa = new HashMap<>();
        for (EInternacionales value : EInternacionales.values()) {
            mapa.put(value.getClave(), value);
        }
        clientesRegistrados = new ArrayList<>();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Principal().iniciar();
    }

    private void iniciar() {
        int opcion = 0;
        while (opcion != 3) {
            try {
                opcion = menu();
                switch (opcion) {
                    case 1:
                        registrarLlamada(opcion);
                        break;
                    case 2:
                        System.out.println(obtenerCliente(opcion));
                        break;
                    case 3:
                        System.out.println("Gracias por utilizar este poderosisimo software, Adios!");
                        break;
                    default:
                        System.out.println("Opcion Invalida, Intente nuevamente");
                }
            } catch (NumberFormatException | IOException e) {
                System.out.println(e instanceof NumberFormatException ? "Valor digitado no corresponde a un numero, se ha cancelado la transaccion, intente nuevamente" : "Error en el diligenciamiento de los datos, operacion cancelada!");

            }
        }
    }

    private int menu() throws IOException {
        System.out.println("Elija una opcion");
        System.out.println("1. Registrar llamada");
        System.out.println("2. Ver resumen de llamadas");
        System.out.println("3. Salir");
        return Integer.parseInt(lector.readLine());
    }

    private Cliente obtenerCliente(int opcion) throws IOException {
        System.out.println(opcion == 1 ? "Seleccione un cliente para asignar la llamada, si desea registrar uno nuevo presione 0" : "Seleccione un cliente consultar el resumen de llamadas");
        int cont = 1;
        for (Cliente cliente : clientesRegistrados) {
            System.out.println((cont++) + ". " + cliente.getNombre());
        }
        int item = Integer.parseInt(lector.readLine());
        if (item == 0 || item > clientesRegistrados.size()) {
            return null;
        }
        return clientesRegistrados.get(item - 1);
    }

    private void registrarLlamada(int opcion) throws IOException {
        Cliente cliente = obtenerCliente(opcion);
        EInternacionales zona = elegirZona();
        System.out.println("Digite el numero de minutos que duro la llamada:");
        int minutos = Integer.parseInt(lector.readLine());
        if (cliente == null) {
            System.out.println("Digite el nombre del cliente:");
            String nombre = lector.readLine();
            cliente = new Cliente(nombre);
            cliente.getLlamadas().add(new LlamadaInternacional(zona, minutos));
            clientesRegistrados.add(cliente);
            System.out.println("Se ha registrado una nueva llamada para el usuario: " + cliente.getNombre());
            return;
        }
        cliente.getLlamadas().add(new LlamadaInternacional(zona, minutos));

    }

    private EInternacionales elegirZona() throws IOException {
        System.out.println("Elige la zona de la llamada: ");
        for (EInternacionales value : mapa.values()) {
            System.out.println("Clave: " + value.getClave() + " - Zona: " + value.getZona());
        }
        return mapa.get(Integer.parseInt(lector.readLine()));
    }
}
