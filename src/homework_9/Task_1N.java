package homework_9;

import java.util.Scanner;

public class Task_1N {

    //За каждый месяц банк начисляет к сумме вклада 7% от суммы.
    // Напишите консольную программу, в которую пользователь вводит сумму вклада и количество месяцев.
    // А банк вычисляет конечную сумму вклада с учетом начисления процентов за каждый месяц.
    // Для вычисления суммы с учетом процентов используйте цикл for.
    //Пусть сумма вклада будет представлять тип float.
    //Введите сумму вклада: 100
    //Введите срок вклада в месяцах: 1
    //После 1 месяцев сумма вклада составит 107,00

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите суму вклада : -");
        Float userSuma = scanner.nextFloat();

        System.out.println("Ведите количество месяцев для вклада : -");
        int userMonths = scanner.nextInt();

        for  (int i = 1; i <= userMonths ; i++) {

            userSuma = (userSuma + userSuma * 0.07f);

            System.out.println("Через один месяц сумма будет  = " +userSuma);
        }

        scanner.close();

    }


}
