public class Automovil extends Vehiculo {

  private int numAsientos;
  private int numPuertas;

  public Automovil() { }

  public void setNumAsientos(int newVar) {
    numAsientos = newVar;
  }

  public int getNumAsientos() {
    return numAsientos;
  }

  public void setNumPuertas(int newVar) {
    numPuertas = newVar;
  }

  public int getNumPuertas() {
    return numPuertas;
  }

  public void mostrarDatos() {
    mostrarCaracteristicas();
    System.out.println("Numero de asientos: " + numAsientos);
    System.out.println("Numero de puertas: " + numPuertas);
  }

  public void pruebaDelMotor() {
    encenderMotor();
    funciona();
    apagarMotor();
  }
}
