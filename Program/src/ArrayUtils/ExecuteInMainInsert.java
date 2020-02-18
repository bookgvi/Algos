package ArrayUtils;

import Utils.ExecuteInMainAbstract;

public class ExecuteInMainInsert extends ExecuteInMainAbstract {
    private int[] arr;
    private int POSITION;

    public ExecuteInMainInsert(int[] arr, int POSITION) {
        this.arr = arr;
        this.POSITION = POSITION;
    }

    public void execute() {
        System.out.printf("\n\nВставка 666 в массив в позицию %d\n", POSITION);
        ArrayShow.printArray(arr);
        System.out.println();
        int[] newArr = ArrayInsert.setElement(arr, 666, POSITION);
        ArrayShow.printArray(newArr);
        System.out.println();
    }
}
