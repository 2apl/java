package Lesson18_HomeWork;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class TimePeriodsUtil {

    private static final String EMPTY_LINE = "";

    private TimePeriodsUtil() {
    }

    public static void timePeriods(File file) {
        Pattern pattern = Pattern.compile("(?<time>\\d{2}:\\d{2})\\s(?<activity>[А-Яа-я ]+)");
        Queue<String> timePeriods = new ArrayDeque<>();
        Matcher matcher;
        String prevTime = EMPTY_LINE;
        String prevActivity = EMPTY_LINE;
        try (Scanner scanner = new Scanner(new BufferedInputStream(new FileInputStream(file)))) {
            String line;
            while (scanner.hasNext()) {
                line = scanner.nextLine();
                matcher = pattern.matcher(line);
                if (matcher.find() && !prevTime.equals(EMPTY_LINE)) {
                    timePeriods.add(prevTime + "-" + matcher.group("time") + " " + prevActivity);
                    prevTime = matcher.group("time");
                    prevActivity = matcher.group("activity");
                } else if (prevTime.equals(EMPTY_LINE)){
                    prevTime = matcher.group("time");
                    prevActivity = matcher.group("activity");
                } else {
                    timePeriods.add(EMPTY_LINE);
                    prevTime = EMPTY_LINE;
                    prevActivity = EMPTY_LINE;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        writeFile(timePeriods);
    }

    private static void writeFile(Queue<String> timePeriods) {
        File fileOut = new File(String.join(File.separator, "src", "Lesson18_HomeWork", "Files", "Time_periods.txt"));
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileOut))){
            while (!timePeriods.isEmpty()){
                writer.write(timePeriods.poll() + System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
