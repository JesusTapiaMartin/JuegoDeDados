import java.util.Random;

public class Dado {
    // ===== ATRIBUTOS =====
    private int caraSuperior;


    // ===== LANZAMIENTO DADO =====
    public int lanzarDado(){
        Random random = new Random();
        caraSuperior  = random.nextInt(6) + 1;
        return caraSuperior;
    }


    // ===== GETTER =====
    public int getCaraSuperior() {
        return caraSuperior;
    }
}
