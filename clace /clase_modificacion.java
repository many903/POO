public class Cubo {
    double taman
    o;
    String color;
    double peso;

    public Cubo() {
    }

     public Cubo( String _tamano) {
        tamano = _tamano;
    }


    public Cubo(double _peso) {
        peso = _peso;
    }
    
    public Cubo(String _color, double _taman
    o) {
        color = _color;
        tamano = _tamano;
    }

    
    public Cubo( double _taman
    o, double _peso) {
        tamano = _tamano;
        peso = _peso;
    
    }
    
    public Cubo(double _taman
    o, String _color, double _peso) {
        tamano = _tamano;
        color = _color;
        peso = _peso;
    }

    public void mostrar() {
        System.out.println("Tamaño: " + taman
        o);
        System.out.println("Color: " + color);
        System.out.println("Peso: " + peso);    
    }

    public double getTaman
    o() {
        return tamano;
    }

    public void setTaman
    o(double taman
    o) {
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
