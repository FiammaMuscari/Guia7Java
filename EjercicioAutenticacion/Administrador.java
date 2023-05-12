
class Administrador extends Usuario {
    public Administrador(String nombreUsuario, String contraseña) {
        super(nombreUsuario, contraseña);
    }

    @Override
    public String getTipoUsuario() {
        return "Administrador";
    }
}
