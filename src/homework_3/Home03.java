package homework_3;

public class Home03 {
    public static void main(String[] args) {

        System.out.println("======Задача №1 =========\n");

// Задача 1

        int num1 = 0;
        int num2 = 1;
        int num3 = 2;
        int num4 = 3;
        int num5 = 4;
        int num6 = 5;
        int num7 = 6;
        int num8 = 7;
        int num9 = 8;
        int num10 = 9;

        int sum = num1+num2+num3+num4+num5+num6+num7+num8+num9+num10;
        int summa = sum / 10;
        int remainder = sum % 10;

        System.out.println("Cреднее арифметическое этих чисел = " + summa + "\n");
        System.out.println("Отброшенная дробная часть: " + remainder + "\n");

// Ответ:
//Cреднее арифметическое этих чисел = 4
//Отброшенная дробная часть: 5

        System.out.println("\n=======//Задача 2.========\n");

//Задача 2.

        double cena1 = 100;
        double cena2 = 50;
        double discount = 10;

        double result = cena1+cena2;
        double result2 = ((cena1+cena2)*(discount/100));


        System.out.println("Цена товара до скидки " + result + " euro\n" );
        System.out.println((result) - (result2) + " euro "+" Цена товара уже со скидкой\n" );

        double result3 = (cena1) + (cena2) - (result) - (result2);

        System.out.println( "Скидка на товар " + (result) / (result2) + " % \n это " + result3 + " euro\n");

//Ответ который выводит
//Цена товара до скидки 150.0 euro
//135.0 euro Цена товара уже со скидкой
//Скидка на товар 10.0 %
// это -15.0 euro

        System.out.println("=======//Задача 3.========\n");

// Задача 3 - Средняя погода по Mannheim на неделю

        double Monday = 7;
        double Tuesday = 7;
        double Wednesday = 13;
        double Thursday = 10;
        double Friday = 10;
        double Saturday = 7;
        double Sunday = 8;

        double ResultWeekTemperatur = (Monday+Tuesday+Wednesday+Thursday+Friday+Saturday+Sunday)/7;
        System.out.printf("Средняя температура \n в Манхайме за неделю %.2f °C \n" , ResultWeekTemperatur);

        // Средняя температура
        // в Манхайме за неделю 8,86

//Ответ:
//Средняя температура
// в Манхайме за неделю 8,86 °C

        System.out.println("\n=======// ДОПОЛНИТЕЛЬНО калькулятор */ ========\n");

// ДОПОЛНИТЕЛЬНО        // ДОПОЛНИТЕЛЬНО СДЕЛАЛ ПРОСТОЙ КАЛЬКУЛЯТОР

        double van1 = 5;
        double van2 = 7;

        double Result = (van1*van2);
        double Result2 = (van1/van2);
        System.out.printf("УМНОЖЕНИЕ %.5f \n",Result);
        System.out.printf("ДЕЛЕНИЕ %.5f \n" , Result2);

//УМНОЖЕНИЕ 35,00000
//ДЕЛЕНИЕ 0,71429


        System.out.println("\n======Задача №4 =========\n");

// Задача 4

        //Остаток от деления на 3
        // var - это придуманное число!
        int var1 = 7;
        int var2 = 5;
        int resultat1 = var1 %2;
        int resultat2 = var2 %2;
        System.out.println("Остаток от деления на 2 \n" + var1 + " % 2 = " + resultat1 + "\n");
        System.out.println("Остаток от деления на 2 \n" + var2 + " % 2 = " + resultat2 + "\n");

        //Остаток от деления на 3
        int var3 = 3;
        int var4 = 6;
        int resultat3 = var3 %3;
        int resultat4 = var4 %3;
        System.out.println("Остаток от деления на 3 \n" + var3 + " % 3 = " + resultat3 +  "\n");
        System.out.println("Остаток от деления на 3 \n" + var4 + " % 3 = " + resultat4 +  "\n");


// Ответ:
//Остаток от деления на 2
//7 % 2 = 1
//Остаток от деления на 2
//5 % 2 = 1

//Остаток от деления на 3
//3 % 3 = 0
//Остаток от деления на 3
//6 % 3 = 0



        System.out.println("\n======Задача №5 =========\n");

// Задача 5
        int x = 3;
        x += x++;
        System.out.println("Значение Х будет равно: " + x + "\n");

// Ответ:
// Значение Х будет равно: 6


    }
}
