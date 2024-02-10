package TestingProdject;
/*
Написать метод по поиску строки в массиве строк.
На вход метод принимает массив строк, и строку для поиска.
 */
public class T14_3 {
    public static void main(String[] args) {

        String[] strings = {"Java", "Python", null, "Orange", "JS", "hello"};
        System.out.println(searchString(strings, "Jav"));

    }


    public static int searchString(String[] strings, String fidMe) {
        if (strings == null || fidMe == null) return -1;

        for (int i = 0; i < strings.length; i++) {
           if (strings[i] != null  && strings[i].equals(fidMe)) return i; // строгое равенство с учетом регистров
            //if (strings[i] != null  && strings[i].equalsIgnoreCase(fidMe)) return i; // метод сравнения значений строк без учета регистра
        }

        return -1;
    }



}

