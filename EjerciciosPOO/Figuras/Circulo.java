
/**
 * Clase Circulo
 */
public class Circulo extends Forma {

    private double radio;

    public Circulo(double radio) {
        super("Círculo");
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    protected void dibujar() {
        System.out.println("Dibujando un círculo de radio " + radio);
    }
}
