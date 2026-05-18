import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Maquinaexpendedora {

    public static void main(String[] args) throws IOException {
        do {
            maquinaexpendedora();
        } while (eleccionMaquina() !=0);
    }

    public static void maquinaexpendedora () {
        Scanner leer = new Scanner(System.in);
        final double REFRESCO = 1.25, SÁNDWITCH = 1.50, GALLETAS = 2.50, CHOCOLATE = 2.30;
        double monedas = 0.0, ingreso = 0.0, producto = 0.0, resta = 0.0;

        switch(eleccionMaquina()) {
// --------- --------- --------- --------- --------- --------- --------- --------- --------- ---------

            case 1:
                System.out.println("Ha escogido un Sándwich");
                producto = SÁNDWITCH;
                do {
                    System.out.println("Introduzca monedas (Llevas: " + monedas + " €)");
                    try {
                        ingreso = leer.nextDouble();
                        if (ingreso < 0) {
                            System.err.println("Moneda no válida");
                            continue;
                        }
                        monedas += ingreso;
                    } catch (InputMismatchException a) {
                        System.err.println("Moneda no válida, por favor, introduzca una moneda válida");
                        leer.nextLine();
                    }
                    resta = producto - monedas;
                    if (resta > 0) System.out.println("Ha ingresado -> " + ingreso + " €, le faltan " + resta + " €");
                } while (monedas < producto);
                System.out.println("Producto entregado. Su cambio: " + (monedas - producto) + " €");
                break;
// ---------  ---------  ---------  ---------  ---------  ---------  ---------  ---------  ---------  ---------
            case 2:

                System.out.println("Ha escogido GALLETAS");
                producto = GALLETAS;
                do {
                    System.out.println("Introduzca monedas (Llevas: " + monedas + " €)");
                    try {
                        ingreso = leer.nextDouble();
                        if (ingreso < 0) {

                            System.err.println("Moneda no válida");
                            continue;
                        }
                        monedas += ingreso;
                    } catch (InputMismatchException a) {
                        System.err.println("Moneda no válida");
                        leer.nextLine();
                    }
                    resta = producto - monedas;
                    if (resta > 0) System.out.println("Ha ingresado -> " + ingreso + " €, le faltan " + resta + " €");

                } while (monedas < producto);
                System.out.println("Producto entregado. Su cambio: " + (monedas - producto) + " €");
                break;
// --------- --------- --------- --------- --------- --------- --------- --------- --------- ---------
            case 3:
                System.out.println("Ha escogido un CHOCOLATE");
                producto = CHOCOLATE;
                do {
                    System.out.println("Introduzca monedas (Llevas: " + monedas + " €)");
                    try {
                        ingreso = leer.nextDouble();
                        if (ingreso < 0) {
                            System.err.println("Moneda no válida");
                            continue;
                        }
                        monedas += ingreso;
                    } catch (InputMismatchException a) {
                        System.err.println("Moneda no válida");
                        leer.nextLine();
                    }
                    resta = producto - monedas;

                    if (resta > 0) System.out.println("Ha ingresado -> " + ingreso + " €, le faltan " + resta + " €");
                } while (monedas < producto);
                System.out.println("Producto entregado. Su cambio: " + (monedas - producto) + " €");
                break;
// --------- --------- --------- --------- --------- --------- --------- --------- --------- ---------
            case 4:
                System.out.println("Ha escogido un REFRESCO");
                producto = REFRESCO;
                do {
                    System.out.println("Introduzca monedas (Llevas: " + monedas + " €)");
                    try {
                        ingreso = leer.nextDouble();
                        if (ingreso < 0) {
                            System.err.println("Moneda no válida");
                            continue;
                        }
                        monedas += ingreso;
                    } catch (InputMismatchException a) {
                        System.err.println("Moneda no válida");
                        leer.nextLine();
                    }
                    resta = producto - monedas;
                    if (resta > 0) System.out.println("Ha ingresado -> " + ingreso + " €, le faltan " + resta + " €");
                } while (monedas < producto);
                System.out.println("Producto entregado. Su cambio: " + (monedas - producto) + " €");
                break;

            default:
                System.err.println("Introduzca un número correcto");
                break;
        }
    }

    public static int eleccionMaquina () {
        Scanner leer = new Scanner(System.in);
        int eleccion = 0;
        do {
            try {
                System.out.println("Escoja el producto que quiere comprar");
                System.out.println("================");
                System.out.println("1. SÁNDWITCH 1.50 €");
                System.out.println("2. GALLETAS  2.50 €");
                System.out.println("3. CHOCOLATE 2.30 €");
                System.out.println("4. REFRESCO  1.25 €");
                System.out.println("================");
                eleccion = leer.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("Debe introducir una opción disponible");
                leer.nextLine();
            }
        } while (eleccion < 1 || eleccion > 4);
        return eleccion;
    }
}