package homework_9;

public class Task3N {

    //опционально Написать программу, выводящую на экран треугольник, состоящий из цифр от 1 до 6 такого вида:
    //
    //1
    //12
    //123
    //1234
    //12345
    //123456

    public static void main(String[] args) {

        int stroca = 6;

        for (int i = 0; i < stroca ; i++) {

            for (int j = 1; j <= i+1 ; j++)
            {
                System.out.print(j);
            }
            System.out.println();

        }

    }
}
