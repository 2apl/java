package Lesson3_HomeWork;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println("Введите целое число: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sumNumeral = sumNumeral(number);
        System.out.println("Сумма цифр числа равна: " + sumNumeral);

    }

    public static int sumNumeral(int number) {
        int sum = 0;
        number = Math.abs(number); // число по модулю, чтобы с отрицательными тоже работало
        while (number >= 1) {
            int remainder = number % 10;
            sum += remainder;
            number /= 10;
        }
        return sum;
    }
}
