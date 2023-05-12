
class Piano implements InstrumentoMusical {
    @Override
    public void tocar() {
        System.out.println("Suena el piano");
    }

    @Override
    public void afinar() {
        System.out.println("El piano está afinado");
    }
}