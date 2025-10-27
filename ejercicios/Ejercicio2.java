/**
 * Autor: Manuel Enrique Garcia Neve 
 * matricula: 2193077979
 * Fecha: 15/10/2025
 * Descripción: Programa combinado con ambos escenarios de decisiones anidadas
 */

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Ejercicio 2: Comparar Dos Números ---");
        System.out.print("Ingresa el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingresa el segundo número: ");
        double num2 = scanner.nextDouble();

        if (num1 > num2) {
            System.out.println("El número " + num1 + " es mayor que " + num2);
        } else if (num2 > num1) {
            System.out.println("El número " + num2 + " es mayor que " + num1);
        } else {
            System.out.println("Los números son iguales.");
        }
        scanner.close();
    }
}