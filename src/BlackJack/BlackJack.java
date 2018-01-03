package BlackJack;

import Casino.Casino;
import Players.BlackJackPlayer;

import java.util.Scanner;

public class BlackJack {

    private Deck playingDeck;
    private Deck playerDeck;
    private Deck dealerDeck;
    private Scanner input;

    public BlackJack() {
        this.dealerDeck = new Deck();
        this.playerDeck = new Deck();
        this.playingDeck = new Deck();
        this.input = new Scanner(System.in);
    }

    public void newGame(int bid, BlackJackPlayer bJPlayer) {

        if (bJPlayer.getCashAmmount() > bid) {
            playingDeck.createFullDeck();

            playerDeck.draw(playingDeck);
            playerDeck.draw(playingDeck);

            dealerDeck.draw(playingDeck);
            dealerDeck.draw(playingDeck);

            boolean endRound = false;

            while (true) {
                System.out.println("Your Cards: " + playerDeck.toString());
                System.out.println("Your Hand: " + playerDeck.cardsValue());

                System.out.println("Dealer Cards: " + dealerDeck.getCard(0).toString() + " and [Hidden]");
                System.out.println("(1)HIT or (2)STAND");
                int response = input.nextInt();
                if (response == 1) {
                    playerDeck.draw(playingDeck);
                    System.out.println("You draw a: " + playerDeck.getCard(playerDeck.deckSize() - 1).toString());
                    if (playerDeck.cardsValue() > 21) {
                        System.out.println(">21 BUST!");
                        bJPlayer.takeCash(bid);
                        endRound = true;
                        break;
                    }
                }
                if (response == 2)
                    break;
            }

            System.out.println("Dealer Cards:" + dealerDeck.toString());

            if ((dealerDeck.cardsValue() > playerDeck.cardsValue())) {
                System.out.println("Dealer beats you " + dealerDeck.cardsValue() + " to " + playerDeck.cardsValue());
                Casino.getInstance().takePlayerMoney(bJPlayer.getName(), bid);
                endRound = true;
            }
            while ((dealerDeck.cardsValue() < 17) && endRound == false) {
                System.out.println("Dealer Busts. You win!");
                Casino.getInstance().givePlayerMoney(bJPlayer.getName(), bid);
                endRound = true;
            }

            if ((dealerDeck.cardsValue() == playerDeck.cardsValue()) && endRound == false) {
                System.out.println("Push.");
                endRound = true;
            }

            if ((playerDeck.cardsValue() > dealerDeck.cardsValue()) && endRound == false) {
                System.out.println("You win the hand.");
                Casino.getInstance().givePlayerMoney(bJPlayer.getName(), bid);
                endRound = true;
            } else if (endRound == false) {
                System.out.println("Dealer wins.");
                Casino.getInstance().takePlayerMoney(bJPlayer.getName(), bid);
            }


            playerDeck.moveAllToDeck(playingDeck);
            dealerDeck.moveAllToDeck(playingDeck);


            System.out.println("End of Game");
            System.out.println("-------------");

        } else
            System.out.println(bJPlayer.getName() + " You don't have enough money.");
    }
}
