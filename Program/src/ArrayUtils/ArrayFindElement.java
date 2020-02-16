package ArrayUtils;

import Sort.QuickSort;

public class ArrayFindElement {
    private int[] sortedArr;
    private int findValue;
    private int result;
    int[] indexes = {0, 0};
    QuickSort quickSort;

    public ArrayFindElement(int[] arr, int findValue) {
        quickSort = new QuickSort(arr);
        this.indexes[1] = arr.length - 1;
        this.findValue = findValue;
        this.result = -1;
        this.sortedArr = quickSort.exec();
    }

    private int binarySearch(int[] arr, int findValue) {
        if (arr.length < 2) {
            if (this.sortedArr[this.indexes[0]] == findValue) {
                return this.result = this.indexes[0];
            } else if (this.sortedArr[this.indexes[1]] == findValue) {
                return this.result = this.indexes[1];
            } else {
                return result;
            }
        }
        int length = arr.length;
        int halfLength = length / 2;
        int secondHalf = length - halfLength;
        int pivotValue = arr[halfLength];
        int[] leftArr = new int[halfLength];
        int[] rightArr = new int[secondHalf];
        if (findValue < pivotValue) {
            leftArr = ArrayCopy.reduceArrayRight(arr, halfLength);
            this.indexes[1] -= halfLength;
            binarySearch(leftArr, findValue);
        } else if (findValue > pivotValue) {
            rightArr = ArrayCopy.reduceArrayLeft(arr, secondHalf);
            this.indexes[0] += secondHalf;
            binarySearch(rightArr, findValue);
        } else {
            this.indexes[0] += secondHalf;
            this.indexes[1] -= halfLength;
            if (this.sortedArr[this.indexes[0]] == findValue) {
                return this.result = this.indexes[0];
            } else if (this.sortedArr[this.indexes[1]] == findValue) {
                return this.result = this.indexes[1];
            }
        }
        return result;
    }

    public int exec() {
        return this.binarySearch(this.sortedArr, this.findValue);
    }
}
