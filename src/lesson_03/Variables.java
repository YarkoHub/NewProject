package lesson_03;

public class Variables {

    public static void main(String[] args){

        int myFirstVariable; // Объявление (декларации) переменной

        myFirstVariable = 1; // Присвоение значение переменной, Первое присвоение значения

        int mySecondVerible = 25; // Объявление и инициализация в одной строке

        System.out.println( mySecondVerible );

        mySecondVerible = 50; // Присвоение нового значения

        System.out.println( mySecondVerible );

        byte byteVar = 125; // Объявление и инициализация типа byte

        byteVar = 0;

        System.out.println("значение переменной " + byteVar);


        short shortVar; // Объявление  переменной типа short

        shortVar =  31000; // инициализация переменной

        long longVariable = 2_111_000_000_000_000_000L; // знак подчеркивание не влияет не на что а просто для лучшего визуального восприятия
        // L в конце числа - СКАЗАТЬ КАОПИЛЯТОРУ ЧТО ЭТО ЧИСЛО В ФОРМАТЕ ЛОНГ

        System.out.println( longVariable + longVariable  );

        double doubleVar = 2.245; // ЧИСЛО С ПЛАВАЮЩЕЙ ТОЧКОЙ ИЛИ ЗАПЯТОЙ
        System.out.println( "плавающая точа = " + doubleVar );

        float FloatVar = 11.45F; // ЧИСЛО С ПЛАВАЮЩЕЙ ТОЧКОЙ ИЛИ ЗАПЯТОЙ


    }

}
