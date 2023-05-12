import java.util.ArrayList;
import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Administrador("fiamma", "admin123"));
        usuarios.add(new UsuarioRegular("nahue", "pass123"));
        usuarios.add(new UsuarioRegular("chiqui", "contra123"));

        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Nombre de usuario: ");
			String nombreUsuario = scanner.nextLine();
			System.out.print("Contraseña: ");
			String contraseña = scanner.nextLine();

			boolean autenticado = false;
			String tipoUsuario = "";

			for (Usuario usuario : usuarios) {
			    if (usuario.autenticar(nombreUsuario, contraseña)) {
			        autenticado = true;
			        tipoUsuario = usuario.getTipoUsuario();
			        break;
			    }
			}

			if (autenticado) {
			    System.out.println("Inicio de sesión exitoso. Tipo de usuario: " + tipoUsuario);
			} else {
			    System.out.println("Nombre de usuario o contraseña incorrectos.");
			}
		}
    }
}