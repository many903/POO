import java.util.Scanner;

/**
 * Autor: Manuel Enrique Garcia Neve
 * Fecha: 24/10/2025
 * Descripción: Programa principal para demostrar el uso de las clases Persona, Producto y Empleado
 * con sus métodos get y set. El usuario ingresa todos los datos.
 */
public class MainGetSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== DEMOSTRACIÓN MÉTODOS GET Y SET ===");
        System.out.println("Autor: Manuel Enrique Garcia Neve");
        System.out.println("Este programa demuestra el uso de métodos get y set en Java");
        System.out.println("El usuario ingresa todos los datos para cada clase");
        System.out.println("=======================================\n");

        int opcion;
        do {
            System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1. Gestionar Personas");
            System.out.println("2. Gestionar Productos");
            System.out.println("3. Gestionar Empleados");
            System.out.println("4. Salir");
            System.out.print("Elige una opción (1-4): ");

            while (!scanner.hasNextInt()) {
                System.out.print("Entrada no válida. Ingresa un número (1-4): ");
                scanner.next();
            }
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    gestionarPersonas(scanner);
                    break;
                case 2:
                    gestionarProductos(scanner);
                    break;
                case 3:
                    gestionarEmpleados(scanner);
                    break;
                case 4:
                    System.out.println("\n¡Gracias por usar el sistema!");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }

        } while (opcion != 4);

        scanner.close();
    }

    // Método auxiliar para leer respuestas "si"/"no"
    private static boolean leerSiNo(Scanner scanner, String mensaje) {
        String respuesta;
        do {
            System.out.print(mensaje);
            respuesta = scanner.nextLine().trim().toLowerCase();
            if (!respuesta.equals("si") && !respuesta.equals("no")) {
                System.out.println("Por favor responde 'si' o 'no'.");
            }
        } while (!respuesta.equals("si") && !respuesta.equals("no"));
        return respuesta.equals("si");
    }

    // ===== GESTIÓN DE PERSONAS =====
    public static void gestionarPersonas(Scanner scanner) {
        System.out.println("\n--- GESTIÓN DE PERSONAS ---");

        System.out.print("Ingresa el nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingresa el apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("Ingresa el correo: ");
        String correo = scanner.nextLine();

        // Crear objeto Persona con datos del usuario
        Persona persona = new Persona(nombre, apellido, correo);

        System.out.println("\n--- PERSONA CREADA ---");
        persona.mostrarDatos();

        System.out.println("\n--- USANDO MÉTODOS GET ---");
        System.out.println("Nombre (getNombre): " + persona.getNombre());
        System.out.println("Apellido (getApellido): " + persona.getApellido());
        System.out.println("Correo (getCorreo): " + persona.getCorreo());

        System.out.println("\n--- MODIFICANDO CON MÉTODOS SET ---");
        if (leerSiNo(scanner, "¿Quieres modificar el nombre? (si/no): ")) {
            System.out.print("Nuevo nombre: ");
            persona.setNombre(scanner.nextLine());
        }

        if (leerSiNo(scanner, "¿Quieres modificar el apellido? (si/no): ")) {
            System.out.print("Nuevo apellido: ");
            persona.setApellido(scanner.nextLine());
        }

        if (leerSiNo(scanner, "¿Quieres modificar el correo? (si/no): ")) {
            System.out.print("Nuevo correo: ");
            persona.setCorreo(scanner.nextLine());
        }

        System.out.println("\n--- DATOS FINALES ---");
        persona.mostrarDatos();
    }

    // ===== GESTIÓN DE PRODUCTOS =====
    public static void gestionarProductos(Scanner scanner) {
        System.out.println("\n--- GESTIÓN DE PRODUCTOS ---");

        System.out.print("Ingresa el nombre del producto: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingresa el precio del producto: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Precio no válido. Ingresa un número: ");
            scanner.next();
        }
        double precio = scanner.nextDouble();

        System.out.print("Ingresa la cantidad en inventario: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Cantidad no válida. Ingresa un número entero: ");
            scanner.next();
        }
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        Producto producto = new Producto(nombre, precio, cantidad);

        System.out.println("\n--- PRODUCTO CREADO ---");
        producto.mostrarInformacion();

        System.out.println("\n--- USANDO MÉTODOS GET ---");
        System.out.println("Nombre (getNombre): " + producto.getNombre());
        System.out.println("Precio (getPrecio): $" + producto.getPrecio());
        System.out.println("Cantidad (getCantidad): " + producto.getCantidad());
        System.out.println("Valor total: $" + producto.calcularValorTotal());

        System.out.println("\n--- MODIFICANDO CON MÉTODOS SET ---");
        if (leerSiNo(scanner, "¿Quieres modificar el nombre? (si/no): ")) {
            System.out.print("Nuevo nombre: ");
            producto.setNombre(scanner.nextLine());
        }

        if (leerSiNo(scanner, "¿Quieres modificar el precio? (si/no): ")) {
            System.out.print("Nuevo precio: ");
            while (!scanner.hasNextDouble()) {
                System.out.print("Precio no válido. Ingresa un número: ");
                scanner.next();
            }
            producto.setPrecio(scanner.nextDouble());
            scanner.nextLine();
        }

        if (leerSiNo(scanner, "¿Quieres modificar la cantidad? (si/no): ")) {
            System.out.print("Nueva cantidad: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Cantidad no válida. Ingresa un número entero: ");
                scanner.next();
            }
            producto.setCantidad(scanner.nextInt());
            scanner.nextLine();
        }

        System.out.println("\n--- DATOS FINALES ---");
        producto.mostrarInformacion();
    }

    // ===== GESTIÓN DE EMPLEADOS =====
    public static void gestionarEmpleados(Scanner scanner) {
        System.out.println("\n--- GESTIÓN DE EMPLEADOS ---");

        System.out.print("Ingresa el nombre del empleado: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingresa el salario mensual: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Salario no válido. Ingresa un número: ");
            scanner.next();
        }
        double salario = scanner.nextDouble();

        scanner.nextLine(); // Limpiar buffer antes de leer booleano como texto
        boolean tiempoCompleto = leerSiNo(scanner, "¿Es tiempo completo? (si/no): ");

        Empleado empleado = new Empleado(nombre, salario, tiempoCompleto);

        System.out.println("\n--- EMPLEADO CREADO ---");
        empleado.mostrarInformacion();

        System.out.println("\n--- USANDO MÉTODOS GET ---");
        System.out.println("Nombre (getNombre): " + empleado.getNombre());
        System.out.println("Salario (getSalario): $" + empleado.getSalario());
        System.out.println("Tiempo completo (isTiempoCompleto): " + empleado.isTiempoCompleto());
        System.out.println("Salario anual: $" + empleado.calcularSalarioAnual());

        System.out.println("\n--- MODIFICANDO CON MÉTODOS SET ---");
        if (leerSiNo(scanner, "¿Quieres modificar el nombre? (si/no): ")) {
            System.out.print("Nuevo nombre: ");
            empleado.setNombre(scanner.nextLine());
        }

        if (leerSiNo(scanner, "¿Quieres modificar el salario? (si/no): ")) {
            System.out.print("Nuevo salario: ");
            while (!scanner.hasNextDouble()) {
                System.out.print("Salario no válido. Ingresa un número: ");
                scanner.next();
            }
            empleado.setSalario(scanner.nextDouble());
            scanner.nextLine();
        }

        if (leerSiNo(scanner, "¿Quieres modificar el tipo de contrato? (si/no): ")) {
            boolean nuevoTiempoCompleto = leerSiNo(scanner, "¿Es tiempo completo? (si/no): ");
            empleado.setTiempoCompleto(nuevoTiempoCompleto);
        }

        System.out.println("\n--- DATOS FINALES ---");
        empleado.mostrarInformacion();
    }
}