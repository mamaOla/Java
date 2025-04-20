import java.util.Scanner;
// в дз нужен сканер

public class Homework2_1 {
    /*
    Напишите программу, которая будет принимать на вход число из консоли и на
выход будет выводить сообщение четное число или нет. Для определения
четности числа используйте операцию получения остатка от деления (операция
выглядит так: '% 2').
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введидите целое число");
        int i = scanner.nextInt();
        if (i % 2 == 0) {
            System.out.println("число четное");
        } else {
            System.out.println("число нечетное");
        }
        ;
        scanner.close();
    }
}
