import ArrayUtils.ArrayPrepare;
import ArrayUtils.ExecuteInMainFind;
import ArrayUtils.ExecuteInMainInsert;
import LinksUtils.ExecuteInMainLinks;
import QueueUtils.ExecuteInMainQueue;
import Sort.BubbleSort;
import Sort.ExecuteInMainSort;
import Sort.QuickSort;
import StackUtils.ExecuteInMainStack;


public class Program {
    public static void main(String[] args) {
        final int ARRAY_SIZE = 100000;
        final int EXECUTION_COUNT = 10000;
        final int MAX_NUMBER = ARRAY_SIZE + 1;
        ArrayPrepare prepArr = new ArrayPrepare(ARRAY_SIZE, MAX_NUMBER);
        int[] arr = prepArr.getArray();
        final int POSITION = (int) (Math.random() * arr.length);

        // для работы со связанными списками
        ExecuteInMainLinks linkList = new ExecuteInMainLinks(ARRAY_SIZE, EXECUTION_COUNT, MAX_NUMBER);

        /**
         * Sorting
         */
        ExecuteInMainSort sortMain = new ExecuteInMainSort(arr, EXECUTION_COUNT);
        QuickSort quickSort = new QuickSort(arr);
        System.out.print(quickSort);
        BubbleSort bubbleSort = new BubbleSort(arr);

        sortMain.execute(quickSort, "QuickSort");
        sortMain.execute(bubbleSort, "Bubble sort");
        linkList.executeSort();

        /**
         * Блок проверки ArrayInsert - вставки элемента в массив
         */
        int[] arr1 = { 1, 2, 3, 4, 5, 6 };
        ExecuteInMainInsert insert = new ExecuteInMainInsert(arr1, POSITION);
        insert.execute();

        /**
         * Блок бинарного поиска
         */
        ExecuteInMainFind binaryFind = new ExecuteInMainFind();
        binaryFind.execute();

        /**
         * Блок для операций со стэком
         */
        ExecuteInMainStack stack = new ExecuteInMainStack();
        // Стэк чисел
        stack.executeNumber();
        // Стэк строк (пустой)
        stack.executeString();

        /**
         * Блок для операций с очередью
         */
        ExecuteInMainQueue queue = new ExecuteInMainQueue();
        queue.executeSimple();
        // Cyclic queue (Смотреть в дебаггере)
        queue.executeCyclic();

        /**
         * Блок для операций со связанными списками
         */
        linkList.execute();
    }
}
