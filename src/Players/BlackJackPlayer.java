package Players;

import BlackJack.BlackJack;

/**
 * Created by K4masz on 2017-10-21.
 */
public class BlackJackPlayer extends Player {

    BlackJack bj;

    public BlackJackPlayer(String name) {
        super(name);
        bj = new BlackJack();
    }

    public BlackJackPlayer(String name, int cash) {
        super(name, cash);
        bj = new BlackJack();
    }

    @Override
    public void play(int bid) {
        bj.newGame(bid, this);
    }
}
