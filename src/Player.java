/**
 * Created by K4masz on 2017-10-21.
 */
public abstract class Player {

    private int cash;
    private String name;
    private Casino casino;

    Player(String name, Casino instance) {
        this.name = name;
        this.casino = instance;
        cash = 250;
    }

    Player(String name, Casino instance, int cash) {
        this.name = name;
        this.casino = instance;
        this.cash = cash;
    }

    abstract void play();

    public String toString() {
        return name + ": " + cash;
    }
}
