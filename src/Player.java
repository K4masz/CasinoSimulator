/**
 * Created by K4masz on 2017-10-21.
 */
public abstract class Player {

    private int cash;
    private String name;


    Player(String name) {
        this.name = name;
        cash = 250;
    }

    Player(String name, int cash) {
        this.name = name;
        this.cash = cash;
    }

    abstract void play();

    public String getName() {
        return name;
    }

    public int getCashAmmount() {
        return this.cash;
    }

    public void setCashAmmount(int newCash) {
        this.cash = newCash;
    }

    public void addCash(int ammount) {
        this.setCashAmmount(this.getCashAmmount() + ammount);
    }

    public void takeCash(int ammount) {
        this.setCashAmmount(this.getCashAmmount() - ammount);
    }

    public String toString() {
        return name + ": " + cash;
    }
}
