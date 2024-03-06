package homework_36;

import java.util.Arrays;

//Напишите MyComparator2 с методом сравнения для сортировки массива целых чисел в следующем порядке:
//
//Четные целые числа должны идти перед нечетными числами в порядке возрастания.
//Нечетные целые числа должны идти после четных в порядке убывания
//Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };
//[2, 4, 6, 8, 9, 7, 7, 5, 3, 1] // Outpur
public class MyComparator2 implements Comparator2 {
    @Override
    public int compare(Integer a, Integer b) {
        if (a % 2 == 0 && b % 2 == 0) {
            return a - b;
        } else if (a % 2 != 0 && b % 2 != 0) {
            return b - a;
        } else if (a % 2 == 0) {
            return -1;
        } else {
            return 1;
        }
    }
}
