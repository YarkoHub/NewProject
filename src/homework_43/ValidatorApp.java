package homework_43;

public class ValidatorApp {
    public static void main(String[] args) {
        String testPassword = "qwerty1Q!";

        testPassword = "qwerty!1";
        testPassword = "qwert";
        testPassword = "QWERTY1!";
        testPassword = "qwetRTY1";

        try {
            PasswordValidator.passwordValidate(testPassword);
            System.out.println("Пароль прошел валидацию");
        } catch (PasswordValidateException e) {
            System.out.println("Валидация провалена");
            System.out.println(e.getMessage());
        }
    }
}
