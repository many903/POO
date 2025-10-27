/**
 * Autor: Manuel Enrique Garcia Neve 
 * matricula: 2193077979
 * Fecha: 15/10/2025
 * Descripción: Programa combinado con ambos escenarios de decisiones anidadas
 */

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Ejercicio 6: Día de la Semana ---");
        System.out.print("Ingresa un número del 1 al 7: ");
        int dia = scanner.nextInt();

        if (dia == 1) {
            System.out.println("Lunes");
        } else if (dia == 2) {
            System.out.println("Martes");
        } else if (dia == 3) {
            System.out.println("Miércoles");
        } else if (dia == 4) {
            System.out.println("Jueves");
        } else if (dia == 5) {
            System.out.println("Viernes");
            System.out.println("Listo para salir!!");
        } else if (dia == 6) {
            System.out.println("Sábado");
        } else if (dia == 7) {
            System.out.println("Domingo");
        } else {
            System.out.println("Número no válido. Debe ser entre 1 y 7.");
        }
        scanner.close();
    }
}