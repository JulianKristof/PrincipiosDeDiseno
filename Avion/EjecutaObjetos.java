public class EjecutaObjetos {

  public static void main(String[] args) {

    Avion avion = new Avion();
    avion.Avion("Aeromexico", "2", "900 km/h", "180 pasajeros");
    avion.setModelo("Boeing 737");

    System.out.println("=== AVION ===");
    System.out.println("Aerolinea: " + avion.getAerolinea());
    System.out.println("Modelo: " + avion.getModelo());
    System.out.println("Capacidad: " + avion.getCapacidad());
    System.out.println("Velocidad: " + avion.getVelocidad());
    System.out.println("Cantidad de Motores: " + avion.getCantidadMotores());

    avion.acelerar();
    avion.elevarse();
  }
}
