import ArrayUtils.ArrayFindElement;
import ArrayUtils.ArrayInsert;
import ArrayUtils.ArrayPrepare;
import ArrayUtils.ArrayShow;
import Sort.QuickSort;
import Utils.FunctionSpeed;

public class Program {
    public static void main(String[] args) {
        final int EXECUTION_COUNT = 1;
        ArrayPrepare prepArr = new ArrayPrepare(5, 300);
        int[] arr = prepArr.getArray();
        FunctionSpeed functionSpeed = new FunctionSpeed(new QuickSort(arr));

        System.out.printf("\nUnsorted array (Array size = %d)", arr.length);

        int[] sortedArray = functionSpeed.evaluateSpeed(EXECUTION_COUNT);

        System.out.printf("\nSorted array: Array size = %d, ETA = %dms\n", sortedArray.length, functionSpeed.getTimeOfExecution(EXECUTION_COUNT));

        /*
         * Блок проверки ArrayInsert - вставки элемента в массив
         */
        ArrayPrepare prepArr1 = new ArrayPrepare(5, 300);
        int[] arr1 = prepArr1.getArray();
        ArrayShow.printArray(arr1);
        System.out.println();
        int[] newArr = ArrayInsert.setElement(arr1, 666, 4);
        ArrayShow.printArray(newArr);
        System.out.println();

        /*
         * Блок бинарного поиска
         */
        ArrayPrepare prepArr2 = new ArrayPrepare(15, 15);
        int[] arr2 = prepArr2.getArray();
        int findValue = 5;
        ArrayFindElement findElement = new ArrayFindElement(arr2, findValue);
        System.out.printf("\nБинарный поиск - ищем %d в массиве ", findValue);
        ArrayShow.printArray(arr2);
        boolean result = findElement.exec();
        if (result) {
            System.out.printf("\n ++++++++ Найдено ++++++++\n");
        } else {
            System.out.printf("\n========= Не найдено =========\n");
        }
    }
}
