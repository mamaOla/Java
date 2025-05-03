package Homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class homework3_1_2_3_4_5_6 {

    /*
пользователь с клавиатуры вводит размер массива (просто целое число). После того, как размер массива
задан, заполнить: используя Math.random(),
После заполнения массива данными, решить для него следующие
задачи:
Задача 1:
Пройти по массиву, вывести все элементы в прямом и в обратном порядке.
Задача 2:
Найти минимальный - максимальный элементы и вывести в консоль.
Задача 3:
Найти индексы минимального и максимального элементов и вывести в консоль.
Задача 4:
Найти и вывести количество нулевых элементов. Если нулевых элементов нет -
вывести сообщение, что их нет.
Задача 5:
Пройти по массиву и поменять местами элементы первый и последний, второй
и предпоследний и т.д.
Задача 6:
Проверить, является ли массив возрастающей последовательностью (каждое
следующее число больше предыдущего).
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива:  ");
        int size = scanner.nextInt();
        double[] mass = new double[size];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = Math.random();
        }
        System.out.println(Arrays.toString(mass));

        System.out.println("Обратный порядок");
        for (int i = mass.length - 1; i >= 0; i--) {
            System.out.println(mass[i]);
        }
        System.out.println();

        System.out.println("мин и макс элементы");
        double min = mass[0];
        double max = mass[0];
        for (int i = 1; 1 < mass.length; i++) {
            if (mass[i] < min) {
                min = mass[i];
            }
            if (mass[i] > max) {
                max = mass[i];
            }
        }
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент : " + max);
        System.out.println("индексы мин и макс элементов");
        double minIndex = 0;
        double maxIndex = 0;
        for (int i = 1; i < mass.length; i++) {
            if (mass[i] < mass[(int) minIndex]) {
                minIndex = i;
            }
            if (mass[i] > mass[(int) maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println("индекс минимального элемента: " + minIndex);
        System.out.println("индекс максимального элемента: " + maxIndex);

        System.out.println("Количество нулевых элементов");
        int zeroCount = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == 0) {
                zeroCount++;
            }
        }
        if (zeroCount > 0) {
            System.out.println("Количество нулевых элементов: " + zeroCount);
        } else {
            System.out.println("Нулевых элементов нет");
        }

        System.out.println("Перестановка элементов");
        for (int i = 0; i < size / 2; i++) {
            double newmass = mass[i];
            mass[i] = mass[size - 1 - i];
            mass[size - 1 - i] = newmass;
        }
        System.out.println("Массив после перестановки: " + Arrays.toString(mass));

        System.out.println("Проверка возрастающей последовательности");
        boolean high = true;
        for (int i = 1; i < mass.length; i++) {
            if (mass[i] <= mass[i - 1]) {
                high = false;
                break;
            }
        }
        if (high) {
            System.out.println("Массив является возрастающей последовательностью");
        } else {
            System.out.println("Массив не является возрастающей последовательностью");
        }
        scanner.close();
    }
}
