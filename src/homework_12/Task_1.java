package homework_12;
//Task 1
//Написать метод, принимающий на вход массив строк.
// Метод должен вернуть массив, состоящий из самой короткой и
// самой длинной строки изначального массива.
public class Task_1 {
    public static void main(String[] args){

        String [] textArrey = {"Auto","Autowash","Autoservice","Automaster","Automehanik"};
        String [] resultArrey = findStrings(textArrey);

        System.out.println("Короткое слово :" + resultArrey[0]);
        System.out.println("Длинное слово :" + resultArrey[1]);
}
        public static String[] findStrings (String[] textArrey) {

            if (textArrey == null || textArrey.length == 0) {
                return new String[0];

            }

            String minstr = textArrey[0];
            String maxstr = textArrey[0];

            for (String str : textArrey) {
                if (str.length() < minstr.length()) {

                    minstr = str;
                }


                if (str.length() > maxstr.length()) {

                    maxstr = str;
                }
            }


            return new String[]{minstr, maxstr};
        }


}


