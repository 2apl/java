package Lesson4_HomeWork;

import java.util.Arrays;
import java.util.Random;

public class DeleteArray {

    public static void main(String[] args) {
        Random random = new Random();
        int length = random.nextInt(50);
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(array));
        deleteArray(array);
        System.out.println(Arrays.toString(array));
    }

    private static void deleteArray(int array[]) {
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    array[i] = 0;
                }
            }
        }
    }
}
