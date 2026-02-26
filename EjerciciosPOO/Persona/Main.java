
/**
 * Class Main
 */
public class Main {

    public static void main(String[] args) {

        Persona p1 = new Persona("Julian", 19);

        p1.saludar();

        System.out.println("Nombre: " + p1.getNombre());
        System.out.println("Edad: " + p1.getEdad());
    }
}
