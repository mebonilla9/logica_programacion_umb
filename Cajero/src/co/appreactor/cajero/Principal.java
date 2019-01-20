package co.appreactor.cajero;

import co.appreactor.superteclado.Teclado;

public class Principal {

    public static void main(String[] args) {

        // Definir variables
        String contrasena = "";
        int saldo = 0;

        System.out.println("Bienvenido al cajero sin nombre");
        System.out.println("Tu tarjeta es de banda(b) o chip(c)?");
        char tipo = Teclado.leerCaracter();
        if (tipo == 'c') {
            System.out.println("Debes dejar tu tarjeta en el cajero mientras realizas la transaccion");

        } else {
            System.out.println("Ya puedes retirar tu tarjeta");
        }
        int opcion = menu();
        switch (opcion) {
            case 1:
                System.out.println("Tu saldo es: " + (Math.random() * 1000000 + 10000));
                break;
            case 2:
                System.out.println("");
                break;
            case 3:

                break;
            default:
                throw new AssertionError();
        }
    }

    public static int menu() {
        System.out.println("Elija una opcion");
        System.out.println("1. Consultar");
        System.out.println("2. Retirar");
        System.out.println("3. Pago en linea");
        return Teclado.leerNumero();
    }

}
