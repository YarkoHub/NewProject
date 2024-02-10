package homework_19;
//Класс "Калькулятор" Создайте класс Calculator, который будет предоставлять базовые арифметические
//операции: сложение, вычитание, умножение и деление.
//добавить возможность введения числа пользователем
//Класс должен содержать: Статические методы для каждой операции, принимающие два аргумента и возвращающие результат операции.
public class Calculator {

    static int plus (int x, int y) {
        return x + y;
    }

    static int minus (int x, int y) {
        return x - y;
    }

    static int umnozenue (int x, int y) {
        return x * y;
    }

    static int delenie (int x, int y) {
        return x / y;
    }

    public Calculator() {
    }
}
