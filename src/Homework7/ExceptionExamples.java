package Homework7;

import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionExamples {

    private Random random = new Random();

    // 1. try-catch
    public int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.err.println("Ошибка: Деление на ноль! " + e.getMessage());
            return 0; // Возвращаем 0 в случае ошибки
        }
    }

    // 2. try-catch, где catch будет несколько
    public int getArrayElement(int[] arr, int index) {
        try {
            return arr[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Ошибка: Индекс за пределами массива! " + e.getMessage());
            return -1; // Возвращаем -1 в случае ошибки
        } catch (NullPointerException e) {
            System.err.println("Ошибка: Массив равен null! " + e.getMessage());
            return -1; // Возвращаем -1 в случае ошибки
        }
    }

    // 3. try -catch, с использованием multi - catch
    public int parseAndMultiply(String numStr) {
        try {
            int num = Integer.parseInt(numStr);
            return num * 2;
        } catch (NumberFormatException | NullPointerException e) {
            System.err.println("Ошибка: Не удалось преобразовать строку в число или строка равна null! " + e.getMessage());
            return -1; // Возвращаем -1 в случае ошибки
        }
    }

    // 4. try-catch-finally
    public int readIntFromScanner() {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        try {
            System.out.print("Введите целое число: ");
            result = scanner.nextInt();
            System.out.println("Вы ввели: " + result);
        } catch (InputMismatchException e) {
            System.err.println("Ошибка: Введен некорректный формат числа! " + e.getMessage());
            result = -1; // Возвращаем -1 в случае ошибки
        } finally {
            scanner.nextLine(); // Очищаем буфер сканера (важно!)
            System.out.println("Блок finally выполнен.");
        }
        return result;
    }


    public static void main(String[] args) {
        ExceptionExamples examples = new ExceptionExamples();

        // Примеры использования методов:

        // 1. try-catch
        System.out.println("Деление: 10 / 2 = " + examples.divide(10, 2));
        System.out.println("Деление: 10 / 0 = " + examples.divide(10, 0));

        // 2. try-catch, где catch будет несколько
        int[] myArray = {1, 2, 3};
        System.out.println("Элемент массива по индексу 1: " + examples.getArrayElement(myArray, 1));
        System.out.println("Элемент массива по индексу 5: " + examples.getArrayElement(myArray, 5)); // Вызовет ArrayIndexOutOfBoundsException
        System.out.println("Элемент массива null: " + examples.getArrayElement(null, 0)); // Вызовет NullPointerException

        // 3. try -catch, с использованием multi - catch
        System.out.println("Преобразование строки '123' и умножение на 2: " + examples.parseAndMultiply("123"));
        System.out.println("Преобразование строки 'abc' и умножение на 2: " + examples.parseAndMultiply("abc")); // Вызовет NumberFormatException
        System.out.println("Преобразование строки null и умножение на 2: " + examples.parseAndMultiply(null)); // Вызовет NullPointerException

        // 4. try-catch-finally
        examples.readIntFromScanner(); // Пример с правильным вводом
        examples.readIntFromScanner(); // Пример с неправильным вводом (буквы)

    }
}
