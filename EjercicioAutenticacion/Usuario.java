
abstract class Usuario implements Autenticacion {
    private String nombreUsuario;
    private String contraseña;

    public Usuario(String nombreUsuario, String contraseña) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
    }

    @Override
    public boolean autenticar(String usuario, String contraseña) {
        return this.nombreUsuario.equals(usuario) && this.contraseña.equals(contraseña);
    }

    public abstract String getTipoUsuario();
}