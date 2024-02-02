package lesson_12;

import java.util.Random;

public class TekstName {
    public static void main(String[] args) {

    }
    static void KotyaName (String name) {
        System.out.printf("Привет, очень приятно познакомится , %s\n", name);

        Random random = new Random();
        int randomNumber = random.nextInt(101);

        System.out.println("Твое счачтливое число :" + randomNumber);

        }





}
