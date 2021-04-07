import models.Coach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CoachTest {
    private Coach nickNurse;

    @BeforeEach
    void setUp()
    {
        nickNurse = new Coach("Nick", "Nurse","head coach", 5);
    }
    @Test
    void setFirstName() {
        assertEquals("Nick", nickNurse.getFirstName());
    }

    @Test
    void setFirstNameEmpty()
    {
        assertThrows(IllegalArgumentException.class, ()-> nickNurse.setFirstName(""));
    }

    @Test
    void setFirstNameShort() {
        assertThrows(IllegalArgumentException.class, ()-> nickNurse.setFirstName("N"));
    }

    @Test
    void setFirstNameSpaced() {
        assertThrows(IllegalArgumentException.class, ()-> nickNurse.setFirstName(" N "));
    }

    @Test
    void setFirstNameLong() {
        assertThrows(IllegalArgumentException.class, ()-> nickNurse.setFirstName("WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW"));
    }

    @Test
    void setLastName() {
        assertEquals("Nurse", nickNurse.getLastName());
    }

    @Test
    void setLastNameEmpty()
    {
        assertThrows(IllegalArgumentException.class, ()-> nickNurse.setLastName(""));
    }

    @Test
    void setLastNameShort() {
        assertThrows(IllegalArgumentException.class, ()-> nickNurse.setLastName("K"));
    }

    @Test
    void setLastNameSpaced() {
        assertThrows(IllegalArgumentException.class, ()-> nickNurse.setLastName(" N "));
    }

    @Test
    void setLastNameLong() {
        assertThrows(IllegalArgumentException.class, ()-> nickNurse.setLastName("WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW"));
    }

    @Test
    void setCoachingPosition() {
        assertEquals("head coach", nickNurse.getCoachingPosition());
    }

    @Test
    void setCoachingPositionEmpty()
    {
        assertThrows(IllegalArgumentException.class, ()-> nickNurse.setCoachingPosition(""));
    }

    @Test
    void setCoachingPositionError()
    {
        assertThrows(IllegalArgumentException.class, ()-> nickNurse.setCoachingPosition("point guard"));
    }

    @Test
    void setCoachingPositionSpaced() {
        assertThrows(IllegalArgumentException.class, ()-> nickNurse.setCoachingPosition(" N "));
    }

    @Test
    void setYearsExperience() {
        assertEquals( 5, nickNurse.getYearsExperience());
    }

    @Test
    void setYearsExperienceHigh()
    {
        assertThrows(IllegalArgumentException.class, ()-> nickNurse.setYearsExperience(100));
    }

    @Test
    void setYearsExperienceLow()
    {
        assertThrows(IllegalArgumentException.class, ()-> nickNurse.setYearsExperience(-1));
    }


}