import Players.BlackJackPlayer;
import Players.Player;
import Players.SlotMachinePlayer;
import SlotMachine.SlotMachine;

/**
 * Created by K4masz on 2017-10-22.
 */
public class Main {
    public static void main(String[] args) {

        Casino casino = Casino.getInstance(10000);

        casino.addPlayer(new BlackJackPlayer("Johnny", 2000));
        casino.addPlayer(new SlotMachinePlayer("Francis", 5000));

        Player johhny = casino.getPlayer("Johnny");
        Player francis = casino.getPlayer("Francis");

        johhny.play(100);
        francis.play(100);

        System.out.println(johhny.toString());
        System.out.println(francis.toString());

        System.out.print(casino.getMoney());

        SlotMachine sm = new SlotMachine();
        sm.fillSlots();
        System.out.println(sm.toString());
    }


}
