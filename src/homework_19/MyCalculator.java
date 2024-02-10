package homework_19;

import java.util.Scanner;

public class MyCalculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число (1) :");
        int num1 = scanner.nextInt();
        System.out.println("Введите число (2) :");
        int num2 = scanner.nextInt();

        System.out.print("Выберите операцию (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        int result;
        switch (operator) {
            case '+':
                result = Calculator.plus (num1, num2);
                System.out.println("Результат: " + result);
                break;
            case '-':
                result = Calculator.minus(num1, num2);
                System.out.println("Результат: " + result);
                break;
            case '*':
                result = Calculator.umnozenue(num1, num2);
                System.out.println("Результат: " + result);
                break;
            case '/':
                result = Calculator.delenie (num1, num2);
                System.out.println("Результат: " + result);
                break;


        }

        scanner.close();
    }


}
