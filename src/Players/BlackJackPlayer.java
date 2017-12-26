package Players;

import BlackJack.Deck;

import java.util.Scanner;

/**
 * Created by K4masz on 2017-10-21.
 */
public class BlackJackPlayer extends Player {


    public BlackJackPlayer(String name) {
        super(name);
    }

    public BlackJackPlayer(String name, int cash) {
        super(name, cash);
    }

    @Override
    public void play(int bid) {

        //method to play BlackJack


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
