/**
 * Created by K4masz on 2017-10-22.
 */
public class Main {
    public static void main(String[] args) {

        Casino casino = Casino.getInstance(10000);

        casino.addPlayer(new BlackJackPlayer("Johnny", 2000));
        casino.addPlayer(new OneArmedBanditPlayer("Francis", 5000));

        Player johhny = casino.getPlayer("Johnny");
        Player francis = casino.getPlayer("Francis");

        johhny.play(100);
        francis.play(100);

        System.out.println(johhny.toString());
        System.out.println(francis.toString());

        System.out.print(casino.getMoney());


    }


}
