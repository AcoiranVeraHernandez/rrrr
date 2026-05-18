import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Parking {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String matricula ="";
    // Con esto le doy otro nombre al método para llamarlo más fácil
     String[] aparcamiento = pedirPlazas();

     //Aquí llamo "pedirPlazas" a "mostrarPlazas" pero con otro nombre
        mostrarPlazas(aparcamiento);
        System.out.print("Ingrese una matrícula ");
        matricula = sc.nextLine();
     //-----------------------------------------------
        aparcarCoche(aparcamiento, matricula);
     //-----------------------------------------------
       sacarCoche(aparcamiento, matricula);
    }



    public static String[] pedirPlazas() {
        Scanner parking = new Scanner(System.in);
        String plazas = ("");
        int nullplas = 0;
        boolean verdadero = false;
        do {
            try {
                imprim("Introduzca el número de plazas: ");
                plazas = parking.nextLine();
                nullplas = Integer.parseInt(plazas);
                verdadero = true;
            } catch (NumberFormatException e) {
                imprim("Error al introducir los datos");
                parking.nextLine();
            }
        } while (!verdadero);
        imprim("Ha ingresado -> " + plazas + " plazas");

        String[] PLZ = new String[nullplas];
        PLZ[3] = "6767-AS67";
        return PLZ;
    }

    /*
    4) Crear un metodo llamado mostrarPlazas que reciba el array por parámetro, lo recorra con un
    bucle e imprima si cada plaza está "Libre" o muestre la matrícula del coche aparcado
     */
    public static void mostrarPlazas(String[] PLZ) {
        imprim("=============================================");
        imprim("Plazas actuales: ");
        for (int i = 0; i < PLZ.length; i++) {
            imprim("Plazas " + i + " -> " + PLZ[i]);
        }
        imprim("=============================================");
    }

    public static boolean aparcarCoche(String[] aparcamiento, String matricula) {
        Scanner parking = new Scanner(System.in);
        for (int i = 0; i <aparcamiento.length; i++) {
            if (aparcamiento[i] == null) {
                 aparcamiento[i]= matricula;
                imprim("Plazas actualizadas");
                imprim("=============================================");
                mostrarPlazas(aparcamiento);
                return true;
            } else {
                imprim("=============================================");
                imprim("Ya se ocuparon todos los puestos del parking, vuelva más tarde");
                imprim("=============================================");
            }
        }
        return false;
    }


        public static void sacarCoche (String [] aparcamiento, String matricula) {
            Scanner parking = new Scanner(System.in);
            String matricula2 = aparcamiento[0];
            boolean coche = false;
            imprim("Ingresa la matricula para eliminar");
             matricula2 = parking.nextLine();
            for (int i = 0; i < aparcamiento.length; i++) {
                if (aparcamiento[i] != null) {
                    if (aparcamiento[i].equals(matricula2)) {
                        imprim("=============================================");
                        imprim("Sacando " + aparcamiento + " -> " + matricula2 + "... ");
                        aparcamiento[i] = null;
                        imprim("Se ha sacado el coche");
                        imprim("=============================================");
                        mostrarPlazas(aparcamiento);
                        coche = true;
                    }
                }
            }
            if (!coche) {
                System.out.println("No hay coche");
            }

        }
        public static void imprim (String message){
            System.out.println(message);
        }
    }

