package utilities;

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

}
