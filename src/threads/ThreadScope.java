package threads;

import beans.House;

public class ThreadScope extends ThreadLocal<House> {
    @Override
    protected House initialValue() {
        return new House();
    }
}
