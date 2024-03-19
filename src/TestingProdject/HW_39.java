package TestingProdject;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class HW_39 {

    public static void main(String[] args) {
        String text = "Строка для проверки количества вхождений слов" +
                ".\n Строка для проверки и теста. и количества слов для проверки теста";

        Map<String, Integer> frequencyMap = frequencyDictionary2(text);
        frequencyMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }

    public static Map<String, Integer> frequencyDictionary4(String text) {
        String[] worlds = text.replaceAll("[^a-zA-Zа-яА-Я0-9 ]", "").split("\\s+");
        Map<String, Integer> result = new HashMap<>();

        for (String world : worlds) {
            Integer amount = result.get(world);

            if (amount == null) {
                amount = 0;
            }

            amount = amount + 1;

            result.put(world, amount);
        }

        return result;
    }

    public static Map<String, Integer> frequencyDictionary2(String text) {
        String[] worlds = text.replaceAll("[^a-zA-Zа-яА-Я0-9 ]", "").split("\\s+");
        Map<String, Integer> result = new HashMap<>();

        for (String world : worlds) {
            Integer amount = result.getOrDefault(world, 0);


            result.put(world, ++amount);
        }

        return result;
    }
}

