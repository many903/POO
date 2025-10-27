/*
    Author: Many903
    POO
    UAM-L 
*/

/* Librerías */
import java.util.Scanner;

public class EstructurasDeSeleccion {
    public static void main(String[] args) {
        // Declaración de variables
        String Nombre; // Almacena el nombre del usuario
        int contracena = 1810; // Contraseña predefinida
        int cont_Usuario; // Almacena la contraseña ingresada por el usuario
        String Usuario = "Manuel"; // Usuario predefinido
        int TP; // Almacena el valor del clima

        // Crear objeto Scanner para leer datos desde el teclado
        Scanner entradaTeclado = new Scanner(System.in);

        // Solicitar nombre al usuario
        System.out.println("Hola\nIngresa tu nombre:");
        Nombre = entradaTeclado.nextLine();

        // Solicitar contraseña al usuario
        System.out.println("\nIngresa tu Clave de Usuario:");
        cont_Usuario = entradaTeclado.nextInt();

        entradaTeclado.nextLine(); // Limpiar buffer

        // Verificar si el nombre coincide con el usuario predefinido
        if (Usuario.equals(Nombre)) {
            // Verificar si la contraseña es correcta
            if (contracena == cont_Usuario) {
                // Solicitar el clima
                System.out.println("\nIngresa el Clima (0-40):");
                TP = entradaTeclado.nextInt();

                // Evaluar el clima ingresado y mostrar mensaje correspondiente
                if (TP <= 10) {
                    System.out.println("\nEl clima es frio");
                } else if (TP >= 11 && TP <= 19) {
                    System.out.println("\nEl clima es nublado");
                } else if (TP >= 20 && TP <= 29) {
                    System.out.println("\nEl clima es caluroso");
                } else if (TP <= 30) {
                    System.out.println("\nEl clima es tropical");
                } else {
                    System.out.println("\nClima no valido");
                }
            } else {
                // Mensaje si la contraseña es incorrecta
                System.out.println("\nContraseña incorrecta");
            }
        } else {
            // Mensaje si el nombre de usuario es incorrecto
            System.out.println("\nDatos equivocados");
        }

        // Cerrar el objeto Scanner
        entradaTeclado.close();
    }
}
