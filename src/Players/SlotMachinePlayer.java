package Players;

import java.util.Random;

/**
 * Created by K4masz on 2017-10-21.
 */
public class SlotMachinePlayer extends Player {

    public SlotMachinePlayer(String name) {
        super(name);
        rand = new Random();
    }

    public SlotMachinePlayer(String name, int cash) {
        super(name, cash);
        rand = new Random();
    }

    @Override
    public void play(int bid) {
        //method to play SlotMachine
    }


    private void checkPrize(int[] slots, int bid) {

        if (slots[0] == 7 && slots[1] == 7 && slots[2] == 7) {
            System.out.println("Major Prize!");
            this.addCash(bid * 2);

        } else if (slots[0] == 7 && slots[1] == 7 ||
                slots[1] == 7 && slots[2] == 7 ||
                slots[2] == 7 && slots[0] == 7) {
            System.out.println("Minor prize!");
            this.addCash(bid);

        } else {
            System.out.println("Bust!");
            this.takeCash(bid);
        }
    }

}

