package SlotMachine;


import Casino.Casino;
import Players.SlotMachinePlayer;

import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
    private Reel[] slots;
    private Random rand;
    private int size;
    private Scanner input;

    public SlotMachine() {
        this.slots = new Reel[]{new Reel(), new Reel(), new Reel()};
        this.size = SlotMachine.ESymbol.values().length;
        this.input = new Scanner(System.in);
    }

    private void fillSlots() {
        this.rand = new Random();

        for (int i = 0; i < slots.length; i++)
            slots[i].setSymbol(SlotMachine.ESymbol.values()[this.rand.nextInt(this.size)]);
    }

    private void checkPrize(int bid, SlotMachinePlayer player) {
        if (slots[0].getSymbol() == slots[1].getSymbol() && slots[1].getSymbol() == slots[2].getSymbol()) {
            System.out.println("Major Prize!");
            Casino.getInstance().givePlayerMoney(player.getName(), bid * 2);

        } else if (slots[0].getSymbol() == slots[1].getSymbol() ||
                slots[1].getSymbol() == slots[2].getSymbol() ||
                slots[0].getSymbol() == slots[2].getSymbol()) {
            System.out.println("Minor prize!");
            Casino.getInstance().givePlayerMoney(player.getName(), bid);

        } else {
            System.out.println("Bust!");
            Casino.getInstance().takePlayerMoney(player.getName(), bid);
        }

        System.out.println("-------------");
    }

    @Override
    public String toString() {
        return "SM: " + slots[0].getSymbol().toString() + " | " + slots[1].getSymbol().toString() + " | " + slots[2].getSymbol().toString();
    }

    public void newGame(int bid, SlotMachinePlayer sMPlayer) {
        if (sMPlayer.getCashAmmount() > bid) {
            this.fillSlots();
            System.out.println(this.toString());
            this.checkPrize(bid, sMPlayer);

        } else
            System.out.println(sMPlayer.getName() + " You don't have enough money.");
    }

}
