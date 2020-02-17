import ArrayUtils.ArrayFindElement;
import ArrayUtils.ArrayInsert;
import ArrayUtils.ArrayPrepare;
import ArrayUtils.ArrayShow;
import LinksUtils.LinkList;
import QueueUtils.Queue;
import QueueUtils.QueueCyclic;
import Sort.QuickSort;
import StackUtils.Stack;
import Utils.FunctionSpeed;

public class Program {
    public static void main(String[] args) {
        final int EXECUTION_COUNT = 1;
        ArrayPrepare prepArr = new ArrayPrepare(500000, 20000);
        int[] arr = prepArr.getArray();
        FunctionSpeed functionSpeed = new FunctionSpeed(new QuickSort(arr));
//        QuickSort quickSort = new QuickSort(arr);

        System.out.printf("\nUnsorted array (Array size = %d)\n", arr.length);
//        ArrayShow.printArray(arr);
//        int[] sortedArray = quickSort.exec();
//        System.out.printf("\nSorted array (Array size = %d)\n", sortedArray.length);
//        ArrayShow.printArray(sortedArray);

        int[] sortedArray = functionSpeed.evaluateSpeed(EXECUTION_COUNT);

        System.out.printf("\nSorted array: Array size = %d, ETA = %dms\n", sortedArray.length, functionSpeed.getTimeOfExecution(EXECUTION_COUNT));
//
        /*
         * Блок проверки ArrayInsert - вставки элемента в массив
         */
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
//
//        /*
//         *
//         * Блок для операций со стэком
//         *
//         */
//        // Стэк чисел
//        Stack<Integer> stackX = new Stack<Integer>();
//        System.out.printf("\nCreating... Stack size = %d\n", stackX.size());
//        System.out.print("Stack push(1)\n");
//        System.out.print("Stack push(100)\n");
//        System.out.print("Stack push(222)\n");
//        stackX.push(1);
//        stackX.push(100);
//        stackX.push(222);
//        System.out.printf("Stack size = %d\n", stackX.size());
//        System.out.printf("Stack pop(): value = %d\n", stackX.pop());
//        System.out.printf("Stack pop(): value = %d\n", stackX.pop());
//        System.out.printf("Stack size = %d\n", stackX.size());
//        System.out.printf("Stack peek(): value = %d\n", stackX.peek());
//
//        // Стэк строк (пустой)
//        Stack<String> stackS = new Stack<String>();
//        System.out.printf("\nStack size = %d\n", stackS.size());
//        System.out.printf("Stack pop(): value = %S\n", stackS.pop());
//        System.out.printf("Stack peek(): value = %S\n", stackS.peek());
//
//        /*
//         * Блок для операций с очередью
//         */
//        final int FIRST = 11, SECOND = 12, THIRD = 13, FOURTH = 666;
//        Queue<Integer> queueX = new Queue<>();
//        System.out.printf("\nCreating queue... Is it empty - %b\n", queueX.isEmpty());
//        System.out.printf("Попытка удалить элемент из пустой очереди: %d\n", queueX.dequeue());
//        System.out.printf("Добавим несколько элементов в очередь... %d, %d, %d\n", FIRST, SECOND, THIRD);
//        queueX.enqueue(FIRST);
//        queueX.enqueue(SECOND);
//        queueX.enqueue(THIRD);
//        System.out.printf("Удаляю элемент из начала очереди... (%d)\n", queueX.dequeue());
//        System.out.printf("Первый элемент в очереди: %d\n", queueX.top());
//        System.out.printf("Is queue empty? %b\n\n", queueX.isEmpty());
//
//        // Cyclic queue (Смотреть в дебаггере)
//        QueueCyclic<Integer> queueCyclic = new QueueCyclic<>(5);
//        queueCyclic.enqueue(FIRST);
//        queueCyclic.enqueue(SECOND);
//        queueCyclic.enqueue(THIRD);
//        queueCyclic.enqueue(FOURTH);
//        System.out.printf("Is queue empty? %b\n", queueCyclic.isEmpty());
//        System.out.printf("Top %d\n", queueCyclic.top());
//        queueCyclic.dequeue();
//        queueCyclic.dequeue();
//        queueCyclic.dequeue();
//        queueCyclic.enqueue(FOURTH);
//        queueCyclic.dequeue();
//
        /*
        * Блок для операций со связанными списками
        */
        LinkList linkList = new LinkList();
        linkList.insertFirst(1, 12);
        linkList.insertFirst(2, 22);
        linkList.insertFirst(3, 32);
        linkList.insertFirst(4, 42);
        linkList.insertFirst(5, 52);
        linkList.displayList();
//        linkList.deleteFirst();
        System.out.print("\nSearching... ");
        linkList.search(1).displayLink();
        linkList.delete(6);
        linkList.displayList();
        linkList.delete(3);
        linkList.displayList();
    }
}
