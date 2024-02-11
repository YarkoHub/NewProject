package homework_19;

public class MyCounter {
    public static void main(String[] args) {

        Counter counter = new Counter(0);

        System.out.println("Текущее значение счетчика: " + counter.getValue());

        counter.increment(); // Увеличение счетчика на 1
        System.out.println("Текущее значение счетчика после увеличения: " + counter.getValue());

        counter.decrement(); // Уменьшение счетчика на 1
        System.out.println("Текущее значение счетчика после уменьшения: " + counter.getValue());
    }
}
