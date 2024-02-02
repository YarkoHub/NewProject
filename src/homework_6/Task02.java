package homework_6;

import java.util.Random;

//Запишите в 4 переменные случайные числа от 0 до 100
//Выведите все 4 на экран
//Программа должна определить максимальное из этих четырех чисел
//Результат вывести на экран

public class Task02 {
    public static void main(String[] args) {
        Random random = new Random();


        int num1 = random.nextInt(100);
        int num2 = random.nextInt(100);
        int num3 = random.nextInt( 100);
        int num4 = random.nextInt(100);
        System.out.println("Число - : " + num1 + "\n" + "Число - : " + num2 + "\n" + "Число - : " + num3 + "\n" + "Число - : " + num4);

        int maxNum;

        if (num1 >= num2 && num1 >= num3 && num1 >= num4) {
            maxNum = num1;
        } else if (num2 >= num1 && num2 >= num3 && num2 >= num4) {
            maxNum = num2;
        } else if (num3 >= num2 && num3 >= num1 && num3 >= num4) {
            maxNum = num3;
        } else   maxNum = num4;
        System.out.println("Максимальное Число - : " + maxNum);
    }
    }

