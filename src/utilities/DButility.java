package utilities;

import models.Coach;
import models.Player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DButility {

    /**
     *
     * @return list of valid positions for players
     */
    public static List<String> getValidPositions() {
        return Arrays.asList("PG", "SG", "SF", "PF", "C");
    }

    /**
     *
     * @return valid list for coaching positions
     */
    public static List<String> getValidCoachingPositions() {
        return Arrays.asList("head coach", "assistant coach", "trainer");
    }

    /**
     *
     * @return list of players to populate my players text area on GUI
     */
    public static ArrayList<Player> getPlayersDB() {
        ArrayList<Player> players = new ArrayList<>();
        players.add(new Player("Kyle", "Lowry", 183, 200, "PG"));
        players.add(new Player("Pascal", "Siakam", 200, 210, "PF"));
        players.add(new Player("Gary", "Trent Jr", 190, 205, "SF"));
        players.add(new Player("OG", "Annuonoby", 195, 225, "SF"));
        players.add(new Player("Fred", "Vanvleet", 180, 190, "PG"));
        players.add(new Player("Malachi", "Flynn", 185, 195, "PG"));
        return players;
    }

    /**
     *
     * @return list of coaches to populate my coaches text area on GUI
     */
    public static ArrayList<Coach> getCoachDB() {
        ArrayList<Coach> coaches = new ArrayList<>();
        coaches.add(new Coach("Nick", "Nurse", "head coach", 3));
        coaches.add(new Coach("Dwayne", "Casey", "assistant coach", 10));
        coaches.add(new Coach("Adrian", "Griffin", "trainer", 4));
        return coaches;
    }

}
