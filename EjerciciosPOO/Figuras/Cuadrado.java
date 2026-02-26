
/**
 * Clase Cuadrado
 */
public class Cuadrado extends Forma {

    private double lado;

    public Cuadrado(double lado) {
        super("Cuadrado");
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }

    @Override
    protected void dibujar() {
        System.out.println("Dibujando un cuadrado de lado " + lado);
    }
}
