public class Pelota {

  public String forma;
  public String tipo;
  protected String material;
  private String color;
  private boolean inflada;

  public void setForma(String newVar) {
    this.forma = newVar;
  }

  public String getForma() {
    return forma;
  }

  public void setTipo(String newVar) {
    this.tipo = newVar;
  }

  public String getTipo() {
    return tipo;
  }

  public void setMaterial(String newVar) {
    this.material = newVar;
  }

  public String getMaterial() {
    return material;
  }

  public void setColor(String newVar) {
    this.color = newVar;
  }

  public String getColor() {
    return color;
  }

  public void Pelota(String forma, String color, String material, String tipo) {
    this.forma = forma;
    this.color = color;
    this.material = material;
    this.tipo = tipo;
    this.inflada = true;
  }

  public void botar() {
    if (inflada) {
      System.out.println("La pelota esta botando");
    } else {
      System.out.println("La pelota esta desinflada y no puede botar");
    }
  }

  public void desinflar() {
    inflada = false;
    System.out.println("La pelota se ha desinflado");
  }
}
