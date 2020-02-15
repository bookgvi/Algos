import ArrayUtils.ArrayPrepare;
//import ArrayUtils.ArrayShow;
import Sort.QuickSort;
import Utils.FunctionSpeed;

public class Program {
    public static void main(String[] args) {
        final int EXECUTION_COUNT = 1000;
        ArrayPrepare prepArr = new ArrayPrepare(500000, 300);

        int[] arr = prepArr.getArray();
        FunctionSpeed functionSpeed = new FunctionSpeed(new QuickSort(arr));

        System.out.printf("\nUnsorted array (Array size = %d):", arr.length);

        int[] sortedArray = functionSpeed.evaluateSpeed(EXECUTION_COUNT);

        System.out.printf("\nSorted array: Array size = %d, ETA = %dms", sortedArray.length, functionSpeed.getTimeOfExecution(EXECUTION_COUNT));
//        ArrayShow.printArray(sortedArray);
    }
}
