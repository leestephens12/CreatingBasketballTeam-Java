package utilities;

import models.Coach;
import models.Player;
import models.Team;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DButility {

    //Creates Global variable for an array list that i can use to put my player objects in
    public static ArrayList<Player> players = new ArrayList<>();

    //Creates Global variable for an array list that i can use to put my coach objects in
    public static ArrayList<Coach> coaches = new ArrayList<>();

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


}
