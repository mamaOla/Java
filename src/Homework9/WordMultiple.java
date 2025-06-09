package Homework9;

import java.util.HashMap;
import java.util.Map;

public class WordMultiple {

    public static Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> result = new HashMap<>();
        Map<String, Integer> counts = new HashMap<>();

        // Считаем количество вхождений каждой строки
        for (String str : strings) {
            counts.put(str, counts.getOrDefault(str, 0) + 1);
        }

        // Заполняем result Map
        for (String str : strings) {
            result.put(str, counts.get(str) >= 2);
        }

        return result;
    }

    public static void main(String[] args) {
        // Примеры использования:
        String[] arr1 = {"a", "b", "a", "c", "b"};
        String[] arr2 = {"c", "b", "a"};
        String[] arr3 = {"c", "c", "c", "c"};

        System.out.println("wordMultiple([\"a\", \"b\", \"a\", \"c\", \"b\"]) -> " + wordMultiple(arr1));
        System.out.println("wordMultiple([\"c\", \"b\", \"a\"]) -> " + wordMultiple(arr2));
        System.out.println("wordMultiple([\"c\", \"c\", \"c\", \"c\"]) -> " + wordMultiple(arr3));
    }
}
