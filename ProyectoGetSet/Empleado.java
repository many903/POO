/**
 * Autor: [Tu Nombre]
 * Fecha: [Fecha Actual]
 * Descripción: Clase Empleado que representa a un empleado con nombre, salario y tiempo completo.
 * Incluye métodos get y set para todos los atributos.
 */
public class Empleado {
    // Atributos privados
    private String nombre;
    private double salario;
    private boolean tiempoCompleto;
    
    // Constructor que inicializa todos los atributos
    public Empleado(String nombre, double salario, boolean tiempoCompleto) {
        this.nombre = nombre;
        this.salario = salario;
        this.tiempoCompleto = tiempoCompleto;
    }
    
    // Métodos GET
    public String getNombre() {
        return nombre;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public boolean isTiempoCompleto() {
        return tiempoCompleto;
    }
    
    // Métodos SET
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void setTiempoCompleto(boolean tiempoCompleto) {
        this.tiempoCompleto = tiempoCompleto;
    }
    
    // Método para calcular salario anual
    public double calcularSalarioAnual() {
        return salario * 12;
    }
    
    // Método para mostrar información del empleado
    public void mostrarInformacion() {
        System.out.println("=== INFORMACIÓN DEL EMPLEADO ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario mensual: $" + salario);
        System.out.println("Salario anual: $" + calcularSalarioAnual());
        System.out.println("Tiempo completo: " + (tiempoCompleto ? "Sí" : "No"));
        System.out.println("Tipo de contrato: " + (tiempoCompleto ? "Tiempo Completo" : "Medio Tiempo"));
        System.out.println("================================");
    }
}