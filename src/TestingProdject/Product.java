package TestingProdject;

public class Product {

    private static long counterId = 0; // Поле для подсчета и автоматического присвоения уникального идентификатора
    private final long id; // Поле для хранения уникального идентификатора конкретного объекта
    private String name; // Поле для названия продукта
    private double price; // Поле для хранения цены продукта

    // Конструктор для создания объекта Product с названием и ценой
    public Product(String name, double price) {
        this.id = counterId++; // Присваивание уникального id и увеличение counterId
        this.name = name;
        this.price = price;
    }

    // Геттер для получения названия продукта
    public String getName() {
        return name;
    }

    // Сеттер для установки названия продукта
    public void setName(String name) {
        this.name = name;
    }

    // Геттер для получения цены продукта
    public double getPrice() {
        return price;
    }

    // Сеттер для установки цены продукта
    public void setPrice(double price) {
        this.price = price;
    }

    // Метод для получения информации о продукте
    public String info() {
        return "ID: " + id + ", Название: " + name + ", Цена: " + price;
    }

    public static void main(String[] args) {
        // Пример использования класса Product
        Product product1 = new Product("Молоко", 2.5);
        Product product2 = new Product("Хлеб", 1.0);

        System.out.println(product1.info());
        System.out.println(product2.info());
    }
}
