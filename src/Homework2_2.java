import java.util.Scanner;
// дз нужен сканер
/*
Для введенного числа t (температура на улице) вывести: Если t>–5, то вывести
«Warm».
Если –5>= t >–20, то вывести «Normal». Если –20>= t, то вывести «Cold».
 */

public class Homework2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру на улице");
        int t = scanner.nextInt();
        if (t >= -5) {
            System.out.println("Worm");
        } else if (t >= -20) {
            System.out.println("Normal");
        } else{
            System.out.println("Cold");
        }
        scanner.close();
    }
}
