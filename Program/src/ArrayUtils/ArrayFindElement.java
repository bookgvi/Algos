package ArrayUtils;

import Sort.QuickSort;

public class ArrayFindElement {
    private int[] sortedArr;
    private int findValue;
    private boolean result;
    QuickSort quickSort;

    public ArrayFindElement(int[] arr, int findValue) {
        quickSort = new QuickSort(arr);
        this.findValue = findValue;
        this.result = false;
        this.sortedArr = quickSort.exec();
    }

    private boolean findElement(int[] arr, int findValue) {
        if (arr.length < 2) {
            result = arr[0] == findValue;
            return result;
        }
        int length = arr.length;
        int halfLength = length / 2;
        int secondHalf = length - halfLength;
        int pivotValue = arr[halfLength];
        int[] leftArr = new int[halfLength];
        int[] rightArr = new int[secondHalf];
        if (findValue < pivotValue) {
            leftArr = ArrayCopy.reduceArrayRight(arr, halfLength);
            findElement(leftArr, findValue);
        } else if (findValue > pivotValue) {
            rightArr = ArrayCopy.reduceArrayLeft(arr, secondHalf);
            findElement(rightArr, findValue);
        } else {
            result = true;
        }
        return result;
    }

    public boolean exec() {
        return this.findElement(this.sortedArr, this.findValue);
    }
}
