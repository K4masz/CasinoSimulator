package SlotMachine;

public class Reel {
    private Symbol symbol;

    public Reel() {
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
