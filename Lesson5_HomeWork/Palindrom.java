package Lesson5_HomeWork;

import java.util.Scanner;

public class Palindrom {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку для анализа:");
        String string = scanner.nextLine();
        if (palindrom(string)){
            System.out.println("Введенная строка является палиндромом");
        } else {
            System.out.println("Введенная строка не является палиндромом");
        }
    }

    private static boolean palindrom (String string){
        String reverse = new StringBuffer(string).reverse().toString();
        System.out.println(reverse);
        return string.equals(reverse);

    }
}
