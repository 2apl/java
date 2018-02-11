package Lesson9_Homework;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("this");
        list.add("is");
        list.add("lots");
        list.add("of");
        list.add("fun");
        list.add("for");
        list.add("every");
        list.add("Java");
        list.add("programmer");
        markLength4(list);
        System.out.println(list.toString());
    }

    public static void markLength4(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            String string = list.get(i);
            if (string.length() == 4) {
                list.add(i, "****");
                i++;
            }
        }
    }
}
