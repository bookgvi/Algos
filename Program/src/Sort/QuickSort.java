package Sort;

import ArrayUtils.ArrayCopy;
import ArrayUtils.ArrayCompareElements;

public class QuickSort implements Execute {
    private int[] arr;

    public QuickSort(int[] arr) {
        this.arr = arr;
    }

    private int[] makeSort(int[] arr) {
        if (arr.length < 2 || ArrayCompareElements.isEqual(arr)) {
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
        int[] leftArrTmp = ArrayCopy.reduceArrayRight(leftArr, i);
        int[] rightArrTmp = ArrayCopy.reduceArrayRight(rightArr, j);
        int[] pivotArrTmp = ArrayCopy.reduceArrayRight(pivotArr, k);
        int[] leftArrAndPivotTmp = ArrayCopy.concatTwoArrays(leftArrTmp, pivotArrTmp);
        return ArrayCopy.concatTwoArrays(makeSort(leftArrAndPivotTmp), makeSort(rightArrTmp));
    }

    @Override
    public int[] exec() {
        return this.makeSort(this.arr);
    }
}
