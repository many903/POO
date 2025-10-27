public class Cubo {
    double tamano;
    String color;
    double peso;

    public Cubo() {
    }

     public Cubo( String _tamano) {
        tamano = _tamano;
    }


    public Cubo( double _peso) {
        peso = _peso;
    }
    
    public Cubo(String _color, double _tamano) {
        color = _color;
        tamano = _tamano;
    }

    
    public Cubo( double _tamano, double _peso) {
        tamano = _tamano;
        peso = _peso;
    
    }
    
    public Cubo(double _tamano, String _color, double _peso) {
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
