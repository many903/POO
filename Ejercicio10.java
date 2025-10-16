import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Ejercicio 10: Actividad Según Temperatura ---");
        System.out.print("Ingresa la temperatura (°C): ");
        double temperatura = scanner.nextDouble();

        if (temperatura < 10) {
            System.out.println("Quédate en casa y lee un libro.");
        } else if (temperatura <= 25) {
            System.out.println("Da un paseo.");
        } else {
            System.out.println("Ve a la playa, te lo mereces!!");
        }
        scanner.close();
    }
}