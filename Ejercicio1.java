import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear el objeto Scanner

        System.out.println("\n--- Ejercicio 1: Positivo, Negativo o Cero ---");
        System.out.print("Ingresa un número: ");

        if (scanner.hasNextDouble()) {
            double numero = scanner.nextDouble(); // Usar el objeto scanner correctamente

            if (numero > 0) {
                System.out.println("El numero es positivo.");
            } else if (numero < 0) {
                System.out.println("El numero es negativo.");
            } else {
                System.out.println("El numero es cero.");
            }
        } else {
            System.out.println("¡Estas loco!!, eso no es un numero!!!");
            System.out.println("Error del sistema, falla inminente X(000001)");
            scanner.next(); // Limpiar el buffer
        }

        scanner.close(); // Cerrar el scanner
    }
}
