package homework_5;

import java.util.Scanner;
// Создайте переменную типа int.
//Получите произвольное значение переменной из консоли (используем Scanner)
//Выведите строку в формате:
//Число: 6 четное: true; кратно 3: true; четное и кратное 3: true
//Число: 3 четное: false, кратно 3: true, четное и кратное 3: false
//(опционально) - учесть, что случайное число может оказаться 0


public class Home4 {

    public static void main(String[] args) {
        // Создаем переменную типа int и инициализируем её произвольным значением
        int number = 6;

        // Выводим информацию о числе в заданном формате
        System.out.println("Число: " + number + " четное: " + (number % 2 == 0) + "; кратно 3: " + (number % 3 == 0) + "; четное и кратное 3: " + (number % 2 == 0 && number % 3 == 0));

        // Присваиваем переменной другое произвольное значение
        number = 3;

        // Выводим информацию о новом числе в заданном формате
        System.out.println("Число: " + number + " четное: " + (number % 2 == 0) + "; кратно 3: " + (number % 3 == 0) + "; четное и кратное 3: " + (number % 2 == 0 && number % 3 == 0));

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++\n");
        int number1 = 6;
        int number2 = 3;

        boolean isZero = number1 ==0;
        boolean isZero2 = number2 ==0;

        boolean isEven = !isZero && number1 % 2 == 0;
        boolean iDBThre = !isZero && number1 % 3 == 0;
        boolean isEven2 = !isZero2 && number2 % 2 == 0;
        boolean iDBThre2 = !isZero2 && number2 % 3 == 0;

        System.out.println("Число: " + number1 + " четное: " + isEven
                + "; кратно 3: " + iDBThre + "; четное и кратно 3: " + (isEven && iDBThre) );
        System.out.println("Число: " + number2 + " четное: " + isEven2
                + ", кратно 3: " + iDBThre2 + ", четное и кратно 3: " + (isEven2 && iDBThre2) );



    }


}
