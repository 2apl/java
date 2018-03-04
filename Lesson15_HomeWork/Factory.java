package Lesson15_Homework3;

import java.util.Collection;

public class Factory implements Runnable {

    public static final int QUANTITY_OF_NIGHTS = 100;
    private static final int TIME_OF_NIGHT = 100;
    private static final int START_QUANTITY_OF_PARTS = 20;
    private static final int LIMIT_OF_INFINITY_PRODUCING = 5;
    private static int numberOfNight;
    private final Collection<Integer> producedParts;

    public Factory(Collection<Integer> producedParts) {
        this.producedParts = producedParts;
    }

    @Override
    public void run() {
        int kindOfParts;
        numberOfNight = 1;
        synchronized (producedParts) {
            for (int i = 0; i < START_QUANTITY_OF_PARTS; i++) {
                kindOfParts = RandomUtil.getKindOfParts();
                producedParts.add(kindOfParts);
            }
        }
        while (numberOfNight <= QUANTITY_OF_NIGHTS + LIMIT_OF_INFINITY_PRODUCING) {
            try {
                Thread.sleep(TIME_OF_NIGHT);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (producedParts) {
                numberOfNight++;
                for (int i = 0; i < RandomUtil.getPartsPerNight(); i++) {
                    kindOfParts = RandomUtil.getKindOfParts();
                    producedParts.add(kindOfParts);
                }
                producedParts.notifyAll();
            }
        }
    }

    public static int getNumberOfNight() {
        return numberOfNight;
    }
}
