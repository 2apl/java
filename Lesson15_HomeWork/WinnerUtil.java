package Lesson15_Homework3;

import java.util.Map;
import java.util.TreeMap;

public final class WinnerUtil {

    public static final Map<String, Integer> winner = new TreeMap<>();

    private WinnerUtil() {
    }

    public static void getWinner() {
        String winName = "";
        String loseName = "";
        String prevName = "";
        int quantityOfRobots;
        int loseQuantityOfRobots = 0;
        int winQuantityOfRobots = 0;
        int prevQuantityOfRobots = 0;
        for (String key : winner.keySet()) {
            quantityOfRobots = winner.get(key);
            if (quantityOfRobots > prevQuantityOfRobots) {
                winName = key;
                winQuantityOfRobots = quantityOfRobots;
                loseName = prevName;
                loseQuantityOfRobots = prevQuantityOfRobots;
            } else if (quantityOfRobots == prevQuantityOfRobots) {
                System.out.println("Ничья! Ученые собрали по " + quantityOfRobots + " роботов");
                return;
            } else if (quantityOfRobots < prevQuantityOfRobots) {
                winName = prevName;
                winQuantityOfRobots = prevQuantityOfRobots;
                loseName = key;
                loseQuantityOfRobots = quantityOfRobots;
            }
            prevName = key;
            prevQuantityOfRobots = quantityOfRobots;
        }
        System.out.println(winName + " победил. Он собрал " + winQuantityOfRobots + " роботов");
        System.out.println(loseName + " проиграл. Он собрал " + loseQuantityOfRobots + " роботов");
    }
}


