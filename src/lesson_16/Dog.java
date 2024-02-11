package lesson_16;

public class Dog {

    String name;
    int weight;

    public Dog(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    void eat() {
        System.out.println("Я вкусно ем!");
        weight++;
    }

    void run() {
        System.out.println("Я бытcро бегаю");
        weight -= 2;


        while (weight < 3) {
            System.out.println("Сорян я худая жрать хочу");
            eat();
        }
    }
    String whoAmI() {
        return "I am dog: " + this.name + " my weight: " + weight;
    }
}

