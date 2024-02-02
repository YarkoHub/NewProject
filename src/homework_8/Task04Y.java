package homework_8;
// Дан массив строк. Вывести на экран все символы из самой длинной строки массива
//
//{ “One”, “Two”, “Twenty” } -->

public class Task04Y {

    public static void main(String[] args) {

        String[] strings = {"Yaroslav", "Hrytsenko", "YaroslavHrytsenko", };

        String longestStr = strings [0];
        int i = 0;

        while (i < strings.length){ //  length (количество символов) Длина.

            String yarkoElement = strings[i]; //
            if (yarkoElement.length()>longestStr.length()){
                longestStr = yarkoElement;
            }
            i++;
        }
        System.out.println("Самое длинное слово : - " +longestStr);

        char[] chars = longestStr.toCharArray(); // преобразует строку в соответствующий массив символов
        int k = 0;
        while (k < chars.length){

            System.out.print(chars[k++]);
        }



    }
}
