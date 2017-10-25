/**
 * Created by K4masz on 2017-10-21.
 */
public abstract class Player {

    private int cash;
    private String name;
    private Casino casino;

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

    public String toString() {
        return name + ": " + cash;
    }
}
