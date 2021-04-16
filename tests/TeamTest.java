import models.Coach;
import models.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import models.Team;

import java.awt.*;
import java.util.ArrayList;

public class TeamTest {
    private Team goldenState;
    private Coach nickNurse;
    private Player kyleLowry;

    @BeforeEach
    void setUp() {
        //goldenState = new Team("Warriors", "Golden State");
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
