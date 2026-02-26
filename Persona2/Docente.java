public class Docente extends Persona {

  private int idTrabajador;
  private double salario;
  private String departamento;
  
  public void setIdTrabajador (int id) {
    this.idTrabajador = id;
  }

  public int getIdTrabajador () {
    return idTrabajador;
  }

  public void setSalario (double salario) {
    this.salario = salario;   // corregido
  }

  public double getSalario () {
    return salario;
  }

  public void setDepartamento (String dep) {
    this.departamento = dep;
  }

  public String getDepartamento () {
    return departamento;
  }

  public void datosDocente(int idTrabajador, double salario, String departamento) {
    this.idTrabajador = idTrabajador;
    this.salario = salario;
    this.departamento = departamento;
  }
}
