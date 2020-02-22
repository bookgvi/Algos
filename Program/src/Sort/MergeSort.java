package Sort;

public class MergeSort implements Execute {
    public long iterator;
    private int[] tempArr;
    private int[] unsortArr;
    private int[] resArr;

    public MergeSort(int[] unsortArr) {
        this.unsortArr = unsortArr;
        this.tempArr = new int[this.unsortArr.length];
        this.resArr = new int[this.unsortArr.length];

        System.arraycopy(this.unsortArr, 0, this.resArr, 0, this.unsortArr.length);
    }

    private void makeSort(int[] tempArr, int leftBound, int rightBound) {
        this.iterator++;
        if (leftBound != rightBound) {
            int mid = (rightBound + leftBound) / 2;
            makeSort(tempArr, leftBound, mid);
            makeSort(tempArr, mid + 1, rightBound);
            merge(tempArr, leftBound, mid, rightBound);
        }
    }

    private void merge(int[] tempArr, int leftBound, int mid, int rightBound) {
        int left = leftBound;
        int pivot = mid + 1;
        int n = rightBound - leftBound + 1;
        int i = 0;
        while (leftBound <= mid && pivot <= rightBound) {
            if (resArr[leftBound] < resArr[pivot]) {
                tempArr[i++] = resArr[leftBound++];
            } else if (resArr[leftBound] > resArr[pivot]) {
                tempArr[i++] = resArr[pivot++];
            } else {
                tempArr[i++] = resArr[leftBound++];
                tempArr[i++] = resArr[pivot++];
            }
        }
        while (leftBound <= mid) {
            tempArr[i++] = resArr[leftBound++];
        }
        while (pivot <= rightBound) {
            tempArr[i++] = resArr[pivot++];
        }
        for (i = 0; i < n; i++) {
            resArr[left + i] = tempArr[i];
        }
    }

    @Override
    public int[] exec() {
        this.makeSort(tempArr, 0, unsortArr.length - 1);
        return resArr;
    }
}
