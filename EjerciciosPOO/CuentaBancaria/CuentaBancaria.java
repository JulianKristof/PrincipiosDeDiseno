public class CuentaBancaria {

  private double saldo;

  public void setSaldo(double newVar) {
    this.saldo = newVar;
  }

  public double getSaldo() {
    return saldo;
  }

  public void CuentaBancaria(double saldo) {
    this.saldo = saldo;
  }

  public void depositar(double saldo) {
    if (saldo > 0) {
      this.saldo += saldo;
      System.out.println("Deposito realizado. Nuevo saldo: " + this.saldo);
    } else {
      System.out.println("Cantidad invalida para depositar");
    }
  }

  public void retirar(double saldo) {
    if (saldo > 0 && saldo <= this.saldo) {
      this.saldo -= saldo;
      System.out.println("Retiro realizado. Nuevo saldo: " + this.saldo);
    } else {
      System.out.println("Fondos insuficientes o cantidad invalida");
    }
  }
}
