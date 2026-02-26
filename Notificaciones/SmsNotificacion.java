public class SmsNotificacion extends Notificacion implements Envia {

  public void SmsNotificacion(String mensaje, String destinatario) {
    this.mensaje = mensaje;
    this.destinatario = destinatario;
  }

  @Override
  public void enviar() {
    System.out.println("Enviando SMS a " + destinatario);
    System.out.println("Mensaje: " + mensaje);
    registrarLog();
  }
}
