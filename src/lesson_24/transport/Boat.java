package lesson_24.transport;



public class Boat extends Transport implements Swimmable {

    public Boat(int capacity) {
        super(capacity);
    }

    @Override
    void takePassenger() {
        System.out.println("Корабль берет пассажира на борт");
    }

    @Override
    public void swim() {
        System.out.println("Корабль плывет по морю");
    }
}
