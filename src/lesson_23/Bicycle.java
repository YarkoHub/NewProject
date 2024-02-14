package lesson_23;

import lesson_20.Vehicle;

public class Bicycle extends Vehicle {

    @Override
    public String toString() {
        return "Bicycle {id: " + getId() + "; engine: Двигателя нет, только педали}";
    }

    @Override
    public void startEngine() {
        System.out.println("У велосипеда двигателя нет");
    }
}
