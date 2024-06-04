import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DoadorTest {

    @Test
    public void testGetIdDoador() {

        Doador doador = new Doador("Ana", "ana@example.com", "senha123", "Rua A, 123", "123456789");

        assertEquals(1, doador.getIdDoador());

        Doador outroDoador = new Doador("Pedro", "pedro@example.com", "senha456", "Rua B, 456", "987654321");

        assertEquals(2, outroDoador.getIdDoador());
    }
}
