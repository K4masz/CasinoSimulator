import java.util.Random;

/**
 * Created by K4masz on 2017-10-21.
 */
public class BlackJackPlayer extends Player {


    BlackJackPlayer(String name) {
        super(name);
    }

    BlackJackPlayer(String name, int cash) {
        super(name, cash);
    }

    @Override
    void play() {
        if (new Random().nextBoolean()) {
            System.out.println("21 won");
        } else {
            System.out.println("22 bust");
        }
    }
}
