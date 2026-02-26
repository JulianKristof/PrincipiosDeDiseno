public class Notificacion {

  protected String mensaje;
  protected String destinatario;

  public void setMensaje(String newVar) {
    this.mensaje = newVar;
  }

  public String getMensaje() {
    return mensaje;
  }

  public void setDestinatario(String newVar) {
    this.destinatario = newVar;
  }

  public String getDestinatario() {
    return destinatario;
  }

  public void Notificacion(String mensaje, String destinatario) {
    this.mensaje = mensaje;
    this.destinatario = destinatario;
  }

  public void registrarLog() {
    System.out.println("Notificacion registrada para: " + destinatario);
  }
}
