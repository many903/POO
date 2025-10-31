public class Prenda extends Ropa {
    private String temporada;

    public Prenda(String tipo, String talla, String color, String marca, double precio, String temporada) {
        super(tipo, talla, color, marca, precio);
        this.temporada = temporada;
    }

    public String getTemporada() { return temporada; }
    public void setTemporada(String temporada) { this.temporada = temporada; }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Temporada: " + this.temporada);
    }

    public void mensaje() {
        System.out.println("Soy un metodo de la clase hija (Prenda)");
    }
}
