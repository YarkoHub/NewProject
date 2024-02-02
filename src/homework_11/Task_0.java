package homework_11;

public class Task_0 {

    // Метод для распечатки массива в обратной последовательности
    public static void printReversed(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Перегрузка метода с индексом
    public static void printReversedFromIndex(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            System.out.println("Invalid index");
            return;
        }

        // Печать части массива слева до индекса в обычном порядке
        for (int i = 0; i <= index; i++) {
            System.out.print(array[i] + " ");
        }

        // Печать части массива начиная с индекса в обратном порядке
        for (int i = array.length - 1; i > index; i--) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
    }

    // Перегрузка метода с булевым флагом
    public static void printArrayWithFlag(int[] array, boolean reverseFlag) {
        if (reverseFlag) {
            printReversed(array);
        } else {
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 6, 7};

        // Примеры использования методов
        printReversed(arr);

        int index = 2;
        printReversedFromIndex(arr, index);

        boolean reverseFlag = true;
        printArrayWithFlag(arr, reverseFlag);

        reverseFlag = false;
        printArrayWithFlag(arr, reverseFlag);
    }
}
