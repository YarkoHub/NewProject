package homework_14;
//Написать метод переводящие все маленькие буквы латинского алфавита в строке в верхний регистр.
public class Task_0 {
    public static void main(String[] args) {
        String input = "Yaroslav";
        String result = register(input);

        System.out.println("Большими буквами " + result);
    }

    public static String register(String input) {
        char[] charArray = input.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if ('a' <= charArray[i] && charArray[i] <= 'z') {
                charArray[i] = (char) (charArray[i] - 'a' + 'A');
            }
        }
        return new String(charArray);
    }
}
