import static org.junit.Assert.*;
import org.junit.*;
import java.util.Date;

public class AdocaoTest {

    @Test
    public void testRegistrarAdocao() {
        Adocao adocao = new Adocao("João", "joao@example.com", "senha123", "Rua A, 123", "123456789", 101, new Date());
        assertNotNull(adocao);
        assertEquals("João", adocao.getNome());
        assertEquals("joao@example.com", adocao.getEmail());
        assertEquals("senha123", adocao.getSenha());
        assertEquals("Rua A, 123", adocao.getEndereco());
        assertEquals("123456789", adocao.getTelefone());
        assertEquals(101, adocao.getIdPet());

        adocao.registrarAdocao();
    }

    @Test
    public void testProcessarAdocao() {
        Adocao adocao = new Adocao("Maria", "maria@example.com", "senha456", "Rua B, 456", "987654321", 102, new Date());
        assertNotNull(adocao);
        assertEquals("Maria", adocao.getNome());
        assertEquals("maria@example.com", adocao.getEmail());
        assertEquals("senha456", adocao.getSenha());
        assertEquals("Rua B, 456", adocao.getEndereco());
        assertEquals("987654321", adocao.getTelefone());
        assertEquals(102, adocao.getIdPet());

        adocao.processarAdocao();
    }


}
