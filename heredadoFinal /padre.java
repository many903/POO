public class Padre {
    private String nombrePadre;

    public Padre (String nombrePadre){
        this.nombrePadre = nombrePadre;
    }

    public String getAtributos2 (){
        return "Nombre:"+ this.nombrePadre;
    }

    public void mensaje(){
        System.out.println("Soy un metodo de la clase padre");
    }
}