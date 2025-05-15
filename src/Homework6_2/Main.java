package Homework6_2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];
        Random random = new Random();

        // Создаем массив из разных фигур
        figures[0] = new Triangle(3, 4, 5);
        figures[1] = new Rectangle(4, 6);
        figures[2] = new Circle(2.5);
        figures[3] = new Triangle(5, 5, 5); // Равносторонний треугольник
        figures[4] = new Rectangle(7, 3);

        // Подсчитываем общую сумму периметров
        double totalPerimeter = 0;
        for (Figure figure : figures) {
            totalPerimeter += figure.calculatePerimeter();
        }

        // Выводим результат на экран
        System.out.println("Сумма периметров всех фигур: " + totalPerimeter);
    }
}
