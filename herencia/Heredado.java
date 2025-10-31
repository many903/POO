pubil class Heredado extends PAdre{
    private String nombreHIjo;
    public Heredado(String nombrePadre, String nombreHIjo){
        super (nombrePadre);
        this.nombreHIjo = nombreHIjo;   
    }
    public String gatAtributo(){
        return "nombre:" + this.nombreHIjo;
    }

    public void mensaje (){
        System.out.println("Soy un metodo de la clase hija");
    }

}