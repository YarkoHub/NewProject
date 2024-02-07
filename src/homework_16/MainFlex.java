package homework_16;
//В резиновом массиве должны быть реализованы методы:
//Добавление элемента
//Вывести все значения в массиве в консоль
public class MainFlex {

    public static void main(String[] args) {
        FlexArray flexibleArray = new FlexArray();
        flexibleArray.add("Понедельник");
        flexibleArray.add("Вторник");
        flexibleArray.add("Среда");
        flexibleArray.add("Четверг");
        flexibleArray.add("Пятница");
        flexibleArray.add("Суббота");
        flexibleArray.add("Воскресенье");

        flexibleArray.display();

    }
}
