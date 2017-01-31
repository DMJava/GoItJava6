package core.dima.practice.module02;

public class Calculator {
    public static void main(String[] args) {

        int[] array = {10, 21, -5, 8, -3, 2, 1, 12, 4, 32};
        double[] array2 = {12.6, 7.3, 2.1, -3.2, -4.2, 0.0, 5.5, 8.4, 16.1, 3.3};

        Calculator calculator = new Calculator();
        calculator.sum(array);
        calculator.max(array);
        calculator.min(array);
        calculator.maxPositive(array);
        calculator.multiplication(array);
        calculator.modulusOfFirstAndLastElement(array);
        calculator.secondLargestElement(array);
        calculator.sum(array2);
        calculator.max(array2);
        calculator.min(array2);
        calculator.maxPositive(array2);
        calculator.multiplication(array2);
        calculator.modulusOfFirstAndLastElement(array2);
        calculator.secondLargestElement(array2);

    }

    public void sum(int[] array) {
        int arraySum = 0;
        for (int i = 0; i < array.length; i++) {
            arraySum += array[i];
        }
        System.out.println("Сумма массива = " + arraySum);
    }

    public void max(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            max = Math.max(max, array[i]);
        }
        System.out.println("Максимальное число массива = " + max);
    }

    public void min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        System.out.println("Минимальное число массива = " + min);
    }

    public void maxPositive(int[] array) {
        int maxPositive = 0;
        for (int pos : array) {
            if (pos > 0 && maxPositive < pos)
                maxPositive = pos;
        }
        System.out.println("Максимальное позитивное число массива = " + maxPositive);
    }

    public void multiplication(int[] array) {
        int multiply = 1;
        for (int number : array) {
            multiply *= number;
        }
        System.out.println("Сумма умножения чисел массива = " + multiply);
    }

    public void modulusOfFirstAndLastElement(int[] array) {
        System.out.println("Модуль первого и последнего элементов в массиве = " + Math.abs(array[0]) + " и " + Math.abs(array[9]));
    }

    public void secondLargestElement(int[] array) {
        int largest = array[0];
        int secondLargest = array[0];
        for (int i : array) {
            if (i > largest) {
                secondLargest = largest;
                largest = i;
            } else if (i > secondLargest) {
                secondLargest = i;
            }
        }
        System.out.println("Второе по величине число в массиве = " + secondLargest);
    }


    public void sum(double[] array2) {
        double sum = 0;
        for (int i = 0; i < array2.length; i++) {
            sum += array2[i];
        }
        System.out.println("Сумма массива = " + sum);
    }

    public void max(double[] array2) {
        double maximum = Double.MIN_VALUE;
        for (int i = 0; i < array2.length; i++) {
            maximum = Math.max(maximum, array2[i]);
        }
        System.out.println("Максимальное число массива = " + maximum);
    }

    public void min(double[] array2) {
        double minimum = array2[0];
        for (int i = 1; i < array2.length; i++) {
            if (array2[i] < minimum)
                minimum = array2[i];
        }
        System.out.println("Минимальное число массива = " + minimum);
    }

    public void maxPositive(double[] array2) {
        double maxPos = 0;
        for (double numbers : array2) {
            if (numbers > 0 && maxPos < numbers)
                maxPos = numbers;
        }
        System.out.println("Максимальное позитивное число массива = " + maxPos);
    }

    public void multiplication(double[] array2) {
        double multiply = 1;
        for (double number : array2) {
            multiply *= number;
        }
        System.out.println("Сумма умножения чисел массива = " + multiply);
    }

    public void modulusOfFirstAndLastElement(double[] array2) {
        System.out.println("Модуль первого и последнего элементов в массиве = " + Math.abs(array2[0]) + " и " + Math.abs(array2[9]));
    }

    public void secondLargestElement(double[] array2) {
        double largestEl = array2[0];
        double secondLargestEl = array2[0];
        for (double num : array2) {
            if (num > largestEl) {
                secondLargestEl = largestEl;
                largestEl = num;
            } else if (secondLargestEl < num)
                secondLargestEl = num;
        }
        System.out.println("Второе по величине число в массиве = " + secondLargestEl);
    }
}




