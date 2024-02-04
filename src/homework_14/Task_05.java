package homework_14;
// Реализуйте метод sumOfArray (сумма элементов массива),
// который получает на вход массив и определяет сумму его элементов.
public class Task_05 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int result = sumOfArray(array);
        System.out.println("Сумма массива: " + result);
    }
    public static int sumOfArray(int[] array) {

        int sum = 0;
        for (int suma : array) {
            sum += suma;
        }

        return sum;
    }


}
