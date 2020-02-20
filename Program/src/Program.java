import ArrayUtils.ArrayPrepare;
import LinksUtils.ExecuteInMainLinks;
import Recursion.Execute.ExecuteInMainRecursion;
import Recursion.TriangleQuant.TriangleCount;
import Sort.BubbleSort;
import Sort.Execute;
import Sort.ExecuteInMainSort;
import Sort.QuickSort;
import Utils.GetInputNumber;
import Utils.GetInputString;

import java.io.IOException;


public class Program {
    public static void main(String[] args) throws IOException {
//        int count = GetInputNumber.getInt();
//        ExecuteInMainRecursion<Integer> triangleQuant = new ExecuteInMainRecursion<>(new TriangleCount(count));
//        int result = triangleQuant.run(count);
//        System.out.println("\n" + result);

        final int ARRAY_SIZE = 10000;
        final int EXECUTION_COUNT = 1;
        int MAX_NUMBER = ARRAY_SIZE + 1;
        ArrayPrepare prepArr = new ArrayPrepare(ARRAY_SIZE, MAX_NUMBER);
        int[] arr = prepArr.getArray();

        // для работы со связанными списками
        ExecuteInMainLinks linkList = new ExecuteInMainLinks(ARRAY_SIZE, EXECUTION_COUNT, MAX_NUMBER);

        /**
         * Sorting
         */
        ExecuteInMainSort sortMethod = new ExecuteInMainSort(EXECUTION_COUNT);
        sortMethod.execute(new QuickSort(arr), "Quick Sort");
        sortMethod.execute(new BubbleSort(arr), "Bubble Sort");
        linkList.executeSort();
//
//        /**
//         * Блок проверки ArrayInsert - вставки элемента в массив
//         */
//        final int POSITION = (int) (Math.random() * arr.length);
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
