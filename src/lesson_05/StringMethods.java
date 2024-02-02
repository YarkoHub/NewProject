package lesson_05;

public class StringMethods {
    public static void main(String[] args) {

        String str1 = "One";
        String str2 = " ";
        String str3 = "Hallo";

        //1. Различные варианты конкатенации
        String concatStr = str1+ str2+ str3; // Склеивание строк
        System.out.println(concatStr);
        concatStr = str1 + " " + str3 + " " + "String";
        System.out.println(concatStr);

        //2 Метот concat
        String concatStr2 = str1.concat(str3);
        System.out.println(concatStr2);
        concatStr2 = str1.concat(str3).toUpperCase();
        System.out.println(concatStr2);
        concatStr2 = str1.concat(str3);
        concatStr2 = concatStr2.toUpperCase();
        System.out.println(concatStr2);

//  3 метот join (статический)

        String concatStrJoin = String.join("==",str1,str3);
        System.out.println(concatStrJoin);



        int int1 = 1;
        int int2 = 2;
        System.out.println("Сумма " +int1 + int2 );
        System.out.println(int1 + int2 + " Сумма " + (int1 + int2) );

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++\n");



        String digits = "0123456789";
        int len = digits.length();
        System.out.println("Длина строки " + len);
        //Взятие символа по порядковому номеру
        char firstChar = digits.charAt(0);
        System.out.println("firstChar: " + firstChar);
        digits = "оимфолфим";
        //последний номер нашей строки. имеет  индекс length(-1)
        char lastChar = digits.charAt(digits.length() -1);
        System.out.println("lastChar: " + lastChar);


        //Выделение подстроки из строки
        String substring = digits.substring(5);//Выделяется подстрока с 5 индекса и до конца строки
        System.out.println("substring " + substring);

        System.out.println(digits); // digits Остается не изменным
        substring = digits.substring(5, 8); // от одной буквы до другой

        System.out.println("substring 5-8: " + substring);

        //ищет индекс начала вхождения подстроки в строке
        digits = "0123456789-10";
        int index = digits.indexOf('4');
        System.out.println("index: " + index);
        index = digits.indexOf("45");
        System.out.println("index: " + index);
        index = digits.indexOf('1');
        System.out.println("indexOf1: " + index);
        index = digits.lastIndexOf('1');
        System.out.println("lastIndexOf: " + index);

        ///indexOf c лева ищет.
        ///lastIndexOf - с права ищет.


        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++\n");
        // ЗАМЕНА . ЗАМЕНЯЕМ ПОДСТРОКУ НА ДРУГУЮ
        String target = "abacabeabd";
        String output = target.replace("ab", "AB");
        System.out.println("output :" +output);

        output = target.replaceFirst( "ab", "AB");
        System.out.println("output :" +output);

        output = target.replaceAll( "ab", "CC");
        System.out.println("output :" +output);









    }
}
