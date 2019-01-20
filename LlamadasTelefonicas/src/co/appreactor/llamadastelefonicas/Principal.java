package co.appreactor.llamadastelefonicas;

/**
 * Importacion de la clase Teclado incluida en la libreria SuperTeclado.jar
 */
import co.appreactor.superteclado.Teclado;

/**
 * Script que representa el requerimiento de llamadas telefonicas y su
 * respectiva generacion de costo por llamada
 *
 * @author Manuel Ernesto Bonilla Muñoz
 * @version 1.0
 * @since 2018-03-03
 */
public class Principal {

    /**
     * Constantes para definir los valores de la llamada por minuto
     */
    private final double INICIAL_INTERNACIONAL = 7.0;
    private final double INICIAL_NACIONAL = 1.2;
    private final double LOCAL = 0.6;

    /**
     * Constantes para definir el valor adicional por minuto de las llamadas
     */
    private final double ADICIONAL_INTERNACIONAL = 3.03;
    private final double ADICIONAL_NACIONAL = 0.84;

    /**
     * contador para las llamadas de tipo local
     */
    private int contadorLocales;

    /**
     * Variable que representa el tipo de llamada digitado por el usuario
     */
    private char tipo;

    /**
     * Variable que representa la duracion de la llamada (en Minutos)
     */
    private int duracion;

    /**
     * Variable que representa el valor final de la llamada despues del
     * respectivo calculo del costo
     */
    private double valorLlamada;

    /**
     * Metodo main -> metodo directivo que es lanzado a la hora de ejecutar una
     * aplicacion java dentro del entorno JVM (Java Virtual Machine)
     *
     * @param args
     */
    public static void main(String[] args) {
        /**
         * Creacion del objeto de la clase principal y su inmediata llamada del
         * metodo iniciar
         */
        new Principal().iniciar();
    }

    /**
     * Metodo base de la logica del negocio, contiene el ciclo infinito que
     * realiza de manera repetitiva la tarea de elegir un tipo de llamada
     * utilizando el metodo <code>menuPrincipal()</code> y la respectiva lectura
     * de la duracion de la llamada (en minutos)
     */
    private void iniciar() {

        // impresion en pantalla de mensaje de bienvenida
        System.out.println("Bienvenido al poderosisimo Facturador de minutos");

        /**
         * creacion del ciclo mientras que para las siguientes condiciones. 1.
         * El tipo de llamada del usuario debe ser diferente a X mayuscula o x
         * minuscula 2. La duracion de la llamada debe ser mayor a -1 (minuto)
         */
        while ((tipo != 'X' || tipo != 'x') && duracion > -1) {

            /**
             * Invocacion del metodo <code>menuPrincipal</code>
             */
            tipo = menuPrincipal();

            /**
             * impresion en pantalla de mensaje de solicitud para digitar la
             * cantidad de minutos de la llamada
             */
            System.out.println("Ingrese la duración en minutos de la llamada");

            /**
             * Escribir en la consola la duracion en minutos de la llamada
             * usando la libreria del SuperTeclado -- Para los que no tienen esa
             * libreria deben usar el <code>Scanner</code>
             */
            duracion = Teclado.leerNumero();

            /**
             * Estructura switch (Segun que) que evaluara los valores de la
             * variable tipo que almacena el posible tipo de llamada digitado
             * por el usuario
             */
            switch (tipo) {

                /**
                 * evaluacion del caso para la llamada internacional
                 */
                case 'I':
                case 'i':

                    // Determinar si la cantidad de minutos supera el valor de 3
                    if (duracion > 3) {

                        /**
                         * calcular el valor de la llamada con la siguiente
                         * formula y almacenar su valor en la variable
                         * valorLlamada
                         */
                        valorLlamada = INICIAL_INTERNACIONAL + ((duracion - 3) * ADICIONAL_INTERNACIONAL);

                        /**
                         * romper con la estructura del switch, pues ya se tiene
                         * el valor del costo de la Llamada y no se requiere de
                         * mas procesamiento.
                         */
                        break;
                    }

                    /**
                     * Si la duracion es menor o igual a 3 solo se agrega al
                     * valor de la llamada el valor inicial de una llamada
                     * internacional
                     */
                    valorLlamada = INICIAL_INTERNACIONAL;

                    /**
                     * romper con la estructura del switch, pues ya se tiene el
                     * valor del costo de la Llamada y no se requiere de mas
                     * procesamiento.
                     */
                    break;

                /**
                 * evaluacion del caso para la llamada nacional
                 */
                case 'N':
                case 'n':

                    // Determinar si la cantidad de minutos supera el valor de 3
                    if (duracion > 3) {

                        /**
                         * calcular el valor de la llamada con la siguiente
                         * formula y almacenar su valor en la variable
                         * valorLlamada
                         */
                        valorLlamada = INICIAL_NACIONAL + ((duracion - 3) * ADICIONAL_NACIONAL);

                        /**
                         * romper con la estructura del switch, pues ya se tiene
                         * el valor del costo de la Llamada y no se requiere de
                         * mas procesamiento.
                         */
                        break;
                    }

                    /**
                     * Si la duracion es menor o igual a 3 solo se agrega al
                     * valor de la llamada el valor inicial de una llamada
                     * nacional
                     */
                    valorLlamada = INICIAL_NACIONAL;

                    /**
                     * romper con la estructura del switch, pues ya se tiene el
                     * valor del costo de la Llamada y no se requiere de mas
                     * procesamiento.
                     */
                    break;

                /**
                 * evaluacion del caso para la llamada local
                 */
                case 'L':
                case 'l':

                    /**
                     * Aumentar sin importar que el conteo de llamadas locales
                     * usando un autoincremento en la variable
                     * <code>contadorLocales</code>
                     */
                    contadorLocales++;

                    /**
                     * Validar siempre cuando el contador sea mayor a 5 para
                     * aplicar el cobro del valor de una llamada local
                     */
                    if (contadorLocales > 5) {

                        /**
                         * Aplicar el valor de una llamada local a la variable
                         * que almacena el costo de la llamada
                         */
                        valorLlamada = LOCAL;
                    }

                    /**
                     * romper con la estructura del switch, pues ya se tiene el
                     * valor del costo de la Llamada y no se requiere de mas
                     * procesamiento.
                     */
                    break;

                /**
                 * evaluacion del caso para la opcion x (salir del programa)
                 */
                case 'X':
                case 'x':

                    // Impresion de pantalla para mensaje de despedida
                    System.out.println("Gracias por usar este poderosisimo software, Adios");

                    /**
                     * aplicar el valor -1 a la duracion en minutos para romper
                     * con el ciclo while (mientras que)
                     */
                    duracion = -1;

                    /**
                     * romper con la estructura del switch, pues ya se tiene el
                     * valor del costo de la Llamada y no se requiere de mas
                     * procesamiento.
                     */
                    break;
                default:
                    break;
            }
            imprimirCostoLlamada(tipo, valorLlamada);
        }
    }

