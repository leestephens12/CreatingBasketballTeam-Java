import models.Coach;
import models.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TeamTest {
    private Coach nickNurse;
    private Player kyleLowry;

    @BeforeEach
    void setUp() {
        nickNurse = new Coach("Nick", "Nurse","head coach", 5);
        kyleLowry = new Player("Kyle", "Lowry", 179, 225, "pg");
    }

    @Test
    void testConstructorAddPlayer() {
        ArrayList<Player> playerResult = new ArrayList<>();
        playerResult.add(kyleLowry);
    }

    @Test
    void testConstructorAddCoach() {
        ArrayList<Coach> coachResult = new ArrayList<>();
        coachResult.add(nickNurse);
    }


}
