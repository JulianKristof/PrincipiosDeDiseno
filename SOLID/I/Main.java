public class Main {

    public static void main(String[] args) {

        // Polimorfismo con Trabajable
        Trabajable robot = new Robot();
        Trabajable humano = new Humano();

        robot.trabajar();
        humano.trabajar();

        // Comible solo aplica a Humano
        Comible persona = new Humano();
        persona.comer();
    }
}
