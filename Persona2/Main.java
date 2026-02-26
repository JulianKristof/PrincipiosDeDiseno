public class Main {

    public static void main(String[] args) {

        // Crear objeto Estudiante
        Estudiante alumno = new Estudiante();
        alumno.mostrarDatos("Julian", 19, "Masculino");
        alumno.datosAlumno(12345, 9.5, "Ingeniería en Sistemas");

        // Mostrar datos del estudiante
        System.out.println("=== DATOS DEL ESTUDIANTE ===");
        System.out.println("Nombre: " + alumno.getNombre());
        System.out.println("Edad: " + alumno.getEdad());
        System.out.println("Sexo: " + alumno.getSexo());
        System.out.println("Matrícula: " + alumno.getMatricula());
        System.out.println("Promedio: " + alumno.getPromedio());
        System.out.println("Licenciatura: " + alumno.getLicenciatura());

        System.out.println();

        // Crear objeto Docente
        Docente profesor = new Docente();
        profesor.mostrarDatos("Centeno", 10, "Masculino");
        profesor.datosDocente(789, 15000, "Principios");

        // Mostrar datos del docente
        System.out.println("=== DATOS DEL DOCENTE ===");
        System.out.println("Nombre: " + profesor.getNombre());
        System.out.println("Edad: " + profesor.getEdad());
        System.out.println("Sexo: " + profesor.getSexo());
        System.out.println("ID Trabajador: " + profesor.getIdTrabajador());
        System.out.println("Salario: " + profesor.getSalario());
        System.out.println("Departamento: " + profesor.getDepartamento());
    }
}
