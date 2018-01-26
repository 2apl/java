package Lesson3_HomeWork;

import java.util.Scanner;

public class Fibonachi {
    public static void main(String[] args) {
        System.out.println("Введите целое число: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        fibonachi(value);
        System.out.print("Числа Фибоначчи, меньшие введенного числа (рекурсия): ");

        for (int i = 0; recurs(i) < value; i++) {
            recurs(i);
            System.out.print(recurs(i) + ", ");

        }

    }

    public static void fibonachi(int value) {
        System.out.print("Числа Фибоначчи, меньшие введенного числа: ");
        int fib, prev = -1;
        for (int i = 1; (i + prev) < value; i = fib) {
            fib = prev + i;
            prev = i;
            System.out.print(fib + ", ");
        }
        System.out.println("");
    }

    public static int recurs(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        } else {
            return recurs(i - 1) + recurs(i - 2);

        }

    }

}
