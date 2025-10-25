package objetos_viernes.persona;

/**
 * Clase de prueba para Persona
 */
public class MainPersona {
    public static void main(String[] args) {
        // Crear instancia
        Persona p = new Persona("Manuel", 20, "Masculino");

        // Mostrar datos iniciales
        System.out.println("Datos iniciales: " + p);

        // Usar setters
        p.setNombre("María");
        p.setEdad(25);
        p.setGenero("Femenino");

        // Mostrar datos modificados y valores individuales
        System.out.println("Datos modificados: " + p);
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Edad: " + p.getEdad());
        System.out.println("Género: " + p.getGenero());
    }
}