import models.Coach;
import models.Player;
import models.Team;

public class Main {
    public static void main(String[] args) {
        Player lebronJames = new Player("Lebron","James", 206, 275, "Small Forward");
        System.out.println(lebronJames.toString());

        Coach steveKerr = new Coach("Steve", "Kerr","head coach", 5);
        System.out.println(steveKerr.toString());
    }
}

