package task3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task3 {
    public static void main(String[] args) {
        Task3 task3 = new Task3();
        task3.calcNextMinBusTime(new Date());
    }

    public int calcNextMinBusTime(Date date) {
        // HH:mm
        String patternHour = "HH";
        SimpleDateFormat formatHour = new SimpleDateFormat(patternHour);

        String patternMin = "mm";
        SimpleDateFormat formatMin = new SimpleDateFormat(patternMin);

        String hh = formatHour.format(date);
        String mm = formatMin.format(date);
        System.out.println("Actual time is: " + hh + ":" + mm);

        int min = Integer.parseInt(mm);
        int resultMin = 0;

        if (min >= 0 && min <= 30) {
            resultMin = 30 - min;
        } else if (min > 30 && min < 60) {
            resultMin = 60 - min;
        }

        System.out.println("Next bus will arrive in " + resultMin + "min");
        return resultMin;
    }
}


