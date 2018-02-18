package Lesson13_HomeWork.Ex1;


import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class LettersInText {

    public static final String NOT_LETTER = " .,!?-:;";
    public static final int INCREMENT = 1;

    public static void lettersInText(File file) throws FileNotFoundException {
        Map<Character, Integer> map = new TreeMap<>();
        try (Scanner scanner = new Scanner(new BufferedInputStream(new FileInputStream(file)))){
            String line;
            Integer count = INCREMENT;
            while (scanner.hasNext()) {
                line = scanner.nextLine().toLowerCase();
                for (int i = 0; i < line.length(); i++) {
                    Character symbol = line.charAt(i);
                    if (!((NOT_LETTER.contains(symbol.toString())))) {
                        if (map.get(symbol) != null) {
                            count = map.get(symbol) + INCREMENT;
                            map.put(symbol, count);
                        } else {
                            map.put(symbol, count);
                        }
                    }
                }
            }
        }
        File fileOut = new File(String.join(File.separator, "src", "Lesson13_HomeWork", "Ex1", "Letters_in_text.txt"));
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileOut))){
            for (Character key : map.keySet()) {
                writer.write(key.toString() + " - " + map.get(key) + System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
