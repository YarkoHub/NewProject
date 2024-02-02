package lesson_06;

import java.util.Locale;
import java.util.Scanner;

// ЗАПРОС ДАННЫХ У ПОЛЬЗОВАТЕЛЯ ИЗ КОНСОЛИ

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Сканер для чтения из консоли
        scanner.useLocale(Locale.US); // МЕНЯЕМ ЛОКОЛИЗАЦИЮ НАШЕГО СКАНЕРА рАЗДЕЛИТЕЛЕМ БУДЕТ "."
        scanner.useLocale(Locale.GERMAN); // МЕНЯЕМ ЛОКОЛИЗАЦИЮ НАШЕГО СКАНЕРА рАЗДЕЛИТЕЛЕМ БУДЕТ ","


        System.out.println("Введите ваше Имя"); // Приглашение для ввода данных

        String name = scanner.nextLine(); // Читает строку ввода, включая пробелы

        System.out.println("Введите ваш возраст ;");
        int age = scanner.nextInt(); /// считывает введенное число из консоли
        scanner.nextLine();


        System.out.println("Ведите число с запятой :" );
        double db1 = scanner.nextDouble(); // считывает введенное число c плавающей точкой из консоли

        // Получаем результат:

        System.out.println("Ваше Имя  ;" + name);
        System.out.println("Ваш возраст ;" + age);
        System.out.println("Число с точкой  : " +db1);







    }
}
