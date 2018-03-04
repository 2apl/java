package Lesson15_Homework3;

import java.util.Random;

public final class RandomUtil {

    public static final int KIND_OF_PARTS = 9;
    public static final int PARTS_PER_NIGHT = 4;
    private static Random random = new Random();

    private RandomUtil() {
    }

    public static int getPartsPerNight() {
        return random.nextInt(PARTS_PER_NIGHT) + 1;
    }

    public static int getKindOfParts() {
        return random.nextInt(KIND_OF_PARTS) + 1;
    }
}
