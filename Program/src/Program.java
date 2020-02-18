import ArrayUtils.ArrayPrepare;
import ArrayUtils.ExecuteInMainFind;
import ArrayUtils.ExecuteInMainInsert;
import LinksUtils.ExecuteInMainLinks;
import QueueUtils.ExecuteInMainQueue;
import Sort.ExecuteInMainSort;
import StackUtils.ExecuteInMainStack;


public class Program {
    public static void main(String[] args) {
        ArrayPrepare prepArr = new ArrayPrepare(500000, 3000);
        int[] arr = prepArr.getArray();
        final int POSITION = (int) (Math.random() * arr.length);
        final int EXECUTION_COUNT = 100;

        // для работы со связанными списками
        ExecuteInMainLinks linkList = new ExecuteInMainLinks();

        /**
         * Sorting
         */
        ExecuteInMainSort quickSort = new ExecuteInMainSort(arr, EXECUTION_COUNT);
        quickSort.execute();
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
