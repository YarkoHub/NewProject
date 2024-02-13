package homework_20;
/*
РЫБОЛОВНЫЕ СОРЕВНОВАНИЯ :

"Написать как минимум одну иерархию классов в которой будет один родительский клас
и два наследника, расширяющих его функционал
Лучше придумать две такие иерархии
У родительского класса должен быть метод создающий строку
с информацией об объекте (метод String info())"
 */
public class FishSport {
    // Название Озера
    String nameOzera;
    // Глубина Озера
    int glubinaOzera;
    // Вид снасти (Спиннинг или Фидер)
    public String snasti;


    public FishSport(String nameOzera, int glubinaOzera, String snasti) {
        this.nameOzera = nameOzera;
        this.glubinaOzera = glubinaOzera;
        this.snasti = snasti;
    }

    public String info() {
        return "Название Озера =" + nameOzera + ", Глубина озера =" + glubinaOzera + ", " +
                "Выбор Снастей =" + snasti;
    }

    public String getSnasti() {
        return snasti;
    }

}
