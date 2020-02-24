package Search;

import ArrayUtils.ArrayShow;
import Search.Interfaces.GetResult;
import Search.Interfaces.Search;
import Sort.MergeSort;

public class BinarySearch implements Search, GetResult {
    private int[] arr;
    private int searchElem;
    private Number indexOfFindingElement = null;
    private int iterator = 0;

    public BinarySearch(int[] arr, int searchElem) {
        MergeSort ms = new MergeSort(arr);
        this.arr = ms.exec();
        this.searchElem = searchElem;
    }

    @Override
    public void makeSearch(int... values) {
        iterator++;
        int leftBound = values[0];
        int rightBound = values[1];
        if (leftBound < rightBound) {
            int mid = (rightBound + leftBound) / 2;
            if (searchElem < arr[mid])
                makeSearch(leftBound, mid);
            else if (searchElem > arr[mid])
                makeSearch(mid + 1, rightBound);
            else
                this.indexOfFindingElement = mid;
        } else if (leftBound == rightBound) {
            if (arr[leftBound] == searchElem)
                this.indexOfFindingElement = leftBound;
        }
    }

    public Number getSearchResult() {
        if (this.arr.length <= 50) {
            ArrayShow.printArray(this.arr);
            System.out.println();
        }
        return indexOfFindingElement;
    }
}
