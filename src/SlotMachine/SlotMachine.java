package SlotMachine;


public class SlotMachine {
    private Reel[] slots;


    public SlotMachine() {
        this.slots = new Reel[]{new Reel(), new Reel(), new Reel()};
    }

    public void fillSlots() {
        for (int i = 0; i < slots.length; i++)
            slots[i].fillSlot();
    }

    public void checkPrize() {
        if (slots[0] == slots[1] && slots[1] == slots[2] && slots[2] == slots[3]) {
            System.out.println("Major Prize!");
            //add cash to Player

        } else if (slots[0] == slots[1] ||
                slots[1] == slots[2] ||
                slots[0] == slots[2]) {
            System.out.println("Minor prize!");
            //add cash to Player

        } else {
            System.out.println("Bust!");
            //take cash from Player
        }
    }

    @Override
    public String toString() {
        return "SM: " + slots[0].getSymbol().toString() + " | " + slots[1].getSymbol().toString() + " | " + slots[2].getSymbol().toString();
    }
}
