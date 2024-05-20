package org.example;

public class Problem1 {

    public long sumArray(int[] numbers) {
        long sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }
}


