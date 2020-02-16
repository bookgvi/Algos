import ArrayUtils.ArrayFindElement;
import ArrayUtils.ArrayInsert;
import ArrayUtils.ArrayPrepare;
import ArrayUtils.ArrayShow;
import Sort.QuickSort;
import Utils.FunctionSpeed;

public class Program {
    public static void main(String[] args) {
        final int EXECUTION_COUNT = 1;
        ArrayPrepare prepArr = new ArrayPrepare(30, 20);
        int[] arr = prepArr.getArray();
        FunctionSpeed functionSpeed = new FunctionSpeed(new QuickSort(arr));
        QuickSort quickSort = new QuickSort(arr);

        System.out.printf("\nUnsorted array (Array size = %d)\n", arr.length);
        ArrayShow.printArray(arr);
        int[] sortedArray = quickSort.exec();
        System.out.printf("\nSorted array (Array size = %d)\n", sortedArray.length);
        ArrayShow.printArray(sortedArray);

//        int[] sortedArray = functionSpeed.evaluateSpeed(EXECUTION_COUNT);

//        System.out.printf("\nSorted array: Array size = %d, ETA = %dms\n", sortedArray.length, functionSpeed.getTimeOfExecution(EXECUTION_COUNT));
//
//        /*
//         * Блок проверки ArrayInsert - вставки элемента в массив
//         */
//        ArrayPrepare prepArr1 = new ArrayPrepare(5, 300);
//        int[] arr1 = prepArr1.getArray();
//        ArrayShow.printArray(arr1);
//        System.out.println();
//        int[] newArr = ArrayInsert.setElement(arr1, 666, 4);
//        ArrayShow.printArray(newArr);
//        System.out.println();

//        /*
//         * Блок бинарного поиска
//         */
//        ArrayPrepare prepArr2 = new ArrayPrepare(20, 7);
//        int[] arr2 = prepArr2.getArray();
//        QuickSort quickSort = new QuickSort(arr2);
//        int findValue = 1;
//        ArrayFindElement findElement = new ArrayFindElement(arr2, findValue);
//        System.out.printf("\nБинарный поиск - ищем %d в массиве ", findValue);
//        ArrayShow.printArray(quickSort.exec());
//        int result = findElement.exec();
//        if (result != -1) {
//            System.out.printf("\n ++++++++ Найдено (%d) ++++++++\n", result);
//        } else {
//            System.out.printf("\n========= Не найдено (%d) =========\n", result);
//        }
    }
}
