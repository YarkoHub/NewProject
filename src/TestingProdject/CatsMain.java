package TestingProdject;

public class CatsMain {
    public static void main(String[] args) {

        Cat cat = new Cat("Tim", "Blue", 5);

        cat.sleep();
        cat.seyMeow();
        cat.run();

        String catNameVar = cat.name;
        System.out.println("Имя кота: " + catNameVar);
        System.out.println("Возраст кота: " + cat.age);
        System.out.println("Цвет: " + cat.color);

        System.out.println("==================================");

        Cat cat1 = new Cat("MAX");

        cat.sleep();
        cat.seyMeow();
        cat.run();

        String catNameVar1 = cat1.name;
        System.out.println("Имя кота: " + catNameVar1);
        System.out.println("Возраст кота: " + cat1.age);
        System.out.println("Цвет: " + cat1.color);

        cat.whoAmI();
        cat1.whoAmI();
    }
}
