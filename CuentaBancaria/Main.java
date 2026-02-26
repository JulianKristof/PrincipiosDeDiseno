public class Main {

  public static void main(String[] args) {

    CuentaBancaria cuenta = new CuentaBancaria();
    cuenta.CuentaBancaria(1000);

    System.out.println("Saldo inicial: " + cuenta.getSaldo());

    cuenta.depositar(500);
    cuenta.retirar(300);
    cuenta.retirar(1500);

    System.out.println("Saldo final: " + cuenta.getSaldo());
  }
}
