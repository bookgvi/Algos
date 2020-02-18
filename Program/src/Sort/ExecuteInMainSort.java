package Sort;

import ArrayUtils.ArrayShow;
import Utils.ExecuteInMainAbstract;
import Utils.FunctionSpeed;

public class ExecuteInMainSort extends ExecuteInMainAbstract {
    private static final int EXECUTION_COUNT = 1000;
    private int[] arr;

    public ExecuteInMainSort(int[] arr) {
        this.arr = arr;
    }

    public void execute() {
        FunctionSpeed functionSpeed = new FunctionSpeed(new QuickSort(arr));
        QuickSort quickSort = new QuickSort(arr);

        System.out.printf("\nUnsorted array (Array size = %d)\n", arr.length);
//        ArrayShow.printArray(arr);
        int[] sortedArray = quickSort.exec();
        System.out.printf("\nSorted array (Array size = %d)\n", sortedArray.length);
//        ArrayShow.printArray(sortedArray);

        int[] QuickSortedArray = functionSpeed.evaluateSpeed(EXECUTION_COUNT);

        System.out.printf("\nSorted array: Array size = %d, ETA = %dms\n", QuickSortedArray.length, functionSpeed.getTimeOfExecution(EXECUTION_COUNT));
    }
}
