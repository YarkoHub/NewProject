package homework_2;

public class Task2 {
    public static void main(String[] args) {
        double priceA = 1000;
        double priceB = 500;
        int discount = 10;

        //скидка в деньгах
        double discountMoney = (priceA + priceB) * discount / 100;
        System.out.println("discountMoney: " + discountMoney);

        //два варианта
        double priceWithDiscount = (priceA + priceB) - discountMoney;
        System.out.println("priceWithDiscount: " + priceWithDiscount);

        priceWithDiscount = (priceA + priceB) * (100 - discount) / 100;
        System.out.println("Цена товаров со скидкой: " + priceWithDiscount + " Евро");


    }
}
