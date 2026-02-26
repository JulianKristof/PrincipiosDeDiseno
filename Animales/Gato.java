public class Gato extends Animal {

  public void Gato(String nombre) {
    this.nombre = nombre;
  }

  @Override
  public void mover() {
    System.out.println(nombre + " se mueve caminando sigilosamente");
  }

  public void hacerSonido() {
    System.out.println(nombre + " dice: Miau");
  }
}
