package homework_4;

public class Home04 {

    public static void main(String[] args) {

        String name = "Ярослав";
        System.out.println(name.length());

        char letter1 = name.charAt(0);
        char letter2 = name.charAt(name.length() - 1);

        System.out.println("Первый символ: " + letter1);
        System.out.println("Последний символ: " + letter2);

        System.out.println("Код первого символа: " + (int) letter1);
        System.out.println("Код последнего символа: " + (int) letter2);

    }

}
