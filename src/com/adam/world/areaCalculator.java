package com.adam.world;

public class areaCalculator {
    public double area(double radius) {
        if (radius < 0) {
            return -1;
        } else {
            double area = radius * Math.PI;
            return area;
        }
    }

    public double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1;
        } else {
            double recArea = x * y;
            return recArea;
        }

    }
}



