/**
 * Autor: Manuel Enrique Garcia Neve 
 * matricula: 2193077979
 * Fecha: 15/10/2025
 * Descripción: Programa combinado con ambos escenarios de decisiones anidadas
 */

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Ejercicio 8: Presupuesto de Compra ---");
        System.out.print("Ingresa tu presupuesto: ");
        double presupuesto = scanner.nextDouble();
        System.out.print("Ingresa el precio del artículo: ");
        double precio = scanner.nextDouble();

        if (precio <= presupuesto) {
            System.out.println("Puedes comprar el artículo.");
        } else {
            System.out.println("No puedes comprar el artículo.");
        }
        scanner.close();
    }
}