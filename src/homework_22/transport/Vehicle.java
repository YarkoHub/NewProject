package homework_22.transport;
//Создайте иерархию классов для разных типов транспортных средств: Vehicle (родительский класс), Car, Bicycle и Motorcycle (дочерние классы).

//Родительский класс Vehicle должен иметь метод startEngine(), который не будет иметь реализации.

//Дочерние классы Car, Bicycle и Motorcycle должны переопределить метод startEngine() для запуска соответствующего типа двигателя (если есть).

import lesson_23.Engine;

//Создайте массив транспортных средств разных типов.
// Используйте полиморфизм для вызова метода startEngine() для каждого транспортного средства.
abstract public class Vehicle {

    private final long id;
    private static long idCounter;

    private Engine engine;

    public Vehicle() {
        this.id = idCounter++;
    }


    // абстрактный метод не имеет реализации. Предназначен для переопределения в классах-потомках
    abstract public void startEngine();

    public long getId() {
        return id;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
