package Lesson2_HomeWork;

import java.util.Scanner;

public class House {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Данные считываю в дробном формате, т.к. длина в метрах редко будет целым числом
        Но сканер корректно работает, только если указывать дробную длину через запятую
         */
        System.out.print("Введите длину первого дома в метрах: ");
        float Dom1length = scanner.nextFloat();
        System.out.print("Введите ширину первого дома в метрах: ");
        float Dom1width = scanner.nextFloat();
        System.out.print("Введите длину второго дома в метрах: ");
        float Dom2length = scanner.nextFloat();
        System.out.print("Введите ширину второго дома в метрах: ");
        float Dom2width = scanner.nextFloat();
        float LandLength = 30.5f;
        float LandWidth = 16.7f;
        if ((Dom1length < LandLength && Dom1width < LandWidth) || (Dom1length < LandWidth && Dom1width < LandLength)) {
            System.out.println("Первый дом поместиться на участке");
        } else System.out.println("Первый дом не поместиться на участке");

        if ((Dom2length < LandLength && Dom2width < LandWidth) || (Dom2length < LandWidth && Dom2width < LandLength)) {
            System.out.println("Второй дом поместиться на участке");
        } else System.out.println("Второй дом не поместиться на участке");


    }
}
