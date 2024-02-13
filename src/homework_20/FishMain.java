package homework_20;


import java.util.Random;

public class FishMain {
    public static void main(String[] args) {
        Random random = new Random();

        //ОЗЕРА
        FishSport[] lakes = {
                new FishSport("Ольховка", 10, "Спиннинг"),
                new FishSport("Щукарь", 8, "Фидер"),
                new FishSport("Болото", 3, "Удочка")
        };

        // Генерация случайной рыбы и случайного веса на каждом озере
        String[] fishSpecies = {"Щука", "Окунь", "Судак", "Жерех"};

        for (FishSport lake : lakes) {
            String randomFish = fishSpecies[random.nextInt(fishSpecies.length)];
            double randomWeight = 1 + random.nextDouble() * 14;

            FishType fish = new FishType(lake.getSnasti(), lake.glubinaOzera, lake.getSnasti(), randomFish, randomWeight);


            System.out.println("Информация о озере:");
            System.out.println("Название Озера =" + lake.nameOzera + ", Глубина озера =" + lake.glubinaOzera + ", " +
                    "Выбор Снастей =" + lake.snasti + ". Название пойманной рыбы : " + randomFish + ", Вес пойманной рыбы : " + randomWeight + " kg");
            System.out.println("=============================================");
        }
    }

    }



