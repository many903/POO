public class MainRopa {
    public static void main(String[] args) {
        // Objeto padre (Ropa)
        Ropa ropaPadre = new Ropa("Abrigo", "L", "Negro", "MarcaX", 79.99);

        // Objeto hijo (Prenda)
        Prenda camiseta = new Prenda("Camiseta", "M", "Blanco", "MarcaY", 19.99, "Verano");

        System.out.println("--- Información del objeto padre (Ropa) ---");
        ropaPadre.mostrarInfo();

        System.out.println();
        System.out.println("--- Información del objeto hijo (Prenda) ---");
        camiseta.mostrarInfo();
        camiseta.mensaje();
    }
}
