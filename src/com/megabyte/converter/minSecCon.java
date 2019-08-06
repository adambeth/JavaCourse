package com.megabyte.converter;

public class minSecCon {
    public String getDurationString(int minutes, int second) {
        if ((minutes >= 0) || (second >= 0 && second <= 59)) {
            int hours = minutes / 60;
            int minute = minutes % 60;
            return hours + "H " + minute + "M " + second + "S";

        } else
            return "Invalid Number";
    }
}
