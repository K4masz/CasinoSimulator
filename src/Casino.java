/**
 * Created by K4masz on 2017-10-21.
 */
public class Casino {

    private int money;
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

    public String toString(){
        if(inst == null)
            return "No Casino";
        else
            return "Casino: " + inst.money + " $";
    }

}

