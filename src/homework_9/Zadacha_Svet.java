package homework_9;

import java.util.Scanner;

public class Zadacha_Svet {
    public static void main(String[] args) {
        // Инициализация состояний освещения для каждой комнаты
        int livingRoomLight = 0; // 0 - выключен, 1 - тусклый, 2 - средний, 3 - яркий
        int kitchenLight = 0;
        int bedroomLight = 0;

        Scanner scanner = new Scanner(System.in);

        // Получение номера кнопки от пользователя
        System.out.print("Введите номер кнопки (1-6): ");
        int buttonNumber = scanner.nextInt();

        // Обработка выбора пользователя
        switch (buttonNumber) {
            case 1:
                setBrightness(livingRoomLight, kitchenLight, bedroomLight, 3, 3, 1);
                break;
            case 2:
                setBrightness(livingRoomLight, kitchenLight, bedroomLight, 1, 3, 3);
                break;
            case 3:
                setBrightness(livingRoomLight, kitchenLight, bedroomLight, 2, 2, 2);
                break;
            case 4:
                kitchenLight = 0; // Выключить свет в кухне
                break;
            case 5:
                increaseBrightness(livingRoomLight, kitchenLight, bedroomLight, 1, 1, 0);
                break;
            case 6:
                decreaseBrightness(livingRoomLight, kitchenLight, bedroomLight, 0, 0, 2);
                break;
            default:
                System.out.println("Неверный номер кнопки.");
                return;
        }

        // Вывод текущего состояния освещения
        System.out.println("Текущее состояние освещения:");
        System.out.println("Гостиная: " + getLightState(livingRoomLight));
        System.out.println("Кухня: " + getLightState(kitchenLight));
        System.out.println("Спальня: " + getLightState(bedroomLight));
    }

    // Метод для установки интенсивности света в каждой комнате
    private static void setBrightness(int livingRoomLight, int kitchenLight, int bedroomLight,
                                      int livingRoomBrightness, int kitchenBrightness, int bedroomBrightness) {
        livingRoomLight = livingRoomBrightness;
        kitchenLight = kitchenBrightness;
        bedroomLight = bedroomBrightness;
    }

    // Метод для увеличения интенсивности света в каждой комнате
    private static void increaseBrightness(int livingRoomLight, int kitchenLight, int bedroomLight,
                                           int livingRoomIncrease, int kitchenIncrease, int bedroomIncrease) {
        livingRoomLight = Math.min(livingRoomLight + livingRoomIncrease, 3);
        kitchenLight = Math.min(kitchenLight + kitchenIncrease, 3);
        bedroomLight = Math.min(bedroomLight + bedroomIncrease, 3);
    }

    // Метод для уменьшения интенсивности света в каждой комнате
    private static void decreaseBrightness(int livingRoomLight, int kitchenLight, int bedroomLight,
                                           int livingRoomDecrease, int kitchenDecrease, int bedroomDecrease) {
        livingRoomLight = Math.max(livingRoomLight - livingRoomDecrease, 0);
        kitchenLight = Math.max(kitchenLight - kitchenDecrease, 0);
        bedroomLight = Math.max(bedroomLight - bedroomDecrease, 0);
    }

    // Метод для получения строкового представления интенсивности света
    private static String getLightState(int brightness) {
        switch (brightness) {
            case 0:
                return "выключен";
            case 1:
                return "тусклый";
            case 2:
                return "средний";
            case 3:
                return "яркий";
            default:
                return "неизвестно";
        }
    }
}
