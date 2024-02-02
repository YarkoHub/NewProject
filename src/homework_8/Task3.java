package homework_8;

import java.util.Arrays;
import java.util.Random;

public class Task3 {

    public static void main(String[] args) {
        // Произвольная длина массива
        int arrayLength = 10;

        // Создаем массив и заполняем случайными значениями
        int[] array = new int[arrayLength];
        Random random = new Random();

        for (int i = 0; i < arrayLength; i++) {
            array[i] = random.nextInt(100); // Генерируем случайное число от 0 до 99
        }

        // Выводим массив
        System.out.println("Массив: " + Arrays.toString(array));

        // Находим минимальное, максимальное и среднее арифметическое значения
        int min = array[0];
        int max = array[0];
        int sum = 0;

        for (int value : array) {
            if (value < min) {
                min = value;
            }

            if (value > max) {
                max = value;
            }

            sum += value;
        }

        double average = (double) sum / arrayLength;

        // Выводим результаты
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее арифметическое: " + average);

        }
    }

