/**
 * Autor: [Tu Nombre]
 * Fecha: [Fecha Actual]
 * Descripción: Clase Producto que representa un producto con nombre, precio y cantidad.
 * Incluye métodos get y set para todos los atributos.
 */
public class Producto {
    // Atributos privados
    private String nombre;
    private double precio;
    private int cantidad;
    
    // Constructor que inicializa todos los atributos
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    
    // Métodos GET
    public String getNombre() {
        return nombre;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public int getCantidad() {
        return cantidad;
    }
    
    // Métodos SET
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    // Método para calcular el valor total del inventario
    public double calcularValorTotal() {
        return precio * cantidad;
    }
    
    // Método para mostrar información del producto
    public void mostrarInformacion() {
        System.out.println("=== INFORMACIÓN DEL PRODUCTO ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Valor total: $" + calcularValorTotal());
        System.out.println("================================");
    }
}