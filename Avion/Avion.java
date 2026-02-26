public class Avion {

  public String aerolinea;
  public String capacidad;
  protected String velocidad;
  private String cantidadMotores;
  private String modelo;
  private boolean enVuelo;

  public void setAerolinea(String newVar) {
    this.aerolinea = newVar;
  }

  public String getAerolinea() {
    return aerolinea;
  }

  public void setCapacidad(String newVar) {
    this.capacidad = newVar;
  }

  public String getCapacidad() {
    return capacidad;
  }

  public void setVelocidad(String newVar) {
    this.velocidad = newVar;
  }

  public String getVelocidad() {
    return velocidad;
  }

  public void setCantidadMotores(String newVar) {
    this.cantidadMotores = newVar;
  }

  public String getCantidadMotores() {
    return cantidadMotores;
  }

  public void Avion(String aerolinea, String cantidadMotores, String velocidad, String capacidad) {
    this.aerolinea = aerolinea;
    this.cantidadMotores = cantidadMotores;
    this.velocidad = velocidad;
    this.capacidad = capacidad;
    this.enVuelo = false;
  }

  public void acelerar() {
    System.out.println("El avion esta acelerando a " + velocidad);
  }

  public void elevarse() {
    enVuelo = true;
    System.out.println("El avion se ha elevado y esta en vuelo");
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public String getModelo() {
    return modelo;
  }
}
