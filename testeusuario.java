import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class UsuarioTest {

    @Test
    public void testLogin() {
      
        Usuario usuario1 = new Usuario("Alice", "alice@example.com", "senha123", "Rua A, 123", "123456789");
        Usuario usuario2 = new Usuario("Bob", "bob@example.com", "senha456", "Rua B, 456", "987654321");
      
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(usuario1);
        usuarios.add(usuario2);

        Usuario usuarioLogado = Usuario.login(usuarios, "alice@example.com", "senha123");
        assertNotNull(usuarioLogado);
        assertEquals("Alice", usuarioLogado.getNome());

        Usuario usuarioNaoLogado = Usuario.login(usuarios, "john@example.com", "senha789");
        assertNull(usuarioNaoLogado);
    }
}
