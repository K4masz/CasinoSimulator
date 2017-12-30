package Players;

import SlotMachine.SlotMachine;

/**
 * Created by K4masz on 2017-10-21.
 */
public class SlotMachinePlayer extends Player {

    private SlotMachine sm;

    public SlotMachinePlayer(String name) {
        super(name);
        this.sm = new SlotMachine();
    }

    public SlotMachinePlayer(String name, int cash) {
        super(name, cash);
        this.sm = new SlotMachine();
    }

    @Override
    public void play(int bid) {
        sm.newGame(bid, this);
    }
}

