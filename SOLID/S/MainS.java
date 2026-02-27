public class MainS {

    public static void main(String[] args) {

        // Crear usuario
        Usuario usuario = new Usuario("Julian", "julian@email.com");

        // Crear dependencias
        UsuarioRepository repository = new UsuarioRepository();
        EmailService emailService = new EmailService();

        // Ejecutar acciones
        repository.guardar(usuario);
        emailService.enviarBienvenida(usuario);
    }
}
