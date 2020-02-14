package QuickSort;

import ArrayUtils.ArrayConcat;
import ArrayUtils.ArrayCopy;

public class QuickSort {
    private ArrayConcat concat;
    private ArrayCopy copy;

    public QuickSort() {
        this.concat = new ArrayConcat();
        this.copy = new ArrayCopy();
    }

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
        int[] temp = this.copy.doit(leftArr, j);
        int[] leftArrTmp = this.concat.concatTwoArrays(temp, pivotArr);
        int[] rightArrTmp = this.copy.doit(rightArr, k);
        return this.concat.concatTwoArrays(makeSort(leftArrTmp), makeSort(rightArrTmp));
    }
}
