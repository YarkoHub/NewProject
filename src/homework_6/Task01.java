package homework_6;

import java.util.Scanner;

public class Task01 {

    //���������� �������� ���������, ��� �� ������������ ������������
    // ������ ����� �� �����: 1, 2 ��� 3,
    // � ��������� ������ �������, ����� ����� ��� ������������: 1, 2, ��� 3
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" ������� ����� �� 1 �� 3 ");

        int userNumer1 = scanner.nextInt();


        if (userNumer1 == 1) {
            System.out.println("�� ����� ����� 1");
        } else if (userNumer1 == 2) {
            System.out.println("�� ����� ����� 2");
        } else if (userNumer1 == 3) {
            System.out.println("�� ����� ����� 3");
        } else {
            System.out.println("�� ����� ������������ �����.");
        }

        scanner.close();


    }
}
