import java.util.Random;

/**
 * Created by K4masz on 2017-10-21.
 */
public class OneArmedBanditPlayer extends Player {

    private Random rand;

    OneArmedBanditPlayer(String name) {
        super(name);
        rand = new Random();
    }

    OneArmedBanditPlayer(String name, int cash) {
        super(name, cash);
        rand = new Random();
    }

    @Override
    void play(int bid) {

        int[] slots;

        slots = fillSlots(new int[3]);
        printSlots(slots);
        checkPrize(slots, bid);

    }

    private int[] fillSlots(int[] slots) {
        for (int i = 0; i < slots.length; i++)
            slots[i] = rand.nextInt(7) + 1;
        return slots;
    }

    private void printSlots(int[] slots) {
        System.out.println(slots[0] + " | " + slots[1] + " | " + slots[2]);
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

