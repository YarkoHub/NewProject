package TestingProdject;

public class Cat {

    String name;
    String color;
    int age;




// КОНСТРУКТОР ПО УМОЧАНИЮ
    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    // Перегруженный конструктор
    public Cat(String catName) {
        System.out.println("Конструктор 2");
        name = catName;
        color = "ELOU";
    }

    void sleep () {
        System.out.println("Я сплю");
    }
    void seyMeow () {
        System.out.println("Мяу");
    }
    void run () {
        System.out.println("run");
    }
    public void whoAmI() {
        System.out.println("Я котик " + name + ", мой возраст: " +
                age + "; цвет: " + color);

    }
}
