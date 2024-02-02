package homework_11;

public class Task_1 {

    // Метод для проверки, является ли число простым
    public static boolean isPrime(int number) {
        // Проверка на отрицательные числа и 0, 1
        if (number <= 1) {
            return false;
        }

        // Проверка наличия делителя от 2 до корня из числа
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                // Если число делится нацело, то оно не простое
                return false;
            }
        }

        // Если не найдено делителей, то число простое
        return true;
    }

    public static void main(String[] args) {
        // Пример использования метода
        int num = 17;
        if (isPrime(num)) {
            System.out.println(num + " является простым числом.");
        } else {
            System.out.println(num + " не является простым числом.");
        }
    }
}
