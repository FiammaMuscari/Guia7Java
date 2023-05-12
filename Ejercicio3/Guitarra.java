
class Guitarra implements InstrumentoMusical {
    @Override
    public void tocar() {
        System.out.println("Suena la guitarra");
    }

    @Override
    public void afinar() {
        System.out.println("La guitarra está afinada");
    }
}