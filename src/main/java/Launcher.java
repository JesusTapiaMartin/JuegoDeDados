public class Launcher {

    // ===== MAIN =====
    public static void main(String[] args) {
        JuegoDados juego    = new JuegoDados();
        int suma            = juego.lanzarDados();

        System.out.println(" ====================");
        System.out.println("    Dado 1  : " + juego.getDado1().getCaraSuperior());
        System.out.println("    Dado 2  : " + juego.getDado2().getCaraSuperior());
        System.out.println("    Suma    : " + suma);
        System.out.print  ("    ¿Ganas o pierdes? ");
        juego.ganarPerder(suma);
        System.out.println(" ====================");
    }
}
