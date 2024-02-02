package homework_7;

import java.util.Random;

//Реализовать с использованием switch Ваш ребенок принес оценку за контрольную работу по математике.
// В школе 12 бальная система. Запишите в переменную случайное число от 0 до 12.
// Вы разрешаете ребенку смотреть телевизор не более 60 минут в день.
// (Оставшееся время не может быть больше 1 часа) На сегодня у него осталось 45 минут. (записать в переменную)
//Если оценка от 10 до 12 баллов -> Скажите ему, как вы рады и добавьте к оставшемуся на сегодня времени 1 час от 7 до 9 -> Слова похвалы на экран + ко времени 45 минут от 4 до 6 -> Нейтральные слова + ко времени 15 минут 3 -> Огорчитесь.
// Минус 30 минут ко времени оценка меньше -> Трагедия. Сегодня ТВ смотреть запрещено
// Выведите на экран оставшееся на сегодня время для просмотра ТВ
//P.S. Реализовать с использованием switch
public class Tassk3 {
    public static void main(String[] args) {

        Random random = new Random();
        int RandomNum = random.nextInt(13);


            int tvTime = 45;

            int count = 0;
            while (count < 2) {
        System.out.printf("\nСегодня ребенок получил в школе оценку : - \n" + RandomNum);

        switch (RandomNum){

            case 10:
            case 11:
            case 12:
                System.out.printf("\nСУПЕР!!! Молодец + 1 час просмотра ТВ\n");

                tvTime += 60;
                break;

            case 7:
            case 8:
            case 9:
                System.out.printf("\nОтлично + 45 минут просмотра ТВ\n");

                tvTime += 45;
                break;

            case 4:
            case 5:
            case 6:
                System.out.printf("\n + 15 минут просмотра ТВ\n");

                tvTime += 15;
                break;

            case 3:
                System.out.printf("\nПЛОХО! - 30 минут просмотра ТВ\n");

                tvTime -= 30;
                break;

            default:
                tvTime = 0;
                System.out.printf("\nУЖАСТНО!!! Сегодня ТВ запрещено.");

        }
if (tvTime > 60){
    tvTime = 60;

} else  if ( tvTime < 0) {

    tvTime = 0;
}


        System.out.printf("\nОставшееся время просмотра телевизора на сегодня - : " + tvTime + " минут");
count++;
    }
}}
