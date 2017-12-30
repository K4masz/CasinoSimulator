import Players.BlackJackPlayer;
import Players.Player;
import Players.SlotMachinePlayer;

/**
 * Created by K4masz on 2017-10-22.
 */
public class Main {
    public static void main(String[] args) {

        Casino casino = Casino.getInstance(10000);

        casino.addPlayer(new SlotMachinePlayer("Francis", 5000));
        Player francis = casino.getPlayer("Francis");
        francis.play(100);
        System.out.println(francis.toString());

        System.out.println("-------------");

        casino.addPlayer(new BlackJackPlayer("Johny", 3000));
        Player johny = casino.getPlayer("Johny");
        johny.play(100);
        System.out.println(johny.toString());

        System.out.print(casino.toString());
    }

}