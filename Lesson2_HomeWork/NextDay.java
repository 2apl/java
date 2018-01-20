package Lesson2_HomeWork;

import java.util.Scanner;

public class NextDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите день: ");
        int day = scanner.nextInt();
        System.out.print("Введите месяц: ");
        int month = scanner.nextInt();
        System.out.print("Введите год: ");
        int year = scanner.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if (day < 31) {
                    day++;
                    nextDate(day, month, year);
                } else if (day == 31) {
                    day = 1;
                    month++;
                    nextDate(day, month, year);
                } else System.out.println("Нет такого дня в месяце");
                break;
            case 12:
                if (day < 31) {
                    day++;
                    nextDate(day, month, year);
                } else if (day == 31) {
                    day = 1;
                    month = 1;
                    year++;
                    nextDate(day, month, year);
                } else System.out.println("Нет такого дня в месяце");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day < 30) {
                    day++;
                    nextDate(day, month, year);
                } else if (day == 30) {
                    day = 1;
                    month++;
                    nextDate(day, month, year);
                } else System.out.println("Нет такого дня в месяце");
                break;
            case 2:
                if (year % 4 == 0 && !(year % 100 == 0) || year % 400 == 0) { //проверка года на високосность
                    if (day < 29) {
                        day++;
                        nextDate(day, month, year);
                    } else if (day == 29) {
                        day = 1;
                        month++;
                        nextDate(day, month, year);
                    } else System.out.println("Нет такого дня в месяце");
                } else if (day < 28) {
                    day++;
                    nextDate(day, month, year);
                } else if (day == 28) {
                    day = 1;
                    month++;
                    nextDate(day, month, year);
                } else System.out.println("Нет такого дня в месяце");
                break;
            default:
                System.out.println("Нет такого месяца");

        }

    }

    public static void nextDate(int day, int month, int year) {
        System.out.println("Следующий день " + day + "." + month + "." + year);


    }
}
