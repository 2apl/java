package Lesson13_HomeWork.Ex1;

import java.io.File;
import java.io.FileNotFoundException;

public class TextDemo {

    public static void main(String[] args) {
        File file = new File(String.join(File.separator, "src", "Lesson13_HomeWork", "Ex1", "Pushkin.txt"));
        try {
            LettersInText.lettersInText(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
