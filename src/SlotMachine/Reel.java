package SlotMachine;

public class Reel {
    private ESymbol symbol;

    public Reel() {
    }

    public ESymbol getSymbol() {
        return this.symbol;
    }

    public void setSymbol(ESymbol symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return this.symbol.toString();
    }
}
