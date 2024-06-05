import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class UsuarioTest {

    @Test
    public void testGettersAndSetters() {
        
        Usuario usuario = new Usuario("Joao", "joao@example.com", "senha123", "Rua A", "123456789");
        
        assertEquals("Joao", usuario.getNome());
        assertEquals("joao@example.com", usuario.getEmail());
        assertEquals("senha123", usuario.getSenha());
        assertEquals("Rua A", usuario.getEndereco());
        assertEquals("123456789", usuario.getTelefone());
        
        usuario.setNome("Pedro");
        usuario.setEmail("pedro@example.com");
        usuario.setSenha("outrasenha");
        usuario.setEndereco("Rua C");
        usuario.setTelefone("987654321");

        assertEquals("Pedro", usuario.getNome());
        assertEquals("pedro@example.com", usuario.getEmail());
        assertEquals("outrasenha", usuario.getSenha());
        assertEquals("Rua C", usuario.getEndereco());
        assertEquals("987654321", usuario.getTelefone());
    }
}
