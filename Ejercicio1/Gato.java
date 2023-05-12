
public class Gato implements Mascota {
    @Override
    public void comer() {
        System.out.println("El gato está comiendo");
    }

    @Override
    public void jugar() {
        System.out.println("El gato está jugando con una pelota");
    }
}