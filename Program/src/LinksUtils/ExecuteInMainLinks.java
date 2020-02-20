package LinksUtils;

import ArrayUtils.ArrayPrepare;
import Utils.ExecuteInMainAbstract;

public class ExecuteInMainLinks extends ExecuteInMainAbstract {
    private ArrayPrepare prepArr;
    private int[] arr;
    private int EXECUTION_COUNT;

    public ExecuteInMainLinks(int ARRAY_SIZE, int EXECUTION_COUNT, int MAX_NUMBER) {
        this.prepArr = new ArrayPrepare(ARRAY_SIZE, MAX_NUMBER);
        this.arr = prepArr.getArray();
        this.EXECUTION_COUNT = EXECUTION_COUNT;
    }

    public void execute() {
        LinkList linkList = new LinkList();
        linkList.insertFirst(1, 12);
        linkList.insertFirst(2, 22);
        linkList.insertFirst(3, 32);
        linkList.insertFirst(4, 42);
        linkList.insertFirst(5, 52);
        linkList.deleteFirst();
        System.out.print("\nSearching... ");
        linkList.search(1).displayLink();
        linkList.delete(6);
        linkList.delete(3);
        linkList.displayList();
        System.out.println();
        // Sorted LinkList
    }

    public void executeSort() {
        LinkListSort linkListSort = new LinkListSort();

        FunctionSpeed functionSpeed1 = new FunctionSpeed(linkListSort);
        functionSpeed1.evaluateSpeed(EXECUTION_COUNT, arr, linkListSort);
        System.out.printf("\nInsertion sort via linked list: Array size = %d, ETA = %dms\n", arr.length, functionSpeed1.getTimeOfExecution(EXECUTION_COUNT));
//        linkListSort.displayList();
    }
}
