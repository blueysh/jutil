package me.blueysh.jutil;

public class Converters {
    /**
     * Converts an amount of hours to milliseconds.
     * @param hours The amount of hours.
     * @return The amount of hours in milliseconds.
     */
    public static float hoursToMillis(float hours) {
        return ( (hours * 60) * 60 ) * 1000;
    }

    /**
     * Converts an amount of days to milliseconds.
     * @param days The amount of days.
     * @return The amount of days in milliseconds.
     */
    public static float daysToMillis(float days) {
        return (hoursToMillis(24) * days);
    }
}
