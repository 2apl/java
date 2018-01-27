package Lesson4_HomeWork;

import java.util.Arrays;
import java.util.Random;

public class LineArize {

    public static void main(String[] args) {
        Random random = new Random();
        int randomValue1 = 1 + random.nextInt(10);
        int randomValue2 = 1 + random.nextInt(10);
        int[][] doubleArray = new int[randomValue1][randomValue2];
        for (int i = 0; i < randomValue1; i++) {
            for (int j = 0; j < randomValue2; j++) {
                doubleArray[i][j] = random.nextInt(20);
            }
        }
        for (int i = 0; i < doubleArray.length; i++) {
            int[] ints = doubleArray[i];
            System.out.println(Arrays.toString(ints));
        }
        System.out.println(Arrays.toString(lineArize(doubleArray, randomValue1, randomValue2)));
    }

    private static int[] lineArize(int[][] doubleArray, int randomValue1, int randomValue2) {
        int[] simpleArray = new int[randomValue1 * randomValue2];
        int count = 0;
        for (int i = 0; i < randomValue1; i++) {
            for (int j = 0; j < randomValue2; j++) {
                simpleArray[count] = doubleArray[i][j];
                count++;
            }
        }
        return simpleArray;

    }
}
