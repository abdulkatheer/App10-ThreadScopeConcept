package test;

import beans.House;
import threads.Thread1;
import threads.Thread2;

public class Client {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1(new House("2BHK", "2450sqft", 2700500));
        Thread2 t2 = new Thread2(new House("3BHK", "3220sqft", 4700500));

        t1.start();
        t2.start();

        /*
        Using ThreadLocal class, we can add an object(resource) to a particular thread. That thread only
        can access that object.
        Hence we are defining the scope of a resource for a particular Thread, and its called ThreadScope.
         */
    }
}
