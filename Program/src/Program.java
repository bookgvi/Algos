import ArrayUtils.ArrayPrepare;
import ArrayUtils.ArrayShow;
import Sort.QuickSort;

public class Program {
    public static void main(String[] args) {
        ArrayPrepare prepArr = new ArrayPrepare(50, 13);
        int[] arr = prepArr.getArray();

        System.out.printf("Array size is %d \n", arr.length);
        System.out.println("\nUnsorted array:");
        ArrayShow.printArray(arr);

        int[] sortedArray = QuickSort.makeSort(arr);

        System.out.printf("\n\nSorted array (%d):\n", sortedArray.length);
        ArrayShow.printArray(sortedArray);
    }
}
