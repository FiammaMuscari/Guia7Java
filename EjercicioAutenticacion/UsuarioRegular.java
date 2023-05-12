
class UsuarioRegular extends Usuario {
    public UsuarioRegular(String nombreUsuario, String contraseña) {
        super(nombreUsuario, contraseña);
    }

    @Override
    public String getTipoUsuario() {
        return "Usuario Regular";
    }
}
