package lesson_24.transport;

import com.sun.jdi.connect.Transport;

public class Airplane extends Transport implements Flyable{

    public Airplane(int capacity) {
        super(capacity);
    }

    @Override
    void takePassenger() {
        System.out.println("Самолет берет на борт пассажира");
    }

    @Override
    public void fly() {
        System.out.println("Самолет летит с пассажирами");
    }
}
