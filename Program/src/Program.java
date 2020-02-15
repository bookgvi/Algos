import ArrayUtils.ArrayPrepare;
import ArrayUtils.ArrayShow;
import QuickSort.QuickSort;

public class Program {
    public static void main(String[] args) {
        ArrayPrepare prepArr = new ArrayPrepare(50, 13);
        int[] arr = prepArr.getArray();
        int arrLength = arr.length;

        System.out.printf("Array size is %d \n", arrLength);
        System.out.println("\nUnsorted array:");
        ArrayShow.printArray(arr);
        QuickSort quickSort = new QuickSort();
        int[] sortedArray = quickSort.makeSort(arr);
        System.out.printf("\n\nSorted array (%d):\n", sortedArray.length);
        ArrayShow.printArray(sortedArray);
    }
}
