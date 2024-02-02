package homework_7;

import java.util.Random;

public class Tv {
    public static void main(String[] args) {


        // Создаем объект Random для генерации случайных чисел
        Random random = new Random();

        // Генерируем случайное число от 0 до 12 для оценки
        int grade = random.nextInt(13);

        // Задаем начальное время для просмотра ТВ
        int remainingTime = 45;

        // Выводим оценку
        System.out.println("Оценка: " + grade);

        // Используем оператор switch для обработки различных случаев
        switch (grade) {
            case 10:
            case 11:
            case 12:
                System.out.println("Выражаем радость! Похвала! Добавлено 1 час (60 минут) к просмотру ТВ.");
                remainingTime += 60;
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Нейтральное отношение. Добавлено 45 минут к просмотру ТВ.");
                remainingTime += 45;
                break;
            case 3:
                System.out.println("Огорчаемся. Уменьшено 30 минут просмотра ТВ.");
                remainingTime -= 30;
                break;
            default:
                System.out.println("Трагедия! Сегодня ТВ смотреть запрещено.");
                remainingTime = 0;
        }

        // Выводим оставшееся на сегодня время для просмотра ТВ
        System.out.println("Оставшееся время для просмотра ТВ: " + remainingTime + " минут");






    }
}
