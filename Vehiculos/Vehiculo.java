public class Vehiculo {

  protected int precioDia;
  protected String marcaModelo;
  protected int numLlantas;
  protected boolean motorEncendido;

  public Vehiculo() { }

  public void setPrecioDia(int newVar) {
    precioDia = newVar;
  }

  public int getPrecioDia() {
    return precioDia;
  }

  public void setMarcaModelo(String newVar) {
    marcaModelo = newVar;
  }

  public String getMarcaModelo() {
    return marcaModelo;
  }

  public void setNumLlantas(int newVar) {
    numLlantas = newVar;
  }

  public int getNumLlantas() {
    return numLlantas;
  }

  public void mostrarCaracteristicas() {
    System.out.println("Marca/Modelo: " + marcaModelo);
    System.out.println("Precio por dia: " + precioDia);
    System.out.println("Numero de llantas: " + numLlantas);
  }

  public void encenderMotor() {
    motorEncendido = true;
    System.out.println("Motor encendido");
  }

  public void apagarMotor() {
    motorEncendido = false;
    System.out.println("Motor apagado");
  }

  public void funciona() {
    if (motorEncendido) {
      System.out.println("El vehiculo esta en funcionamiento");
    } else {
      System.out.println("El vehiculo esta apagado");
    }
  }
}
