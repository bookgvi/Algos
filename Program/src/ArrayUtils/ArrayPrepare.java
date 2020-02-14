package ArrayUtils;

public class ArrayPrepare {
    private final int size;
    private final short MAX_NUM = 10000;

    public ArrayPrepare(int sizeOfArray) {
        this.size = sizeOfArray;
    }

    public int[] getArray() {
        int[] arr = new int[this.size];
        for (int i = 0; i < this.size; i++) {
            arr[i] = (int) (Math.random() * this.MAX_NUM);
        }
        return arr;
    }
}
