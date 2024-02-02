package homework_9;

public class Task01G {
    // Метод для распечатывания массива в обратной последовательности
    public static void printReverse(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Перегруженный метод для распечатывания части массива в обычном и обратном порядке
    public static void printWithIndex(int[] array, int index) {
        // Распечатываем часть массива слева до индекса в обычном порядке
        for (int i = 0; i <= index; i++) {
            System.out.print(array[i] + " ");
        }

        // Распечатываем часть массива начиная с индекса в обратном порядке
        for (int i = array.length - 1; i > index; i--) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
    }

    // Перегруженный метод с булевым флагом для выбора порядка печати
    public static void printWithFlag(int[] array, boolean reverseOrder) {
        if (reverseOrder) {
            // Печатаем массив в обратном порядке
            for (int i = array.length - 1; i >= 0; i--) {
                System.out.print(array[i] + " ");
            }
        } else {
            // Печатаем массив в прямом порядке
            for (int value : array) {
                System.out.print(value + " ");
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {1, 4, 3, 6, 7};

        // Вызываем методы с разными аргументами
        printReverse(array);

        int index = 2;
        printWithIndex(array, index);

        boolean reverseOrder = true;
        printWithFlag(array, reverseOrder);
    }
}
