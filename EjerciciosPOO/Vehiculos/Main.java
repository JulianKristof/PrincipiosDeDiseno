public class Main {

  public Main() { }

  public static void main(String[] args) {

    Autobus autobus = new Autobus();
    autobus.setMarcaModelo("Mercedes Benz");
    autobus.setPrecioDia(5000);
    autobus.setNumLlantas(6);
    autobus.setNumAsientos(40);
    autobus.setNumPuertas(2);
    autobus.setNumVentilas(10);

    System.out.println("=== AUTOBUS ===");
    autobus.mostrarDatos();
    autobus.pruebaDelMotor();

    System.out.println();

    Automovil auto = new Automovil();
    auto.setMarcaModelo("Toyota Corolla");
    auto.setPrecioDia(1500);
    auto.setNumLlantas(4);
    auto.setNumAsientos(5);
    auto.setNumPuertas(4);

    System.out.println("=== AUTOMOVIL ===");
    auto.mostrarDatos();
    auto.pruebaDelMotor();

    System.out.println();

    Motocicleta moto = new Motocicleta();
    moto.setMarcaModelo("Honda");
    moto.setPrecioDia(800);
    moto.setNumLlantas(2);
    moto.setNumAsientos(2);

    System.out.println("=== MOTOCICLETA ===");
    moto.mostrarDatos();
    moto.pruebaDelMotor();
  }
}
