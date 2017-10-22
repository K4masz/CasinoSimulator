import java.util.Random;

/**
 * Created by K4masz on 2017-10-21.
 */
public class OneArmedBanditPlayer extends Player {


    OneArmedBanditPlayer(String name, Casino instance) {
        super(name, instance);
    }

    OneArmedBanditPlayer(String name, Casino instance, int cash) {
        super(name, instance, cash);
    }

    @Override
    void play() {
        if (new Random().nextBoolean()) {
            System.out.println("XXX won");
        } else {
            System.out.println("XYZ bust");
        }

    }
}
