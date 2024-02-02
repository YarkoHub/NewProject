package lesson_03;

public class TypeCasting {
    public static void main(String[] args) {

        // преобразование типов ( преоброзавование типов данных. Из одного типа в другой)

        // Неявное преобразование : Происходит автоматически, когда меньший тип преобразуется в большой.

        byte byteV = 123;
        int intV;
        intV = byteV; // неявное преобразование типа byte в тип int
        System.out.println(intV);
        double doubleV;
        doubleV = intV;
        System.out.println(doubleV);

        // Явное преобразование . Необходимо, когда мы больший тип данных пытаемся преобразовать в меньший.

        doubleV = 125.65;
        intV =(int) doubleV; // Явное преобразование double в тип int
        System.out.println("intV " + intV);

        System.out.println("=======================");
        int x = 20;
        int y = 7;
        double result;
        result = x / (double) y;
        System.out.println(result);



    }
}
