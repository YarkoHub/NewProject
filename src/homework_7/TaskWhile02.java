package homework_7;

public class TaskWhile02 {

    public static void main(String[] args) {
        int count = 0;
        int number = 1;

        while (count < 7) {
            if (number % 5 == 0) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }


}
