package org.horizoncolumbus.hs;

public class Average {

    public static void main(String[] args) {
        // Sum algorithm
        int[] arr = {3, 6, 3, 6, 8, 2, 7};

        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        System.out.println("Sum:" + sum);

        int average = sum / arr.length;

        System.out.println("Average:" + average);
    }
}
