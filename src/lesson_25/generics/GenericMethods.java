package lesson_25.generics;

public class GenericMethods {
    public static <T> void printBoxes(GenericsBox<T>[] boxes) {
        for (GenericsBox<T> box : boxes) {
            System.out.println(box + "; ");
        }
    }

    // в контексте
}
