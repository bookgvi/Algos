package QuickSort;

import ArrayUtils.ArrayConcat;
import ArrayUtils.ArrayCopy;

public class QuickSort {
    private ArrayConcat concat;
    private ArrayCopy copy;

    public int[] makeSort(int[] arr) {
        if (arr.length < 2) {
            return arr;
        }
        int pivot = (int) (Math.random() * (arr.length - 1));
        int pivotValue = arr[pivot];
        int[] leftArr = new int[arr.length];
        int[] rightArr = new int[arr.length];
        int j = 0, k = 0;
        for (int value : arr) {
            if (value < pivotValue) {
                leftArr[j] = value;
                j++;
            } else if (value > pivotValue) {
                rightArr[k] = value;
                k++;
            }
        }
        int[] pivotArr = new int[]{pivotValue};
        int[] temp = ArrayCopy.reduceArray(leftArr, j);
        int[] leftArrTmp = ArrayConcat.concatTwoArrays(temp, pivotArr);
        int[] rightArrTmp = ArrayCopy.reduceArray(rightArr, k);
        return ArrayConcat.concatTwoArrays(makeSort(leftArrTmp), makeSort(rightArrTmp));
    }
}
