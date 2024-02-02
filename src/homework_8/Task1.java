package homework_8;

public class Task1 {
    public static void main(String[] args) {
        int number = 1;

        do {
            if (number % 5 == 0) {
                System.out.println(number);
            }
            number++;
        } while (number <= 100);
    }

}
