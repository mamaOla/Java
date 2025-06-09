package Homework8;

import java.util.Arrays;
import java.util.Scanner;

public class StringTasks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите три строки:");
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();

        // Задача 1: Самая короткая и самая длинная строки
        findShortestAndLongest(str1, str2, str3);

        // Задача 2: Сортировка по длине
        sortStringsByLength(str1, str2, str3);

        // Задача 3: Строки меньше средней длины
        printStringsShorterThanAverage(str1, str2, str3);

        // Задача 4: Слово с различными символами
        findWordWithUniqueCharacters(str1, str2, str3);

        // Задача 5: Удвоение символов
        System.out.println("Введите строку для удвоения символов:");
        String inputString = scanner.nextLine();
        System.out.println("Строка с удвоенными символами: " + doubleCharacters(inputString));

        scanner.close();
    }

    // Задача 1: Самая короткая и самая длинная строки
    public static void findShortestAndLongest(String str1, String str2, String str3) {
        String shortest = str1;
        String longest = str1;

        if (str2.length() < shortest.length()) {
            shortest = str2;
        }
        if (str3.length() < shortest.length()) {
            shortest = str3;
        }

        if (str2.length() > longest.length()) {
            longest = str2;
        }
        if (str3.length() > longest.length()) {
            longest = str3;
        }

        System.out.println("Задача 1:");
        System.out.println("Самая короткая строка: \"" + shortest + "\" (длина: " + shortest.length() + ")");
        System.out.println("Самая длинная строка: \"" + longest + "\" (длина: " + longest.length() + ")");
    }

    // Задача 2: Сортировка по длине
    public static void sortStringsByLength(String str1, String str2, String str3) {
        String[] strings = {str1, str2, str3};
        Arrays.sort(strings, (s1, s2) -> s1.length() - s2.length());

        System.out.println("\nЗадача 2:");
        System.out.println("Строки в порядке возрастания длины:");
        for (String str : strings) {
            System.out.println("\"" + str + "\" (длина: " + str.length() + ")");
        }
    }

    // Задача 3: Строки меньше средней длины
    public static void printStringsShorterThanAverage(String str1, String str2, String str3) {
        double averageLength = (str1.length() + str2.length() + str3.length()) / 3.0;

        System.out.println("\nЗадача 3:");
        System.out.println("Строки, длина которых меньше средней (" + averageLength + "):");

        if (str1.length() < averageLength) {
            System.out.println("\"" + str1 + "\" (длина: " + str1.length() + ")");
        }
        if (str2.length() < averageLength) {
            System.out.println("\"" + str2 + "\" (длина: " + str2.length() + ")");
        }
        if (str3.length() < averageLength) {
            System.out.println("\"" + str3 + "\" (длина: " + str3.length() + ")");
        }
    }

    // Задача 4: Слово с различными символами
    public static void findWordWithUniqueCharacters(String str1, String str2, String str3) {
        String[] words1 = str1.split("\\s+"); // Разделяем строки на слова по пробелам
        String[] words2 = str2.split("\\s+");
        String[] words3 = str3.split("\\s+");

        String uniqueWord = null;

        for (String word : words1) {
            if (hasUniqueCharacters(word)) {
                uniqueWord = word;
                break;
            }
        }
        if (uniqueWord == null) {
            for (String word : words2) {
                if (hasUniqueCharacters(word)) {
                    uniqueWord = word;
                    break;
                }
            }
        }
        if (uniqueWord == null) {
            for (String word : words3) {
                if (hasUniqueCharacters(word)) {
                    uniqueWord = word;
                    break;
                }
            }
        }

        System.out.println("\nЗадача 4:");
        if (uniqueWord != null) {
            System.out.println("Слово с различными символами: \"" + uniqueWord + "\"");
        } else {
            System.out.println("Слово с различными символами не найдено.");
        }
    }

    // Вспомогательный метод для проверки, состоит ли слово только из различных символов
    public static boolean hasUniqueCharacters(String word) {
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    // Задача 5: Удвоение символов
    public static String doubleCharacters(String str) {
        StringBuilder doubled = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            doubled.append(c).append(c);
        }
        return doubled.toString();
    }
}
