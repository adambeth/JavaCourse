package com.loop;

public class threeAndFive {

    public void numberRange() {

        double sum = 0;
        double count = 0;

        for (int i = 1; i <= 100; i++) {

            if ((i % 3 == 0) && (i % 5 == 0)) {
                sum = sum + i;
                System.out.println(i);
                count++;
            } else if (count == 5) {
                break;

            }

        }
        System.out.println(sum);
    }


}

