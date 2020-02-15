package ArrayUtils;

public class ArrayCopy {
    public static int[] reduceArray(int[] source, int sizeOfArray) {
        int[] target = new int[sizeOfArray];
        System.arraycopy(source, 0, target, 0, sizeOfArray);
        return target;
    }
}
