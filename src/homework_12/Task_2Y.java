package homework_12;

import java.util.ArrayList;
import java.util.Arrays;

public class Task_2Y {

    public static void main(String[] args) {
        // Пример вызова метода с массивом целых чисел
        int[] inputArray = {0, 13, -25, 11, 31, 55, 98, 11, 5};
        int[] resultArray = filterPrimeNumbers(inputArray);

        // Вывод результатов
        System.out.println("Входной массив: " + Arrays.toString(inputArray));
        System.out.println("Массив простых чисел: " + Arrays.toString(resultArray));
    }

    public static int[] filterPrimeNumbers(int[] inputArray) {
        // Проверка на null и пустой массив
        if (inputArray == null || inputArray.length == 0) {
            return new int[0]; // Массив пуст, возвращаем пустой массив
        }

        // Создаем список для хранения простых чисел
        ArrayList<Integer> primeNumbersList = new ArrayList<>();

        // Проверяем каждое число во входном массиве на простоту
        for (int num : inputArray) {
            if (isPrime(num)) {
                primeNumbersList.add(num);
            }
        }

        // Преобразуем список обратно в массив
        int[] resultArray = new int[primeNumbersList.size()];
        for (int i = 0; i < primeNumbersList.size(); i++) {
            resultArray[i] = primeNumbersList.get(i);
        }

        return resultArray;
    }

    // Метод для проверки, является ли число простым
    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
