package homework_15;

// Возраст 13 и 14
public class Person {
    String name;
    String hooby;
    String traum;
    int age;

    public Person(String name, String hooby, String traum, int age) {
        this.name = name;
        this.hooby = hooby;
        this.traum = traum;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", hooby='" + hooby + '\'' +
                ", traum='" + traum + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;

    }

    public String getHooby() {
        return hooby;
    }

    public String getTraum() {
        return traum;
    }

    public int getAge() {
        return age;
    }

    void  tv () {
        System.out.println("Смотрит телевизор ");
    }
    void plays (){
        System.out.println("Играет на компьютере ");
    }
    void study (){
        System.out.println("Учатся в школе ");
    }

}
