package Lesson3_HomeWork;

import java.util.Scanner;

public class Whether {
    public static void main(String[] args) {
        System.out.println("Введите количество дней: ");
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        precipitation(days);

    }

    public static void precipitation(int days) {
        int some = 0, max = 0, sum = 0;
        float medium;
        for (int i = 1; i <= days; i++) {
            System.out.println("Введите количество осадков в каждый из дней: ");
            Scanner scanner = new Scanner(System.in);
            int value = scanner.nextInt();
            sum = sum + value;
            if (value > some) {
                max = value;
            }
            some = value;
            if (i == days) {
                medium = (float) sum / i;
                System.out.println("Статистика за " + days + " дней");
                System.out.println("Сумма осадков за этот период: " + sum);
                System.out.println("Среднее количество осадков за этот период: " + medium);
                System.out.println("Максимальное количество осадков за этот период: " + max);
            }

        }

    }
}
