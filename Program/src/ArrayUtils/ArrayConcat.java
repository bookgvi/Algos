package ArrayUtils;

public class ArrayConcat {
    public static int[] concatTwoArrays(int[] A, int[] B) {
        int aLen = A.length;
        int bLen = B.length;
        int[] C = new int[aLen + bLen];
        System.arraycopy(A, 0, C, 0, aLen);
        System.arraycopy(B, 0, C, aLen, bLen);
        return C;
    }
}
