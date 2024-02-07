package TestingProdject;

import java.util.Scanner;
//Перепишите решение задачи с использованием switch вместо if-else:
//Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор:
// 1, 2 или 3, а программа должна сказать, какое число ввёл пользователь: 1, 2, или 3
public class T7_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userImput = scanner.nextInt();

        System.out.println("Введите число от 1 до 3");


        switch (userImput){
            case 1:
                System.out.println("Вы ввели число 1");
                break;
            case 2:
                System.out.println("Вы ввели число 2");
                break;
            case 3:
                System.out.println("Вы ввели число 3");
                break;
            default:
                System.out.println("Вы ввели неверное число");
        }
        scanner.close();


    }
}
