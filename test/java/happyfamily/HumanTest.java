package happyfamily;

import static org.junit.jupiter.api.Assertions.*;
import  happyfamily.Family ;
import  happyfamily.Human;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


class HumanTest {

    private Human Murphy ;
    @BeforeEach
    void init() {
       Murphy = new Human("Ann", "Murphy", 1989);

    }

    @Test
    void testHumanEquality() {
        Human Murphy2 = new Human("Ann", "Murphy", 1989);
        assertEquals(Murphy, Murphy2);
    }

    @Test
    void testHumanNonEquality(){
        Human Murphy2 = new Human("Jack", "Murphy", 1985);
        assertNotEquals(Murphy, Murphy2);
    }

}

