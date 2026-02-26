public class Television {

  public String forma;
  public String calidadVideo;
  protected String marca;
  private String tamaño;
  private boolean encendida;

  public void setForma(String newVar) {
    forma = newVar;
  }

  public String getForma() {
    return forma;
  }

  public void setCalidadVideo(String newVar) {
    calidadVideo = newVar;
  }

  public String getCalidadVideo() {
    return calidadVideo;
  }

  public void setMarca(String newVar) {
    marca = newVar;
  }

  public String getMarca() {
    return marca;
  }

  public void setTamaño(String newVar) {
    tamaño = newVar;
  }

  public String getTamaño() {
    return tamaño;
  }

  public void Television(String forma, String tamaño, String calidadVideo, String marca) {
    this.forma = forma;
    this.tamaño = tamaño;
    this.calidadVideo = calidadVideo;
    this.marca = marca;
  }

  public void apagada() {
    encendida = false;
    System.out.println("La television esta apagada");
  }

  public void prendida() {
    encendida = true;
    System.out.println("La television esta encendida");
  }
}

