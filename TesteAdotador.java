import static org.junit.Assert.*;
import org.junit.*;

public class AdotadorTest {

    @Test
    public void testGetIdAdotador() {
        Adotador adotador = new Adotador("Maria", "maria@example.com", "senha123", "Rua A, 123", "123456789");
        assertNotNull(adotador);
        assertEquals("Maria", adotador.getNome());
        assertEquals("maria@example.com", adotador.getEmail());
        assertEquals("senha123", adotador.getSenha());
        assertEquals("Rua A, 123", adotador.getEndereco());
        assertEquals("123456789", adotador.getTelefone());
        assertEquals(1, adotador.getIdAdotador()); // O primeiro ID adotador é esperado ser 1

        Adotador outroAdotador = new Adotador("João", "joao@example.com", "senha456", "Rua B, 456", "987654321");
        assertNotNull(outroAdotador);
        assertEquals("João", outroAdotador.getNome());
        assertEquals("joao@example.com", outroAdotador.getEmail());
        assertEquals("senha456", outroAdotador.getSenha());
        assertEquals("Rua B, 456", outroAdotador.getEndereco());
        assertEquals("987654321", outroAdotador.getTelefone());
        assertEquals(2, outroAdotador.getIdAdotador()); // O segundo ID adotador é esperado ser 2

    }


}
