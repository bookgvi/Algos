import Recursion.Execute.ExecuteInMainRecursion;
import Recursion.TriangleQuant.TriangleCount;
import Utils.GetInputNumber;
import Utils.GetInputString;

import java.io.IOException;


public class Program {
    public static void main(String[] args) throws IOException {
        ExecuteInMainRecursion triangleQuant = new ExecuteInMainRecursion(new TriangleCount());
        int count = GetInputNumber.getInt();
        int result = (Integer) triangleQuant.run(count);
        System.out.print(result);
        System.out.println();

//        ArrayPrepare prepArr = new ArrayPrepare(500000, 3000);
//        int[] arr = prepArr.getArray();
//        final int POSITION = (int) (Math.random() * arr.length);
//        final int EXECUTION_COUNT = 100;
//
//        // для работы со связанными списками
//        ExecuteInMainLinks linkList = new ExecuteInMainLinks();
//
//        /**
//         * Sorting
//         */
//        ExecuteInMainSort quickSort = new ExecuteInMainSort(arr, EXECUTION_COUNT);
//        quickSort.execute();
//        linkList.executeSort();
//
//        /**
//         * Блок проверки ArrayInsert - вставки элемента в массив
//         */
//        int[] arr1 = { 1, 2, 3, 4, 5, 6 };
//        ExecuteInMainInsert insert = new ExecuteInMainInsert(arr1, POSITION);
//        insert.execute();
//
//        /**
//         * Блок бинарного поиска
//         */
//        ExecuteInMainFind binaryFind = new ExecuteInMainFind();
//        binaryFind.execute();
//
//        /**
//         * Блок для операций со стэком
//         */
//        ExecuteInMainStack stack = new ExecuteInMainStack();
//        // Стэк чисел
//        stack.executeNumber();
//        // Стэк строк (пустой)
//        stack.executeString();
//
//        /**
//         * Блок для операций с очередью
//         */
//        ExecuteInMainQueue queue = new ExecuteInMainQueue();
//        queue.executeSimple();
//        // Cyclic queue (Смотреть в дебаггере)
//        queue.executeCyclic();
//
//        /**
//         * Блок для операций со связанными списками
//         */
//        linkList.execute();
    }
}
