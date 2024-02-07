package homework_15;

//Посмотрите вокруг себя. Напишите три класса, описывающие какие-то сущности вокруг Вас. Не забудьте использовать абстракцию.
//
//Например, опишите студента, преподавателя и, допустим, врача.
//
//Вы можете выбрать свои сущности для описания.


import java.util.Random;

public class Children {
    public static void main(String[] args) {


        Person person1 = new Person("Кирилл", "Компьютер", "Отдых на море", 13);
        Person person2 = new Person("София", "Рисование", "Отдых на море", 14);


        String[] strings1 = {"Смотрит телевизор ", "Смотрит телевизор ", "Учиться в школе "};

        Random random = new Random();
        int randomIndex1 = random.nextInt(strings1.length);
        int randomIndex2 = random.nextInt(strings1.length);
        String randomStr1 = strings1[randomIndex1];
        String randomStr2 = strings1[randomIndex2];


        String Children1;
        Children1 = "Кирилл";
        String Children2;
        Children2 = "София";


        Person[] person = new Person[2];
        person[0] = person1;
        person[1] = person2;

        for (int i = 0; i < person.length; i++) {
            System.out.println("Мои Дети:");
            System.out.println("Имя : " + person[i].name);
            System.out.println("Возраст : " + person[i].age);
            System.out.println("Хоби Увличения : " + person[i].hooby);
            System.out.println("Мечтает : " + person[i].traum);
            System.out.println("============================================");
        }


        System.out.println(Children1 + " Так-же любит : "+randomStr1);
        System.out.println(Children2 + " Так-же любит : "+randomStr2);


    }

}
