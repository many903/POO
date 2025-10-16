/**
 * Autor: Manuel Enrique Garcia Neve 
 * matricula: 2193077979
 * Fecha: 15/10/2025
 * Descripción: Programa combinado con ambos escenarios de decisiones anidadas
 */

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Ejercicio 9: Medio de Transporte ---");
        System.out.print("Ingresa la distancia a recorrer (km): ");
        double distancia = scanner.nextDouble();

        if (distancia <= 1) {
            System.out.println("Puedes caminar.");
        } else if (distancia <= 5) {
            System.out.println("Puedes ir en bicicleta.");
        } else {
            System.out.println("Puedes ir en coche.");
        }
        scanner.close();
    }
}