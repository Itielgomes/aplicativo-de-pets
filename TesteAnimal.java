import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class AnimalTest {

    @Test
    public void testAnimaisDoados() {
      
        Animal animal1 = new Animal(1, "Rex", 5, "Cachorro", "Vira-lata", "Macho", "doados", 1);
        Animal animal2 = new Animal(2, "Mittens", 3, "Gato", "Persa", "Fêmea", "paraDoacao", 2);
        Animal animal3 = new Animal(3, "Charlie", 2, "Cachorro", "Labrador", "Macho", "doados", 3);

        List<Animal> animais = new ArrayList<>();
        animais.add(animal1);
        animais.add(animal2);
        animais.add(animal3);

        List<Animal> animaisDoados = Animal.animaisDoados(animais);
        assertEquals(2, animaisDoados.size());
    }
}
