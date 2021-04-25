package model;

import java.util.Date;
import java.text.SimpleDateFormat;

public class TimeProcessing {
    private static long setTime;
    private static Date currentDate;

    public static long tenMinuteTimer() {
        long nextTenMinuteSecond = 0;
        setTime = System.currentTimeMillis();
        currentDate = new Date(setTime);
        long currentSecond = System.currentTimeMillis();

        SimpleDateFormat minuteFormat = new SimpleDateFormat("mm");
        String minuteString = minuteFormat.format(currentDate);
        double minuteDouble = Double.parseDouble(minuteString);
        if ((int) minuteDouble % 10 == 0) {
            nextTenMinuteSecond += 60;
            minuteDouble++;
        }
        long minuteLong = (long) ((Math.ceil(minuteDouble / 10)) * 10);

        SimpleDateFormat secondFormat = new SimpleDateFormat("ss");
        String secondString = secondFormat.format(currentDate);
        long secondLong = Long.parseLong(secondString);
        nextTenMinuteSecond += ((minuteLong - (long) minuteDouble) * 60 - secondLong + (currentSecond / 1000));

        return nextTenMinuteSecond * 1000;
    }

    public static long oneDayTimer() {
        //add one day 86400 seconds
        long nextOneDaySecond = 86400;

        setTime = System.currentTimeMillis();
        currentDate = new Date(setTime);
        long currentSecond = System.currentTimeMillis();
        //minute
        SimpleDateFormat minuteFormat = new SimpleDateFormat("mm");
        String minuteString = minuteFormat.format(currentDate);
        long minuteLong = Long.parseLong(minuteString);
        //second
        SimpleDateFormat secondFormat = new SimpleDateFormat("ss");
        String secondString = secondFormat.format(currentDate);
        long secondLong = Long.parseLong(secondString);
        //hour
        SimpleDateFormat hourFormat = new SimpleDateFormat("HH");
        String hourString = hourFormat.format(currentDate);
        long hourLong = Long.parseLong(hourString);

        nextOneDaySecond += ((currentSecond / 1000) - (minuteLong * 60) - (hourLong * 3600) - secondLong);
        return nextOneDaySecond * 1000;
    }

    public static String timeString(long timeStamp, String format) {
        Date date = new Date(timeStamp * 1000);
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(date);
    }
}