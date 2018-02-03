package Lesson7_HomeWork;

import Lesson7_HomeWork.Figures.*;

import java.util.Scanner;

public class FigureDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координату Х первой точки: ");
        double x1 = scanner.nextDouble();
        System.out.println("Введите координату Y первой точки: ");
        double y1 = scanner.nextDouble();
        System.out.println("Введите координату Х второй точки: ");
        double x2 = scanner.nextDouble();
        System.out.println("Введите координату y второй точки: ");
        double y2 = scanner.nextDouble();
        System.out.println("Введите координату Х третьей точки: ");
        double x3 = scanner.nextDouble();
        System.out.println("Введите координату Y третьей точки: ");
        double y3 = scanner.nextDouble();

        Point point1 = new Point(x1, y1);
        Point point2 = new Point(x2, y2);
        Point point3 = new Point(x3, y3);

        Line line = new Line(point1, point2);
        System.out.println(line.toString());

        Rectangle rectangle = new Rectangle(point1, point2);
        System.out.println(rectangle.toString());
        System.out.println("Площадь прямоугольника: " + rectangle.square());
        System.out.println("Диагональ прямоугольника: " + rectangle.diagonal());

        Square square = new Square(point2, point3);
        System.out.println(square.toString());
        System.out.println("Площадь квадрата: " + square.square());
        System.out.println("Диагональ квадрата: " + square.diagonal());
        square.compareSquare(rectangle);
        System.out.println("Фигура является прямоугольном?: " + ShapeUtils.isRectangle(rectangle));

        Triangle triangle = new Triangle(point1, point2, point3);
        System.out.println(triangle.toString());
        System.out.println("Площадь треугольника: " + triangle.square());
        triangle.compareSquare(rectangle);
        System.out.println("Фигура является треугольником?: " + ShapeUtils.isTriangle(triangle));

        Triangle triangle12 = new TriangleEquilateral(point3, point2, point1);
        System.out.println(triangle12.toString());
        System.out.println("Площадь равностороннего треугольника: " + triangle12.square());
        triangle12.compareSquare(triangle);

        Ellipse ellipse = new Ellipse(point2, point3, point1);
        System.out.println(ellipse.toString());
        System.out.println("Площадь эллипса: " + ellipse.square());
        ellipse.compareSquare(square);

        Circle circle = new Circle(point2, point3);
        System.out.println(circle.toString());
        System.out.println("Площадь круга: " + circle.square());
    }
}
