
/**
 * Clase abstracta Forma
 */
public abstract class Forma {

    protected String nombre;

    public Forma(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract double calcularArea();

    public abstract double calcularPerimetro();

    protected void dibujar() {
        System.out.println("Dibujando " + nombre);
    }
}
