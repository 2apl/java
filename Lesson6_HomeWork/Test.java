package Lesson6_HomeWork;

import Lesson6_HomeWork.Point.Point;
import Lesson6_HomeWork.Point.Rectangle;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координату Х первой точки: ");
        double point1x = scanner.nextDouble();
        System.out.println("Введите координату Y первой точки: ");
        double point1y = scanner.nextDouble();
        System.out.println("Введите координату Х второй точки: ");
        double point2x = scanner.nextDouble();
        System.out.println("Введите координату Y второй точки: ");
        double point2y = scanner.nextDouble();
        Point point1 = new Point(point1x, point1y);
        Point point2 = new Point(point2x, point2y);
        Rectangle rectangle = new Rectangle(point1, point2);
        System.out.println("Расстояние между точками: " + point1.distance(point2));
        System.out.println("Диагональ прямоугольника: " + rectangle.diagonalRectangle());
        System.out.println("Площадь прямоугольника: " + rectangle.squareRectangle());
    }
}
