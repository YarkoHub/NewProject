package homework_14;
//Написать метод swap, принимающий на вход массив целых чисел, и два индекса.
// Метод должен поменять местами значения, хранящихся в этих индексах
//{0, 1, 2, 3, 4, 5, 6} -> swap(arr, 1, 5} -> {0, 5, 2, 3, 4, 1, 6}
//Если индексы за пределами массива?
//Перегрузка метода для работы с массивами строк.
public class Task_01 {
    public static void main(String[] args) {
        // Пример использования метода swap для массива целых чисел
        int[] intArray = {0, 1, 2, 3, 4, 5, 6};
        System.out.println("Исходный массив целых чисел: " + java.util.Arrays.toString(intArray));
        swap(intArray, 1, 5);
        System.out.println("Массив после swap: " + java.util.Arrays.toString(intArray));

    }

    // Метод swap для массива целых чисел
    public static void swap(int[] array, int index1, int index2) {
        if (index1 >= 0 && index1 < array.length && index2 >= 0 && index2 < array.length) {
            int temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        } else {
            System.out.println("Неверные индексы. Обмен не выполнен.");
        }
    }

    // Перегруженный метод swap для массива строк
    public static void swap(String[] array, int index1, int index2) {
        if (index1 >= 0 && index1 < array.length && index2 >= 0 && index2 < array.length) {
            String temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        } else {
            System.out.println("Неверные индексы. Обмен не выполнен.");
        }
    }
}
