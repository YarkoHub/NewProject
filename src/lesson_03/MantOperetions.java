package lesson_03;

public class MantOperetions
{

    // Математические сложения значение и результат!
    public static void main(String[] args){

        int var1 =20;
        int var2 =7;

        int result;

            // сложение результат
        result = var1+var2;

            System.out.println("Результат + = " +result);

        result = 15+15; // Или такой вариант!

            System.out.println("Результат + = " +result);

        int result2 = var1 + var2; // еще вариант вычисления

        result = var1 - var2;
        System.out.println("Результат - = " +result);

        // УМНОЖЕНИЕ
        result = var1 * var2;
        System.out.println("Результат * умножение = " +result);

        // ЦЕЛОЧИСЛЕННОЕ ДЕЛЕНИЕ (округляет число)

        result = var1 / var2;  // будет остаток 20// = 2 остаток 6

        System.out.println("devResult: = " +result);

        // % ОСТАТОК ОТ ДЕЛЕНИЯ

        result = var1 % var2;

        System.out.println("devResult: ОСТАТОК ОТ ДЕЛЕНИЯ = " +result);

        result = var1 % var2;
        System.out.println("целочисленные деления  = " + (4 + 2) ); // 2
        System.out.println("остаток от деления  = " + (4 % 2) ); // 0


        System.out.println("остаток от деления  = " + (5 % 10) );
        System.out.println("остаток от деления  = " + (5 / 10) );

    // 18/10-> 1 целая и 8 в остатке  -> и обратно 2*10+8

        System.out.println("====================================================== ");


    // ОПЕРАЦИЯ ДЕЛЕНИЕ
        double doubleVar = 20.0d; // явно указано что число записано в формате double
        double doubleSeven = 7.0; // все числа, записанные в нашем коде с "." считаются числами в формате double

        double doubleResult = doubleVar / doubleSeven;

        System.out.println("doubleResult dev  = " + doubleResult);

        //
        int a = 20;
        int b = 7;
        int intResult = a / b;

        // %d - шаблон для цифры
        // %f - шаблон для числа с плавующей точкой
        // %.2 или 4f - вывести число с плавующей точки, Отобразить ровно 2 иди 4 знака после запятой
        System.out.println("результат деления" + a + "на" + b + "равен = " + intResult);
        System.out.printf(" Результат деления %d на %d  \n равен = %d\n", a, b, intResult);
        System.out.println("Что нибудь!");


        // \n- -> перевод каретки на новую строчку

        // %d - шаблон для цифры
        // %f - шаблон для числа с плавуюшей точкой

        System.out.printf("Округленый вывод деления %.2f\n", doubleResult);

        System.out.println("====================================================== ");










    }


}
