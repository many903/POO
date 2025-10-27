/**
 * Autor: Manuel Enrique Garcia Neve 
 * matricula: 2193077979
 * Fecha: 15/10/2025
 * Descripción: Programa combinado con ambos escenarios de decisiones anidadas
 */

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Ejercicio 3: Asignar Calificación ---");
        System.out.print("Ingresa tu nota (0-100): ");
        int nota = scanner.nextInt();

        if (nota >= 90) {
            System.out.println("Calificación: A");
        } else if (nota >= 80) {
            System.out.println("Calificación: B");
        } else if (nota >= 70) {
            System.out.println("Calificación: C");
        } else if (nota >= 60) {
            System.out.println("Calificación: D");
        } else {
            System.out.println("Calificación: F");
        }
        scanner.close();
    }
}