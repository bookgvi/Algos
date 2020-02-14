package ArrayUtils;

public class ArrayCopy {
    public int[] doit(int[] source, int sizeOfArray) {
        int[] target = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            target[i] = source[i];
        }
        return target;
    }
}
