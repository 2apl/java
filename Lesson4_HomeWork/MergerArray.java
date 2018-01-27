package Lesson4_HomeWork;

import java.util.Arrays;
import java.util.Random;

public class MergerArray {

    public static void main(String[] args) {
        Random random = new Random();
        int randomValue1 = 1 + random.nextInt(20);
        int randomValue2 = 1 + random.nextInt(20);
        int[] arrayFirst = new int[randomValue1];
        int[] arraySecond = new int[randomValue2];
        for (int i = 0; i < arrayFirst.length; i++) {
            arrayFirst[i] = random.nextInt(100);
        }
        for (int i = 0; i < arraySecond.length; i++) {
            arraySecond[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(arrayFirst));
        System.out.println(Arrays.toString(arraySecond));
        mergerArray(arrayFirst, arraySecond);

    }

    private static void mergerArray(int arrayFirst[], int arraySecond[]) {
        int[] arrayThird = new int[arrayFirst.length + arraySecond.length];
        int count1 = 0, count2 = 1;
        int minLength;
        if (arrayFirst.length > arraySecond.length) {
            minLength = arraySecond.length;
            for (int i = minLength; i < arrayFirst.length; i++) {
                arrayThird[minLength + i] = arrayFirst[i];
            }
        } else {
            minLength = arrayFirst.length;
            for (int i = minLength; i < arraySecond.length; i++) {
                arrayThird[minLength + i] = arraySecond[i];
            }
        }
        for (int i = 0; i < minLength; i++) {
            arrayThird[count1] = arrayFirst[i];
            count1 = count1 + 2;

        }
        for (int i = 0; i < minLength; i++) {
            arrayThird[count2] = arraySecond[i];
            count2 = count2 + 2;
        }

        System.out.println(Arrays.toString(arrayThird));
    }
}
