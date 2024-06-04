import org.junit.Test;
import java.util.Date;
import static org.junit.Assert.assertEquals;

public class DoacaoTest {

    @Test
    public void testGettersAndSetters() {
      
        Doador doador = new Doador("João", "joao@example.com", "senha123", "Rua A, 123", "123456789");
        Date data = new Date();
        Doacao doacao = new Doacao(1, 2, doador, 3, data, 100.0, "Maria", "maria@example.com", "senha456", "Rua B, 456", "987654321");

        assertEquals(1, doacao.getIdDoacao());
        assertEquals(2, doacao.getIdPet());
        assertEquals(doador, doacao.getIdDoador());
        assertEquals(3, doacao.getIdAdotante());
        assertEquals(data, doacao.getDataDoacao());
        assertEquals(100.0, doacao.getValor(), 0.001);

        doacao.setIdDoacao(10);
        assertEquals(10, doacao.getIdDoacao());

        doacao.setIdPet(20);
        assertEquals(20, doacao.getIdPet());

        Doador novoDoador = new Doador("Carlos", "carlos@example.com", "senha789", "Rua C, 789", "123456789");
        doacao.setIdDoador(novoDoador);
        assertEquals(novoDoador, doacao.getIdDoador());

        doacao.setIdAdotante(30);
        assertEquals(30, doacao.getIdAdotante());

        Date novaData = new Date();
        doacao.setDataDoacao(novaData);
        assertEquals(novaData, doacao.getDataDoacao());

        doacao.setValor(200.0);
        assertEquals(200.0, doacao.getValor(), 0.001);
    }
}
