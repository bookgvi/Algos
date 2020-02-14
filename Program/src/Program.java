import ArrayUtils.ArrayPrepare;
import ArrayUtils.ArrayShow;
import QuickSort.QuickSort;

public class Program {
    public static void main(String[] args) {
        ArrayPrepare prepArr = new ArrayPrepare(3000);
        int[] arr = prepArr.getArray();
        int arrLength = arr.length;
        ArrayShow arrShow = new ArrayShow();

        System.out.printf("Array size is %d \n", arrLength);
        System.out.println("\nUnsorted array:");
        arrShow.printArray(arr);
        QuickSort quickSort = new QuickSort();
        int[] sortedArray = quickSort.makeSort(arr);
        System.out.printf("\n\nSorted array (%d):", sortedArray.length);
        arrShow.printArray(sortedArray);
    }
}
