public class Cubo {
    double tamaño;
    String color;
    double peso;

    public Cubo() {
    }

     public Cubo( String tamaño) {

    }

    

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
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

public Cubo(double tamaño, String color, double peso) {
        this.tamaño = tamaño;
        this.color = color;
        this.peso = peso;
    }