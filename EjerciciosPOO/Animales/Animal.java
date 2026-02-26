abstract public class Animal {

  protected String nombre;

  public void setNombre(String newVar) {
    this.nombre = newVar;
  }

  public String getNombre() {
    return nombre;
  }

  public void Animal(String nombre) {
    this.nombre = nombre;
  }

  public abstract void mover();
}
