package threads;

import beans.House;

public class Thread1 extends  Thread{
    public static ThreadScope threadScope = new ThreadScope();
    House h;

    public Thread1(House h){
        this.h = h;
    }

    @Override
    public void run() {
        threadScope.set(h);
        System.out.println("House Details:");
        System.out.println("--------------");
        h.getHouseDetails();
    }
}
