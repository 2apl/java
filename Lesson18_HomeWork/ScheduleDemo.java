package Lesson18_HomeWork;

import java.io.File;

public class ScheduleDemo {

    public static void main(String[] args) {
        File file = new File(String.join(File.separator, "src", "Lesson18_HomeWork", "Files", "Schedule.txt"));
        TimePeriodsUtil.timePeriods(file);
        TimeActivityUtil.timeActivityDetalization(file);
    }
}
