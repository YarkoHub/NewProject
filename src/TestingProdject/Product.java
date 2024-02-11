package TestingProdject;

public class Product {
    private static long counterId = 0;
    private final long id;
    private String name;
    private double price;

    public Product(String name, double price) {
        this.id = counterId++;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String info() {
        return "ID: " + id + ", Название: " + name + ", Цена: " + price;
    }

    // Метод для изменения цены продукта на заданный процент
    public void changePriceByPercent(double percent) {
        price *= (1 + percent / 100);
    }

    // Статический метод для возврата общего количества созданных продуктов
    public static long getTotalProducts() {
        return counterId;
    }

    public static void main(String[] args) {
        // Создание объектов Product
        Product product1 = new Product("Молоко", 2.5);
        Product product2 = new Product("Хлеб", 1.0);

        // Вывод информации о каждом продукте
        System.out.println(product1.info());
        System.out.println(product2.info());

        // Изменение цены одного из продуктов на 10%
        product1.changePriceByPercent(10);

        // Вывод общего количества созданных продуктов
        System.out.println("Общее количество созданных продуктов: " + Product.getTotalProducts());

    }
}
