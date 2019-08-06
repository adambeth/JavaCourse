package com.adam.world;

public class speedConverter {

    public long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour >= 0) {
            double total = kilometersPerHour * 1.60934;
            return (long) total;

        } else
            return -1;
    }

    public void printConversion(double kmPerHOur) {

        double milesPerhour = kmPerHOur * 0.621371;
        if (kmPerHOur >= 0) {
            milesPerhour = Math.round((float) kmPerHOur);
            System.out.println(kmPerHOur + "km/h = " + milesPerhour + " mi/h");
        } else {
            System.out.println("Invalid Number");
        }


    }
}
/*

 */