package Sort;

import ArrayUtils.ArrayShow;
import Utils.ExecuteInMainAbstract;
import Utils.FunctionSpeed;

public class ExecuteInMainSort extends ExecuteInMainAbstract {
    private int EXECUTION_COUNT;

    public ExecuteInMainSort(int EXECUTION_COUNT) {
        this.EXECUTION_COUNT = EXECUTION_COUNT;
    }

    public void execute(Execute sortMethod, String name) {
        FunctionSpeed functionSpeed = new FunctionSpeed(sortMethod);

//        System.out.printf("\nUnsorted array (Array size = %d)\n", arr.length);
//        ArrayShow.printArray(arr);
//        int[] sortedArray = quickSort.exec();
//        System.out.printf("\nSorted array (Array size = %d)\n", sortedArray.length);
//        ArrayShow.printArray(sortedArray);

        int[] SortedArray = functionSpeed.evaluateSpeed(EXECUTION_COUNT);

        System.out.printf("\n%s: Array size = %d, ETA = %dms", name, SortedArray.length, functionSpeed.getTimeOfExecution(EXECUTION_COUNT));
    }
}
