package homework_8;

import java.util.Scanner;

/*
Программа просит пользователя ввести произвольное число
Вывести сумму цифр этого числа

567432 -> 5+6+7+4+3+2 -> 27
 */
public class Task2Y {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // программа запрашивает у пользователя ввод данных

        System.out.println("Ведите любое число");

        int userNumber = scanner.nextInt(); // Считываем введенное пользователем число

        int suma = 0; // Отсчет с самого начала "0" - это значит первое число или буква.

        while (userNumber>0) {
            suma += userNumber %10; // % 10 (получение последней цифры)
            userNumber /=10; //  и /= 10 (удаление последней цифры).

        }
        System.out.println(suma);

    }
}
