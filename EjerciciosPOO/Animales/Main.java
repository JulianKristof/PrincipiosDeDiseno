public class Main {

  public static void main(String[] args) {

    Gato gato = new Gato();
    gato.Gato("Michi");

    System.out.println("=== GATO ===");
    gato.mover();
    gato.hacerSonido();

    System.out.println();

    Perro perro = new Perro();
    perro.Perro("Firulais");

    System.out.println("=== PERRO ===");
    perro.mover();
    perro.hacerSonido();
  }
}
