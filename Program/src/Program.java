import ArrayUtils.ArrayPrepare;
import ArrayUtils.ArrayShow;
import Sort.QuickSort;

public class Program {
    public static void main(String[] args) {
        ArrayPrepare prepArr = new ArrayPrepare(50, 300);

        int[] arr = prepArr.getArray();

        System.out.printf("\nUnsorted array (%d):\n", arr.length);
        ArrayShow.printArray(arr);

        int[] sortedArray = QuickSort.makeSort(arr);

        System.out.printf("\n\nSorted array (%d):\n", sortedArray.length);
        ArrayShow.printArray(sortedArray);
    }
}
