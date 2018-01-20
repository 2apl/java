package Lesson3_HomeWork;

import java.util.Scanner;

public class Summ {
    public static void main(String[] args) {
        System.out.println("Введите целое число: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int summNumeral = summNumeral(number);
        System.out.println("Сумма цифр числа равна: " + summNumeral);

    }

    public static int summNumeral(int number) {
        int summ = 0;
        number = Math.abs(number); // число по модулю, чтобы с отрицательными тоже работало
        while (number >= 1) {
            int remainder = number % 10;
            summ += remainder;
            number /= 10;
        }
        return summ;
    }
}
