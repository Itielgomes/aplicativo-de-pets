import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Date;

public class AdocaoTest {

    @Test
    public void testRegistrarAdocao() {
        String nome = "André";
        String email = "andre@example.com";
        String senha = "senha123";
        String endereco = "Rua da Flores";
        String telefone = "123456789";
        int idPet = 1;
        Date dataDaAdocao = new Date();

        Adocao adocao = new Adocao(nome, email, senha, endereco, telefone, idPet, dataDaAdocao);

        adocao.registrarAdocao();

        assertTrue(true);
    }

    @Test
    public void testProcessarAdocao() {
        String nome = "otavio";
        String email = "otavio@example.com";
        String senha = "senha456";
        String endereco = "Centro Central";
        String telefone = "987654321";
        int idPet = 2;
        Date dataDaAdocao = new Date();

        Adocao adocao = new Adocao(nome, email, senha, endereco, telefone, idPet, dataDaAdocao);

        adocao.processarAdocao();

        assertTrue(true);
    }
}
