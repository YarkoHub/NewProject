package homework_8;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите произвольное число:");

        int number = (int) scanner.nextLong();

        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        System.out.println("Сумма цифр числа: " + sum);

        scanner.close();
    }


}
