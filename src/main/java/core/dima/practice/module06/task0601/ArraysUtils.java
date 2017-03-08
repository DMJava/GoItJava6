package core.dima.practice.module06.task0601;

public final class ArraysUtils {

    public final static void printSumOfArray(int[] array) {
        int arraySum = 0;
        for (int anArray : array) {
            arraySum += anArray;
        }
        System.out.println("Сумма массива = " + arraySum);
    }

    public final static void printMaxElement(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int anArray : array) {
            max = Math.max(max, anArray);
        }
        System.out.println("Максимальное число массива = " + max);
    }

    public final static void printMinElement(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Минимальное число массива = " + min);
    }

    public final static void findMaxPositiveElement(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int anArray : array) {
            max = Math.max(max, anArray);
        }
        if (max > 0) {
            System.out.println("Максимальный позитивный элемент массива: " + max);
        } else {
            if (max < 0) {
                System.out.println("В масиве отсутствуют позитивные элементы!");
            }
        }
    }

    public final static void multiplicationOfElementsInArray(int[] array) {
        int multiply = 1;
        for (int number : array) {
            multiply *= number;
        }
        System.out.println("Сумма умножения чисел массива = " + multiply);
    }

    public final static void modulusOfFirstAndLastElement(int[] array) {
        int first = array[0];
        int last = array.length - 1;
        Math.abs(first);
        Math.abs(last);
        System.out.println("Модуль первого и последнего элементов в массиве = " + first + " и " + last);
    }

    public final static void secondLargestElement(int[] array) {
        int largest = array[0];
        int secondLargest = array[0];
        for (int i : array) {
            if (i > largest) {
                secondLargest = largest;
                largest = i;
            } else {
                if (i > secondLargest) {
                    secondLargest = i;
                }
            }
        }
        System.out.println("Второе по величине число в массиве = " + secondLargest);
    }

    public final static void findEvenElements(int[] array) {
        System.out.print("Четные числа в массиве: ");
        for (int anArray : array) {
            if (anArray % 2 == 0) {
                System.out.print(anArray + " ");
            }
        }
        System.out.println();
    }


    public final static void reverse(int[] array) {
        int i = 0;
        int j = array.length - 1;
        int tmp;
        while (j > i) {
            tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
            j--;
            i++;
        }
        System.out.print("Массив задом наперед: ");
        for (int anArray : array) {
            System.out.print(anArray + " ");
        }
    }
}