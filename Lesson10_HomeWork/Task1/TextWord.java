package Lesson10_HomeWork.Task1;

import java.util.HashMap;
import java.util.Map;

public class TextWord {

    private static final String DELIMITER_OF_WORD = " ,.!?:;'";
    private static final int END_OF_WORD = -1;

    public static Map verbsInText(String text) {
        Map<String, Integer> map = new HashMap<>();
        String verb = "";
        Integer count = 1;
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            if (DELIMITER_OF_WORD.indexOf(symbol) != END_OF_WORD) {
                if (map.containsKey(verb)) {
                    count = map.get(verb) + 1;
                    map.put(verb, count);
                    count = 1;
                } else {
                    map.put(verb, count);
                }
                verb = "";
            } else {
                verb += symbol;
            }
        }
        return map;
    }
}
