package homework_4;

public class Home04_3 {
    public static void main(String[] args) {

        String str1 = "string";
        String str2 = "code";
        String str3 = "practice";


        int middle = str1.length() / 2;
        String sl1 = str1.substring(middle - 1, middle + 1);

        int middle2 = str2.length() / 2;
        String sl2 = str2.substring(middle2 - 1, middle2 + 1);

        int middle3 = str3.length() / 2;
        String sl3 = str3.substring(middle3 - 1, middle3 + 1);

        System.out.println((sl1) + "\n" + (sl2) + "\n" + (sl3));
    }
}
