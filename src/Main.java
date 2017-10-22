/**
 * Created by K4masz on 2017-10-22.
 */
public class Main {
    public static void main(String[] args) {

        Casino casino = Casino.getInstance(10000);
        Player johnny = new BlackJackPlayer("Johnny", casino);
        Player francis = new OneArmedBanditPlayer("Francis", casino);

        johnny.play();
        francis.play();
    }
}
