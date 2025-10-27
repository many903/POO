public class Cubo {
    double tamano;
    String color;
    double peso;

    public Cubo() {
    }

    // Constructor para tamaño
    public Cubo(double _tamano) {
        this.tamano = _tamano;
    }

    // Factory para crear un Cubo a partir del peso (evita ambigüedad con otro constructor double)
    public static Cubo conPeso(double _peso) {
        Cubo c = new Cubo();
        c.peso = _peso;
        return c;
    }

    public Cubo(String _color, double _tamano) {
        this.color = _color;
        this.tamano = _tamano;
    }

    public Cubo(double _tamano, double _peso) {
        this.tamano = _tamano;
        this.peso = _peso;
    }

    public Cubo(double _tamano, String _color, double _peso) {
        this.tamano = _tamano;
        this.color = _color;
        this.peso = _peso;
    }

    public void mostrar() {
        System.out.println("Tamaño: " + tamano);
        System.out.println("Color: " + color);
        System.out.println("Peso: " + peso);
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
