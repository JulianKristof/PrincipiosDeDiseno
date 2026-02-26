public class Perro extends Animal {

  public void Perro(String nombre) {
    this.nombre = nombre;
  }

  @Override
  public void mover() {
    System.out.println(nombre + " se mueve corriendo");
  }

  public void hacerSonido() {
    System.out.println(nombre + " dice: Guau");
  }
}
