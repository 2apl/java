package Lesson15_Homework3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Scientist implements Runnable {

    private final Collection<Integer> PRODUCED_PARTS;
    private final String name;

    public Scientist(Collection<Integer> PRODUCED_PARTS, String name) {
        this.PRODUCED_PARTS = PRODUCED_PARTS;
        this.name = name;
    }

    private void finalQuantityOfRobots(Map<Integer, Integer> partsCollection) {
        int minValueOfParts = partsCollection.get(1);
        for (Integer i = 1; i <= RandomUtil.KIND_OF_PARTS; i++) {
            if (partsCollection.get(i) < minValueOfParts) {
                minValueOfParts = partsCollection.get(i);
            }
        }
        synchronized (WinnerUtil.winner) {
            WinnerUtil.winner.put(name, minValueOfParts);
        }
    }

    private Map<Integer, Integer> createCollection() {
        Map<Integer, Integer> partsCollection = new HashMap<>(RandomUtil.KIND_OF_PARTS);
        Integer count = 0;
        for (Integer i = 1; i <= RandomUtil.KIND_OF_PARTS; i++) {
            partsCollection.put(i, count);
        }
        return partsCollection;
    }

    @Override
    public void run() {
        Map<Integer, Integer> partsCollection = createCollection();
        int increment = 1;
        synchronized (PRODUCED_PARTS) {
            while (Factory.getNumberOfNight() <= Factory.QUANTITY_OF_NIGHTS) {
                for (int i = 0; i < RandomUtil.PARTS_PER_NIGHT; i++) {
                    for (Integer part : PRODUCED_PARTS) {
                        partsCollection.put(part, partsCollection.remove(part) + increment);
                        PRODUCED_PARTS.remove(part);
                        PRODUCED_PARTS.notify();
                        try {
                            PRODUCED_PARTS.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        break;
                    }
                }
                try {
                    PRODUCED_PARTS.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            PRODUCED_PARTS.notify();
        }
        finalQuantityOfRobots(partsCollection);
    }
}
