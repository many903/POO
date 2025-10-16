import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Ejercicio 5: Calculadora Simple ---");
        System.out.print("Ingresa el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingresa el segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.print("Elige una operación (+, -, *, /): ");
        char operacion = scanner.next().charAt(0);

        double resultado = 0;
        boolean operacionValida = true;

        if (operacion == '+') {
            resultado = num1 + num2;
        } else if (operacion == '-') {
            resultado = num1 - num2;
        } else if (operacion == '*') {
            resultado = num1 * num2;
        } else if (operacion == '/') {
            if (num2 != 0) {
                resultado = num1 / num2;
            } else {
                System.out.println("Error: No se puede dividir entre cero.");
                operacionValida = false;
            }
        } else {
            System.out.println("Error: Operación no válida.");
            operacionValida = false;
        }

        if (operacionValida) {
            System.out.println("El resultado es: " + resultado);
        }
        scanner.close();
    }
}