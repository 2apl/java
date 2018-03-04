package Lesson18_HomeWork;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class TimeActivityUtil {

    private static final String EMPTY_LINE = "";
    private static final int MINUTES_IN_HOUR = 60;
    private static final double TO_PERCENT = 100;
    private static final String GENERAL_TIME = "Общее время занятий";

    private TimeActivityUtil() {
    }

    public static void timeActivityDetalization(File file) {
        Pattern pattern = Pattern.compile("(?<hours>\\d{2}):(?<minutes>\\d{2})\\s(?<activity>[А-Яа-я ]+)");
        Matcher matcher;
        Map<String, Integer> activityDetalization = new LinkedHashMap<>();
        List<Map> list = new ArrayList<>();
        String prevHours = EMPTY_LINE;
        String prevMinutes = EMPTY_LINE;
        String prevActivity = EMPTY_LINE;
        String thisHours;
        String thisMinutes;
        String thisActivity;
        int prevHoursInt;
        int prevMinutesInt;
        int thisHoursInt;
        int thisMinutesInt;
        int timeOfActivity;
        int timeOfStudy = 0;
        int timeOfLections = 0;

        try (Scanner scanner = new Scanner(new BufferedInputStream(new FileInputStream(file)))) {
            String line;
            while (scanner.hasNext()) {
                line = scanner.nextLine();
                matcher = pattern.matcher(line);
                if (matcher.find() && !prevHours.equals(EMPTY_LINE)) {
                    prevHoursInt = Integer.parseInt(prevHours);
                    prevMinutesInt = Integer.parseInt(prevMinutes);
                    thisHours = matcher.group("hours");
                    thisMinutes = matcher.group("minutes");
                    thisActivity = matcher.group("activity");
                    thisHoursInt = Integer.parseInt(thisHours);
                    thisMinutesInt = Integer.parseInt(thisMinutes);
                    timeOfActivity = (thisHoursInt - prevHoursInt) * MINUTES_IN_HOUR - prevMinutesInt + thisMinutesInt;
                    Integer count = activityDetalization.getOrDefault(prevActivity, 0);
                    if (prevActivity.equals(PeriodicalActivity.Break.getName()) || prevActivity.equals(PeriodicalActivity.Exercices.getName())
                            || prevActivity.equals(PeriodicalActivity.Lunch.getName()) || prevActivity.equals(PeriodicalActivity.Solutions.getName())) {
                        activityDetalization.put(prevActivity,  count + timeOfActivity);
                    } else {
                        activityDetalization.put(prevActivity, count + timeOfActivity);
                        timeOfLections += timeOfActivity;
                        activityDetalization.put(PeriodicalActivity.Lections.getName(),  timeOfLections);
                    }
                    timeOfStudy += timeOfActivity;
                    activityDetalization.put(GENERAL_TIME, timeOfStudy);
                    prevHours = thisHours;
                    prevMinutes = thisMinutes;
                    prevActivity = thisActivity;

                } else if (prevHours.equals(EMPTY_LINE)) {
                    prevHours = matcher.group("hours");
                    prevMinutes = matcher.group("minutes");
                    prevActivity = matcher.group("activity");
                } else {
                    list.add(activityDetalization);
                    activityDetalization = new LinkedHashMap<>();
                    prevHours = EMPTY_LINE;
                    prevMinutes = EMPTY_LINE;
                    prevActivity = EMPTY_LINE;
                    timeOfLections = 0;
                    timeOfStudy = 0;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        list.add(activityDetalization);
        writeActivityDetalization(list);
    }

    private static void writeActivityDetalization(List<Map> list) {
        File fileOut = new File(String.join(File.separator, "src", "Lesson18_HomeWork", "Files", "Activity_detalization.txt"));
        String colon = ": ";
        String minutes = " минут ";
        String percent = "%";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileOut))){
            for (int i = 0; i < list.size(); i++) {
                Map<String, Integer> activityDetalization = list.get(i);
                Integer generalTime = activityDetalization.remove(GENERAL_TIME);
                for (PeriodicalActivity key : PeriodicalActivity.values()) {
                    String nameOfActivity = key.getName();
                    Integer timeOfActivity = activityDetalization.remove(nameOfActivity);
                    writer.write(nameOfActivity + colon + timeOfActivity + minutes
                           + getPercent(timeOfActivity, generalTime) + percent + System.lineSeparator());
                }
                writer.append(System.lineSeparator() + PeriodicalActivity.Lections.getName() + colon + System.lineSeparator());
                for (String key : activityDetalization.keySet()) {
                    Integer timeOfActivity = activityDetalization.get(key);
                    writer.write(key + colon + timeOfActivity + minutes
                            + getPercent(timeOfActivity, generalTime) + percent + System.lineSeparator());
                }
                writer.append(System.lineSeparator() + System.lineSeparator());

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Integer getPercent(Integer timeOfActivity, Integer generalTime) {
        return (int)Math.round(timeOfActivity * TO_PERCENT / generalTime);
    }
}
