package ArrayUtils;

import Sort.QuickSort;
import Utils.ExecuteInMainAbstract;

public class ExecuteInMainFind extends ExecuteInMainAbstract {
    private final int ARRAY_SIZE = 25, MAX_VALUE = 15, FIND_VALUE = (int) (Math.random() * MAX_VALUE);

    public void execute() {
        ArrayPrepare prepArr2 = new ArrayPrepare(ARRAY_SIZE, MAX_VALUE);
        int[] arr2 = prepArr2.getArray();
        QuickSort quickSort2 = new QuickSort(arr2);
        ArrayFindElement findElement = new ArrayFindElement(arr2, FIND_VALUE);
        System.out.printf("\nБинарный поиск - ищем %d в массиве ", FIND_VALUE);
        ArrayShow.printArray(quickSort2.exec());
        int result = findElement.exec();
        if (result != -1) {
            System.out.printf("\n ++++++++ Найдено (index = %d) ++++++++\n", result);
        } else {
            System.out.print("\n========= Не найдено =========\n");
        }

    }
}
