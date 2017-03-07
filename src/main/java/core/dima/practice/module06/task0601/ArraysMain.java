package core.dima.practice.module06.task0601;

public class ArraysMain {
    public static void main(String[] args) {
        int[] array = {10, 21, -5, 8, -3, 2, 1, 12, 4, 32};
        //  final int[] array3 = {-5, -6, -3, -15};

        ArraysUtils.printSumOfArray(array);
        ArraysUtils.printMaxElement(array);
        ArraysUtils.printMinElement(array);
        ArraysUtils.findMaxPositiveElement(array);
        ArraysUtils.multiplicationOfElementsInArray(array);
        ArraysUtils.modulusOfFirstAndLastElement(array);
        ArraysUtils.secondLargestElement(array);
        ArraysUtils.reverse(array);
        ArraysUtils.findEvenElements(array);

    }

}
