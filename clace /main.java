public class main {

    public static void main(String[] args) {
        System.out.println("objeto vacio");
        Cubo cubo1 = new Cubo();
        cubo1.mostrar();
        System.out.println("--------------------");
        System.out.println("objeto con dos atributos");
        Cubo cubo2 = new Cubo("Grande", "Rojo");
        cubo2.mostrar();
        System.out.println("--------------------");
    }
}
