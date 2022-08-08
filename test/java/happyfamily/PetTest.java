package happyfamily;

import static org.junit.jupiter.api.Assertions.*;
import  happyfamily.Pet;
import  happyfamily.Species;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


class PetTest {
    private Pet Dog;

    @BeforeEach
    void init() {
        Dog = new Pet( Species.DOG.name() ,"Cloud",1, 8, new String[]{"playing","eating" , "walking"});

    }

    @Test
    void testPetEqual() {
        Pet Dog2 = new Pet(Species.DOG.name(), "Cloud", 1, 8, new String[]{"playing","eating" , "walking"});
        assertEquals(Dog, Dog2);
    }

    @Test
    void testPetNonEqual(){
        Pet Dog2 = new Pet(Species.DOG.name(), "Cloude", 1, 1, new String[]{"eating"});
        assertNotEquals(Dog, Dog2);
    }
}