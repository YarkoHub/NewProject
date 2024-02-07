package homework_16;


public class FlexArray {

    String[] array;
    public int size;

    public FlexArray() {
        array = new String[10]; // начальный размер массива
        size = 0;
    }

    public void add(String element) {
        if (size == array.length) {

            String[] newArray = new String[array.length * 2];
            array = newArray;
        }
        array[size++] = element;
    }

    public void display() {
        System.out.println("Элементы масива: ");
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }


}
