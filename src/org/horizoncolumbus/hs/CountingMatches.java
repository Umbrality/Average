package org.horizoncolumbus.hs;

public class CountingMatches {

    private static int myFunction(int[] arr, int i) {
        int counter = 0;
        for (int x : arr) {
            if (x == i)
                counter++;
        }

        return counter;
    }
}
