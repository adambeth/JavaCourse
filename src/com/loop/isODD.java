package com.loop;

public class isODD {
    public boolean odd(int number) {
        if (number % 2 == 0 && number > 0) {
            return true;
        }
        return false;
    }

    public double sumOdd(int start, int end) {

        double sum = 0;

        if (start > 0 && end > 0) {
            for (int i = start; i <= end; i++) {
                if (odd(i)) {
                    sum += i;
                }
            }
            return sum;
        }

        return -1;

    }
}
