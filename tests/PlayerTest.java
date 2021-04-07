import models.Coach;
import models.Player;
import models.Team;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class PlayerTest {
    private Player kyleLowry;

    @BeforeEach
    void setUp() {
        kyleLowry = new Player("Kyle", "Lowry", 179, 225, "pg");
    }

    @Test
    void setFirstName() {
        assertEquals("Kyle", kyleLowry.getFirstName());
    }

    @Test
    void setFirstNameEmpty()
    {
        assertThrows(IllegalArgumentException.class, ()-> kyleLowry.setFirstName(""));
    }

    @Test
    void setFirstNameShort() {
        assertThrows(IllegalArgumentException.class, ()-> kyleLowry.setFirstName("K"));
    }

    @Test
    void setFirstNameLong() {
        assertThrows(IllegalArgumentException.class, ()-> kyleLowry.setFirstName("WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW"));
    }

    @Test
    void setLastName() {
        assertEquals("Lowry", kyleLowry.getLastName());
    }

    @Test
    void setLastNameEmpty()
    {
        assertThrows(IllegalArgumentException.class, ()-> kyleLowry.setLastName(""));
    }

    @Test
    void setLastNameShort() {
        assertThrows(IllegalArgumentException.class, ()-> kyleLowry.setLastName("K"));
    }

    @Test
    void setLastNameLong() {
        assertThrows(IllegalArgumentException.class, ()-> kyleLowry.setLastName("WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW"));
    }

    @Test
    void setHeight() {
        assertEquals(179, kyleLowry.getHeight());
    }

    @Test
    void setHeightTall() {
        assertThrows(IllegalArgumentException.class, ()-> kyleLowry.setHeight(300));
    }

    @Test
    void setHeightShort() {
        assertThrows(IllegalArgumentException.class, ()-> kyleLowry.setHeight(25));
    }

    @Test
    void setWeight() {
        assertEquals(225, kyleLowry.getWeight());
    }

    @Test
    void setWeightTall() {
        assertThrows(IllegalArgumentException.class, ()-> kyleLowry.setWeight(350));
    }

    @Test
    void setWeightShort() {
        assertThrows(IllegalArgumentException.class, ()-> kyleLowry.setWeight(25));
    }

    @Test
    void setPosition() {
        assertEquals("pg", kyleLowry.getPosition());
    }

    @Test
    void setPositionError() {
        assertThrows(IllegalArgumentException.class, ()-> kyleLowry.setPosition("aa"));
    }

    @Test
    void setPositionEmpty() {
        assertThrows(IllegalArgumentException.class, ()-> kyleLowry.setPosition(""));
    }
}
