package homework_9;

import java.util.Random;

public class Task3 {
//Заполните массив 50 случайными числами от 1 до 100. Программа должна найти, и вывести на экран все простые числа.
// Посчитайте сколько получилось таких чисел в массиве. Простое число - число, которое делится на цело только на 1 и само себя.
    public static void main(String[] args) {

        Random random = new Random();
        int arrayLength = 50;
        int[] randoArray = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            randoArray[i] = random.nextInt(101);

        }
        System.out.print("Ваш масив - ");

        for (int numer : randoArray) {

            System.out.print(numer + " ");
        }

        for (int k = 0; k < arrayLength; k++){

            if (k > 0){
                boolean even = true;

            }
        }



    }
}
