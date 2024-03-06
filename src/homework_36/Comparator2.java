package homework_36;

import java.util.Arrays;

public interface Comparator2 {
    static void main(String[] args) {
        Integer[] integers = {1, 6, 5, 4, 7, 8, 9, 2, 7, 3};
        Arrays.sort(integers);
        System.out.println(Arrays.toString(integers));
    }

    int compare(Integer a, Integer b);
}
