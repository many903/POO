import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Ejercicio 4: Licencia de Conducir ---");
        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        if (edad >= 18) {
            System.out.println("Puedes obtener una licencia de conducir.");
        } else {
            System.out.println("No puedes obtener una licencia de conducir.");
        }
        scanner.close();
    }
}