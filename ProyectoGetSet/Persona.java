/**
 * Autor: [Tu Nombre]
 * Fecha: [Fecha Actual]
 * Descripción: Clase Persona que representa a una persona con nombre, apellido y correo.
 * Incluye métodos get, set y mostrarDatos.
 */
public class Persona {
    // Atributos privados
    private String nombre;
    private String apellido;
    private String correo;
    
    // Constructor que inicializa todos los atributos
    public Persona(String nombre, String apellido, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
    }
    
    // Métodos GET
    public String getNombre() {
        return nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public String getCorreo() {
        return correo;
    }
    
    // Métodos SET
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    // Método para mostrar todos los datos
    public void mostrarDatos() {
        System.out.println("=== DATOS DE LA PERSONA ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Correo: " + correo);
        System.out.println("============================");
    }
}
