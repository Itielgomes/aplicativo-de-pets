import static org.junit.Assert.*;
import org.junit.*;
import java.util.Date;

public class PetTest {

    @Test
    public void testCadastrarPet() {
        Pet pet = new Pet(1, 101, "Rex", 3, "Cachorro", "Labrador", "Macho", "Disponível", 201, new Date(), true, "Labrador amarelo");
        assertNotNull(pet);
        assertEquals(1, pet.getIdPet());
        assertEquals(101, pet.getIdAnimal());
        assertEquals(201, pet.getIdResponsavel());
        assertEquals("Rex", pet.getNome());
        assertEquals(3, pet.getIdade());
        assertEquals("Cachorro", pet.getEspecie());
        assertEquals("Labrador", pet.getRaca());
        assertEquals("Macho", pet.getGenero());
        assertEquals("Disponível", pet.getStatus());
        assertTrue(pet.isVacinado());
        assertEquals("Labrador amarelo", pet.getDescricao());
    }

    @Test
    public void testAtualizarPet() {
        Pet pet = new Pet(2, 102, "Bob", 5, "Gato", "Persa", "Macho", "Disponível", 202, new Date(), false, "Persa cinza");
        assertNotNull(pet);
        assertEquals(2, pet.getIdPet());
        assertEquals(102, pet.getIdAnimal());
        assertEquals(202, pet.getIdResponsavel());
        assertEquals("Bob", pet.getNome());
        assertEquals(5, pet.getIdade());
        assertEquals("Gato", pet.getEspecie());
        assertEquals("Persa", pet.getRaca());
        assertEquals("Macho", pet.getGenero());
        assertEquals("Disponível", pet.getStatus());
        assertFalse(pet.isVacinado());
        assertEquals("Persa cinza", pet.getDescricao());

        pet.setNome("Felix");
        pet.setIdade(3);
        pet.setEspecie("Gato");
        pet.setRaca("Siamês");
        pet.setGenero("Macho");
        pet.setStatus("Adotado");
        pet.setVacinado(true);
        pet.setDescricao("Siamês branco");

        assertEquals("Felix", pet.getNome());
        assertEquals(3, pet.getIdade());
        assertEquals("Gato", pet.getEspecie());
        assertEquals("Siamês", pet.getRaca());
        assertEquals("Macho", pet.getGenero());
        assertEquals("Adotado", pet.getStatus());
        assertTrue(pet.isVacinado());
        assertEquals("Siamês branco", pet.getDescricao());
    }

    // Adicione mais testes conforme necessário

}
