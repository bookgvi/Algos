import StackUtils.Stack;

public class Program {
    public static void main(String[] args) {
//        final int EXECUTION_COUNT = 1;
//        ArrayPrepare prepArr = new ArrayPrepare(30, 20);
//        int[] arr = prepArr.getArray();
//        FunctionSpeed functionSpeed = new FunctionSpeed(new QuickSort(arr));
//        QuickSort quickSort = new QuickSort(arr);
//
//        System.out.printf("\nUnsorted array (Array size = %d)\n", arr.length);
//        ArrayShow.printArray(arr);
//        int[] sortedArray = quickSort.exec();
//        System.out.printf("\nSorted array (Array size = %d)\n", sortedArray.length);
//        ArrayShow.printArray(sortedArray);
//
////        int[] sortedArray = functionSpeed.evaluateSpeed(EXECUTION_COUNT);
//
////        System.out.printf("\nSorted array: Array size = %d, ETA = %dms\n", sortedArray.length, functionSpeed.getTimeOfExecution(EXECUTION_COUNT));
////
//        /*
//         * Блок проверки ArrayInsert - вставки элемента в массив
//         */
//        ArrayPrepare prepArr1 = new ArrayPrepare(5, 300);
//        int[] arr1 = prepArr1.getArray();
//        final int POSITION = (int) (Math.random() * arr1.length);
//        System.out.printf("\n\nВставка 666 в массив в позицию %d\n", POSITION);
//        ArrayShow.printArray(arr1);
//        System.out.println();
//        int[] newArr = ArrayInsert.setElement(arr1, 666, POSITION);
//        ArrayShow.printArray(newArr);
//        System.out.println();
//
//        /*
//         * Блок бинарного поиска
//         */
//        final int ARRAY_SIZE = 25, MAX_VALUE = 15, FIND_VALUE = (int) (Math.random() * MAX_VALUE);
//        ArrayPrepare prepArr2 = new ArrayPrepare(ARRAY_SIZE, MAX_VALUE);
//        int[] arr2 = prepArr2.getArray();
////        int[] arr2 = {0, 2, 2, 4, 4};
//        QuickSort quickSort2 = new QuickSort(arr2);
//        ArrayFindElement findElement = new ArrayFindElement(arr2, FIND_VALUE);
//        System.out.printf("\nБинарный поиск - ищем %d в массиве ", FIND_VALUE);
//        ArrayShow.printArray(quickSort2.exec());
//        int result = findElement.exec();
//        if (result != -1) {
//            System.out.printf("\n ++++++++ Найдено (index = %d) ++++++++\n", result);
//        } else {
//            System.out.print("\n========= Не найдено =========\n");
//        }

        /*
         *
         * Блок для операций со стэком
         *
         */

        Stack<Integer> stackX = new Stack<Integer>();
        System.out.printf("Creating... Stack size = %d\n", stackX.size());
        System.out.print("Stack push(1)\n");
        stackX.push(1);
        System.out.printf("Stack size = %d\n", stackX.size());
        System.out.printf("Stack peek(): value = %d\n", stackX.peek());
        System.out.printf("Stack size = %d\n", stackX.size());
        System.out.printf("Stack pop(): value = %d\n", stackX.pop());
        System.out.printf("Stack size = %d\n", stackX.size());
    }
}
