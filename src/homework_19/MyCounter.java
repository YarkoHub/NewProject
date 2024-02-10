package homework_19;

public class MyCounter {
    public static void main(String[] args) {

        Counter counter = new Counter(0); // Создание счетчика с начальным значением 0

        counter.increment();
        counter.decrement();

        System.out.println("Начальное значение счетчика: " + counter.getVaule());
        System.out.println("Значение счетчика после увеличения: " + counter.getVaule());
        System.out.println("Значение счетчика после уменьшения: " + counter.getVaule());


    }
}
