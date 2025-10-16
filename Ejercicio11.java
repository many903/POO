/**
 * Autor: Manuel Enrique Garcia Neve 
 * matricula: 2193077979
 * Fecha: 15/10/2025
 * Descripción: Programa combinado con ambos escenarios de decisiones anidadas
 */

 import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Ejercicio 11: Descuento por Edad ---");
        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        if (edad < 12 || edad > 65) {
            System.out.println("Tienes derecho a un descuento del 10%.");
        } else {
            System.out.println("No tienes derecho a descuento.");
        }
        scanner.close();
    }
}