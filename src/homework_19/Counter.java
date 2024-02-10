package homework_19;
/*
Класс "Счётчик" Разработайте класс Counter, который позволяет
создавать объекты-счётчики с возможностью увеличения и уменьшения значения
счётчика. В классе должны быть:

Поле value для хранения текущего значения счётчика.
Методы increment() и decrement(), увеличивающие и уменьшающие
значение счётчика соответственно.
Метод getValue() для получения текущего значения счётчика.

 */
public class Counter {

int vaule;

    public Counter(int vaule) {
        this.vaule = vaule;
    }

    void increment(){
        vaule++;
    }
    void decrement(){
        vaule--;
    }

    public int getVaule() {
        return vaule;
    }

}
