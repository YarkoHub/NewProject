package homework_7;

import java.util.Scanner;

public class TaskWhile03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tekst = "HELLO";
        int numer = 0;

        System.out.println("Введите слово 'HELLO':");

        while (true) {
            String userInput = scanner.nextLine();
            numer++;

            if (userInput.equals(tekst)) {
                System.out.println("Вы ввели правильное слово.");
                System.out.println("Количество попыток: " + numer);
                break;
            } else {
                System.out.println("Вы ввели неправильное слово. Попробуйте снова: ");
            }
        }

        scanner.close();
    }

}
