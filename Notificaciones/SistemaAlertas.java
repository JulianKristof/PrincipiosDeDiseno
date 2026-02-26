public class SistemaAlertas {

  public static void main(String[] args) {

    EmailNotificacion email = new EmailNotificacion();
    email.EmailNotificacion("Reunion a las 10 AM", "usuario@email.com");
    email.enviar();
    email.registrarLog();

    System.out.println();

    SmsNotificacion sms = new SmsNotificacion();
    sms.SmsNotificacion("Tu codigo es 1234", "5551234567");
    sms.enviar();
  }
}
