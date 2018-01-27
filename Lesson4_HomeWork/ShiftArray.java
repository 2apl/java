package Lesson4_HomeWork;

import java.util.Arrays;
import java.util.Random;

public class ShiftArray {

    public static void main(String[] args) {
        Random random = new Random();
        int randomValue = random.nextInt(50);
        int[] array = new int[randomValue];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(array));
        shiftArray(array);

    }

    private static void shiftArray(int array[]) {
        int endValue = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = endValue;
        System.out.println(Arrays.toString(array));
    }

}
