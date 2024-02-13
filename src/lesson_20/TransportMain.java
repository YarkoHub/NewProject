package lesson_20;

public class TransportMain {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("TELEGA", 1910);
        System.out.println(vehicle.toString());
        vehicle.go();
        vehicle.stop();

        Bus bus = new Bus("MAN",2023, 5);
        System.out.println(bus.toString());
        bus.go();
        bus.stop();

        System.out.println("bus.getCapacity "+bus.getCapacity());

        System.out.println("=================================");
        bus.getOutPassenger();
        bus.takePassenger();
        bus.takePassenger();
        bus.takePassenger();
        System.out.println("bus.getCountPassengers ; "+ bus.getCountPassengers());
        bus.takePassenger();


    }
}
