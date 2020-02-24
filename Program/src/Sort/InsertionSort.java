package Sort;

import java.util.Arrays;

public class InsertionSort implements Execute {
    private int[] resArr;

    public InsertionSort(int[] unsortedArr) {
        this.resArr = Arrays.copyOf(unsortedArr, unsortedArr.length);
    }

    private void makeSort(int leftBound, int rightBound) {
        int inPtr, outPtr, temp;
        for (outPtr = leftBound + 1; outPtr < rightBound; outPtr++) {
            temp = resArr[outPtr];
            inPtr = outPtr;
            while (inPtr > leftBound && resArr[inPtr - 1] >= temp) {
                resArr[inPtr] = resArr[inPtr - 1];
                --inPtr;
            }
            resArr[inPtr] = temp;
        }
    }

    @Override
    public int[] exec() {
        this.makeSort(0, resArr.length - 1);
        return resArr;

    }
}
