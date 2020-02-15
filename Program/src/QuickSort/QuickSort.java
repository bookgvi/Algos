package QuickSort;

import ArrayUtils.ArrayConcat;
import ArrayUtils.ArrayCopy;
import ArrayUtils.ArrayElements;

public class QuickSort {
    private ArrayConcat concat;
    private ArrayCopy copy;

    public int[] makeSort(int[] arr) {
        if (arr.length < 2 || ArrayElements.isEqual(arr)) {
            return arr;
        }
        int pivot = (int) (Math.random() * (arr.length - 1));
        int pivotValue = arr[pivot];
        int[] leftArr = new int[arr.length];
        int[] rightArr = new int[arr.length];
        int[] pivotArr = new int[arr.length];
        int i = 0, j = 0, k = 0;
        for (int value : arr) {
            if (value < pivotValue) {
                leftArr[i] = value;
                i++;
            } else if (value > pivotValue) {
                rightArr[j] = value;
                j++;
            } else {
                pivotArr[k] = value;
                k++;
            }
        }
        int[] leftArrTmp = ArrayCopy.reduceArray(leftArr, i);
        int[] rightArrTmp = ArrayCopy.reduceArray(rightArr, j);
        int[] pivotArrTmp = ArrayCopy.reduceArray(pivotArr, k);
        int[] leftArrAndPivotTmp = ArrayConcat.concatTwoArrays(leftArrTmp, pivotArrTmp);
        return ArrayConcat.concatTwoArrays(makeSort(leftArrAndPivotTmp), makeSort(rightArrTmp));
    }
}
