package homework_14;
//Написать метод, принимающий строку и возвращающий новую строку, состоящую из 2го и 3го символа входящей строки,
// переведенных в верхний регистр. Распечатать полученный результат в методе main
//"Hello" -> "EL"
//"He" -> "E"
//"H" -> ???
public class Task_04 {

    public static void main(String[] args) {
        // Пример использования метода
        String str1 = newstroce ("Hello");
        System.out.println(str1);  // Вывод: "EL"

        String str2 = newstroce ("He");
        System.out.println(str2);  // Вывод: "E"

        String str3 = newstroce ("H");
        System.out.println(str3);  // Вывод: ""
        System.out.println("Строка 3 :" +str3);
    }

    // Метод для извлечения 2-го и 3-го символов в верхнем регистре
    public static String newstroce (String input) {
        // Проверяем, что строка не является null и имеет длину не менее 3 символов
        if (input != null && input.length() >= 3) {
            // Извлекаем 2-й и 3-й символы и переводим их в верхний регистр
            char char2 = Character.toUpperCase(input.charAt(1));
            char char3 = Character.toUpperCase(input.charAt(2));


            // Формируем новую строку из полученных символов
            return String.valueOf(char2) + String.valueOf(char3);
        } else {
            // Если строка не соответствует условиям, возвращаем пустую строку
            return "";
        }

    }


}
