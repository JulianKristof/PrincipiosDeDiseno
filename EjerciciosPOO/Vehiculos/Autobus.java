public class Autobus extends Vehiculo {

  private int numAsientos;
  private int numPuertas;
  private int numVentilas;

  public Autobus() { }

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

  public void setNumVentilas(int newVar) {
    numVentilas = newVar;
  }

  public int getNumVentilas() {
    return numVentilas;
  }

  public void mostrarDatos() {
    mostrarCaracteristicas();
    System.out.println("Numero de asientos: " + numAsientos);
    System.out.println("Numero de puertas: " + numPuertas);
    System.out.println("Numero de ventilas: " + numVentilas);
  }

  public void pruebaDelMotor() {
    encenderMotor();
    funciona();
    apagarMotor();
  }
}
