import Temp.LinkList.LinkList;
import Temp.Tree.Tree;

import java.io.IOException;


public class Program {
    public static void main(String[] args) throws IOException {
//        int count = GetInputNumber.getInt();
//        ExecuteInMainRecursion<Integer> triangleQuant = new ExecuteInMainRecursion<>(new TriangleCount(count));
//        int result = triangleQuant.run(count);
//        System.out.println("\n" + result);

        Tree tree = new Tree();
        tree.insert(15, 100);
        tree.insert(20, 200);
        tree.insert(3, 300);
        tree.insert(24, 400);

//        final int ARRAY_SIZE = 50;
//        final int EXECUTION_COUNT = 1;
//        int MAX_NUMBER = ARRAY_SIZE + 1;
//        final int SEARCH_NUMBER = 20;
//        ArrayPrepare prepArr = new ArrayPrepare(ARRAY_SIZE, MAX_NUMBER);
//        int[] arr = prepArr.getArray();
//
//        // Binary search
//        BinarySearch binarySearch = new BinarySearch(arr, SEARCH_NUMBER);
//        binarySearch.makeSearch(0, arr.length - 1);
//        Number searchResult = binarySearch.getSearchResult();
//        if (searchResult != null) {
//            System.out.printf("Element %d, расположен по индексу %d", SEARCH_NUMBER, (int) searchResult);
//        } else {
//            System.out.printf("Element %d, в массиве не найден", SEARCH_NUMBER);
//        }
//

        // для работы со связанными списками
//        ExecuteInMainLinks linkList = new ExecuteInMainLinks(ARRAY_SIZE, EXECUTION_COUNT, MAX_NUMBER);
//
//        /**
//         * Sorting
//         */
//        MergeSort ms = new MergeSort(arr);
//        QuickSort qs = new QuickSort(arr);
//        InsertionSort is = new InsertionSort(arr);
//        ExecuteInMainSort sortMethod = new ExecuteInMainSort(EXECUTION_COUNT);
//        sortMethod.execute(ms, "Merge Sort");
//        System.out.print(", Iterator = " + ms.iterator);
//        sortMethod.execute(qs, "Quick Sort");
//        System.out.print(", Iterator = " + qs.iterator);
//        sortMethod.execute(is, "Insertion Sort");
//        System.out.println();
//        sortMethod.execute(new BubbleSort(arr), "Bubble Sort");
//        linkList.executeSort();
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
