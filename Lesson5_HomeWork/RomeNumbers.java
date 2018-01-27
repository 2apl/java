package Lesson5_HomeWork;

import java.util.Scanner;

public class RomeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число в римском формате: ");
        String string = scanner.next();
        System.out.println(romeToArabic(string));
    }

    private static int romeToArabic(String string) {
        int symbolValue = 0;
        int symbolPrevValue = 1000;
        int value = 0;
        for (int i = 0; i < string.length(); i++) {
            char symbol = string.charAt(i);
            switch (symbol) {
                case 'M':
                    symbolValue = 1000;
                    break;
                case 'D':
                    symbolValue = 500;
                    break;
                case 'C':
                    symbolValue = 100;
                    break;
                case 'L':
                    symbolValue = 50;
                    break;
                case 'X':
                    symbolValue = 10;
                    break;
                case 'V':
                    symbolValue = 5;
                    break;
                case 'I':
                    symbolValue = 1;
                    break;
                default:
                    System.out.println("Нет такого числа в римском формате");
                    break;
            }
            if (symbolValue > symbolPrevValue) {
                value += symbolValue - 2 * symbolPrevValue;
            } else {
                value += symbolValue;
            }
            symbolPrevValue = symbolValue;

        }
        return value;
    }

}
