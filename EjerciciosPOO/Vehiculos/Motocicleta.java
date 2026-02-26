public class Motocicleta extends Vehiculo {

  private int numAsientos;

  public Motocicleta() { }

  public void setNumAsientos(int newVar) {
    numAsientos = newVar;
  }

  public int getNumAsientos() {
    return numAsientos;
  }

  public void mostrarDatos() {
    mostrarCaracteristicas();
    System.out.println("Numero de asientos: " + numAsientos);
  }

  public void pruebaDelMotor() {
    encenderMotor();
    funciona();
    apagarMotor();
  }
}
