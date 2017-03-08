package core.dima.practice.module06.task0601;

public class ArraysMain {
    public static void main(String[] args) {
        int[] array = {10, 21, -5, 8, -3, 2, 1, 12, 4, 32};
        int[] arrayCopy = new int[10];
        System.arraycopy(array, 0, arrayCopy, 0, 10);

        // test massive
        // final int[] array3 = {-5, -6, -3, -15};

        ArraysUtils.printSumOfArray(array);
        ArraysUtils.printMaxElement(array);
        ArraysUtils.printMinElement(array);
        ArraysUtils.findMaxPositiveElement(array);
        ArraysUtils.multiplicationOfElementsInArray(array);
        ArraysUtils.modulusOfFirstAndLastElement(array);
        ArraysUtils.secondLargestElement(array);
        ArraysUtils.findEvenElements(array);
        ArraysUtils.reverse(arrayCopy);

    }
}