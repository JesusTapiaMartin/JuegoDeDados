
public class JuegoDados {

    // ===== ATRIBUTOS =====
    private Dado dado1;
    private Dado dado2;


    // =====CONSTRUCTOR =====
    public JuegoDados() {
        dado1 = new Dado();
        dado2 = new Dado();
    }


    // ===== LANZAMIENTO DADOS =====
    public int lanzarDados(){
        int lanzamientoDado1 = dado1.getCaraSuperior();
        int lanzamientoDado2 = dado2.getCaraSuperior();
        int suma             = Calculadora.sumar(lanzamientoDado1, lanzamientoDado2);
        return suma;
    }


    // ===== GANAR O PERDER =====
    public void ganarPerder(int suma){
        if(suma == 7){
    System.out.println(" ¡Ganaste!, Felicitaciones");
        } else {
            System.out.println(" Perdiste...");
        }
    }


    // ===== GETTERS =====
    public Dado getDado1() {
        return dado1;
    }

    public Dado getDado2() {
        return dado2;
    }
}
