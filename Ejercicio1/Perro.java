
public class Perro implements Mascota {
    @Override
    public void comer() {
        System.out.println("El perro está comiendo");
    }

    @Override
    public void jugar() {
        System.out.println("El perro está jugando con una pelota");
    }
}