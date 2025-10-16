/**
 * Autor: Manuel Enrique Garcia Neve 
 * Fecha: 15/10/2025
 * Descripción: Programa combinado con ambos escenarios de decisiones anidadas
 */

import java.util.Scanner;

public class variantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== PROGRAMA COMBINADO DECISIONES ANIDADAS ===");
        System.out.println("Autor: Manuel Enrique Garcia Neve");
        System.out.println("Matrícula: [Tu Matrícula]");

        int opcion;
        do {
            System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1. Escenario 1 - Actividades según clima");
            System.out.println("2. Escenario 2 - Múltiples alternativas");
            System.out.println("0. Salir");
            System.out.print("Elige una opción (0-2): ");

            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, ingresa un número válido.");
                scanner.next();
            }
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    ejecutarEscenario1(scanner);
                    break;
                case 2:
                    ejecutarEscenario2(scanner);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 0);

        System.out.println("\n=== Fin del programa ===");
        System.out.println("¡Hasta pronto!");
        scanner.close();
    }

    public static String leerSiNo(Scanner scanner, String mensaje) {
        String respuesta;
        do {
            System.out.print(mensaje);
            respuesta = scanner.nextLine().trim().toLowerCase();
            if (!respuesta.equals("si") && !respuesta.equals("no")) {
                System.out.println("Por favor, responde solo 'si' o 'no'.");
            }
        } while (!respuesta.equals("si") && !respuesta.equals("no"));
        return respuesta;
    }

    public static void ejecutarEscenario1(Scanner scanner) {
        System.out.println("\n--- ESCENARIO 1 ---");
        String buenClima = leerSiNo(scanner, "¿Hay buen clima? (si/no): ");

        if (buenClima.equals("si")) {
            System.out.println("Saldremos a caminar.");
            String buenRestaurante = leerSiNo(scanner, "¿Encontramos un buen restaurante? (si/no): ");
            if (buenRestaurante.equals("si")) {
                System.out.println("Almorzaremos allí.");
            } else {
                System.out.println("Vamos a comer un sandwich.");
            }
        } else {
            System.out.println("Iremos al cine.");
            String hayBoletos = leerSiNo(scanner, "¿Hay boletos disponibles? (si/no): ");
            if (hayBoletos.equals("no")) {
                System.out.println("Iremos de compras al centro comercial más cercano.");
            } else {
                System.out.println("Disfrutaremos de la película en el cine.");
            }
        }
    }

    public static void ejecutarEscenario2(Scanner scanner) {
        System.out.println("\n--- ESCENARIO 2 ---");
        String buenClima = leerSiNo(scanner, "¿Hay buen clima? (si/no): ");

        if (buenClima.equals("si")) {
            System.out.println("Saldremos a caminar.");
        } else {
            String entradasCine = leerSiNo(scanner, "¿Obtenemos entradas para el cine? (si/no): ");
            if (entradasCine.equals("si")) {
                System.out.println("Iremos al cine.");
            } else {
                String mesasLibres = leerSiNo(scanner, "¿Hay mesas libres en el restaurante? (si/no): ");
                if (mesasLibres.equals("si")) {
                    System.out.println("Vamos a almorzar al restaurante.");
                } else {
                    System.out.println("Regresaremos a casa y jugaremos ajedrez.");
                }
            }
        }
    }
}
