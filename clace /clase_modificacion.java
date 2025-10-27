public class Cubo {
    double tamao;
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
    
    public Cubo(String _color, double _tamao) {
        color = _color;
        tamano = _tamano;
    }

    
    public Cubo( double _tamao, double _peso) {
        tamano = _tamano;
        peso = _peso;
    
    }
    
    public Cubo(double _tamao, String _color, double _peso) {
        tamano = _tamano;
        color = _color;
        peso = _peso;
    }

    public double getTamao() {
        return tamano;
    }

    public void setTamao(double tamao) {
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
