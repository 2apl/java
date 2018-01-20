package Lesson2_HomeWork;

import java.util.Scanner;

public class sqrt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение a уравнения: ");
        float a = scanner.nextFloat();
        System.out.print("Введите значение b уравнения: ");
        float b = scanner.nextFloat();
        System.out.print("Введите значение c уравнения: ");
        float c = scanner.nextFloat();
        double x, x1, x2;
        float discriminant = discriminant(a, b, c);
        if (isPositive(discriminant)) {
            x1 = (-b + Math.sqrt(discriminant)) / 2 * a;
            x2 = (-b - Math.sqrt(discriminant)) / 2 * a;
            System.out.println("X1 = " + x1);
            System.out.println("X2 = " + x2);
        } else if (isZero(discriminant)){
            x = -b/2*a;
            System.out.println("X = " + x);
        } else System.out.println("Нет корней");
    }

    public static float discriminant(float a, float b, float c) {
        float D = b * b - 4 * a * c;
        return D;

    }

    public static boolean isPositive(float positive) {
        return positive > 0;
    }

    public static boolean isZero(float zero) {
        return zero == 0;
    }

}
