package TestingProdject;
//Написать метод переводящие все маленькие буквы латинского алфавита в строке в верхний регистр.
public class lesson_task_0 {

    public static void main(String[] args) {
        String stringTest = "sddsdDSDDSSsdsd";
        System.out.println(stringTest);
        System.out.println(stringToUpperCase(stringTest));
    }
    public static String stringToUpperCase (String string){

    if (string == null) return null;

//ПОДХОД № 1
    // 1. Преобразую строку в массив char
    char[] chars = string.toCharArray();

    //2. Перебрать символы. если есть маленький регистр делаем большой
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z'){

                //  Преобразовываем на верхний регистр!
                chars[i] = (char) (chars[i] - 32);
            }
        }
    //3. Сформировать из массива char строку и вернуть из метода
        return String.valueOf(chars); // Сформировать из массива char строку и вернуть из метода
        //return  new String(chars); // Сформировать из массива char строку и вернуть из метода
    }
}
