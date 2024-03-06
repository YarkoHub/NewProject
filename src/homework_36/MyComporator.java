package homework_36;

import java.util.Arrays;
import java.util.Comparator;

//Напишите MyComparator, реализующий Comparator с методом сравнения для сортировки
// массива целых чисел в следующем порядке: Четные целые числа должны идти перед нечетными числами
public class MyComporator {

    public static void main(String[] args) {
        Integer[] integers = {1, 6, 5, 4, 7, 8, 9, 2, 7, 3};
        Arrays.sort(integers, new NewComparator());
        System.out.println(Arrays.toString(integers));
    }

    static class NewComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer a, Integer b) {
            if (a % 2 == 0 && b % 2 != 0) {
                return -1;
            } else if (a % 2 != 0 && b % 2 == 0) {
                return 1;
            } else {
                return a - b;
            }
        }
    }


}
