package homework_15;

import java.util.Random;

// Возраст 13 и 14
public class Person {
    String name;
    String hooby;
    String traum;
    int age;

    public Person(String name, String hooby, String traum, int age) {
        this.name = name;
        this.hooby = hooby;
        this.traum = traum;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", hooby='" + hooby + '\'' +
                ", traum='" + traum + '\'' +
                ", age=" + age +
                '}';
    }

}