    /**
     * Representa el menu de la aplicacion, cada opcion que el usuario puede
     * digitar y retorna la opcion escrita por el usuario
     *
     * @return El caracter digitado por el usuario
     */
    private char menuPrincipal() {
        /**
         * Impresion de pantalla por cada opcion disponible
         */
        System.out.println("I. Llamada Internacional");
        System.out.println("N. Llamada Nacional");
        System.out.println("L. Llamada Local");
        System.out.println("X. Salir");
        /**
         * Retorno del valor digitado por el usuario, usando la libreria del
         * SuperTeclado -- Para los que no tienen esa libreria deben usar el
         * <code>Scanner</code>
         */
        return Teclado.leerCaracter();
    }

    /**
     * Genera una impresion de pantalla con el valor total del costo de la
     * llamada realizada.
     *
     * @param tipo El tipo de llamada que se realizo,
     * @param valorLlamada
     */
    private void imprimirCostoLlamada(char tipo, double valorLlamada) {
        /**
         * Al usuario no se le debe decir el tipo de llamada como "I", "N", "L"
         * se debe usar lenguaje natural, en la siguiente linea se define un
         * operador ternario para determinar que palabra se debe imprimir en el
         * mensaje de factura para el respectivo tipo de llamada
         *
         * Para mas Información sobre operador ternario ir al siguiente link
         * http://lineadecodigo.com/java/el-operador-ternario-en-java/
         */
        String llamada = (tipo == 'I' || tipo == 'i') ? "Internacional" : (tipo == 'N' || tipo == 'n') ? "Nacional" : (tipo == 'L' || tipo == 'l') ? "Local" : "";

        // separador de linea para la factura
        System.out.println("=============================================");

        /**
         * impresion del tipo de llamada y el valor de la llamada sin usar los
         * valores decimales en el resultado para eliminar los decimales de una
         * variable <code>double</code> se debe usar el metodo
         * <code>Math.floor(double x)</code> eso dejara el valor decimal en .0
         */
        System.out.println("= Llamada " + llamada + " | Costo: " + Math.floor(valorLlamada));

        // separador de linea para la factura
        System.out.println("=============================================");
    }

}
