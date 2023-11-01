import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class JuegoDadosTest {

    @Test
    public void testJuegoGana() {
        JuegoDados juego    = new JuegoDados();
        juego.getDado1().setCaraSuperior(4);
        juego.getDado2().setCaraSuperior(3);
        int suma            = juego.lanzarDados();
        assertEquals(7, suma);
    }

    @Test
    public void testJuegoPierde() {
        JuegoDados juego    = new JuegoDados();
        juego.getDado1().setCaraSuperior(1);
        juego.getDado2().setCaraSuperior(2);
        int suma            = juego.lanzarDados();
        assertEquals(3, suma);
    }
}