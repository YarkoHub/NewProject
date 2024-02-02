package homework_4;

public class Home04_4 {
    public static void main(String[] args) {

        char s1 = 'y';
        char s2 = 'a';
        char s3 = 'r';
        char s4 = 'o';
        char s5 = 's';
        char s6 = 'l';
        char s7 = 'a';
        char s8 = 'v';

        String nameUp =( "" + (char)(s1 - 'a'+ '\u0041') +
                (char)(s2 - 'a' + '\u0041') +
                (char)(s3 - 'a' + '\u0041') +
                (char)(s4 - 'a' + '\u0041') +
                (char)(s5 - 'a' + '\u0041') +
                (char)(s6 - 'a' + '\u0041') +
                (char)(s7 - 'a' + '\u0041') +
                (char)(s8 - 'a' + '\u0041'));
        System.out.println("name: " + nameUp);



    }


}
