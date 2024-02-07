package TestingProdject;

import java.util.Scanner;

public class T7_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] daysOfWeek = {"", "Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"};

        System.out.println("Введите число от 1 до 7");
        int userInputDay = scanner.nextInt();

        if (userInputDay >= 1 && userInputDay <= 7) {
            System.out.println(daysOfWeek[userInputDay]);
            if (userInputDay == 6 || userInputDay == 7) {
                System.out.println("Выходной день");
            }
        } else {
            System.out.println("Ваш ввод не распознан");
        }
    }
}