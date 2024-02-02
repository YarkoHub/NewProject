package homework_7;

import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {

        //(Использовать оператор switch)
        //Программа просит пользователя ввести число от 1 до 7
        // Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и так далее. Если 6 или 7 – “Выходной”.

        System.out.print("Введите число от 1 до 7 и узнаете день недели");
        Scanner scanner = new Scanner(System.in);
        int userNumer = scanner.nextInt();

        switch (userNumer){

            case 1:
                System.out.print("Понедельник");
                break;
            case 2:
                System.out.print("Вторник");
                break;
            case 3:
                System.out.print("Среда");
                break;
            case 4:
                System.out.print("Четверг");
                break;
            case 5:
                System.out.print("Пятница");
                break;
            case 6:
                System.out.print("Суббота");
                break;
            case 7:
                System.out.print("Воскресенье");
                break;
            default:
            System.out.print("Вы вели не правильное число (введите от 1 до 7");

        }
        scanner.close();

    }
}
