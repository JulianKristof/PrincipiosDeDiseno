public class Persona {

  private String nombre;
  private int edad;
  private String sexo;
  
  public void setNombre (String nom) {
    this.nombre = nom;
  }

  public String getNombre () {
    return nombre;
  }

  public void setEdad (int ed) {
    this.edad = ed;
  }

  public int getEdad () {
    return edad;
  }

  public void setSexo (String sex) {
    this.sexo = sex;
  }

  public String getSexo () {
    return sexo;
  }
  
  public void mostrarDatos(String nombre, int edad, String sexo) {
    this.nombre = nombre;
    this.edad = edad;
    this.sexo = sexo;
  }
}
