import org.junit.Test;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class DenunciaTest {


    @Test
    public void testListarDenuncias() {

        Denuncia.denunciaList.clear();

        Denuncia denuncia1 = new Denuncia(1, 124, 456, new Date(), "Descrição da denúncia 1");
        Denuncia denuncia2 = new Denuncia(2, 456, 789, new Date(), "Descrição da denúncia 2");

        denuncia1.registrarDenuncia();
        denuncia2.registrarDenuncia();

        List<Denuncia> denuncias = Denuncia.listarDenuncias();
        assertEquals(2, denuncias.size());
        assertTrue(denuncias.contains(denuncia1));
        assertTrue(denuncias.contains(denuncia2));

        assertFalse(denuncias.stream().anyMatch(d -> !d.equals(denuncia1) && !d.equals(denuncia2)));
    }

}
