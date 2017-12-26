import BlackJack.Deck;

import java.util.Scanner;

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
    void play(int bid) {
        Deck playingDeck = new Deck();
        playingDeck.createFullDeck();

        Deck playerDeck = new Deck();
        Deck dealerDeck = new Deck();

        Scanner userInput = new Scanner(System.in);

        //start
        playerDeck.draw(playingDeck);
        playerDeck.draw(playingDeck);

        dealerDeck.draw(playingDeck);
        dealerDeck.draw(playingDeck);


    }
}
