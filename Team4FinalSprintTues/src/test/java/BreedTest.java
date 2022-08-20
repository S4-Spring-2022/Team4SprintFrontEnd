
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.keyin.entity.Breed;

@ExtendWith(MockitoExtension.class)

public class BreedTest {
    @Mock
    private Breed breedUnderTest = Mockito.mock(Breed.class);

    @Test
    public void testGetId() {
        Breed breedUnderTest = new Breed();
        breedUnderTest.setId(1);
        assertEquals(1, breedUnderTest.getId());

    }

    @Test
    public void testGetBreedName() {
        Breed breedUnderTest = new Breed();
        breedUnderTest.setBreedName("Newfoundland");
        assertEquals("Newfoundland", breedUnderTest.getBreedName());

    }

    @Test
    public void testGetScientificName() {
        Breed breedUnderTest = new Breed();
        breedUnderTest.setScientificName("Canus Domesticus");
        assertEquals("Canus Domesticus", breedUnderTest.getScientificName());

    }

    @Test
    public void testGetCountry() {
        Breed breedUnderTest = new Breed();
        breedUnderTest.setCountry("Canada");
        assertEquals("Canada", breedUnderTest.getCountry());

    }

    @Test
    public void testGetYears() {
        Breed breedUnderTest = new Breed();
        breedUnderTest.setYears(10);
        assertEquals(10, breedUnderTest.getYears());

    }

}
