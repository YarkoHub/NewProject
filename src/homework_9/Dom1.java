package homework_9;

import java.util.Scanner;

public class Dom1 {
    public static void main(String[] args) {

            int Gostinaya = 0;
            int Spalnya = 0;
            int Kuhnya =0;

            Scanner scanner = new Scanner(System.in);

            System.out.println("Включите свет - введите номер от 1 до 3 : -");
            int buttonNumer = scanner.nextInt();
            System.out.println("Hомер кнопки." + buttonNumer);

        switch (buttonNumer) {
            case 1:
                Gostinaya = 4;
                Kuhnya = 4;
                Spalnya = 2;
                break;
            case 2:
                Gostinaya = 2;
                Kuhnya = 4;
                Spalnya = 4;
                break;
            case 3:
                Gostinaya = 3;
                Kuhnya = 3;
                Spalnya = 3;
                break;
            case 4:
                Kuhnya = 1;
                break;
            case 5:
                Gostinaya ++;
                Kuhnya++;
                break;
            case 6:
                Spalnya -= 2;
                break;
            default:
                System.out.println("Некорректный номер кнопки.");
                break;
        }
        Status (Gostinaya, Kuhnya, Spalnya);
        scanner.close();

    }

    private static void Status(int Gostinaya, int Kuhnya, int Spalnya){

        System.out.println("Состояние освещения:");
        System.out.println("Гостиная: " + setting(Gostinaya));
        System.out.println("Кухня: " + setting(Kuhnya));
        System.out.println("Спальня: " + setting(Spalnya));
        System.out.println();
    }
    // интенсивность света
    private static String setting (int intensiv) {
        switch (intensiv) {
            case 1:
                return "Выключен";
            case 2:
                return "Тусклый";
            case 3:
                return "Средний";
            case 4:
                return "Яркий";
            default:
                return "Некорректно";
        }
    }



}
