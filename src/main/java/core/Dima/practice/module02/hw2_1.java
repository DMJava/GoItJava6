package core.module02;

public class hw2_1 {
    public static void main(String[] args) {

        int[] arrary = new int[10];
        {
            // int sum
            int sum = 0;
            for (int i = 0; i < arrary.length; i++) {
                sum += arrary[i];
            }
        }
        // int max
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arrary.length; i++) {
            max = Math.max(max, arrary[i]);
        }
        // int min
        int min = arrary[0];
        for (int i = 1; i < arrary.length; i++) {
            if (arrary[i] < min)
                min = arrary[i];
        }
        // int max positive
        int maxPositive = 0;
        for (int pos : arrary) {
            if (pos > 0 && maxPositive < pos)
                maxPositive = pos;
        }
        // int multiplication
        int multiply = 1;
        for (int mult : arrary) {
            multiply *= mult;
        }

        //int modulus of first and last element
        int first = arrary[0];
        int last = arrary.length - 1;
        Math.abs(first);
        Math.abs(last);

        //second largest element
        int largest = arrary[0];
        int secondLargest = arrary[0];
        for (int i : arrary) {
            if (i > largest) {
                secondLargest = largest;
                largest = i;
            } else if (i > secondLargest) {
                secondLargest = i;
            }
        }

        // double sum
        double sum = 0;
        for (int i = 0; i < arrary.length; i++) {
            sum += arrary[i];
        }
        // double max
        double maximum = Double.MIN_VALUE;
        for (int i = 0; i < arrary.length; i++) {
            maximum = Math.max(maximum, arrary[i]);
        }
        // double min
        double minimum = arrary[0];
        for (int i = 1; i < arrary.length; i++) {
            if (arrary[i] < minimum)
                minimum = arrary[i];
        }
        //double max positive
        double maxPos = 0;
        for (double numbers : arrary) {
            if (numbers > 0 && maxPos < numbers)
                maxPos = numbers;
        }
        // double multiplication
        double mult = 1;
        for (double num : arrary) {
            mult *= num;
        }
        // double modulus of first and last element
        double firstEl = 0;
        double secondEl = arrary.length - 1;
        Math.abs(firstEl);
        Math.abs(secondEl);

        // double second largest element
        double largestEl = arrary[0];
        double secondLargestEl = arrary[0];
        for (double num : arrary) {
            if (num > largestEl) {
                secondLargestEl = largestEl;
                largestEl = num;
            } else if (secondLargestEl < num)
                secondLargestEl = num;
        }
    }
}


