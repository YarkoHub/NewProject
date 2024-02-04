package homework_14;
//Написать метод по поиску строки в массиве строк. На вход метод принимает массив строк, и строку для поиска.
public class Task_03 {

    public static void main(String[] args) {
        String[] array = {"Auto","Autowash","Autoservice","Automaster","Automehanik"};
        String search = "Autoservice";

        int resultat = search(array, search);

        if (resultat != -1) {
            System.out.println("Слово " + search + " индекс " + resultat);
        }
    }

    public static int search(String[] array, String search) {
        if (array == null || search == null) {
            return -1;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(search)) {
                return i;
            }
        }

        return -1;
    }

}
