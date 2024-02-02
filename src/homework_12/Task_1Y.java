package homework_12;

public class Task_1Y {
    public static void main(String[] args) {
        // Пример вызова метода с массивом строк
        String[] inputArray = {"apple", "banana", "orange", "kiwi", "grape"};
        String[] resultArray = findShortestLongestStrings(inputArray);

        // Вывод результатов
        System.out.println("Shortest string: " + resultArray[0]);
        System.out.println("Longest string: " + resultArray[1]);
    }

    public static String[] findShortestLongestStrings(String[] inputArray) {
        // Проверка на null и пустой массив
        if (inputArray == null || inputArray.length == 0) {
            return new String[0]; // Массив пуст, возвращаем пустой массив
        }

        String shortest = inputArray[0];
        String longest = inputArray[0];

        // Проходим по массиву строк и находим самую короткую и самую длинную строку
        for (String str : inputArray) {
            if (str.length() < shortest.length()) {
                shortest = str;
            }
            if (str.length() > longest.length()) {
                longest = str;
            }
        }

        // Возвращаем результат в виде массива
        return new String[]{shortest, longest};
    }
}
