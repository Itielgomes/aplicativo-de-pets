import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AdotadorTest {

    @Test
    public void testGetIdAdotador() {
        Adotador adotador = new Adotador("André", "andre@example.com", "senha123", "Rua A, 123", "123456789");
        assertEquals(1, adotador.getIdAdotador());

        Adotador outroAdotador = new Adotador("Otávio", "otavio@example.com", "senha456", "Rua B, 456", "987654321");
        assertEquals(2, outroAdotador.getIdAdotador());
    }
}
