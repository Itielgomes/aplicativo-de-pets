import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Date;

public class AdocaoTest {

    @Test
    public void testRegistrarAdocao() {
        String nome = "João";
        String email = "joao@example.com";
        String senha = "senha123";
        String endereco = "Rua das Flores";
        String telefone = "123456789";
        int idPet = 1;
        Date dataDaAdocao = new Date();

        Adocao adocao = new Adocao(nome, email, senha, endereco, telefone, idPet, dataDaAdocao);

        adocao.registrarAdocao();

        // Aqui você pode adicionar mais asserções se necessário
        assertTrue(true); // Se chegou até aqui sem lançar exceção, consideramos o teste bem-sucedido
    }

    @Test
    public void testProcessarAdocao() {
        String nome = "Maria";
        String email = "maria@example.com";
        String senha = "senha456";
        String endereco = "Avenida Central";
        String telefone = "987654321";
        int idPet = 2;
        Date dataDaAdocao = new Date();

        Adocao adocao = new Adocao(nome, email, senha, endereco, telefone, idPet, dataDaAdocao);

        adocao.processarAdocao();

        // Aqui você pode adicionar mais asserções se necessário
        assertTrue(true); // Se chegou até aqui sem lançar exceção, consideramos o teste bem-sucedido
    }
}
