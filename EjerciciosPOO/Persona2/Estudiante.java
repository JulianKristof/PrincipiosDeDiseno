public class Estudiante extends Persona {

  private int matricula;
  private double promedio;
  private String licenciatura;

  public void setMatricula (int mat) {
    this.matricula = mat;
  }

  public int getMatricula () {
    return matricula;
  }

  public void setPromedio (double prom) {
    this.promedio = prom;
  }

  public double getPromedio () {
    return promedio;
  }

  public void setLicenciatura (String lic) {
    this.licenciatura = lic;
  }
  
  public String getLicenciatura () {
    return licenciatura;
  }

  public void datosAlumno(int matricula, double promedio, String licenciatura) {
    this.matricula = matricula;
    this.promedio = promedio;
    this.licenciatura = licenciatura;
  }
}
