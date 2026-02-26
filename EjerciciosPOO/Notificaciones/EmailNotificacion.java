public class EmailNotificacion extends Notificacion {

  public void EmailNotificacion(String mensaje, String destinatario) {
    this.mensaje = mensaje;
    this.destinatario = destinatario;
  }

 public void enviar() {
    System.out.println("Enviando email a " + destinatario);
    System.out.println("Mensaje: " + mensaje);
  }
}

