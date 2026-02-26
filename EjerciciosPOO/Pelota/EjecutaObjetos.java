public class EjecutaObjetos {

  public static void main(String[] args) {

    Pelota pelota = new Pelota();
    pelota.Pelota("Esferica", "Rojo", "Cuero", "Futbol");

    System.out.println("=== PELOTA ===");
    System.out.println("Forma: " + pelota.getForma());
    System.out.println("Color: " + pelota.getColor());
    System.out.println("Material: " + pelota.getMaterial());
    System.out.println("Tipo: " + pelota.getTipo());

    pelota.botar();
    pelota.desinflar();
    pelota.botar();
  }
}
