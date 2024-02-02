package homework_4;

public class Home04_2 {
    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = "is";
        String s3 = "a";
        String s4 = "powerful";
        String s5 = "language";

        String result = s1 + " " + s2 + " " + s3 + " " + s4 + " " + s5;

        String result2 = s1.concat(s2).concat(s3).concat(s4).concat(s5);


        System.out.println("Склеенная строка 1: " + result);

        System.out.println("Склеенная строка 2: " + result2);

        System.out.println("Длина строки: " + result.length());

        result = result.replace("powerful","SUPER"); // replace - заменяет значение!

        System.out.println("Замена слова: " + result);

        boolean contains= result.contains("age");

        System.out.println("Содержит age ?: " + contains);

    }
}
