package com.loop;

public class forLoops {

    public void calculateInterest(double amount) {
        double total = 0;
        for (int i = 2; i <= 8; i++) {
            total = (amount * ((double) i / 100));
            System.out.println(amount + " amount");
            System.out.println(i + " interest");
            System.out.println(total + " Total");
        }

    }
}
