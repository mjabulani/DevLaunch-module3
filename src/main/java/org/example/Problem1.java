package org.example;

public class Problem1 {

    public int sumArray(int[] numbers) {
        boolean isNegative = false;
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0 ) {
                isNegative = true;
            }
            sum = sum + numbers[i];
        }
        if (!isNegative && sum < 0) {
            throw new StackOverflowError("Overflow!");
        }
        return sum;
    }
}
