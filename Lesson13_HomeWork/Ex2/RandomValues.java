package Lesson13_HomeWork.Ex2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.IntStream;

public class RandomValues {

    public static void randomValues(int number, int maxValue) {
        File randomValues = new File(String.join(File.separator, "src", "Lesson13_HomeWork", "Ex2", "Random_values.csv"));
        Random random = new Random();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(randomValues))) {
            OptionalDouble stream = IntStream.generate(() -> random.nextInt(maxValue))
                    .limit(number)
                    .sorted()
                    .peek(value -> {
                        try {
                            writer.write(value + System.lineSeparator());
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    })
                    .average();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

