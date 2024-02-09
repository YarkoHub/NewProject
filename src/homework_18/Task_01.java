package homework_18;
//Написать класс Собака
//Каждая Собака обязательно должна иметь имя и высоту прыжка
//Должна уметь прыгать и должна уметь тренироваться.
//За каждую тренировку высота прыжка увеличивается максимум на 10 сантиметров
//Максимальная высота прыжка, которую может натренировать собака, не может быть больше, чем двукратная высота первоначального прыжка.
//Также должен быть метод взять барьер. В параметрах метод принимает высоту барьера.
// Если собака в состоянии преодолеть этот барьер - прыгает.
// Если не в состоянии, нужно проверить помогут ли тренировки (будет ли данная собака в принципе в состоянии взять барьер).
// Если да -> идем тренироваться -> берет барьер
public class Task_01 {

    private String name;
    private int jampHeight;
    private int maxJampHeight;
    private static int increasePerOneTraining;

    public Task_01(String name, int jampHeight) {
        this.name = name;
        this.jampHeight = jampHeight;
        this.maxJampHeight = jampHeight * 2;
    }
    static {
        increasePerOneTraining = 10;
    }
    public void jamp (){
    System.out.println("Собака" + name + " совершила прыжок");
}
    public void training (){
        this.jampHeight+increasePerOneTraining;
    }






}
