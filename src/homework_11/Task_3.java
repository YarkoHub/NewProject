package homework_11;

public class Task_3 {
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int countPrimesInArray(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (isPrime(num)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Пример использования
        int[] inputArray = {2, 3, 5, 7, 10, 13, 17};
        int result = countPrimesInArray(inputArray);
        System.out.println("Количество простых чисел в массиве: " + result);
    }
}
