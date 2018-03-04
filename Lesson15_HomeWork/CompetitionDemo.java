package Lesson15_Homework3;

import java.util.ArrayList;
import java.util.Collection;

public class CompetitionDemo {

    public static void main(String[] args) {
        String nameFirst = "Mad scientist";
        String nameSecond = "Crazy scientist";
        Collection<Integer> producedParts = new ArrayList<>(RandomUtil.KIND_OF_PARTS);

        Scientist scientistMad = new Scientist(producedParts, nameFirst);
        Scientist scientistCrazy = new Scientist(producedParts, nameSecond);
        
        Thread factory = new Thread(new Factory(producedParts));
        Thread firstScientist = new Thread(scientistMad);
        Thread secondScientist = new Thread(scientistCrazy);

        factory.start();
        firstScientist.start();
        secondScientist.start();

        try {
            factory.join();
            firstScientist.join();
            secondScientist.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WinnerUtil.getWinner();

    }
}
