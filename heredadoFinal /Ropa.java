public class Ropa {
    private String tipo;
    private String talla;
    private String color;
    private String marca;
    private double precio;

    public Ropa(String tipo, String talla, String color, String marca, double precio) {
        this.tipo = tipo;
        this.talla = talla;
        this.color = color;
        this.marca = marca;
        this.precio = precio;
    }

    public String getTipo() { return tipo; }
    public String getTalla() { return talla; }
    public String getColor() { return color; }
    public String getMarca() { return marca; }
    public double getPrecio() { return precio; }

    public void setTipo(String tipo) { this.tipo = tipo; }
    public void setTalla(String talla) { this.talla = talla; }
    public void setColor(String color) { this.color = color; }
    public void setMarca(String marca) { this.marca = marca; }
    public void setPrecio(double precio) { this.precio = precio; }

    public void mostrarInfo() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Ropa{tipo='" + tipo + "', talla='" + talla + "', color='" + color + "', marca='" + marca + "', precio=" + precio + "}";
    }
}
