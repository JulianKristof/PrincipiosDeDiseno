public class EjecutaObjetos {
  public static void main(String[] args) {

    Television tv = new Television();
    tv.Television("Plana", "55 pulgadas", "4K", "Samsung");

    System.out.println("=== TELEVISION ===");
    System.out.println("Forma: " + tv.getForma());
    System.out.println("Tamaño: " + tv.getTamaño());
    System.out.println("Calidad de Video: " + tv.getCalidadVideo());
    System.out.println("Marca: " + tv.getMarca());

    tv.prendida();
    tv.apagada();
  }
}
