package BlackJack;

public class Card {
    private ESuit suit;
    private EValue value;

    public Card(ESuit suit, EValue value) {
        this.suit = suit;
        this.value = value;

    }

    public EValue getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return this.suit.toString() + "-" + this.value.toString();
    }
}
