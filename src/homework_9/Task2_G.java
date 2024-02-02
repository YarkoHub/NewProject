package homework_9;

public class Task2_G {
    // Метод для создания и распечатывания нового массива указанной длины
    // с копированием элементов из начального массива
    public static void copyOfArray(int[] originalArray, int newLength) {
        if (newLength < 0) {
            System.out.println("Длина нового массива должна быть неотрицательным числом.");
            return;
        }

        int[] newArray = new int[newLength];

        // Определение длины копируемой части
        int copyLength = Math.min(originalArray.length, newLength);

        // Копирование элементов из начального массива
        for (int i = 0; i < copyLength; i++) {
            newArray[i] = originalArray[i];
        }

        // Вывод нового массива на экран
        System.out.print("{");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i]);
            if (i < newArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6};
        int newLength = 3;

        // Вызов метода copyOfArray
        copyOfArray(array, newLength);
    }
}
