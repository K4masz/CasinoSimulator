package SlotMachine;


import Players.SlotMachinePlayer;

import java.util.Random;

public class SlotMachine {
    private Reel[] slots;
    private Random rand;
    private int size;

    public SlotMachine() {
        this.slots = new Reel[]{new Reel(), new Reel(), new Reel()};
        this.size = Symbol.values().length;
    }

    private void fillSlots() {
        this.rand = new Random();

        for (int i = 0; i < slots.length; i++)
            slots[i].setSymbol(Symbol.values()[this.rand.nextInt(this.size)]);
    }

    private void checkPrize(int bid, SlotMachinePlayer player) {
        if (slots[0].getSymbol() == slots[1].getSymbol() && slots[1].getSymbol() == slots[2].getSymbol()) {
            System.out.println("Major Prize!");
            player.addCash(bid * 2);

        } else if (slots[0].getSymbol() == slots[1].getSymbol() ||
                slots[1].getSymbol() == slots[2].getSymbol() ||
                slots[0].getSymbol() == slots[2].getSymbol()) {
            System.out.println("Minor prize!");
            player.addCash(bid);

        } else {
            System.out.println("Bust!");
            player.takeCash(bid);
        }
    }

    @Override
    public String toString() {
        return "SM: " + slots[0].getSymbol().toString() + " | " + slots[1].getSymbol().toString() + " | " + slots[2].getSymbol().toString();
    }

    public void newGame(int bid, SlotMachinePlayer sMPlayer) {
        this.fillSlots();
        System.out.println(this.toString());
        this.checkPrize(bid, sMPlayer);
    }
}
