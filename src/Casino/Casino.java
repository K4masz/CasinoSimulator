package Casino;

import Players.Player;

import java.util.HashMap;

/**
 * Created by K4masz on 2017-10-21.
 */
public class Casino {

    private int money;
    private static HashMap<String, Player> players = new HashMap<String, Player>();
    private static Casino inst;

    private Casino(){
        money = 1000000;
    }

    private Casino(int money){
        this.money = money;
    }

    public static synchronized Casino getInstance(){
        if(inst == null)
            inst = new Casino();

        return inst;
    }

    public static synchronized Casino getInstance(int money){
        if(inst == null)
            inst = new Casino(money);

        return inst;
    }

    public synchronized void setMoney(int newMoneyAmmount){
        inst.money = newMoneyAmmount;
    }

    public synchronized int getMoney(){
        return  inst.money;
    }

    public void addPlayer(Player player) {
        try {
            players.putIfAbsent(player.getName(), player);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Player getPlayer(String name) {
        return players.get(name);
    }

    public String toString(){
        if(inst == null)
            return "No Casino";
        else
            return "Casino: " + inst.money + " $";
    }

    public void givePlayerMoney(String name, int money) {
        this.setMoney(this.getMoney() - money);
        this.getPlayer(name).addCash(money);
    }

    public void takePlayerMoney(String name, int money) {
        this.setMoney(this.getMoney() + money);
        this.getPlayer(name).takeCash(money);
    }
}

