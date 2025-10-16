/**
 * Autor: Manuel Enrique Garcia Neve 
 * matricula: 2193077979
 * Fecha: 15/10/2025
 * Descripción: Programa combinado con ambos escenarios de decisiones anidadas
 */

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Ejercicio 7: ¿Puedo Salir? ---");
        System.out.print("¿Está lloviendo? (sí/no): ");
        String lluvia = scanner.next().toLowerCase();
        System.out.print("¿Tienes una sombrilla? (sí/no): ");
        String sombrilla = scanner.next().toLowerCase();

        if (lluvia.equals("no") || (lluvia.equals("sí") && sombrilla.equals("sí"))) {
            System.out.println("Puedes salir.");
        } else {
            System.out.println("No debes salir.");
        }
        scanner.close();
    }
}