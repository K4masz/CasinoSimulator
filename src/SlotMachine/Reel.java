package SlotMachine;

import java.util.Random;

public class Reel {
    private Symbol symbol;
    private Random rand;
    private int size;

    public Reel() {
        this.rand = new Random();
        this.size = Symbol.values().length;
    }

    public void fillSlot() {
        this.setSymbol(Symbol.values()[rand.nextInt(size)]);
    }

    public Symbol getSymbol() {
        return this.symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return this.symbol.toString();
    }
}
