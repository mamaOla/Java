package Homework9;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите набор чисел через запятую (например, \"1, 2, 3, 4, 4, 5\"):");
        String input = scanner.nextLine();

        // 1. Разделяем строку на отдельные числа, используя запятую в качестве разделителя.
        String[] numbersArray = input.split(",");

        // 2. Создаем Set для хранения уникальных чисел. Используем LinkedHashSet, чтобы сохранить порядок ввода.
        Set<Integer> uniqueNumbers = new LinkedHashSet<>();

        // 3. Преобразуем строки в числа и добавляем в Set (дубликаты автоматически отбрасываются).
        try {
            for (String number : numbersArray) {
                // Удаляем пробелы, чтобы корректно парсить числа
                String trimmedNumber = number.trim();
                int num = Integer.parseInt(trimmedNumber);
                uniqueNumbers.add(num);
            }
        } catch (NumberFormatException e) {
            System.err.println("Ошибка: Некорректный формат числа в строке.");
            scanner.close();
            return; // Завершаем программу, если обнаружена ошибка
        }

        // 4. Выводим уникальные числа на экран.
        System.out.println("Уникальные числа: " + uniqueNumbers);

        scanner.close();
    }
}
